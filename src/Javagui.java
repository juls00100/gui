
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juls
 */
public class Javagui extends baseFrame {

public Javagui() {
    initComponents();
    
    // --- LOGO INSERTION START ---
    try {
        // 1. Load the image from your resources folder
        java.net.URL imgURL = getClass().getResource("/resources/logo.png");
        
        if (imgURL != null) {
            javax.swing.ImageIcon icon = new javax.swing.ImageIcon(imgURL);
            
            // 2. SCALE: This ensures the image is exactly 60x60 regardless of the file size
            java.awt.Image img = icon.getImage();
            java.awt.Image scaledImg = img.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
            
            // 3. APPLY TO LABEL: We use the existing textLabel4 variable
            textLabel4.setIcon(new javax.swing.ImageIcon(scaledImg));
            textLabel4.setText(""); // Remove the "jLabel4" text
            
            // 4. ALIGNMENT: Center the icon inside its box
            textLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            
            // 5. POSITION: Force the box to be 60x60 and centered horizontally
            // In your Absolute Layout, X=220 centers it on a 500px panel
            textLabel4.setBounds(220, 60, 60, 60); 
            
        } else {
            System.out.println("Could not find file: /resources/60.png");
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    // --- LOGO INSERTION END ---
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        textLabel1 = new javax.swing.JLabel();
        textLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        signup1Button1 = new javax.swing.JButton();
        loginButton2 = new javax.swing.JButton();
        textLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 33, 71));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setMinimumSize(new java.awt.Dimension(500, 400));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textLabel1.setBackground(new java.awt.Color(0, 33, 71));
        textLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        textLabel1.setForeground(new java.awt.Color(197, 179, 88));
        textLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textLabel1.setText("Welcome to Academic Evaluation System!");
        textLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(197, 179, 88)));
        jPanel1.add(textLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 340, 34));

        textLabel3.setBackground(new java.awt.Color(0, 33, 71));
        textLabel3.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        textLabel3.setForeground(new java.awt.Color(197, 179, 88));
        textLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textLabel3.setText("Your voice has value to us! ");
        jPanel1.add(textLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 26, 500, 30));

        jPanel2.setBackground(new java.awt.Color(0, 33, 71));

        signup1Button1.setBackground(new java.awt.Color(0, 33, 71));
        signup1Button1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        signup1Button1.setForeground(new java.awt.Color(0, 204, 0));
        signup1Button1.setText("Sign Up");
        signup1Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signup1Button1ActionPerformed(evt);
            }
        });

        loginButton2.setBackground(new java.awt.Color(0, 33, 71));
        loginButton2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        loginButton2.setForeground(new java.awt.Color(0, 204, 102));
        loginButton2.setText("Log in");
        loginButton2.setToolTipText("");
        loginButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(signup1Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(loginButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginButton2)
                    .addComponent(signup1Button1))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 340, 70));

        textLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\SONY\\OneDrive\\Documents\\NetBeansProjects\\JavaGui\\src\\resources\\logo.png")); // NOI18N
        jPanel1.add(textLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 70, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 490, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signup1Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signup1Button1ActionPerformed
        signup1 signup1Frame = new signup1();
        signup1Frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_signup1Button1ActionPerformed

    private void loginButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButton2ActionPerformed
        logIn loginFrame = new logIn();
        loginFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_loginButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Javagui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Javagui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Javagui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Javagui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Javagui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loginButton2;
    private javax.swing.JButton signup1Button1;
    private javax.swing.JLabel textLabel1;
    private javax.swing.JLabel textLabel3;
    private javax.swing.JLabel textLabel4;
    // End of variables declaration//GEN-END:variables
}
