package mainfiles;

import com.mysql.jdbc.*;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.font.TextAttribute;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;


public class signupp extends javax.swing.JFrame {
    
    public signupp() {
        initComponents();
        
        signup.setEnabled(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        signup = new javax.swing.JButton();
        loginpage = new javax.swing.JLabel();
        passcheckbox = new javax.swing.JCheckBox();
        txtu = new javax.swing.JTextField();
        txtp = new javax.swing.JPasswordField();
        txtpc = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        securityquestion = new javax.swing.JTextField();
        securityans = new javax.swing.JTextField();
        usera = new javax.swing.JCheckBox();
        useragreementpage = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sign up form");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/icons8_add_user_male_26px_1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jLabel7)
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("User id : ");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Password : ");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Confirm password :");

        signup.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        signup.setText("Sign up");
        signup.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 102, 102)));
        signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupActionPerformed(evt);
            }
        });

        loginpage.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        loginpage.setForeground(new java.awt.Color(0, 51, 255));
        loginpage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginpage.setText("Login page");
        loginpage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginpageMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginpageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginpageMouseExited(evt);
            }
        });

        passcheckbox.setText("Show password");
        passcheckbox.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                passcheckboxStateChanged(evt);
            }
        });

        txtu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 102, 102)));

        txtp.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 102, 102)));

        txtpc.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 102, 102)));
        txtpc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtpcMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Security Question :");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Answer :");

        securityquestion.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 102, 102)));

        securityans.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 102, 102)));

        usera.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        usera.setText("I have read and, I accept the user agreement");
        usera.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                useraStateChanged(evt);
            }
        });

        useragreementpage.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        useragreementpage.setForeground(new java.awt.Color(0, 51, 255));
        useragreementpage.setText("User\nAgreement");
        useragreementpage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                useragreementpageMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                useragreementpageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                useragreementpageMouseExited(evt);
            }
        });

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/icons8_info_squared_20px.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(securityquestion, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtp, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtu, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtpc, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(securityans, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(usera, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passcheckbox)
                                    .addComponent(useragreementpage, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel8))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(loginpage, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(signup, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passcheckbox))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(securityquestion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(securityans, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usera)
                    .addComponent(useragreementpage, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(signup, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginpage, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    Font original;
    
    Connection con;
    PreparedStatement ps;
    Statement st;
    ResultSet rs;
    
    private void loginpageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginpageMouseClicked
       logform lf = new logform();
       lf.setVisible(true);
       lf.setLocation(450,150);
       this.dispose();
    }//GEN-LAST:event_loginpageMouseClicked

    private void signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupActionPerformed
        
        String user = txtu.getText();
        String pass = txtp.getText();
        String cuser = txtpc.getText();
        String secuq = securityquestion.getText();
        String secans = securityans.getText();
        
        if(pass.equals(cuser))
        {
        try{
        Class.forName("com.mysql.jdbc.Driver");
		
        con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mydb","root","admin@123");
		
	st = con.createStatement();
		
	st.executeUpdate("INSERT INTO userdata (usern,userp,security_question,security_ans)"
                + " VALUES('"+user+"','"+pass+"','"+secuq+"','"+secans+"')" );
        
        rs = st.executeQuery("select * from userdata where usern = '"+ user+"' and userp = '"+pass+"' ");
	if(rs.next())
        {
            JOptionPane.showMessageDialog(this,"User Added !!");
            txtu.setText("");
            txtp.setText("");
            txtpc.setText("");
           
            logform lf = new logform();
            lf.setVisible(true);
            lf.setLocation(450,150);
            this.dispose();
            
        }else
        {
            JOptionPane.showMessageDialog(this,"Sign-up Failed !!");
            txtu.setText("");
            txtp.setText("");
            txtpc.setText("");
        }
        rs.close();
	st.close();
	con.close();
        }
        catch(HeadlessException | ClassNotFoundException | SQLException e){ }
        
        }else
        {
            JOptionPane.showMessageDialog(this,"Password Don't Match ReEnter !!");
            txtu.setText(" ");
            txtp.setText(" ");
            txtpc.setText(" ");
        }
    }//GEN-LAST:event_signupActionPerformed

    private void passcheckboxStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_passcheckboxStateChanged
        if (passcheckbox.isSelected())
        {
            txtp.setEchoChar((char)0);
            txtpc.setEchoChar((char)0);
        }else
        {
            txtp.setEchoChar('*');
            txtpc.setEchoChar('*');
        }

    }//GEN-LAST:event_passcheckboxStateChanged

    private void useraStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_useraStateChanged
        String user = txtu.getText();
        String pass = txtp.getText();
        String cuser = txtpc.getText();
        String secuq = securityquestion.getText();
        String secans = securityans.getText();
        String e="";
        
        if ((usera.isSelected()) && (!(user.equals(e))) && (!(pass.equals(e))) && (!(cuser.equals(e))) && (!(secuq.equals(e))) && (!(secans.equals(e))))
        {
            signup.setEnabled(true);
        }else
        {
            signup.setEnabled(false);
        }        
    }//GEN-LAST:event_useraStateChanged

    private void useragreementpageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_useragreementpageMouseClicked
        useragreement ua = null;
        try {
            ua = new useragreement();
        } catch (IOException ex) {
            Logger.getLogger(signupp.class.getName()).log(Level.SEVERE, null, ex);
        }
        ua.setVisible(true);
        ua.setLocation(450,150);
    }//GEN-LAST:event_useragreementpageMouseClicked

    private void txtpcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtpcMouseClicked
        String passw = txtp.getText();
        if(((passw.length() >= 8) && (passw.length() <= 15)) /* <-- length check */ 
		&& (!(passw.contains(" "))) /* space check */ 
		&& (passw.contains("@") || passw.contains("#") /* char check*/
              || passw.contains("!") || passw.contains("~") 
              || passw.contains("$") || passw.contains("%") 
              || passw.contains("^") || passw.contains("&") 
              || passw.contains("*") || passw.contains("(") 
              || passw.contains(")") || passw.contains("-") 
              || passw.contains("+") || passw.contains("/") 
              || passw.contains(":") || passw.contains(".") 
              || passw.contains(", ") || passw.contains("<") 
              || passw.contains(">") || passw.contains("?") 
              || passw.contains("|")) 
		&& (passw.contains("0") || passw.contains("1") /* num check*/
              || passw.contains("3") || passw.contains("2") 
              || passw.contains("4") || passw.contains("5") 
              || passw.contains("7") || passw.contains("6") 
              || passw.contains("8") || passw.contains("9")))   {}
        else
        {
            JOptionPane.showMessageDialog(this,"password rejected !! READ INSTRUCTIONS FOR PASSWORD");
            txtp.setText("");
        }
    }//GEN-LAST:event_txtpcMouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        JOptionPane.showMessageDialog(this,"Password should min 8 digit and max 15 digit,\n Also containing numbers and"
                + " special characters, and should not contain spaces. \n "
                + "Password only accepted if instructions are followed !!");
    }//GEN-LAST:event_jLabel8MouseClicked

    private void loginpageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginpageMouseEntered
        original = evt.getComponent().getFont();
        Map attributes = original.getAttributes();
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        evt.getComponent().setFont(original.deriveFont(attributes));
    }//GEN-LAST:event_loginpageMouseEntered

    private void loginpageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginpageMouseExited
        evt.getComponent().setFont(original);
    }//GEN-LAST:event_loginpageMouseExited

    private void useragreementpageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_useragreementpageMouseEntered
        original = evt.getComponent().getFont();
        Map attributes = original.getAttributes();
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        evt.getComponent().setFont(original.deriveFont(attributes));
    }//GEN-LAST:event_useragreementpageMouseEntered

    private void useragreementpageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_useragreementpageMouseExited
        evt.getComponent().setFont(original);// TODO add your handling code here:
    }//GEN-LAST:event_useragreementpageMouseExited

    public static void main(String args[]) {
            java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel loginpage;
    private javax.swing.JCheckBox passcheckbox;
    private javax.swing.JTextField securityans;
    private javax.swing.JTextField securityquestion;
    private javax.swing.JButton signup;
    private javax.swing.JPasswordField txtp;
    private javax.swing.JPasswordField txtpc;
    private javax.swing.JTextField txtu;
    private javax.swing.JCheckBox usera;
    private javax.swing.JLabel useragreementpage;
    // End of variables declaration//GEN-END:variables
}
