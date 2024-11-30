package mainfiles;

import java.awt.Color;
import java.awt.HeadlessException;
import java.io.*;
import java.sql.*;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.*;
import java.sql.PreparedStatement;

public class Home extends javax.swing.JFrame {
   
    String helpcont;
    String name;
    Connection con;
    PreparedStatement ps;
    Statement st;
    ResultSet rs;
    
    String dest = "D:/Stegograph/";
    
    public Home(String nm) {
        initComponents();
        name = nm.toUpperCase();
        dispname.setText(name);
        table_update();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        inbox = new javax.swing.JPanel();
        reft = new javax.swing.JButton();
        alldel = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jt = new javax.swing.JTable();
        singledel = new javax.swing.JButton();
        insave = new javax.swing.JButton();
        sendmsg = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        sendmto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        sendmsgb1 = new javax.swing.JTextField();
        browse1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        sendmsgbox = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        sendmsgb = new javax.swing.JButton();
        sizel = new javax.swing.JLabel();
        msgalert = new javax.swing.JLabel();
        sendfile = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        sendfto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        sendfileb2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        sendfileb3 = new javax.swing.JTextField();
        sendfileb = new javax.swing.JButton();
        browse2 = new javax.swing.JButton();
        browse3 = new javax.swing.JButton();
        sizel2 = new javax.swing.JLabel();
        sizel3 = new javax.swing.JLabel();
        encrypt = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        mpf = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        enmsgbox = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        enmsg = new javax.swing.JButton();
        sizel1 = new javax.swing.JLabel();
        enmsgalert = new javax.swing.JLabel();
        encryptfile = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        pf = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        fe = new javax.swing.JTextField();
        savefile = new javax.swing.JButton();
        browse6 = new javax.swing.JButton();
        browse7 = new javax.swing.JButton();
        efl1 = new javax.swing.JLabel();
        efl2 = new javax.swing.JLabel();
        decrypt = new javax.swing.JPanel();
        browse5 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        retrievefile = new javax.swing.JButton();
        fd = new javax.swing.JTextField();
        titlepanel = new javax.swing.JPanel();
        version1 = new javax.swing.JLabel();
        user1 = new javax.swing.JLabel();
        dispname = new javax.swing.JLabel();
        title1 = new javax.swing.JLabel();
        logu = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        file = new javax.swing.JMenu();
        settings = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        logout = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        exit = new javax.swing.JMenuItem();
        help = new javax.swing.JMenu();
        checkupdate = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        report = new javax.swing.JMenuItem();
        about = new javax.swing.JMenu();
        abo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        reft.setText("Refresh");
        reft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reftActionPerformed(evt);
            }
        });

        alldel.setText("Delete All");
        alldel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alldelActionPerformed(evt);
            }
        });

        jt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "From", "Date", "File Size(MB)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Long.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jt);
        if (jt.getColumnModel().getColumnCount() > 0) {
            jt.getColumnModel().getColumn(0).setResizable(false);
            jt.getColumnModel().getColumn(1).setResizable(false);
            jt.getColumnModel().getColumn(2).setResizable(false);
        }

        singledel.setText("Delete");
        singledel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                singledelActionPerformed(evt);
            }
        });

        insave.setText("Save");
        insave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout inboxLayout = new javax.swing.GroupLayout(inbox);
        inbox.setLayout(inboxLayout);
        inboxLayout.setHorizontalGroup(
            inboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inboxLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(inboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 705, Short.MAX_VALUE)
                    .addGroup(inboxLayout.createSequentialGroup()
                        .addComponent(alldel, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(singledel, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(insave, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(reft)))
                .addContainerGap())
        );
        inboxLayout.setVerticalGroup(
            inboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inboxLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(inboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(singledel)
                    .addGroup(inboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(reft)
                        .addComponent(alldel)
                        .addComponent(insave)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        jTabbedPane1.addTab("Inbox", inbox);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Send To :");
        jLabel4.setPreferredSize(new java.awt.Dimension(35, 15));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Browse primary file :");
        jLabel5.setPreferredSize(new java.awt.Dimension(35, 15));

        browse1.setText("Browse");
        browse1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browse1ActionPerformed(evt);
            }
        });

        sendmsgbox.setColumns(20);
        sendmsgbox.setRows(5);
        jScrollPane1.setViewportView(sendmsgbox);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Message to encrypt :");
        jLabel6.setToolTipText("");

        sendmsgb.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        sendmsgb.setText("Send");
        sendmsgb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendmsgbActionPerformed(evt);
            }
        });

        sizel.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        sizel.setForeground(new java.awt.Color(255, 0, 0));
        sizel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        msgalert.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        msgalert.setForeground(new java.awt.Color(255, 0, 0));
        msgalert.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout sendmsgLayout = new javax.swing.GroupLayout(sendmsg);
        sendmsg.setLayout(sendmsgLayout);
        sendmsgLayout.setHorizontalGroup(
            sendmsgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sendmsgLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sendmsgb, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(337, 337, 337))
            .addGroup(sendmsgLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(sendmsgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(msgalert, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(sendmsgLayout.createSequentialGroup()
                        .addGroup(sendmsgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(sendmsgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                            .addComponent(sendmto)
                            .addComponent(sendmsgb1)))
                    .addComponent(sizel, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(browse1)
                .addContainerGap(95, Short.MAX_VALUE))
        );
        sendmsgLayout.setVerticalGroup(
            sendmsgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sendmsgLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(sendmsgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sendmto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(sendmsgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sendmsgb1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(browse1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(sizel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sendmsgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(msgalert, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sendmsgb, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Send Message", sendmsg);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Send To :");
        jLabel1.setPreferredSize(new java.awt.Dimension(35, 15));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Primary File :");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("File to Embedd");

        sendfileb.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        sendfileb.setText("Send");
        sendfileb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendfilebActionPerformed(evt);
            }
        });

        browse2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        browse2.setText("Browse");
        browse2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browse2ActionPerformed(evt);
            }
        });

        browse3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        browse3.setText("Browse");
        browse3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browse3ActionPerformed(evt);
            }
        });

        sizel2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        sizel2.setForeground(new java.awt.Color(255, 0, 0));
        sizel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        sizel3.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        sizel3.setForeground(new java.awt.Color(255, 0, 0));
        sizel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout sendfileLayout = new javax.swing.GroupLayout(sendfile);
        sendfile.setLayout(sendfileLayout);
        sendfileLayout.setHorizontalGroup(
            sendfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sendfileLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(sendfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(sendfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sendfto, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(sendfileLayout.createSequentialGroup()
                        .addGroup(sendfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sizel3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(sendfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(sendfileb3)
                                .addComponent(sendfileb2, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                                .addComponent(sizel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(sendfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(browse3)
                            .addComponent(browse2))))
                .addContainerGap(62, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sendfileLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sendfileb, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(322, 322, 322))
        );
        sendfileLayout.setVerticalGroup(
            sendfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sendfileLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(sendfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sendfto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(sendfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sendfileb2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(browse2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(sizel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sendfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sendfileb3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(browse3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sizel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sendfileb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(125, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Send File", sendfile);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Primary File :");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setText("Message to encrypt :");

        mpf.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        enmsgbox.setColumns(20);
        enmsgbox.setRows(5);
        jScrollPane2.setViewportView(enmsgbox);

        jButton1.setText("Browse");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        enmsg.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        enmsg.setText("Save");
        enmsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enmsgActionPerformed(evt);
            }
        });

        sizel1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        sizel1.setForeground(new java.awt.Color(255, 0, 0));
        sizel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        enmsgalert.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        enmsgalert.setForeground(new java.awt.Color(255, 0, 0));
        enmsgalert.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout encryptLayout = new javax.swing.GroupLayout(encrypt);
        encrypt.setLayout(encryptLayout);
        encryptLayout.setHorizontalGroup(
            encryptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, encryptLayout.createSequentialGroup()
                .addGroup(encryptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(encryptLayout.createSequentialGroup()
                        .addGap(322, 449, Short.MAX_VALUE)
                        .addComponent(enmsgalert, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(encryptLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(encryptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(encryptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, encryptLayout.createSequentialGroup()
                                .addGroup(encryptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mpf, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                                    .addGroup(encryptLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(sizel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)))))
                .addGap(76, 76, 76))
            .addGroup(encryptLayout.createSequentialGroup()
                .addGap(322, 322, 322)
                .addComponent(enmsg, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        encryptLayout.setVerticalGroup(
            encryptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(encryptLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(encryptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mpf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sizel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(encryptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(enmsgalert, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(enmsg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Encrypt message", encrypt);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Primary File :");

        jLabel19.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("File to Embedd :");

        savefile.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        savefile.setText("Save");
        savefile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savefileActionPerformed(evt);
            }
        });

        browse6.setText("Browse");
        browse6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browse6ActionPerformed(evt);
            }
        });

        browse7.setText("Browse");
        browse7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browse7ActionPerformed(evt);
            }
        });

        efl1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        efl1.setForeground(new java.awt.Color(255, 0, 0));
        efl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        efl2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        efl2.setForeground(new java.awt.Color(255, 0, 0));
        efl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout encryptfileLayout = new javax.swing.GroupLayout(encryptfile);
        encryptfile.setLayout(encryptfileLayout);
        encryptfileLayout.setHorizontalGroup(
            encryptfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(encryptfileLayout.createSequentialGroup()
                .addGroup(encryptfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(encryptfileLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(encryptfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(encryptfileLayout.createSequentialGroup()
                                .addGroup(encryptfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(efl1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(encryptfileLayout.createSequentialGroup()
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pf, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(browse6))
                            .addGroup(encryptfileLayout.createSequentialGroup()
                                .addGroup(encryptfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(efl2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(encryptfileLayout.createSequentialGroup()
                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fe, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(browse7))))
                    .addGroup(encryptfileLayout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addComponent(savefile, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(76, 76, Short.MAX_VALUE))
        );
        encryptfileLayout.setVerticalGroup(
            encryptfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, encryptfileLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(encryptfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(browse6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(efl1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(encryptfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fe, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(browse7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(efl2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(savefile, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Encrypt File", encryptfile);

        browse5.setText("Browse");
        browse5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browse5ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Browse file to decrypt :");
        jLabel14.setPreferredSize(new java.awt.Dimension(35, 15));

        retrievefile.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        retrievefile.setText("Retrive");
        retrievefile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retrievefileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout decryptLayout = new javax.swing.GroupLayout(decrypt);
        decrypt.setLayout(decryptLayout);
        decryptLayout.setHorizontalGroup(
            decryptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(decryptLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fd, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(browse5)
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, decryptLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(retrievefile, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(300, 300, 300))
        );
        decryptLayout.setVerticalGroup(
            decryptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(decryptLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(decryptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(browse5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(retrievefile, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(246, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Decrypt", decrypt);

        titlepanel.setBackground(new java.awt.Color(102, 153, 255));
        titlepanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        version1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        version1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        version1.setText("Version : 2.0");

        user1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        user1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user1.setText("User :");

        dispname.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        dispname.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        title1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title1.setText("Stegograph");

        logu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/icons8_exit_24px.png"))); // NOI18N
        logu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loguMouseClicked(evt);
            }
        });

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/icons8_user_30px_1.png"))); // NOI18N

        javax.swing.GroupLayout titlepanelLayout = new javax.swing.GroupLayout(titlepanel);
        titlepanel.setLayout(titlepanelLayout);
        titlepanelLayout.setHorizontalGroup(
            titlepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(version1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(user1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dispname, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logu)
                .addGap(34, 34, 34))
            .addGroup(titlepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titlepanelLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8)
                    .addGap(268, 268, 268)))
        );
        titlepanelLayout.setVerticalGroup(
            titlepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(titlepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(titlepanelLayout.createSequentialGroup()
                        .addGroup(titlepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(titlepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(title1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(version1))
                            .addComponent(dispname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(user1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(titlepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(titlepanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        file.setText("Options");
        file.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        settings.setText("Profile");
        settings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsActionPerformed(evt);
            }
        });
        file.add(settings);
        file.add(jSeparator1);

        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        file.add(logout);
        file.add(jSeparator2);

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        file.add(exit);

        jMenuBar1.add(file);

        help.setText("Help");

        checkupdate.setText("Check for update");
        help.add(checkupdate);
        help.add(jSeparator3);

        report.setText("Report");
        report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportActionPerformed(evt);
            }
        });
        help.add(report);

        jMenuBar1.add(help);

        about.setText("About");

        abo.setText("About stegograph");
        abo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboActionPerformed(evt);
            }
        });
        about.add(abo);

        jMenuBar1.add(about);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titlepanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titlepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        dispose();
    }//GEN-LAST:event_exitActionPerformed

    public double filesize(String fl)
    {
        File f = new File(fl);
        double s = ((f.length())/(1024*1024));
        return s;
    }
    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        
        logform l = new logform();
        l.setVisible(true);
        l.setLocation(450,150);
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void aboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboActionPerformed
        about b = new about();
        b.setVisible(true);
        b.setLocation(290,115);
    }//GEN-LAST:event_aboActionPerformed

    private void loguMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loguMouseClicked
        logform l = new logform();
        l.setVisible(true);
        l.setLocation(450,150);
        this.dispose();
    }//GEN-LAST:event_loguMouseClicked

    private void browse2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browse2ActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("This PC"));
        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            sendfileb2.setText((chooser.getSelectedFile()).toString());
        }
        double fz = filesize(sendfileb2.getText());
        if(fz<5)
        {
            sizel2.setText("Minimum file size required: 5mb");
        }
        else{sizel2.setText("");}
    }//GEN-LAST:event_browse2ActionPerformed

    private void sendfilebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendfilebActionPerformed
        if("".equals(sendfto.getText()) || "".equals(sendfileb2.getText()) || "".equals(sendfileb3.getText()))
        {
            JOptionPane.showMessageDialog(this,"Fill all the fields !!");
        }else{
            String p = sendfileb2.getText();
        String f2 = sendfileb3.getText();
        boolean result = encodefile(p,f2);
        
        if(result)
        {
            File f = new File(p);
        String ext="";
        int index = p.lastIndexOf('.');
        if(index > 0) {
        ext = p.substring(index + 1);
        }
        
        double sz = f.length();
        LocalDateTime ld = LocalDateTime.now();  
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
        String date = ld.format(format);
        
        try {
                FileInputStream ip = new FileInputStream(p);
                Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mydb","root","admin@123") ;
                ps = (PreparedStatement) conn.prepareStatement("INSERT INTO userfile (usern,fromm,date,file,filetype,size) VALUES(?,?,?,?,?,?);");
                ps.setString(1, sendfto.getText());
                ps.setString(2, dispname.getText());
                ps.setString(3, date);
                ps.setBlob(4, ip);
                ps.setString(5, ext);
                ps.setDouble(6, sz);
                int row = ps.executeUpdate();
                if(row>0)
                {
                    JOptionPane.showMessageDialog(this,"File sended !!");
                }
        } catch (SQLException | IOException ex) {
            System.out.println(ex);
        }
        }
        else{
            JOptionPane.showMessageDialog(this,"Something went wrong !! try Again");
        }
        }
    }//GEN-LAST:event_sendfilebActionPerformed

    private void reftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reftActionPerformed
        table_update();
    }//GEN-LAST:event_reftActionPerformed

    private void table_update(){
        int c;
        
        try{
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mydb","root","admin@123");
	st = con.createStatement();
        String nm = dispname.getText();
	rs = st.executeQuery("select * from userfile where usern= '"+nm+"'");
        ResultSetMetaData res = rs.getMetaData();
        c = res.getColumnCount();
        
        DefaultTableModel ds = (DefaultTableModel)jt.getModel();
        ds.setRowCount(0);
        
	while(rs.next())
	{
		Vector v2 = new Vector();
                
                for(int a=1;a<=c;a++)
                {
                    v2.add(rs.getString("fromm"));
                    v2.add(rs.getString("date"));
                    DecimalFormat numberFormat = new DecimalFormat("0.00");
                    Double d = (((rs.getDouble("size")))/1024)/1024;
                    v2.add(numberFormat.format(d));
                }
                
                ds.addRow(v2);
	}
        }
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println(e);
        }
    }
    
    private void singledelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_singledelActionPerformed
        DefaultTableModel ds = (DefaultTableModel)jt.getModel();
        int selectedIndex = jt.getSelectedRow();
        
        try{
        
        int dialogResult = JOptionPane.showConfirmDialog(null,"Do you want to delete the record","WARNING",JOptionPane.YES_NO_OPTION); 
        
        if(dialogResult == JOptionPane.YES_OPTION)
        {
        
        Class.forName("com.mysql.jdbc.Driver");
		
        con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mydb?"+ "autoReconnect=true&useSSL=false","root","admin@123");
		
	ps = con.prepareStatement("delete from userfile where (usern = ? AND fromm = ?) AND date = ?");
        ps.setString(1, dispname.getText());
        ps.setString(2, ds.getValueAt(selectedIndex,0).toString());
        ps.setString(3, ds.getValueAt(selectedIndex,1).toString());
        
	int row = ps.executeUpdate();
        
	con.close();
        
        if(row>0)
        {
            JOptionPane.showMessageDialog(this,"Record Deleted");
        }
        table_update();
        }
        }
        catch(HeadlessException | ClassNotFoundException | SQLException e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_singledelActionPerformed

    private void alldelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alldelActionPerformed
        DefaultTableModel ds = (DefaultTableModel)jt.getModel();
        int selectedIndex = jt.getSelectedRow();
        
        try{
        
        int dialogResult = JOptionPane.showConfirmDialog(null,"Do you want to delete the record","WARNING",JOptionPane.YES_NO_OPTION); 
        
        if(dialogResult == JOptionPane.YES_OPTION)
        {
                    Class.forName("com.mysql.jdbc.Driver");
		
        con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mydb?"+ "autoReconnect=true&useSSL=false","root","admin@123");
		
	ps = con.prepareStatement("delete from userfile where usern = ?");
        ps.setString(1, dispname.getText());
        
	int r = ps.executeUpdate();
        
	con.close();
        
        if(r > 0)
        {
            JOptionPane.showMessageDialog(this,"Records Deleted");
        }
        table_update();
        }
        }
        catch(HeadlessException | ClassNotFoundException | SQLException e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_alldelActionPerformed

    private void insaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insaveActionPerformed
        DefaultTableModel ds = (DefaultTableModel)jt.getModel();
        int selectedindex = jt.getSelectedRow();
        
        String ftp = null;
        String filepath="";
        String from = (ds.getValueAt(selectedindex,0).toString());
        String date = (ds.getValueAt(selectedindex,1).toString());
        String filesz = (ds.getValueAt(selectedindex,2).toString());
        String userna= dispname.getText();
        
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Select Location and Enter Filename");
        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            filepath = ((chooser.getSelectedFile()).toString());
        }
        if(filepath.equals("") || filepath.contains("."))
        {
            JOptionPane.showMessageDialog(this,"Invalid Filename");
        }
        else
        {
            try {
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mydb?"+ "autoReconnect=true&useSSL=false","root","admin@123");
            st = con.createStatement();
            rs =  st.executeQuery("Select file,filetype from userfile where (usern = '"+userna+"' AND fromm = '"+from+"' AND date = '"+date+"')");
            
            while(rs.next())
            {
                ftp = rs.getString("filetype");
                byte[] fp = rs.getBytes("file");
                FileOutputStream ft=new FileOutputStream(filepath+"."+ftp);
                ft.write(fp);
                ft.close();
            }
            JOptionPane.showMessageDialog(this,"file saved !!");
        } catch (SQLException | IOException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
        int a=JOptionPane.showConfirmDialog(this,"Do you want to retreive file ?");  
        if(a==JOptionPane.YES_OPTION){  
            
            boolean result = retreivefile(filepath+"."+ftp);
        if(result)
        {
            JOptionPane.showMessageDialog(this,"File retreived !!");
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Retreive failed ");
        }
        }  
    }//GEN-LAST:event_insaveActionPerformed

    private void savefileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savefileActionPerformed
        String f1 = pf.getText();
        String f2 = fe.getText();
        boolean result = encodefile(f1,f2);
        if(result)
        {
            JOptionPane.showMessageDialog(this,"File saved");
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Something went wrong");
        }
    }//GEN-LAST:event_savefileActionPerformed

    private void browse6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browse6ActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("This PC"));
        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            pf.setText((chooser.getSelectedFile()).toString());
        }
        double fz = filesize(pf.getText());
        if(fz<5)
        {
            efl1.setText("Minimum file size required: 5mb");
        }
        else{efl1.setText("");}
    }//GEN-LAST:event_browse6ActionPerformed

    private void browse7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browse7ActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("This PC"));
        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            fe.setText((chooser.getSelectedFile()).toString());
        }
        double fz = filesize(sendfileb3.getText());
        
        double size = filesize(pf.getText());
        if(fz>(size/100))
        {
            efl2.setText("Maximum file size required: "+(size/100)+"MB");
        }
        else{efl2.setText("");}
    }//GEN-LAST:event_browse7ActionPerformed

    private void browse5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browse5ActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("This PC"));
        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            fd.setText((chooser.getSelectedFile()).toString());
        }
    }//GEN-LAST:event_browse5ActionPerformed

    private void retrievefileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retrievefileActionPerformed
        String f = fd.getText();
        boolean result = retreivefile(f);
        if(result)
        {
            JOptionPane.showMessageDialog(this,"File retreived !!");
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Retreive failed ");
        }
    }//GEN-LAST:event_retrievefileActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("This PC"));
        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            mpf.setText((chooser.getSelectedFile()).toString());
        }
        double fz = filesize(mpf.getText());
        if(fz<5)
        {
            sizel1.setText("Minimum file size required: 5mb");
        }
        else{sizel1.setText("");}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void enmsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enmsgActionPerformed
       if(enmsgbox.getText().length()>500)
        {
            enmsgalert.setText("Not More than 500 characters!");
        }
       else{
           String msg = enmsgbox.getText();
        
         try{    
           FileWriter fw=new FileWriter(dest+"msg.txt");    
           fw.write(msg);    
           fw.close();    
          }catch(Exception e){System.out.println(e);}
         
        String f1 = mpf.getText();
        String f2 = dest+"msg.txt";
        boolean result = encodefile(f1,f2);
        
        if(result)
        {
            JOptionPane.showMessageDialog(this,"Encrypion Success !!");
        }
        else{
            JOptionPane.showMessageDialog(this,"Error In Encryption Try Again");
        }
       }
    }//GEN-LAST:event_enmsgActionPerformed

    private void browse3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browse3ActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("This PC"));
        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            sendfileb3.setText((chooser.getSelectedFile()).toString());
        }
        double fz = filesize(sendfileb3.getText());
        
        double size = filesize(sendfileb2.getText());
        if(fz>(size/100))
        {
            sizel3.setText("Maximum file size required: "+(size/100)+"MB");
        }
        else{sizel3.setText("");}
    }//GEN-LAST:event_browse3ActionPerformed

    private void browse1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browse1ActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("This PC"));
        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            sendmsgb1.setText((chooser.getSelectedFile()).toString());
        }
        double fz = filesize(sendmsgb1.getText());
        if(fz<5)
        {
            sizel.setText("Minimum file size required: 5mb");
        }
    }//GEN-LAST:event_browse1ActionPerformed

    private void sendmsgbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendmsgbActionPerformed
        if("".equals(sendmto.getText()) || "".equals(sendmsgb1.getText()) || "".equals(sendmsgbox.getText()))
        {
            JOptionPane.showMessageDialog(this,"Fill all fields");
        }
        else{
            if(sendmsgbox.getText().length()>500)
        {
            msgalert.setText("Not More than 500 characters!");
        }else{
            String msg = sendmsgbox.getText();
        
         try{    
           FileWriter fw=new FileWriter(dest+"msg.txt");    
           fw.write(msg);    
           fw.close();    
          }catch(IOException e){System.out.println(e);}
         
        String f1 = sendmsgb1.getText();
        String f2 = dest+"msg.txt";
        boolean result = encodefile(f1,f2);
        
        if(result)
        {
            File f = new File(f1);
        String ext="";
        int index = f1.lastIndexOf('.');
        if(index > 0) {
        ext = f1.substring(index + 1);
        }
        
        double sz = f.length();
        LocalDateTime ld = LocalDateTime.now();  
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
        String date = ld.format(format);
        
        try {
                FileInputStream ip = new FileInputStream(f1);
                Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mydb","root","admin@123") ;
                ps = (PreparedStatement) conn.prepareStatement("INSERT INTO userfile (usern,fromm,date,file,filetype,size) VALUES(?,?,?,?,?,?);");
                ps.setString(1, sendmto.getText());
                ps.setString(2, dispname.getText());
                ps.setString(3, date);
                ps.setBlob(4, ip);
                ps.setString(5, ext);
                ps.setDouble(6, sz);
                int row = ps.executeUpdate();
                if(row>0)
                {
                    JOptionPane.showMessageDialog(this,"Message sended !!");
                }
        } catch (SQLException | FileNotFoundException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(this,"Try Again !!");
        }
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Try Again !!");
        }
        }
        }
    }//GEN-LAST:event_sendmsgbActionPerformed

    private void settingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsActionPerformed
        String n = dispname.getText();
        profile p = new profile(n);
        p.setVisible(true);
        p.setLocation(300,150);
    }//GEN-LAST:event_settingsActionPerformed

    private void reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportActionPerformed
        review r =new review(name);
        r.setVisible(true);
        r.setLocation(300,150);
    }//GEN-LAST:event_reportActionPerformed
    
    public boolean retreivefile(String inputfile){
        DataInputStream dis = null;
    DataOutputStream dos = null;
    Object[] ob = new Object[2];
    String filename = null,file, message, path = null;
    char mes[];
    int i, j, filesize;
    byte byt, filebyte, key = 0;
    int HEADER = 128;
    short msgsize,temp;
    
        try {
            dis = new DataInputStream(new FileInputStream(inputfile));
            for (int t = 0; t <= HEADER; t++)
                dis.readByte();

            //Retrive filename size into byte variable
            byt = 0;
            for (i = 6; i >= 0; i -= 2) {
                filebyte = dis.readByte();
                filebyte &= 0x03;
                filebyte <<= i;
                byt |= filebyte;
            }
            byte filenamesize = byt;

            //Retrive the data file length
            filesize = 0;
            for (i = 30; i >= 0; i -= 2) {
                filebyte = dis.readByte();
                j = (int) filebyte;
                j &= 0x00000003;
                j <<= i;
                filesize |= j;
            }

            //Retrive the key
            key = 0;
            for (j = 6; j >= 0; j -= 2) {
                filebyte = dis.readByte();
                filebyte &= 0x03;
                filebyte <<= j;
                key |= filebyte;
            }

            //Retrive name of the data file
            mes = new char[filenamesize];
            for (i = 0; i < filenamesize; i++) {
                byt = 0;
                for (j = 6; j >= 0; j -= 2) {
                    filebyte = dis.readByte();
                    filebyte &= 0x03;
                    filebyte <<= j;
                    byt |= filebyte;
                }
                mes[i] = (char) byt;
            }
            filename = new String(mes);

            JOptionPane.showMessageDialog(this,"Choose location to save file ");
            JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("This PC"));
        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
           path = chooser.getCurrentDirectory().toString();
        }
            
            dos = new DataOutputStream(new FileOutputStream(path + "/" +
                    filename));
            //Write contents retrived to the data file
            for (i = 0; i < filesize; i++) {
                byt = 0;
                for (j = 6; j >= 0; j -= 2) {
                    filebyte = dis.readByte();
                    filebyte &= 0x03;
                    filebyte <<= j;
                    byt |= filebyte;
                }
                dos.writeByte(byt);
            }

        } catch (EOFException eof) {} catch (HeadlessException | IOException e) {
            JOptionPane.showMessageDialog(this,e.toString());
        } finally {
            try {
                dis.close();
                dos.close();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this,ex.toString());
            }
        }
        message = path + "/" + filename;
        decryptFile(key, message);
        return true;
    }
    
    public boolean decryptFile(byte key, String datafile){
        int val;
        String infile,cpyfile;
        FileReader fr = null;
        FileWriter fw = null;
        File file1, file2,file3;
        
        cpyfile = datafile + "cpy";
        file1=new File(datafile) ;
        file2=new File(cpyfile) ;
        try {
            fr = new FileReader(file1);
            fw = new FileWriter(file2);
            byte n = key;
            while ((val = fr.read()) != -1) {
                val = (short) (val - n);
                if (val < 0)
                    fw.write(126 + val);
                else
                    fw.write(val);
                n++;
                if (n > 126) n = 0;
            }
        } catch (IOException e) {
           JOptionPane.showMessageDialog(this,e.toString());
        } finally {
            try {
                fr.close();
                fw.close();
                file3=file1;
                file1.delete() ;
                file2.renameTo(file3);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this,ex.toString());
            }
        }
        return true;
    }
    
    public boolean encodefile(String infile,String datafile) {
        DataInputStream dis = null, data = null;
    DataOutputStream dos = null;
    FileWriter fw;
    byte byt, mbyte, filebyte, key;
    short msgsize, size;
    int i, j, filesize;
    String mesg, message, cpyfile;
    File file1, file2, file3;
    int HEADER = 128;
    
        file1 = new File(infile);
        cpyfile = infile + "cpy";
        file2 = new File(cpyfile);
        key = (byte) (126 * Math.random());
        File encFile=encryptfile(key, datafile);
        
        try {
            fw = new FileWriter(file2);
            fw.close();
            dis = new DataInputStream(new FileInputStream(file1));
            dos = new DataOutputStream(new FileOutputStream(file2));
            data = new DataInputStream(new FileInputStream(encFile));

            for (int i1 = 0; i1 <= HEADER; i1++)
                dos.writeByte(dis.readByte());

            File msgfile = new File(datafile);
            String filename = msgfile.getName();
            msgsize = (short) filename.length();

            //Embed the data file name size
            for (i = 6; i >= 0; i -= 2) {
                size = msgsize;
                size >>= i;
                mbyte = (byte) size;
                mbyte &= 0x03;
                filebyte = dis.readByte();
                filebyte &= 0xFC;
                filebyte |= mbyte;
                dos.writeByte(filebyte);
            }

            //Embed the data file length
            filesize = (int) msgfile.length();
            for (i = 30; i >= 0; i -= 2) {
                j = filesize;
                j >>= i;
                mbyte = (byte) j;
                mbyte &= 0x03;
                filebyte = dis.readByte();
                filebyte &= 0xFC;
                filebyte |= mbyte;
                dos.writeByte(filebyte);
            }

            //Embed the key
            for (int j1 = 6; j1 >= 0; j1 -= 2) {
                mbyte = key;
                mbyte >>= j1;
                mbyte &= 0x03;
                filebyte = dis.readByte();
                filebyte &= 0xFC;
                filebyte |= mbyte;
                dos.writeByte(filebyte);
            }

            //Embed the data file name
            for (i = 0; i < filename.length(); i++) {
                byt = (byte) filename.charAt(i);
                for (j = 6; j >= 0; j -= 2) {
                    mbyte = byt;
                    mbyte >>= j;
                    mbyte &= 0x03;
                    filebyte = dis.readByte();
                    filebyte &= 0xFC;
                    filebyte |= mbyte;
                    dos.writeByte(filebyte);
                }
            }

            //Embed the content of the data file
            for (i = 0; i < filesize; i++) {
                mbyte = data.readByte();
                for (j = 6; j >= 0; j -= 2) {
                    byt = mbyte;
                    byt >>= j;
                    byt &= 0x03;
                    filebyte = dis.readByte();
                    filebyte &= 0xFC;
                    filebyte |= byt;
                    dos.writeByte(filebyte);
                }
            } while (true) {
                byte fb = dis.readByte();
                dos.writeByte(fb);
            }
        }
        catch (EOFException eof) {}
        catch (IOException e) {
            JOptionPane.showMessageDialog(this,"Oops!!\nError: " + e.toString());
            return false;
        }
        finally {
            try {
                dos.close();
                dis.close();
                data.close() ;
                System.out.println("tem enc data del:"+encFile.delete()) ;
                dos = new DataOutputStream(new FileOutputStream(file1));
                dis = new DataInputStream(new FileInputStream(file2));
                while (true){
                    dos.writeByte(dis.readByte());
                }
            } catch (EOFException eof) {
                try {
                    dos.close();
                    dis.close();
                    System.out.println("tem img del:"+file2.delete()) ;
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this,"Oops!!\nError: " + ex.toString());
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this,e.toString());
                return false;
            }
        }
        return true;
    }
    
    public File encryptfile(byte key, String infile) {
        
        int val;
        String message,cpyfile;
        FileReader fr = null;
        FileWriter fw = null;
        File file1,file2;
    
        try {
            cpyfile=infile+"cpy";
            file1=new File(infile) ;
            file2=new File(cpyfile) ;
            fr = new FileReader(file1);
            fw=new FileWriter(file2) ;
            byte n = key;
            while((val=fr.read())!=-1){
                val=val+n;
                if ((126 - val) < 0)
                    fw.write(Math.abs(126 - val));
                else
                    fw.write(val);
                n++;
                if (n > 126) n = 0;
            }
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(this,"Oops! error in encryption\n" + e.toString());
            return null;
        }
        finally{
            try{
                fr.close();
                fw.close();
            }
            catch(IOException ex){
                JOptionPane.showMessageDialog(this,"Oops! error in encryption process\n" + ex.toString());
                return null;
            }
        }
        return file2;
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {}
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem abo;
    private javax.swing.JMenu about;
    private javax.swing.JButton alldel;
    private javax.swing.JButton browse1;
    private javax.swing.JButton browse2;
    private javax.swing.JButton browse3;
    private javax.swing.JButton browse5;
    private javax.swing.JButton browse6;
    private javax.swing.JButton browse7;
    private javax.swing.JMenuItem checkupdate;
    private javax.swing.JPanel decrypt;
    private javax.swing.JLabel dispname;
    private javax.swing.JLabel efl1;
    private javax.swing.JLabel efl2;
    private javax.swing.JPanel encrypt;
    private javax.swing.JPanel encryptfile;
    private javax.swing.JButton enmsg;
    private javax.swing.JLabel enmsgalert;
    private javax.swing.JTextArea enmsgbox;
    private javax.swing.JMenuItem exit;
    private javax.swing.JTextField fd;
    private javax.swing.JTextField fe;
    public javax.swing.JMenu file;
    private javax.swing.JMenu help;
    private javax.swing.JPanel inbox;
    private javax.swing.JButton insave;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jt;
    private javax.swing.JMenuItem logout;
    private javax.swing.JLabel logu;
    private javax.swing.JTextField mpf;
    private javax.swing.JLabel msgalert;
    private javax.swing.JTextField pf;
    private javax.swing.JButton reft;
    private javax.swing.JMenuItem report;
    private javax.swing.JButton retrievefile;
    private javax.swing.JButton savefile;
    private javax.swing.JPanel sendfile;
    private javax.swing.JButton sendfileb;
    private javax.swing.JTextField sendfileb2;
    private javax.swing.JTextField sendfileb3;
    private javax.swing.JTextField sendfto;
    private javax.swing.JPanel sendmsg;
    private javax.swing.JButton sendmsgb;
    private javax.swing.JTextField sendmsgb1;
    private javax.swing.JTextArea sendmsgbox;
    private javax.swing.JTextField sendmto;
    private javax.swing.JMenuItem settings;
    private javax.swing.JButton singledel;
    private javax.swing.JLabel sizel;
    private javax.swing.JLabel sizel1;
    private javax.swing.JLabel sizel2;
    private javax.swing.JLabel sizel3;
    private javax.swing.JLabel title1;
    private javax.swing.JPanel titlepanel;
    private javax.swing.JLabel user1;
    private javax.swing.JLabel version1;
    // End of variables declaration//GEN-END:variables
}
