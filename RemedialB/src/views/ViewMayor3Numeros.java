/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

;


/**
 *
 * @author Briceyda Angeles
 */
public class ViewMayor3Numeros extends javax.swing.JPanel {

    /**
     * Creates new form ViewMayor3Numeros
     */
    public ViewMayor3Numeros() {
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

        jlb_numero_1 = new javax.swing.JLabel();
        jlb_numero_2 = new javax.swing.JLabel();
        jlb_numero_3 = new javax.swing.JLabel();
        jlb_resultado = new javax.swing.JLabel();
        jtf_numero_1 = new javax.swing.JTextField();
        jtf_numero_2 = new javax.swing.JTextField();
        jtf_numero_3 = new javax.swing.JTextField();
        jbtn_calcular = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 51, 153));

        jlb_numero_1.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jlb_numero_1.setText("Numero 1:");

        jlb_numero_2.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jlb_numero_2.setText("Numero 2:");

        jlb_numero_3.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jlb_numero_3.setText("Numero 3:");

        jlb_resultado.setFont(new java.awt.Font("PakType Naskh Basic", 2, 18)); // NOI18N
        jlb_resultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jtf_numero_1.setFont(new java.awt.Font("PakType Naskh Basic", 1, 14)); // NOI18N

        jtf_numero_2.setFont(new java.awt.Font("PakType Naskh Basic", 1, 14)); // NOI18N

        jtf_numero_3.setFont(new java.awt.Font("PakType Naskh Basic", 1, 14)); // NOI18N

        jbtn_calcular.setBackground(new java.awt.Color(255, 51, 204));
        jbtn_calcular.setFont(new java.awt.Font("PakType Naskh Basic", 1, 14)); // NOI18N
        jbtn_calcular.setText("Calcular");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addComponent(jlb_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlb_numero_3)
                                .addGap(18, 18, 18)
                                .addComponent(jtf_numero_3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jlb_numero_1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jtf_numero_1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jlb_numero_2)
                                    .addGap(18, 18, 18)
                                    .addComponent(jtf_numero_2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jbtn_calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_numero_1)
                    .addComponent(jtf_numero_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_numero_2)
                    .addComponent(jtf_numero_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_numero_3)
                    .addComponent(jtf_numero_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jlb_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtn_calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jbtn_calcular;
    public javax.swing.JLabel jlb_numero_1;
    public javax.swing.JLabel jlb_numero_2;
    public javax.swing.JLabel jlb_numero_3;
    public javax.swing.JLabel jlb_resultado;
    public javax.swing.JTextField jtf_numero_1;
    public javax.swing.JTextField jtf_numero_2;
    public javax.swing.JTextField jtf_numero_3;
    // End of variables declaration//GEN-END:variables
}