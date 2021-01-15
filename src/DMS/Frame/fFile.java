package musabbiha.Frame;

import java.awt.Color;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.table.DefaultTableModel;
import musabbiha.Classes.CSQL;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author XPENDER
 */
public class fFile extends javax.swing.JFrame {
    
    public Vector logg;
    File openfile = new File("") ;
    boolean maximize;
    public int xMouse, yMouse, userID, fileid;
    String FolderName = "";
    public String foldername, filename, fileize, filedate, filetype;
    
    /**
     * Creates new form File
     */
    public fFile() {
        initComponents();
        
        lblFileName.setVisible(false);
        lblFileDate.setVisible(false);
        lblFileIcon.setVisible(false);
        
         try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                   
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(fFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerPanel = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        btnMaxMin = new javax.swing.JButton();
        btnMin = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblFolderName = new javax.swing.JLabel();
        lblCreatedDate = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFile = new javax.swing.JTable();
        lblFileName = new javax.swing.JLabel();
        lblFileDate = new javax.swing.JLabel();
        lblFileIcon = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        headerPanel.setBackground(new java.awt.Color(255, 255, 255));
        headerPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerPanelMouseDragged(evt);
            }
        });
        headerPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerPanelMousePressed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(255, 255, 255));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musabbiha/icon/cancel.png"))); // NOI18N
        btnExit.setBorder(null);
        btnExit.setContentAreaFilled(false);
        btnExit.setOpaque(true);
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExitMouseExited(evt);
            }
        });

        btnMaxMin.setBackground(new java.awt.Color(255, 255, 255));
        btnMaxMin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musabbiha/icon/add.png"))); // NOI18N
        btnMaxMin.setBorder(null);
        btnMaxMin.setContentAreaFilled(false);
        btnMaxMin.setOpaque(true);
        btnMaxMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMaxMinMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMaxMinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMaxMinMouseExited(evt);
            }
        });

        btnMin.setBackground(new java.awt.Color(255, 255, 255));
        btnMin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musabbiha/icon/minimize1.png"))); // NOI18N
        btnMin.setBorder(null);
        btnMin.setContentAreaFilled(false);
        btnMin.setOpaque(true);
        btnMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMinMouseExited(evt);
            }
        });
        btnMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addGap(0, 834, Short.MAX_VALUE)
                .addComponent(btnMin, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMaxMin, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnMin, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
            .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnMaxMin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musabbiha/icon/folder.png"))); // NOI18N
        jLabel1.setToolTipText("");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 204, 153)));

        lblFolderName.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lblFolderName.setForeground(new java.awt.Color(255, 153, 153));
        lblFolderName.setText("Folder Name");

        lblCreatedDate.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblCreatedDate.setForeground(new java.awt.Color(255, 153, 153));
        lblCreatedDate.setText("Created Date");

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        tblFile.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        tblFile.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        tblFile.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "File Name", "Created Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblFile.setGridColor(new java.awt.Color(255, 255, 255));
        tblFile.setSelectionBackground(new java.awt.Color(204, 204, 204));
        tblFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblFileMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblFile);

        lblFileName.setBackground(new java.awt.Color(51, 51, 51));
        lblFileName.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        lblFileName.setForeground(new java.awt.Color(51, 51, 51));
        lblFileName.setText("File Name");

        lblFileDate.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblFileDate.setForeground(new java.awt.Color(51, 51, 51));
        lblFileDate.setText("Created Date");

        lblFileIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pdf.png"))); // NOI18N

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musabbiha/icon/add-file.png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 255)));

        jLabel3.setBackground(new java.awt.Color(204, 204, 255));
        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Upload File");
        jLabel3.setOpaque(true);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFolderName)
                                    .addComponent(lblCreatedDate))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblFileIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFileName)
                                    .addComponent(lblFileDate)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 916, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(23, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblFileName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblFileDate))
                            .addComponent(lblFileIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblFolderName)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblCreatedDate)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        File F = new File("DownloadedFolder");
        if(F.exists()){

            File[] listoffiles = F.listFiles();
            for (int i = 0; i < listoffiles.length; i++) {
                listoffiles[i].delete();
            }
                this.dispose();
        }
        else{
            System.out.println("Han bhai masla hy");
        }
    }//GEN-LAST:event_btnExitMouseClicked

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
        btnExit.setBackground(new Color (255,102,102));
    }//GEN-LAST:event_btnExitMouseEntered

    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited
        btnExit.setBackground(Color.white);
    }//GEN-LAST:event_btnExitMouseExited

    private void btnMaxMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMaxMinMouseClicked
        if(maximize){
            this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment evn = GraphicsEnvironment.getLocalGraphicsEnvironment();
            this.setMaximizedBounds(evn.getMaximumWindowBounds());
            maximize = false;
        }
        else{
            setExtendedState(JFrame.NORMAL);
            maximize = true;
        }
    }//GEN-LAST:event_btnMaxMinMouseClicked

    private void btnMaxMinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMaxMinMouseEntered
        btnMaxMin.setBackground(new Color (204,204,204));
    }//GEN-LAST:event_btnMaxMinMouseEntered
    public void Refresh(CSQL s){
        DefaultTableModel model = (DefaultTableModel) this.tblFile.getModel();
        model.setRowCount(0);
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Document","sa", "musabbiha@18");
            
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT* FROM Files");
                            
            while(rs.next()){
                if(rs.getInt("Folder_ID") == s.searchFolder(lblFolderName.getText(),userID)&& userID == rs.getInt("User_ID")){

                   
                    System.out.println("HAN ANDER AGAYA");
                    
                    rs.getBytes("Scanned_Document");
                    Object[] row = {rs.getString("File_Name"),rs.getString("Created_Date") };

                    model.addRow(row);   
                }
            }
        }
                       
        catch (ClassNotFoundException|SQLException ex) {
        JOptionPane.showMessageDialog(null, ex.getMessage());
    }
    }
    private void btnMaxMinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMaxMinMouseExited
        btnMaxMin.setBackground(Color.white);
    }//GEN-LAST:event_btnMaxMinMouseExited

    private void btnMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_btnMinMouseClicked

    private void btnMinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinMouseEntered
        btnMin.setBackground(new Color (204,204,204));
    }//GEN-LAST:event_btnMinMouseEntered

    private void btnMinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinMouseExited
        btnMin.setBackground(Color.white);
    }//GEN-LAST:event_btnMinMouseExited

    private void btnMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMinActionPerformed

    private void headerPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerPanelMouseDragged
        if(maximize){
            int x = evt.getXOnScreen();
            int y = evt.getYOnScreen();
            this.setLocation(x - xMouse, y - yMouse);
        }
    }//GEN-LAST:event_headerPanelMouseDragged

    private void headerPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerPanelMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerPanelMousePressed
    public ImageIcon ResizeImage(byte[] ImagePath){
        ImageIcon i = new ImageIcon(new ImageIcon(ImagePath).getImage().getScaledInstance(100,100, Image.SCALE_SMOOTH));
        return i;
    }
    
    private void addExeIcon(String FileName,CSQL s){
        CSQL snew = new CSQL();
        snew.connection();
        
        int typeid = snew.GetTypeID(FileName, 3);
        System.out.println(typeid);
        if(typeid==1){
            System.out.println("heyyy");
            this.lblFileIcon.setIcon(this.ResizeImage(snew.getImageThumb(FileName, userID)));
            lblFileIcon.setVisible(true);
        }
        validate();
        repaint();
    }
    private void tblFileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFileMouseClicked
        // TODO add your handling code here:
        CSQL s = new CSQL();
        s.connection();
        DefaultTableModel f = (DefaultTableModel)this.tblFile.getModel();
        int row = this.tblFile.getSelectedRow();
        
        this.lblFileName.setText(f.getValueAt(row, 0).toString());
        
        lblFileName.setVisible(true);
        lblFileDate.setVisible(true);
        this.lblFileDate.setText(f.getValueAt(row, 1).toString());
        this.addExeIcon(f.getValueAt(row, 0).toString(), s);
        
        if(evt.getClickCount()==2 && evt.getButton() == MouseEvent.BUTTON1){
        s.connection();
        System.out.println("han");
        s.OpenFile(f.getValueAt(row, 0).toString(), openfile,userID);
        
        }
        else if(evt.getButton() == MouseEvent.BUTTON3||evt.isPopupTrigger()){
                            System.out.println("Right click hogya");
                            JPopupMenu popup = new JPopupMenu();
                             JMenuItem itemOpen = new JMenuItem("Open");
                            JMenuItem itemSend = new JMenuItem("Send");
                            JMenuItem itemRename = new JMenuItem("Rename");
                            JMenuItem itemDelete = new JMenuItem("Delete");
                            JMenuItem itemProperties = new JMenuItem("Properties");
                            JMenuItem itemMove = new JMenuItem("Move");
                            JMenuItem itemCopy = new JMenuItem("Copy");
                            
                            itemOpen.addActionListener(
                                    new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    s.connection();
                                    System.out.println("File is opening");
                                    s.OpenFile(f.getValueAt(row, 0).toString(), openfile,userID);
                                    s.UpdateFileLog(s.GetFileID(lblFileName.getText(), userID));
                                }
                            }
                             );
                            
                            itemSend.addActionListener(
                                    new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    
                                    String email = JOptionPane.showInputDialog("Enter the email of receiver!");
                                    
                                   
                                }
                            }
                       );
                       itemDelete.addActionListener(
                            new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                
                                int delete = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this?");
                                if(delete == 0){
                                    if(s.deleteFile(s.GetFileID(lblFileName.getText(), userID))){
                                    JOptionPane.showMessageDialog(null, "DELETED!!");
                                    
                                        Refresh(s);
                                    }
                                    
                                    System.out.println("han bhai");
                                    
                                }
                                else{
                                    
                                }
                                
                        }
                    }
                );
                       
                       itemCopy.addActionListener(
                            new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                               
                                String folder = JOptionPane.showInputDialog("Enter the folder name you want to copy to!");
                                
                        }
                    }
                );
                       
                       itemMove.addActionListener(
                            new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                
                                String folder = JOptionPane.showInputDialog("Enter the folder name you want to copy to!");
                                System.out.println(fileid);
                                if(folder!= null){
                                s.moveFile(s.GetFileID(lblFileName.getText(), userID), folder);
                                    Refresh(s);
                                }
                        }
                    }
                );
                       
                       itemProperties.addActionListener(
                            new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                
                                Properties p = new Properties();
                                p.setVisible(true);
                                p.setLocationRelativeTo(null);
                                p.lblFileName.setText(filename);
                                p.lblSize.setText(fileize);
                                p.lblCreatedDate.setText(filedate);
                                p.lblLocation.setText(foldername);
                                p.lblType.setText(filetype);
                                p.log = s.rerieveLog(s.GetFileID(filename, userID));
                                p.addLog();
                        }
                    }
                );
                       
                       itemRename.addActionListener(
                            new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                
                                String Rename = JOptionPane.showInputDialog("Enter new name for the file!");
                                if(Rename!=null){
                                s.renameFile(Rename, s.GetFileID(lblFileName.getText(), userID));
                                    Refresh(s);
                                }
                                
                                
                        }
                    }
                );
                       
                      
                popup.add(itemOpen);
                popup.add(itemSend);
                popup.add(itemMove);
                popup.add(itemCopy);
                popup.add(itemDelete);
                popup.add(itemRename);
                popup.add(itemProperties);
                
                popup.setVisible(true);
                popup.show(tblFile, evt.getX(), evt.getY());
                addMouseListener(
                    new MouseListener() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                        popup.setVisible(false);
                    }

                        @Override
                        public void mousePressed(MouseEvent e) {
                        popup.setVisible(false);
                    }

                        @Override
                        public void mouseReleased(MouseEvent e) {
                        popup.setVisible(false);
                    }

                        @Override
                        public void mouseEntered(MouseEvent e) {

                        }

                        @Override
                        public void mouseExited(MouseEvent e) {

                        }
                });
            }    }//GEN-LAST:event_tblFileMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        JFileChooser jFileChooser1 = new JFileChooser();
          jFileChooser1.setCurrentDirectory(new File(System.getProperty("user.home")));
