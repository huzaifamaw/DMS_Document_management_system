package musabbiha.Classes;

import java.awt.Font;
import java.awt.Image;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import musabbiha.Frame.fDashboard;
import musabbiha.Frame.fLogin;
import musabbiha.Frame.fSearch;

public class CSQL {
    int strUserID;
    String strName, strEmail, strAddress, strPassword, strContactNumber;
    byte[] strProileImage;
    
    
    int user_id;
    String email1, add, num, name;
    ImageIcon pimage = new ImageIcon();
    Connection con;
    Statement st;
    public byte[] image;
 
    public void connection(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Document","sa", "musabbiha@18");
            
            System.out.println("Connected");
        } 
        catch (ClassNotFoundException|SQLException ex) {
                System.out.println("ERROR MESSAGE: " + ex.getMessage());
        }
    }
    
    public void signup(String name, String email, String num , String pass, String add, byte[] dp)
    {
        try {
            
            PreparedStatement ps = con.prepareStatement("INSERT INTO User_Profile(User_Name, User_Email, User_Contact, User_Password, User_DP, User_Address) VALUES(?, ?, ?, ?, ?, ?)");
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, num);
            ps.setString(4, pass);
            ps.setBytes(5, dp);
            ps.setString(6, add);
            ps.execute();
            ps.close();
        } 
        catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    public boolean loginInDashboard(String email, String password){
        
        try{
            st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM User_Profile");
            
            while( rs.next()){
                if(rs.getString("User_Email").equals(email) && rs.getString("User_Password").equals(password)){
                   strName = rs.getString("User_Name");
                   strUserID = rs.getInt("User_ID");
                   strAddress = rs.getString("User_Address");
                   strEmail = rs.getString("User_Email");
                   strPassword = rs.getString("User_Password");
                   strContactNumber = rs.getString("User_Contact");
                   strProileImage = rs.getBytes("User_DP");
                           
                   fDashboard d = new fDashboard();
                   d.lblName.setText(strName);
                   d.lblEmail.setText(strEmail);
                   d.lblImageProfile.setIcon(pimage = d.ResizeImage(rs.getBytes("User_DP")));
                   d.userID = strUserID;
                   d.setLocationRelativeTo(null);
                   d.setVisible(true);
                   
                   d.UserName = strName;
                   d.UserEmail = strEmail;
                   d.UserAddress = strAddress;
                   d.UserNumber = strContactNumber;
                   d.UserPassword = strPassword;
                   d.UserDp = strProileImage;
                   d.NumOfFiles = this.countFiles(rs.getInt("User_ID"));
                   d.NumOfFolder = this.countFolder(rs.getInt("User_ID"));
                   return true;
                }
                
            }
            
                return false;
            
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return false;
        }
        
        
    }
    
    public boolean addFolder(String folderName , String createdDate, int numberOfFiles , int userID){
        try{
            PreparedStatement p = con.prepareStatement("INSERT INTO Folder(User_ID, Folder_Name , Created_Date , Number_of_files) VALUES(?, ?, ?, ?)");
            p.setInt(1, userID);
            p.setString(2, folderName);
            p.setString(3, createdDate);
            p.setInt(4, numberOfFiles);
            p.execute();
            p.close();
            return true;
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return false;
    }
    
    
    public Vector getFolder(int userID){
        int count = 0;
        Vector folderName = new Vector();
        
        try{
            st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Folder");
           
            while( rs.next()){
            if(rs.getInt("User_ID")==(userID) ){
                folderName.add(rs.getString("Folder_Name"));
                System.out.println("horaha hy");
                count++;
            }
        }
        return folderName;
    }
    catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, ex.getMessage());
    }
    return null;
}
    
    
    public void addFiles(String File_Name , String Created_Date, String Size , byte[] Scanned_Document, int Folder_ID , int Type_ID , int User_ID){
        try {
            PreparedStatement p = con.prepareStatement("INSERT INTO Files(Folder_ID,User_ID, Type_ID , File_Name , Created_Date,Size,Scanned_Document) VALUES(?, ?, ?, ?,?,?,?)");
            p.setInt(1, Folder_ID);
            p.setInt(2, User_ID);
            p.setInt(3,Type_ID);
            p.setString(4, File_Name);
            p.setString(5, Created_Date);
            p.setString(6, Size);
            p.setBytes(7, Scanned_Document);
            p.execute();
            p.close();
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
 
    public int searchFolderByType(String folderType){
       int type_ID = 0;
       try{
           st = con.createStatement();
           ResultSet rs = st.executeQuery("SELECT * FROM File_Type");

            while( rs.next()){
                if(rs.getString("Type_name").equals(folderType) ){
                    type_ID = rs.getInt("Type_ID");
                    return type_ID;    
                }
            }    
        }
        catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return 19;
    }
    
    
    public int searchFolder(String Folder_name, int userId){
        int Folder_ID = 0;
        
        try{
           st = con.createStatement();
           ResultSet rs = st.executeQuery("SELECT * FROM Folder");

            while( rs.next()){
                if(rs.getString("Folder_name").equals(Folder_name) && userId == rs.getInt("User_ID")){
                    Folder_ID=rs.getInt("Folder_ID");
                    return Folder_ID;    
                }
            }    
        }
        catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
        }
       return 0;
    }
    
    
    public int NumberOfFiles(int FolderID){
        int nof=0;
        try {
            
            st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT* FROM Files");
            while(rs.next()){
                if(rs.getInt("Folder_ID") == FolderID){
                    nof++;
                }
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(CSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nof;
    }
    
    
    public Vector getFile(int folder_ID){
        Vector v = new Vector();
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT* FROM Files");
            while(rs.next()){
                    if(rs.getInt("Folder_ID") == folder_ID){
                        
                        System.out.println("HAN ANDER AGAYA");
                        Object[] row = {rs.getString("File_Name"),rs.getString("Created_Date")};
                        v.add(row);
                    }        
            }    
                    } catch (SQLException ex) {
            Logger.getLogger(CSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       return v;
    }
        public String getFolderDate(String FolderName)
        {
             
        
        try{
           st = con.createStatement();
           ResultSet rs = st.executeQuery("SELECT * FROM Folder");
           
       while( rs.next()){
         if(rs.getString("Folder_Name").equals(FolderName))
               {
                   System.out.println("hahahahahah");
                   String date = rs.getString("Created_Date");
                   System.out.println(date);
                   return date;
               }
       }
        }
        catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return null;
       
        }
        
        public Vector getTypeName(){
            Vector v = new Vector();
            try{
                st = con.createStatement();
                ResultSet rs = st.executeQuery("SELECT* FROM File_type");
                while(rs.next()){
                    v.add(rs.getString("Type_name"));
                    
                    System.out.println("Han mil gya name");
                }
            } catch (SQLException ex) {
            Logger.getLogger(CSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
         return v;   
        }
        
        public int getTypeId(String name){
            
            int id;
            try{
                st = con.createStatement();
                ResultSet rs = st.executeQuery("SELECT* FROM File_type");
                while(rs.next()){
                    if(name.equals(rs.getString("Type_name")))
                    {
                        return rs.getInt("Type_id");
                    }
                }
                
            } catch (SQLException ex) {
            Logger.getLogger(CSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
            return 0;
        }
        
        public String getTypeName(int FileID){
            
            String name = "Not found";
            try{
                st = con.createStatement();
                ResultSet rs = st.executeQuery("SELECT* FROM File_type");
                while(rs.next()){
                    if(FileID == (rs.getInt("Type_ID")))
                    {
                        return rs.getString("Type_name");
                    }
                }
                
            } catch (SQLException ex) {
            Logger.getLogger(CSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
            return name;
        }
        
        public String getFolderName(int FolderID){
            
            String name = "Not found";
            try{
                st = con.createStatement();
                ResultSet rs = st.executeQuery("SELECT* FROM Folder");
                while(rs.next()){
                    if(FolderID == (rs.getInt("Folder_ID")))
                    {
                        return rs.getString("Folder_Name");
                    }
                }
                
            } catch (SQLException ex) {
            Logger.getLogger(CSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
            return name;
        }
        
        public int getFolderID(String FolderName){
            
            int name = 0;
            try{
                st = con.createStatement();
                ResultSet rs = st.executeQuery("SELECT* FROM Folder");
                while(rs.next()){
                    if(FolderName.equals(rs.getString("Folder_Name")))
                    {
                        return rs.getInt("Folder_ID");
                    }
                }
                
            } catch (SQLException ex) {
            Logger.getLogger(CSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
            return name;
        }
        
        public void searchfile(String name, fSearch s, int userID){
                        JDialog j = new JDialog();

        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT* FROM Files");
            DefaultTableModel tbl = (DefaultTableModel) s.tblSearch.getModel();
            tbl.setRowCount(0);
            while(rs.next()){
                
                if(rs.getString("File_Name").contains(name)&& userID == rs.getInt("User_ID")){
                    String filename = rs.getString("File_Name");
                    
                    Object[] row = {filename};
                    tbl.addRow(row);
                }
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(CSQL.class.getName()).log(Level.SEVERE, null, ex);
        }

            
        }
        
        public void searchfolder(String name, fSearch s,int UserID){
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT* FROM Folder");
            DefaultTableModel tbl = (DefaultTableModel) s.tblSearch.getModel();
            tbl.setRowCount(0);
            
            while(rs.next()){
                if(rs.getString("Folder_Name").contains(name)&&UserID == rs.getInt("User_ID")){
                    String foldername = rs.getString("Folder_Name");
                    Object[] row = {foldername};
                    tbl.addRow(row);
                }

            }
           
        } catch (SQLException ex) {
            Logger.getLogger(CSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
        public Vector openFolder(String name, int UserID){
            Vector v = new Vector();
            
            
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT* FROM Folder");
            while(rs.next()){
                if(name.equals(rs.getString("Folder_Name"))&&UserID==rs.getInt("User_ID") ){
                    System.out.println("this is folder");
                    int folder_id = (rs.getInt("Folder_ID"));
                    v = getFile(folder_id);
                    
                }
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(CSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return v;
    }
        
        
        
        public void openFile(String name){
            
            
        try {
            Statement st;
            st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT* FROM Files");
            while(rs.next()){
                if(name.equals(rs.getString("File_Name"))){
                    System.out.println("this is a file");
                    System.out.println(rs.getString("File_Name"));
                    System.out.println(rs.getString("Size"));
                    System.out.println(rs.getString("Created_Date"));
                }
        }
        }catch (SQLException ex) {
            Logger.getLogger(CSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
            
                    
                
        }
        
        public boolean checkEmail(String mail){
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT* FROM User_Profile");
            
            while(rs.next()){
                if(mail.equals(rs.getString("User_Email"))){
                    
                    return true;
                }
            }
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return false;
    }
        
        public void renameFolder(String name, int folder_id){
        try {
            PreparedStatement st = con.prepareStatement("UPDATE Folder SET Folder_Name = '"+name+"' WHERE Folder_ID = '"+folder_id+"' ");
            st.executeUpdate();
            st.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
        
     public void renameFile(String name, int file_id){
        try {
            PreparedStatement st = con.prepareStatement("UPDATE Files SET File_Name = '"+name+"' WHERE File_ID = '"+file_id+"' ");
            st.executeUpdate();
            st.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }   
     
     
        
        public void deleteFolder(int folder_id){
            try{
                deleteFilebyFolder(folder_id);
                PreparedStatement st = con.prepareStatement("DELETE FROM Folder WHERE Folder_ID = '" + folder_id + "' ");
                st.executeUpdate();
                st.close();
                
            }
            catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        }
        
        public boolean deleteFilebyFolder(int folder_id){
            try{
                
                PreparedStatement pt = con.prepareStatement("DELETE FROM Files WHERE Folder_ID = '" + folder_id + "' ");
                pt.executeUpdate();
                pt.close();
                return true;
            }
            catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return false;
        }
        }
        
        public boolean deleteFile(int file_id){
            try{
                
                PreparedStatement pt = con.prepareStatement("DELETE FROM Files WHERE File_ID = '" + file_id + "' ");
                pt.executeUpdate();
                pt.close();
                return true;
            }
            catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return false;
        }
        }
        
                 public void moveFile(int file_ID, String folder_Name){
             try{
            PreparedStatement st = con.prepareStatement("UPDATE Files SET Folder_ID = '" + getFolderID(folder_Name) + "' WHERE File_ID = '" + file_ID + "' ");
            st.executeUpdate();
            st.close();
             }
             catch(SQLException ex){
                 System.out.println(ex);
             }
         }    
        
        
        public int GetFileID(String File_Name  , int UserID){
            int name = 0;
            try{
                st = con.createStatement();
                ResultSet rs = st.executeQuery("SELECT* FROM Files");
                while(rs.next()){
                    if(File_Name.equals(rs.getString("File_Name"))&& UserID == rs.getInt("User_ID"))
                    {
                        return rs.getInt("File_ID");
                    }
                }
                
            } catch (SQLException ex) {
            Logger.getLogger(CSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
            return name;

        }
        
        public boolean checkPassword(String password, int userid){
            
        try {
            Statement st;
            st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT* FROM User_Profile");
            while(rs.next()){
                if(password.equals(rs.getString("User_Password")) && userid == (rs.getInt("User_ID"))){
                    return true;
                }
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(CSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;    
    }
        
        
        public void OpenFile(String Name , File f,int userID){
            
            int b = 0;
            
            f= new File("DownloadedFolder");
            if(!f.exists()){
                f.mkdir();
            }
            try{
                Statement at = con.createStatement();
                ResultSet rs = at.executeQuery("SELECT* FROM Files");
                while(rs.next())
                {
                    if(Name.equals(rs.getString("File_Name"))&& userID==rs.getInt("User_ID")){
                    byte[] im = rs.getBytes("Scanned_Document");
                    f = new File("DownloadedFolder//"+Name);

                    ByteArrayInputStream is = new ByteArrayInputStream(im);
                    
                    FileOutputStream fos = new FileOutputStream(f);
                    
                    if(is.available()>=0){
                    
                    
                        
                    while ((b = is.read()) != -1){
                        System.out.println(b);
                        System.out.println("sbr karle naa...");
                        fos.write(b); 
                    }
                }
                }
            }
            System.out.println(rs.getString("File_Name"));
            
        }
            catch(SQLException | IOException x){
                System.out.println(x.getMessage());
            }
            
            try{
                
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+"..\\musabbiha\\DownloadedFolder\\"+Name);
            }
            
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        public int GetTypeID(String nameoffile , int userID){
            int id=0;
            try{
                st = con.createStatement();
                ResultSet rs = st.executeQuery("SELECT* FROM Files");
                while(rs.next()){
                    if(nameoffile.equals(rs.getString("File_Name"))&& userID == rs.getInt("User_ID"))
                    {
                        System.out.println("yahan agaya");
                        return rs.getInt("Type_ID");
                    }
                }
                
            } catch (SQLException ex) {
            Logger.getLogger(CSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
            return 0;
        }
        public byte[] getImageThumb(String nameoffile , int userID)
        {
            try{
                st = con.createStatement();
                ResultSet rs = st.executeQuery("SELECT* FROM Files");
                while(rs.next()){
                    if(nameoffile.equals(rs.getString("File_Name"))&& userID == rs.getInt("User_ID"))
                    {
                        System.out.println("yahan agaya");
                        return rs.getBytes("Scanned_Document");
                    }
                }
                
            } catch (SQLException ex) {
            Logger.getLogger(CSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
            return null;
        }
    
        public void editName(String name, int user_id){
        try {
            PreparedStatement st = con.prepareStatement("UPDATE User_Profile SET User_Name = '" + name + "' WHERE User_ID = '" + user_id + "' ");
            st.executeUpdate();
            st.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        }
        
        public void editAddress(String name, int user_id){
        try {
            PreparedStatement st = con.prepareStatement("UPDATE User_Profile SET User_Address = '" + name + "' WHERE User_ID = '" + user_id + "' ");
            st.executeUpdate();
            st.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        }
        

   public void editNumber(String name, int user_id){
        try {
            PreparedStatement st = con.prepareStatement("UPDATE User_Profile SET User_Contact = '" + name + "' WHERE User_ID = '" + user_id + "' ");
            st.executeUpdate();
            st.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        }
        
        public void editDp(byte[] name, int user_id){
        try {
            PreparedStatement st = con.prepareStatement("UPDATE User_Profile SET User_DP = '" + name + "' WHERE User_ID = '" + user_id + "' ");
            st.executeUpdate();
            st.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        }
        
        public void editPassword(String name, String user_email){
        try {
            PreparedStatement st = con.prepareStatement("UPDATE User_Profile SET User_Password = '" + name + "' WHERE User_Email = '" + user_email + "' ");
            st.executeUpdate();
            st.close();
            JOptionPane.showMessageDialog(null, "PASSWORD CHANGED...");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }
        }
        
        public void editPasswordUserID(String name, int user_id){
        try {
            PreparedStatement st = con.prepareStatement("UPDATE User_Profile SET User_Password = '" + name + "' WHERE User_ID = '" + user_id + "' ");
            st.executeUpdate();
            st.close();
            JOptionPane.showMessageDialog(null, "PASSWORD CHANGED!");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }
        }
        
        public int countFiles(int userID){
            int count = 0;
            try{
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT* FROM Files");
            while(rs.next()){
                if(userID == rs.getInt("User_ID")){
                    count++;
                }
            }
        }
            catch(SQLException ex){
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
            return count;
        }
        
        public int countFolder(int userID){
            int count = 0;
            try{
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT* FROM Folder");
            while(rs.next()){
                if(userID == rs.getInt("User_ID")){
                    count++;
                }
            }
        }
            catch(SQLException ex){
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
            return count;
        }
        public void UpdateFileLog(int FileID){
          try {
            
            PreparedStatement ps = con.prepareStatement("INSERT INTO File_Log(File_ID, Log_Date) VALUES(?, ?)");
            ps.setInt(1, FileID);
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
            String date;
            Date d = new Date();  
            date = formatter.format(d);
             
            ps.setString(2,date.toString() );
            ps.execute();
            ps.close();
        } 
        catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex.getMessage());
        }  
        }
        
        public Vector rerieveLog(int fileid){
            Vector v = new Vector();
            try{
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("SELECT* FROM File_Log");
                while(rs.next()){
                    if(fileid == rs.getInt("File_ID")){
                        v.add(rs.getString("Log_Date"));
                    }
                }
            }
            catch(SQLException ex){
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
            return v;
        }
        public boolean CheckFolder(String s){
            return true;
        }
}
 



