/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

/**
 *
 * @author Briceyda Angeles
 */
public class ViewOperaciones extends javax.swing.JPanel {

    /**
     * Creates new form ViewOperaciones
     */
    public ViewOperaciones() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbtn_suma = new javax.swing.JButton();
        jbtn_resta = new javax.swing.JButton();
        jbtn_division = new javax.swing.JButton();
        jbtn_multiplicacion = new javax.swing.JButton();
        jtf_numero_1 = new javax.swing.JTextField();
        jtf_numero_2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jlb_resultado = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 0, 153));

        jbtn_suma.setBackground(new java.awt.Color(0, 0, 0));
        jbtn_suma.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jbtn_suma.setForeground(new java.awt.Color(255, 204, 204));
        jbtn_suma.setText("+");

        jbtn_resta.setBackground(new java.awt.Color(0, 0, 0));
        jbtn_resta.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jbtn_resta.setForeground(new java.awt.Color(255, 204, 204));
        jbtn_resta.setText("-");

        jbtn_division.setBackground(new java.awt.Color(0, 0, 0));
        jbtn_division.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jbtn_division.setForeground(new java.awt.Color(255, 204, 204));
        jbtn_division.setText("/");

        jbtn_multiplicacion.setBackground(new java.awt.Color(0, 0, 0));
        jbtn_multiplicacion.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jbtn_multiplicacion.setForeground(new java.awt.Color(255, 204, 204));
        jbtn_multiplicacion.setText("x");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("numero1");

        jLabel2.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jLabel2.setText("numero2");

        jlb_resultado.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jlb_resultado.setText("Resultado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtf_numero_2, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                            .addComponent(jtf_numero_1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlb_resultado)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtn_suma)
                                .addGap(18, 18, 18)
                                .addComponent(jbtn_resta)
                                .addGap(18, 18, 18)
                                .addComponent(jbtn_division)))
                        .addGap(18, 18, 18)
                        .addComponent(jbtn_multiplicacion)))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_numero_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_numero_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jlb_resultado)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_suma)
                    .addComponent(jbtn_resta)
                    .addComponent(jbtn_division)
                    .addComponent(jbtn_multiplicacion))
                .addGap(52, 52, 52))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JButton jbtn_division;
    public javax.swing.JButton jbtn_multiplicacion;
    public javax.swing.JButton jbtn_resta;
    public javax.swing.JButton jbtn_suma;
    public javax.swing.JLabel jlb_resultado;
    public javax.swing.JTextField jtf_numero_1;
    public javax.swing.JTextField jtf_numero_2;
    // End of variables declaration//GEN-END:variables
}
