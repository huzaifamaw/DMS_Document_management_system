package musabbiha.Frame;

import musabbiha.Frame.fFile;
import musabbiha.Classes.CSQL;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Frame;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URI;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.table.DefaultTableModel;
import musabbiha.*;
        

public class fDashboard extends javax.swing.JFrame {

    public String UserName, UserEmail, UserAddress, UserNumber, UserPassword;
    public byte[] UserDp;
    public int NumOfFolder, NumOfFiles;
    
    public static boolean maximize = true;
    Vector folderaname ;
    int xMouse;
    int yMouse;
    public int userID;
    boolean b = true, b1 = true;
    
    public fDashboard() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel16 = new javax.swing.JLabel();
        headerPanel = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        btnMaxMin = new javax.swing.JButton();
        btnMin = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblLogOut = new javax.swing.JLabel();
        lblLearnMore = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lblImageProfile = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        pnlFolder = new javax.swing.JPanel();
        lblType = new javax.swing.JLabel();
        lblFolder = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        AddFolder = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblSearchFolder = new javax.swing.JLabel();
        lblSearchFile = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblGmail = new javax.swing.JLabel();
        lblFacebook = new javax.swing.JLabel();
        lblWhatsApp = new javax.swing.JLabel();
        lblInsta = new javax.swing.JLabel();

        jLabel16.setText("jLabel16");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dashboard");
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
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnMin, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMaxMin, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnMin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnMaxMin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblName.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        lblName.setText("Name");

