package com.personal.calc;

import java.math.RoundingMode;
import java.math.BigDecimal;

public class CurrencyConverter extends javax.swing.JFrame {
    
    //Variable Declaration
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    
    public CurrencyConverter() {
        initComponents();
    }                        
    private void initComponents() {

        jCheckBox2 = new javax.swing.JCheckBox();
        jSpinner1 = new javax.swing.JSpinner();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jCheckBox2.setText("jCheckBox2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Currency Converter");

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Currency Converter ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(jLabel1)
                .addContainerGap(161, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USD - United States", "INR - India", "CAD - Canadian Dollar", "EUR - Euro"}));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USD - United States", "INR - India", "CAD - Canadian Dollar", "EUR - Euro"}));

        jTextField2.setEditable(false);

        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton1.setText("Convert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox1, 0, 116, Short.MAX_VALUE))
                .addGap(133, 133, 133)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addGap(29, 29, 29))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(37, 37, 37))
        );

        pack();
    }//                         

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        System.exit(0);
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        jTextField1.setText("");
        jTextField2.setText("");
    }                                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String val1=(String)jComboBox1.getSelectedItem();
        String val2=(String)jComboBox2.getSelectedItem();
                
        if(val1.equals(val2)) {
        	double c = Double.parseDouble(jTextField1.getText());
            jTextField2.setText(String.valueOf(c));
        }
        
        else if(val1.equals("USD - United States") && val2.equals("INR - India")){
            double usd = Double.parseDouble(jTextField1.getText());
            double inr = (double)(usd*82.93);
            jTextField2.setText(String.valueOf(Math.round(inr*100.0)/100.0));
        }
        else if(val1.equals("USD - United States") && val2.equals("CAD - Canadian Dollar"))
       {
           double usd = Double.parseDouble(jTextField1.getText());
           double cad = (double)(usd*1.34);

           jTextField2.setText(String.valueOf(Math.round(cad*100.0)/100.0));
       }
        
        else if(val1.equals("USD - United States") && val2.equals("EUR - Euro"))
        {
            double usd = Double.parseDouble(jTextField1.getText());
            double eur = (double)(usd*0.94);

            jTextField2.setText(String.valueOf(Math.round(eur*100.0)/100.0));
        }
        else if(val1.equals("INR - India") && val2.equals("USD - United States"))
        {
            double inr = Double.parseDouble(jTextField1.getText());
            double usd = (double)(inr*0.012);

            jTextField2.setText(String.valueOf(Math.round(usd*100.0)/100.0));
        }
        else if(val1.equals("INR - India") && val2.equals("CAD - Canadian Dollar"))
        {
            double inr = Double.parseDouble(jTextField1.getText());
            double cad = (double)(inr*0.016);

            jTextField2.setText(String.valueOf(Math.round(cad*100.0)/100.0));
        }
        else if(val1.equals("INR - India") && val2.equals("EUR - Euro"))
        {
            double inr = Double.parseDouble(jTextField1.getText());
            double eur = (double)(inr*0.011);

            jTextField2.setText(String.valueOf(Math.round(eur*100.0)/100.0));
        }
                
        else if(val1.equals("CAD - Canadian Dollar") && val2.equals("USD - United States"))
        {
            double cad = Double.parseDouble(jTextField1.getText());
            double usd = (double)(cad*0.74);

            jTextField2.setText(String.valueOf(Math.round(usd*100.0)/100.0));
        }
        else if(val1.equals("CAD - Canadian Dollar") && val2.equals("INR - India"))
        {
            double cad = Double.parseDouble(jTextField1.getText());
            double inr = (double)(cad*61.72);

            jTextField2.setText(String.valueOf(Math.round(inr*100.0)/100.0));
        }
        else if(val1.equals("CAD - Canadian Dollar") && val2.equals("EUR - Euro"))
        {
            double cad = Double.parseDouble(jTextField1.getText());
            double eur = (double)(cad*0.7);

            jTextField2.setText(String.valueOf(Math.round(eur*100.0)/100.0));
        }
        
        else if(val1.equals("EUR - Euro") && val2.equals("USD - United States"))
        {
            double eur = Double.parseDouble(jTextField1.getText());
            double usd = (double)(eur*1.07);

            jTextField2.setText(String.valueOf(Math.round(usd*100.0)/100.0));
        }
        else if(val1.equals("EUR - Euro") && val2.equals("INR - India"))
        {
            double eur = Double.parseDouble(jTextField1.getText());
            double inr = (double)(eur*88.91);

            jTextField2.setText(String.valueOf(Math.round(inr*100.0)/100.0));
        }
        else if(val1.equals("EUR - Euro") && val2.equals("CAD - Canadian Dollar"))
        {
            double eur = Double.parseDouble(jTextField1.getText());
            double cad = (double)(eur*1.44);

            jTextField2.setText(String.valueOf(Math.round(cad*100.0)/100.0));
        }
        

    }                                        

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CurrencyConverter().setVisible(true);
            }
        });
    }
                    
                    
}