//        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg", "gif", "png");
        //jFileChooser1.addChoosableFileFilter(filter);
           int result = jFileChooser1.showSaveDialog(null);
        if(result == JFileChooser.APPROVE_OPTION){
            try {
                File selectedFile = jFileChooser1.getSelectedFile();
          //      String path = selectedFile.getAbsolutePath();
                //image.setIcon(ResizeImage(path));
            //    File file = new File(path);
            String File_Name = selectedFile.getName();
            String Size=Long.toString(selectedFile.getTotalSpace());
            System.out.println(File_Name);
            String extension = "";

            int i = File_Name.lastIndexOf('.');
            if (i > 0) {
                    extension = File_Name.substring(i+1);
                    }
            else 
                {
                    extension = "OTHER";
    
                }
                String ext = extension.toUpperCase();
                CSQL s = new CSQL();
        
                s.connection();
                int Type_ID= s.getTypeId(ext);
                System.out.println(Type_ID);
                int Folder_ID = s.getFolderID(lblFolderName.getText());
                System.out.println(FolderName+ " " + Folder_ID );
                FileInputStream f;
                f = new FileInputStream(selectedFile);
                ByteArrayOutputStream b = new ByteArrayOutputStream();
                byte[] buff = new byte[2048];
                for(int a ; (a=f.read(buff))!=-1;)
                {
                    b.write(buff, 0, a);
                }
                byte[] Scanned_Document = b.toByteArray();
                System.out.println(Scanned_Document);
                Date d = new Date();  
                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
                String Created_Date = formatter.format(d);
                Size= Long.toString(selectedFile.length());
                s.addFiles(File_Name, Created_Date, Size, Scanned_Document, Folder_ID, Type_ID, userID);
                                Object[] row = {File_Name,Type_ID,Created_Date,Size };


            DefaultTableModel model = (DefaultTableModel) this.tblFile.getModel();

            model.addRow(row); 
    
//            selectedFile.
//            rimage = path;
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }

        else if(result == JFileChooser.CANCEL_OPTION){
            System.out.println("Error");
        }

        
    }//GEN-LAST:event_jLabel3MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
       
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fFile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnMaxMin;
    private javax.swing.JButton btnMin;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lblCreatedDate;
    private javax.swing.JLabel lblFileDate;
    private javax.swing.JLabel lblFileIcon;
    private javax.swing.JLabel lblFileName;
    public javax.swing.JLabel lblFolderName;
    public javax.swing.JTable tblFile;
    // End of variables declaration//GEN-END:variables
}