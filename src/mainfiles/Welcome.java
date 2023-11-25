package mainfiles;

public class Welcome extends javax.swing.JFrame {

   
    public Welcome() {
        initComponents();
        
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loadtxt = new javax.swing.JLabel();
        jpb = new javax.swing.JProgressBar();
        subtitle = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        loadtxt.setForeground(new java.awt.Color(255, 255, 255));
        loadtxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(loadtxt);
        loadtxt.setBounds(660, 394, 160, 10);

        jpb.setForeground(new java.awt.Color(102, 153, 255));
        getContentPane().add(jpb);
        jpb.setBounds(0, 410, 830, 10);

        subtitle.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        subtitle.setText("Version: 2.0");
        getContentPane().add(subtitle);
        subtitle.setBounds(90, 110, 82, 17);

        title.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Stegograph");
        getContentPane().add(title);
        title.setBounds(50, 50, 240, 50);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/back1.jpg"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, -7, 834, 490);

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    public static void main(String args[])
    {
       Welcome w = new Welcome();
        w.setVisible(true);
        w.setSize(834,483);
        w.setLocation(250,100);
        
        try{
            for(int i=0;i<=100;i++){
                if(i==15){
                    w.loadtxt.setText("Loading resources . . .");
                }
                if(i==40){
                    w.loadtxt.setText("Loading modules . . .");
                }
                if(i==70){
                    w.loadtxt.setText("Starting modules . . .");
                }
                if(i==90){
                    w.loadtxt.setText("Starting . . .");
                }
                Thread.sleep(30);
                w.jpb.setValue(i);
            }
            
            w.dispose();
            
                logform lf = new logform();
                lf.setVisible(true);
                lf.setLocation(450,150);
        }
        catch(InterruptedException e){}
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    public javax.swing.JProgressBar jpb;
    public javax.swing.JLabel loadtxt;
    private javax.swing.JLabel subtitle;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
