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
public class ViewAscendente extends javax.swing.JPanel {

    /**
     * Creates new form ViewAscendente
     */
    public ViewAscendente() {
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

        jlb_entrada = new javax.swing.JLabel();
        jlb_resultado = new javax.swing.JLabel();
        jtf_numero_insertado = new javax.swing.JTextField();
        jsp_lista_numeros = new javax.swing.JScrollPane();
        jli_lista_numeros = new javax.swing.JList<>();
        jbtn_insertar = new javax.swing.JButton();
        jbtn_ascendente = new javax.swing.JButton();
        jbtn_promedio = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 51, 204));

        jlb_entrada.setFont(new java.awt.Font("PakType Naskh Basic", 1, 14)); // NOI18N
        jlb_entrada.setText("Input:");

        jlb_resultado.setBackground(new java.awt.Color(0, 0, 0));
        jlb_resultado.setFont(new java.awt.Font("PakType Naskh Basic", 1, 18)); // NOI18N
        jlb_resultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jtf_numero_insertado.setFont(new java.awt.Font("PakType Naskh Basic", 1, 14)); // NOI18N

        jli_lista_numeros.setForeground(new java.awt.Color(51, 51, 51));
        jsp_lista_numeros.setViewportView(jli_lista_numeros);

        jbtn_insertar.setBackground(new java.awt.Color(255, 204, 153));
        jbtn_insertar.setFont(new java.awt.Font("PakType Naskh Basic", 1, 14)); // NOI18N
        jbtn_insertar.setText("Insertar");

        jbtn_ascendente.setBackground(new java.awt.Color(255, 204, 153));
        jbtn_ascendente.setFont(new java.awt.Font("PakType Naskh Basic", 1, 14)); // NOI18N
        jbtn_ascendente.setText("Ascendente");

        jbtn_promedio.setBackground(new java.awt.Color(255, 204, 153));
        jbtn_promedio.setFont(new java.awt.Font("PakType Naskh Basic", 1, 14)); // NOI18N
        jbtn_promedio.setText("Promedio");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlb_entrada)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtf_numero_insertado, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtn_insertar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jsp_lista_numeros, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtn_ascendente, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                            .addComponent(jbtn_promedio, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jlb_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_entrada)
                    .addComponent(jtf_numero_insertado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn_insertar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jsp_lista_numeros, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbtn_ascendente, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtn_promedio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlb_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jbtn_ascendente;
    public javax.swing.JButton jbtn_insertar;
    public javax.swing.JButton jbtn_promedio;
    public javax.swing.JLabel jlb_entrada;
    public javax.swing.JLabel jlb_resultado;
    public javax.swing.JList<String> jli_lista_numeros;
    public javax.swing.JScrollPane jsp_lista_numeros;
    public javax.swing.JTextField jtf_numero_insertado;
    // End of variables declaration//GEN-END:variables
}