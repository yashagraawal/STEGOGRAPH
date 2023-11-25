package mainfiles;

import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.font.TextAttribute;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;
import javax.swing.JOptionPane;

public class forgetpass extends javax.swing.JFrame {

    boolean h;
    
    public forgetpass(boolean home) {
        initComponents();
        h = home;
        if(h)
        {
            loginpage.setVisible(false);
        }
        changepass.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        getusern = new javax.swing.JTextField();
        checkusern = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        showques = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        getans = new javax.swing.JTextField();
        checkans = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        changepass = new javax.swing.JButton();
        loginpage = new javax.swing.JLabel();
        passinfo = new javax.swing.JLabel();
        showpass = new javax.swing.JCheckBox();
        newpass2 = new javax.swing.JPasswordField();
        newpass1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Change password");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Username :");

        getusern.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 102, 102)));

        checkusern.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        checkusern.setText("Check");
        checkusern.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkusernActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Your security question :");

        showques.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        showques.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Answer :");

        getans.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 102, 102)));

        checkans.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        checkans.setText("Check");
        checkans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkansActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("New Password :");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Re-Enter :");

        changepass.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        changepass.setText("Change password");
        changepass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changepassActionPerformed(evt);
            }
        });

        loginpage.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        loginpage.setForeground(new java.awt.Color(51, 102, 255));
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

        passinfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passinfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/icons8_info_squared_20px.png"))); // NOI18N
        passinfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passinfoMouseClicked(evt);
            }
        });

        showpass.setText("Show password");
        showpass.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                showpassStateChanged(evt);
            }
        });

        newpass2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 102, 102)));
        newpass2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newpass2MouseClicked(evt);
            }
        });

        newpass1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 102, 102)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(getans, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(newpass2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(newpass1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passinfo)
                                    .addComponent(showpass)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(175, 175, 175)
                                .addComponent(loginpage, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(checkans)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(53, 53, 53)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(getusern, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addComponent(checkusern, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(changepass)))
                .addContainerGap(8, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(showques, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getusern, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(checkusern, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(showques, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(getans, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkans, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newpass1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(passinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showpass)
                    .addComponent(newpass2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(changepass, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginpage, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Connection con;
    PreparedStatement ps;
    Statement st;
    ResultSet rs;
    
    
    private void checkusernActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkusernActionPerformed
        
        String username = getusern.getText();
        String question;
        
        try
        {    
        Class.forName("com.mysql.jdbc.Driver");
		
        con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/detailsdb","root","1234yash");
		
	ps = (PreparedStatement) con.prepareStatement("select * from userdata where usern = ?");	
        ps.setString(1, username);
        
        rs = ps.executeQuery();
        
        if(rs.next())
        {
            question = rs.getString("security_question");
            showques.setText(question);
            getusern.setEditable(false);
        }else{
            JOptionPane.showMessageDialog(this,"No such user !!");
            logform lf = new logform();
            lf.setVisible(true);
            lf.setLocation(450,150);
            this.dispose();
        }
        }
        catch(HeadlessException | ClassNotFoundException | SQLException ex){ }
    }//GEN-LAST:event_checkusernActionPerformed

    private void checkansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkansActionPerformed
        
        String userans = getans.getText();
        String username = getusern.getText();
        String answer;
        
        try
        {    
        Class.forName("com.mysql.jdbc.Driver");
		
        con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/detailsdb","root","1234yash");
		
	ps = (PreparedStatement) con.prepareStatement("select security_ans from userdata where usern = ?");	
        ps.setString(1, username);
        
        rs = ps.executeQuery();
        
        if(rs.next())
        {
            answer = rs.getString("security_ans");
            if(answer.equals(userans))
            {
                JOptionPane.showMessageDialog(this,"Change your password");
            changepass.setEnabled(true);
            }
            else{
            JOptionPane.showMessageDialog(this,"Answer not matched");
            forgetpass fp = new forgetpass(h);
            fp.setVisible(true);
            fp.setLocation(450,150);
            this.dispose();
        }
        }
        }
        catch(HeadlessException | ClassNotFoundException | SQLException ex){ }
    }//GEN-LAST:event_checkansActionPerformed

    private void loginpageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginpageMouseClicked
        logform lf = new logform();
        lf.setVisible(true);
        lf.setLocation(450,150);
        this.dispose();
    }//GEN-LAST:event_loginpageMouseClicked

    private void changepassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changepassActionPerformed
        
        String name = getusern.getText() ,newpassword = newpass1.getText() ,repassword = newpass2.getText();
        
        if(newpassword.equals(repassword))
        {
            try
        {    
        Class.forName("com.mysql.jdbc.Driver");
		
        con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/detailsdb","root","1234yash");
        
        st = con.createStatement();
        
        st.executeUpdate("update  userdata  set userp = '"+newpassword+"' where usern = '"+name+"'");
        
        rs = st.executeQuery("select * from userdata where usern = '"+name+"'");
        
        if(rs.next())
        {
            String changedpass = rs.getString("userp");
            
        if(changedpass.equals(newpassword))
        {
            JOptionPane.showMessageDialog(this,"password changed");
            logform lf = new logform();
            lf.setVisible(true);
            lf.setLocation(450,150);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(this,"Something went wrong !! Try again");
            forgetpass fp = new forgetpass(h);
            fp.setVisible(true);
            fp.setLocation(450,150);
            this.dispose();
        }
        }else{ JOptionPane.showMessageDialog(this,"Something went wrong !! Try again"); }
        }
        catch(HeadlessException | ClassNotFoundException | SQLException ex){ }
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Both passwords don't match Re-Enter password !!");
            newpass1.setText("");
            newpass2.setText("");
        }
    }//GEN-LAST:event_changepassActionPerformed
    
    Font original;
    
    private void loginpageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginpageMouseEntered
        original = evt.getComponent().getFont();
        Map attributes = original.getAttributes();
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        evt.getComponent().setFont(original.deriveFont(attributes));
    }//GEN-LAST:event_loginpageMouseEntered

    private void loginpageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginpageMouseExited
                evt.getComponent().setFont(original);
    }//GEN-LAST:event_loginpageMouseExited

    private void passinfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passinfoMouseClicked
        JOptionPane.showMessageDialog(this,"Password should min 8 digit and max 15 digit,\n Also containing numbers and"
            + " special characters, and should not contain spaces. \n "
            + "Password only accepted if instructions are followed !!");
    }//GEN-LAST:event_passinfoMouseClicked

    private void showpassStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_showpassStateChanged
        if (showpass.isSelected())
        {
            newpass1.setEchoChar((char)0);
            newpass2.setEchoChar((char)0);
        }else
        {
            newpass1.setEchoChar('*');
            newpass2.setEchoChar('*');
        }
    }//GEN-LAST:event_showpassStateChanged

    private void newpass2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newpass2MouseClicked
        String passw = newpass1.getText();
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
            newpass1.setText("");
        }
    }//GEN-LAST:event_newpass2MouseClicked

    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton changepass;
    private javax.swing.JButton checkans;
    private javax.swing.JButton checkusern;
    private javax.swing.JTextField getans;
    private javax.swing.JTextField getusern;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel loginpage;
    private javax.swing.JPasswordField newpass1;
    private javax.swing.JPasswordField newpass2;
    private javax.swing.JLabel passinfo;
    private javax.swing.JCheckBox showpass;
    private javax.swing.JLabel showques;
    // End of variables declaration//GEN-END:variables
}