        lblEmail.setBackground(new java.awt.Color(102, 102, 102));
        lblEmail.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(102, 102, 102));
        lblEmail.setText("Email");

        lblLogOut.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        lblLogOut.setForeground(new java.awt.Color(0, 153, 204));
        lblLogOut.setText("Log out");
        lblLogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogOutMouseClicked(evt);
            }
        });

        lblLearnMore.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        lblLearnMore.setForeground(new java.awt.Color(0, 153, 204));
        lblLearnMore.setText("Learn more.");
        lblLearnMore.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLearnMore.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLearnMoreMouseClicked(evt);
            }
        });

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblImageProfile.setMaximumSize(new java.awt.Dimension(4, 4));
        lblImageProfile.setMinimumSize(new java.awt.Dimension(4, 4));
        lblImageProfile.setPreferredSize(new java.awt.Dimension(4, 4));
        jPanel6.add(lblImageProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 100));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblName)
                    .addComponent(lblEmail)
                    .addComponent(lblLearnMore))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogOut)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblLearnMore))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(lblLogOut)
                .addContainerGap())
        );

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 21)); // NOI18N
        jTabbedPane1.setOpaque(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 0, 255));
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 102));
        jLabel1.setText("WELCOME!");

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("To Document Management System");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("A platform which helps you to organize your file, customize your files,");

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("save your files, send your files all in one user friendly inteface");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(443, 443, 443)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(274, 274, 274))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(272, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(200, 200, 200))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(241, 241, 241))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(1, 1, 1)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("      DMS      ", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlFolder.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.add(pnlFolder, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 808, 230));

        lblType.setBackground(new java.awt.Color(255, 153, 153));
        lblType.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblType.setForeground(new java.awt.Color(255, 255, 255));
        lblType.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblType.setText("  Type  ");
        lblType.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblType.setOpaque(true);
        lblType.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTypeMouseClicked(evt);
            }
        });
        jPanel3.add(lblType, new org.netbeans.lib.awtextra.AbsoluteConstraints(828, 106, 115, -1));

        lblFolder.setBackground(new java.awt.Color(255, 204, 153));
        lblFolder.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblFolder.setForeground(new java.awt.Color(255, 255, 255));
        lblFolder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFolder.setText("Folder");
        lblFolder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblFolder.setOpaque(true);
        lblFolder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFolderMouseClicked(evt);
            }
        });
        jPanel3.add(lblFolder, new org.netbeans.lib.awtextra.AbsoluteConstraints(828, 253, 115, -1));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musabbiha/icon/document.png"))); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 204, 204)));
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(828, 18, 115, 88));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musabbiha/icon/folder.png"))); // NOI18N
        jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 204, 153)));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(828, 153, 115, 100));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musabbiha/icon/folder.png"))); // NOI18N
        jLabel17.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 102, 255)));
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 250, 40, 30));

        AddFolder.setBackground(new java.awt.Color(204, 102, 255));
        AddFolder.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        AddFolder.setForeground(new java.awt.Color(255, 255, 255));
        AddFolder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AddFolder.setText("Add Folder");
        AddFolder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddFolder.setOpaque(true);
        AddFolder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddFolderMouseClicked(evt);
            }
        });
        jPanel3.add(AddFolder, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 250, 90, 30));

        jTabbedPane1.addTab("      FOLDERS      ", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musabbiha/icon/folderr.png"))); // NOI18N
        jLabel13.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 102, 255)));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musabbiha/icon/pdf.png"))); // NOI18N
        jLabel14.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 102, 102)));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        lblSearchFolder.setBackground(new java.awt.Color(102, 102, 255));
        lblSearchFolder.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblSearchFolder.setForeground(new java.awt.Color(255, 255, 255));
        lblSearchFolder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSearchFolder.setText("Folder");
        lblSearchFolder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSearchFolder.setOpaque(true);
        lblSearchFolder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSearchFolderMouseClicked(evt);
            }
        });

        lblSearchFile.setBackground(new java.awt.Color(255, 102, 102));
        lblSearchFile.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblSearchFile.setForeground(new java.awt.Color(255, 255, 255));
        lblSearchFile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSearchFile.setText("File");
        lblSearchFile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSearchFile.setOpaque(true);
        lblSearchFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSearchFileMouseClicked(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel15.setText("What do you want to search?");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 215, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSearchFolder, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSearchFile, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSearchFolder)
                    .addComponent(lblSearchFile))
                .addContainerGap(160, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("      SEARCH      ", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel7.setText("You can find us on social media");

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel8.setText("Links are given below");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musabbiha/icon/gmail.png"))); // NOI18N
        jLabel9.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 51, 51)));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musabbiha/icon/facebook.png"))); // NOI18N
        jLabel10.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 102, 255)));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musabbiha/icon/whatsapp.png"))); // NOI18N
        jLabel11.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 204, 153)));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musabbiha/icon/instagram.png"))); // NOI18N
        jLabel12.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 204)));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        lblGmail.setBackground(new java.awt.Color(255, 51, 51));
        lblGmail.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblGmail.setForeground(new java.awt.Color(255, 255, 255));
        lblGmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGmail.setText("Gmail");
        lblGmail.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblGmail.setOpaque(true);

        lblFacebook.setBackground(new java.awt.Color(102, 102, 255));
        lblFacebook.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblFacebook.setForeground(new java.awt.Color(255, 255, 255));
        lblFacebook.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFacebook.setText("Facebook");
        lblFacebook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblFacebook.setOpaque(true);

        lblWhatsApp.setBackground(new java.awt.Color(0, 204, 153));
        lblWhatsApp.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblWhatsApp.setForeground(new java.awt.Color(255, 255, 255));
        lblWhatsApp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWhatsApp.setText("WhatsApp");
        lblWhatsApp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblWhatsApp.setOpaque(true);

        lblInsta.setBackground(new java.awt.Color(255, 153, 204));
        lblInsta.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblInsta.setForeground(new java.awt.Color(255, 255, 255));
        lblInsta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInsta.setText("Instagram");
        lblInsta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblInsta.setOpaque(true);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(386, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(387, 387, 387))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(344, 344, 344))))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGmail, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(89, 89, 89)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblFacebook, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(103, 103, 103)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblWhatsApp, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblInsta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(33, 33, 33)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblFacebook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblWhatsApp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblInsta, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lblGmail, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60))
        );

        jTabbedPane1.addTab("      CONTACT US      ", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTabbedPane1))
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("      Welcome      ");

        setSize(new java.awt.Dimension(984, 561));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMinActionPerformed
    public ImageIcon ResizeImage(byte[] ImagePath){
        ImageIcon i = new ImageIcon(new ImageIcon(ImagePath).getImage().getScaledInstance(100,100, Image.SCALE_SMOOTH));
        return i;
    }
    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
        btnExit.setBackground(new Color (255,102,102));
    }//GEN-LAST:event_btnExitMouseEntered

    private void btnMaxMinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMaxMinMouseEntered
        btnMaxMin.setBackground(new Color (204,204,204));
    }//GEN-LAST:event_btnMaxMinMouseEntered

    private void btnMinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinMouseEntered
        btnMin.setBackground(new Color (204,204,204));
    }//GEN-LAST:event_btnMinMouseEntered

    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited
        btnExit.setBackground(Color.white);
    }//GEN-LAST:event_btnExitMouseExited

    private void btnMaxMinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMaxMinMouseExited
        btnMaxMin.setBackground(Color.white);
    }//GEN-LAST:event_btnMaxMinMouseExited

    private void btnMinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinMouseExited
        btnMin.setBackground(Color.white);
    }//GEN-LAST:event_btnMinMouseExited

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnExitMouseClicked

    private void btnMaxMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMaxMinMouseClicked
        if(maximize){
            fDashboard.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment evn = GraphicsEnvironment.getLocalGraphicsEnvironment();
            fDashboard.this.setMaximizedBounds(evn.getMaximumWindowBounds());
            maximize = false;
        }
        else{
            setExtendedState(JFrame.NORMAL);
            maximize = true;
        }
    }//GEN-LAST:event_btnMaxMinMouseClicked

    private void btnMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinMouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_btnMinMouseClicked

    private void headerPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerPanelMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerPanelMousePressed

    private void headerPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerPanelMouseDragged
        if(maximize){
            int x = evt.getXOnScreen();
            int y = evt.getYOnScreen();
            this.setLocation(x - xMouse, y - yMouse);
        }
    }//GEN-LAST:event_headerPanelMouseDragged

    private void lblTypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTypeMouseClicked
        pnlFolder.removeAll();
        if(b){
        
            b1=true;    
            CSQL s = new CSQL();
            s.connection();
            
            ImageIcon im = new ImageIcon(getClass().getResource("/musabbiha/icon/folderr.png"));
            
            Vector v = new Vector();
            v = s.getTypeName();
            for (int i = 0; i < v.size(); i++) {
                System.out.println("ander aya tha");
                JLabel lbl= new JLabel();
                lbl.setText((String) v.elementAt(i));
                lbl.setIcon(im);       
                lbl.setIconTextGap(20);
                lbl.setHorizontalTextPosition(JLabel.CENTER);
                lbl.setVerticalTextPosition(JLabel.BOTTOM);
                pnlFolder.add(lbl);
                validate();
                repaint();
                lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        s.connection();
                        if (lbl.getText().equals("JPG")){
                            
                        }
                        int typeid = s.getTypeId(lbl.getText());
                        fFile fil = new fFile();

                        try {
                            
                            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                            Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Document","sa", "musabbiha@18");
                            Statement st = con.createStatement();
                            ResultSet rs = st.executeQuery("SELECT* FROM Files");
                            while(rs.next()){
                                if(typeid == rs.getInt("Type_ID") && userID == rs.getInt("User_ID") ){
                                    Object[] row = {rs.getString("File_Name"), rs.getString("Created_Date"), rs.getString("Size")};
                                    byte[] file = rs.getBytes("Scanned_Document");
                                    
                                    DefaultTableModel tbl = (DefaultTableModel) fil.tblFile.getModel();
                                    tbl.addRow(row);
                                    
                                }
                                
                            }
                            
            
                        } catch (SQLException | ClassNotFoundException ex) {
                            Logger.getLogger(fDashboard.class.getName()).log(Level.SEVERE, null, ex);
                        }
                                        fil.setVisible(true);
                                        fil.setLocationRelativeTo(null);

                        
                    }
            });
            
            
         b=false;   
        }
        }
                                       

    }//GEN-LAST:event_lblTypeMouseClicked

    private void lblFolderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFolderMouseClicked
        System.out.println("han");

        if(b1){
            System.out.println("han");
             pnlFolder.removeAll();
             validate();
             repaint();
             b=true;
             CSQL sql = new CSQL();
             sql.connection();
             folderaname = new Vector();
             System.out.println(userID);
             
             folderaname = sql.getFolder(userID);
             
            for (int i = 0; i <folderaname.size(); i++) {
                System.out.println("ander aya yahan bhi");
                JLabel l = new JLabel((String) folderaname.elementAt(i));
                ImageIcon img = new ImageIcon(getClass().getResource("/musabbiha/icon/folderr.png"));
                l.setIconTextGap(20);
                l.setIcon(img);
                l.setHorizontalTextPosition(JLabel.CENTER);
                l.setVerticalTextPosition(JLabel.BOTTOM);
                pnlFolder.add(l);
            
            validate();
            repaint();
                
                l.addMouseListener(new java.awt.event.MouseAdapter() {
            
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        
                        if(evt.getClickCount() == 2 && evt.getButton()== MouseEvent.BUTTON1){
                                        
                            openfile(sql, l);
                    }
                    else if(evt.getButton() == MouseEvent.BUTTON3||evt.isPopupTrigger()){
                            System.out.println("Right click hogya");
                            JPopupMenu popup = new JPopupMenu();
                            JMenuItem item1 = new JMenuItem("Open");
                            JMenuItem item2 = new JMenuItem("Rename");
                            JMenuItem item3 = new JMenuItem("Delete");
                            
                            item1.addActionListener(
                                    new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    openfile(sql, l);
                                }
                            }
                             );
                            
                            item2.addActionListener(
                                    new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    
                                    String input = JOptionPane.showInputDialog("Enter new name");
                                    sql.renameFolder(input, sql.searchFolder(l.getText(),userID));
                                    
                                    b1 = true;
                                    pnlFolder.removeAll();
                                    validate();
                                    repaint();
                                    lblFolderMouseClicked(evt);
                                }
                            }
                       );
                       item3.addActionListener(
                            new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                            int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this?", "Delete", JOptionPane.YES_NO_OPTION);
                            if(p==0){
                                sql.deleteFolder(sql.searchFolder(l.getText(),userID));
                               b1=true;
                               pnlFolder.removeAll();
                               validate();
                               repaint();
                                lblFolderMouseClicked(evt);
                                
                            }      
                        }
                    }
                );
                popup.add(item1);
                popup.add(item2);
                popup.add(item3);
                popup.setVisible(true);
                popup.show(l, evt.getX(), evt.getY());
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
                        throw new UnsupportedOperationException("abey nh chal rha");
                    }

                        @Override
                        public void mouseExited(MouseEvent e) {
                        throw new UnsupportedOperationException("abey nh chal rha naa");
                    }
                });
            }
        }
                    
    public void mouseEntered(java.awt.event.MouseEvent evt) {
        l.setForeground(Color.red);
    }
                
    public void mouseExited(java.awt.event.MouseEvent evt) {
        l.setForeground(Color.BLACK);
    }

                    private void addMouseListener(MouseListener mouseListener) {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }
        
                });
            
        }
        b1=false;
                }
    
    }//GEN-LAST:event_lblFolderMouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        
    
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
       fSearch search = new fSearch();
       search.FolderStatus=1;
       search.setVisible(true);
       search.isAlwaysOnTop();
       search.userID=userID;
       search.setLocationRelativeTo(null);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
       fSearch search = new fSearch();
       search.FileStatus=1;
       search.setVisible(true);
       search.isAlwaysOnTop();
       search.userID=userID;
       search.setLocationRelativeTo(null);    }//GEN-LAST:event_jLabel14MouseClicked

    private void lblSearchFolderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSearchFolderMouseClicked
        // TODO add your handling code here:
        fSearch search = new fSearch();
       search.FolderStatus=1;
       search.setVisible(true);
       search.isAlwaysOnTop();
       search.userID=userID;
       search.setLocationRelativeTo(null);
    }//GEN-LAST:event_lblSearchFolderMouseClicked

    private void lblSearchFileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSearchFileMouseClicked
        // TODO add your handling code here:
        fSearch search = new fSearch();
       search.FileStatus=1;
       search.setVisible(true);
       search.isAlwaysOnTop();
       search.userID=userID;
       search.setLocationRelativeTo(null);
    }//GEN-LAST:event_lblSearchFileMouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
            try {
            Desktop desktop = java.awt.Desktop.getDesktop();
            URI oURL = new URI("https://www.facebook.com/Huzaifamaw");
            desktop.browse(oURL);
} catch (Exception e) {
  e.printStackTrace();
}
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
                try {
            Desktop desktop = java.awt.Desktop.getDesktop();
            URI oURL = new URI("https://www.instagram.com/huzaifamaw/");
            desktop.browse(oURL);
} catch (Exception e) {
  e.printStackTrace();

}
    }//GEN-LAST:event_jLabel12MouseClicked

    private void lblLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogOutMouseClicked
        this.dispose();
        fLogin l = new fLogin();
        l.setVisible(true);
        l.setLocationRelativeTo(null);
    }//GEN-LAST:event_lblLogOutMouseClicked

    private void lblLearnMoreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLearnMoreMouseClicked
        fUserDetail p = new fUserDetail();
        p.setVisible(true);
        p.setLocationRelativeTo(null);
        p.lblUserName.setText(UserName);
        p.lblUserAddress.setText(UserAddress);
        p.lblUserEmail.setText(UserEmail);
        p.lblUserNumber.setText(UserNumber);
        p.password = UserPassword;
        p.lblDp.setIcon(this.ResizeImage(UserDp));
        p.UserID = userID;
        p.lblNumberOfFiles.setText(Integer.toString(this.NumOfFiles));
        p.lblNumberOfFolders.setText(Integer.toString(this.NumOfFolder));
    }//GEN-LAST:event_lblLearnMoreMouseClicked

    private void AddFolderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddFolderMouseClicked
        
        CSQL sql = new CSQL();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
        String date;
        int numofiles;
        String input = JOptionPane.showInputDialog("Enter new Folder Name: ");
       
        Date d = new Date();  
        date = formatter.format(d);
        numofiles = 0;
        
        if( date !=null && input != null && this.userID!=0)
        {
            sql.connection();
            if(sql.addFolder(input, date, numofiles, this.userID)){
                
                pnlFolder.removeAll();
                validate();
                repaint();
                b1=true;
                lblFolderMouseClicked(evt);
                
            }
            
        }

        
    }//GEN-LAST:event_AddFolderMouseClicked

    
    public void openfile(CSQL sql, JLabel l){
        System.out.println("HYYYYYY " + l.getText());
        fFile files = new fFile();
        files.FolderName=l.getText();
                        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Document","sa", "musabbiha@18");
            
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT* FROM Files");
                            
            while(rs.next()){
                if(rs.getInt("Folder_ID") == sql.searchFolder(l.getText(),userID)&& userID == rs.getInt("User_ID")){
                    rs.getInt("File_ID");
                    rs.getInt("Folder_ID");
                    rs.getInt("User_ID");
                    files.filename = rs.getString("File_Name");
                    files.filedate = rs.getString("Created_Date");
                    files.fileize = rs.getString("Size");
                    files.filetype = sql.getTypeName(rs.getInt("Type_ID"));
                    files.foldername = sql.getFolderName(rs.getInt("Folder_ID"));
                    files.fileid = rs.getInt("File_ID");
                    files.userID = userID;
                    
                    System.out.println("HAN ANDER AGAYA");
                    
                    rs.getBytes("Scanned_Document");
                    Object[] row = {rs.getString("File_Name"),rs.getString("Created_Date") };

                    DefaultTableModel model = (DefaultTableModel) files.tblFile.getModel();
                    model.addRow(row);   
                }
            }
        }
                       
        catch (ClassNotFoundException|SQLException ex) {
        System.out.println("ERROR MESSAGE: " + ex.getMessage());
    }
    files.lblFolderName.setText(l.getText());
    files.lblCreatedDate.setText(sql.getFolderDate(l.getText()));

    files.userID = userID;
    files.setVisible(true);
    files.setLocationRelativeTo(null);

    }
    
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(fDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fDashboard().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddFolder;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnMaxMin;
    private javax.swing.JButton btnMin;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFacebook;
    private javax.swing.JLabel lblFolder;
    private javax.swing.JLabel lblGmail;
    public javax.swing.JLabel lblImageProfile;
    private javax.swing.JLabel lblInsta;
    private javax.swing.JLabel lblLearnMore;
    private javax.swing.JLabel lblLogOut;
    public javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSearchFile;
    private javax.swing.JLabel lblSearchFolder;
    private javax.swing.JLabel lblType;
    private javax.swing.JLabel lblWhatsApp;
    public javax.swing.JPanel pnlFolder;
    // End of variables declaration//GEN-END:variables
}
