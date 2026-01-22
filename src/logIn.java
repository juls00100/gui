 
import javax.swing.*;
public class logIn extends baseFrame {

    public logIn() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        textLabel = new javax.swing.JLabel();
        pass = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        back = new javax.swing.JPanel();
        backlabel = new javax.swing.JLabel();
        Login = new javax.swing.JPanel();
        login = new javax.swing.JLabel();
        create = new javax.swing.JPanel();
        create1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.SystemColor.activeCaption);
        setMinimumSize(new java.awt.Dimension(500, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 33, 71));
        jPanel3.setAutoscrolls(true);
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.setMinimumSize(new java.awt.Dimension(500, 400));
        jPanel3.setPreferredSize(new java.awt.Dimension(500, 400));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textLabel.setBackground(new java.awt.Color(0, 33, 71));
        textLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        textLabel.setForeground(new java.awt.Color(240, 240, 240));
        textLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textLabel.setText("Log In");
        jPanel3.add(textLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 75, 35));

        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        jPanel3.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 170, -1));

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel3.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 170, -1));

        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Password:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Email:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        back.setBackground(new java.awt.Color(197, 179, 88));
        back.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        back.setForeground(new java.awt.Color(0, 204, 51));
        back.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backlabel.setBackground(new java.awt.Color(197, 179, 88));
        backlabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        backlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backlabel.setText("Back");
        backlabel.setFocusable(false);
        backlabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        backlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backlabelMouseClicked(evt);
            }
        });
        back.add(backlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 20));

        jPanel3.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 60, 20));

        Login.setBackground(new java.awt.Color(0, 204, 51));
        Login.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Login.setForeground(new java.awt.Color(0, 204, 51));
        Login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        login.setBackground(new java.awt.Color(0, 153, 51));
        login.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        login.setText("Log in");
        login.setFocusable(false);
        login.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
        });
        Login.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 20));

        jPanel3.add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 60, -1));

        create.setBackground(new java.awt.Color(0, 33, 71));
        create.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        create.setForeground(new java.awt.Color(240, 240, 240));
        create.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        create1.setBackground(new java.awt.Color(0, 153, 51));
        create1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        create1.setForeground(new java.awt.Color(240, 240, 240));
        create1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        create1.setText("No account? Create account.");
        create1.setFocusable(false);
        create1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        create1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                create1MouseClicked(evt);
            }
        });
        create.add(create1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 20));

        jPanel3.add(create, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 170, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 280, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void backlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backlabelMouseClicked
       
        Javagui javaguiFrame = new Javagui();
        javaguiFrame.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_backlabelMouseClicked

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
        dashboard dashboardFrame = new dashboard();
        dashboardFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_loginMouseClicked

    private void create1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_create1MouseClicked
        signup1 signup1Frame = new signup1();
        signup1Frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_create1MouseClicked

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
            java.util.logging.Logger.getLogger(logIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(logIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(logIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(logIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new logIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel Login;
    public javax.swing.JPanel back;
    public javax.swing.JLabel backlabel;
    public javax.swing.JPanel create;
    public javax.swing.JLabel create1;
    public javax.swing.JTextField email;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel3;
    public javax.swing.JLabel login;
    public javax.swing.JTextField pass;
    public javax.swing.JLabel textLabel;
    // End of variables declaration//GEN-END:variables
}
