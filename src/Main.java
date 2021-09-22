
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



public class Main extends javax.swing.JFrame {

     private String order="", en="", de="", temp2;
     private byte[] temp, temp1,end;
    
    public Main() {
        initComponents();
        Toolkit tk = getToolkit();
        Dimension size = tk.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        l1 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        b1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        ta1 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        ta2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        l1.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        l1.setText("Enter Your Text");

        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });

        b1.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        b1.setText("Encrypt");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        jButton1.setText("Decrypt");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Data Leakage Prevention System - Hybrid Cryptography");

        ta1.setColumns(20);
        ta1.setLineWrap(true);
        ta1.setRows(5);
        jScrollPane4.setViewportView(ta1);

        ta2.setColumns(20);
        ta2.setLineWrap(true);
        ta2.setRows(5);
        jScrollPane5.setViewportView(ta2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(190, 190, 190))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 53, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(b1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(205, 205, 205))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(375, 375, 375)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(b1))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Encryption
    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
       
        try
        {
            // creating objects of all the classes
            final String secretKey = "ssshhhhhhhhhhh!!!!";
            AES myEncryptor1 = new AES();        
            DESedeEncryption myEncryptor2 = new DESedeEncryption();
            Blowfish myEncryptor3 = new Blowfish();
            RSA myEncryptor4 = new RSA();
            Hybridizer hy = new Hybridizer();

            // getting the input string
            String pt = t1.getText();
            
            //variable to display final output
            String output="";


            // generating random encryption sequence
            order = hy.form_comb();
            System.out.println("\nEncrypting Order : "+ order +"\n");


            int len = order.length();
            int i = 0;
            while(i<len)
            {
                if(i==0)
                {                
                    if(order.charAt(i)=='1')
                    {
                        en = myEncryptor1.encrypt(pt,secretKey);
                        output = output + "Stage 1 Encrytion : " +en;
                        i=i+1;
                    }
                    else if(order.charAt(i)=='2')
                    {
                        en = myEncryptor2.encrypt(pt);
                        output = output + "Stage 1 Encryption : " +en;
                        i=i+1;
                    }
                    else if(order.charAt(i)=='3')
                    {
                        temp2=pt;
                        temp = myEncryptor3.encrypt(pt);
                        en = new String(temp);
                        output = output + "Stage 1 Encryption : " +en;
                        i=i+1;
                    }
                }
                else
                {
                    if(order.charAt(i)=='1')
                    {
                        en = myEncryptor1.encrypt(en,secretKey);
                        output = output + "\n\nStage " + (i+1) + " Encryption : " +en;
                        i=i+1;
                    }
                    else if(order.charAt(i)=='2')
                    {
                        en = myEncryptor2.encrypt(en);
                        output = output + "\n\nStage " + (i+1) + " Encryption : " +en;
                        i=i+1;
                    }
                    else if(order.charAt(i)=='3')
                    {
                        temp2=en;
                        temp = myEncryptor3.encrypt(en);
                        en = new String (temp);
                        output = output + "\n\nStage " + (i+1) + " Encryption : " +en;
                        i=i+1;
                    }
                }
            }
            temp1 = en.getBytes();
            end = myEncryptor4.encrypt(temp1);
            output = output +"\n\n Final Encrypted Text : " + myEncryptor4.bytesToString(end);
            ta1.setText(output);
            ta2.setText("");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e);
        }
        
        
    }//GEN-LAST:event_b1ActionPerformed
    //Decryption
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try
        {
            // creating objects of all the classes
            final String secretKey = "ssshhhhhhhhhhh!!!!";
            AES myEncryptor1 = new AES();        
            DESedeEncryption myEncryptor2 = new DESedeEncryption();
            Blowfish myEncryptor3 = new Blowfish();
            RSA myEncryptor4 = new RSA();
            
            //Reversing Encrypted order
            StringBuilder sb = new StringBuilder();
            sb.append(order);
            order = sb.reverse().toString();
           
            //variable to display final output
            String output="";
            
            //decrypting stage 1
           
            de=en;
            output = output + "Stage 1 Decryption : " + de;
            
            int len = order.length();
            int i = 0;
            while(i<len)
            {
                if(i==(len-1))
                {                
                    if(order.charAt(i)=='1')
                    {
                        de = myEncryptor1.decrypt(de,secretKey);
                        output = output + "\n\nPlain Text : " +de;
                        i=i+1;
                    }
                    else if(order.charAt(i)=='2')
                    {
                        de = myEncryptor2.decrypt(de);
                        output = output + "\n\nPlain Text : " +de;
                        i=i+1;
                    }
                    else if(order.charAt(i)=='3')
                    {
                        //de = myEncryptor3.decrypt(temp);
                        de = temp2;
                        output = output + "\n\nPlain Text : " +de;
                        i=i+1;
                    }
                }
                else
                {
                    if(order.charAt(i)=='1')
                    {
                        de = myEncryptor1.decrypt(de,secretKey);
                        output = output + "\n\nStage " + (i+2) + " Decryption : " +de;
                        i=i+1;
                    }
                    else if(order.charAt(i)=='2')
                    {
                        de = myEncryptor2.decrypt(de);
                        output = output + "\n\nStage " + (i+2) + " Decryption : " +de;
                        i=i+1;
                    }
                    else if(order.charAt(i)=='3')
                    {
                        //de = myEncryptor3.decrypt(temp);
                        de = temp2;
                        output = output + "\n\nStage " + (i+2) + " Decryption : " +de;
                        i=i+1;
                    }
                }
            }
            ta2.setText(output);
            
            
            
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel l1;
    private javax.swing.JTextField t1;
    private javax.swing.JTextArea ta1;
    private javax.swing.JTextArea ta2;
    // End of variables declaration//GEN-END:variables
}
