/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package juegosolitario;

import java.awt.Color;
import javax.swing.JTextField;

/**
 *
 * @author meli
 */
public class JFJuego extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    Solitario juego;
    Nodo lastClick=new Nodo("X", 0, Nodo.TIERRA);
    int lastCol=0;
    public JFJuego(Solitario juego) {
        this.juego=juego;
        initComponents();
        setLocationRelativeTo(null);
        mostrar();
    }
    public void setColor(Nodo columna, JTextField colText){
        if(columna.getSimbolo()=="♥"||columna.getSimbolo()=="♦"){
            colText.setForeground(Color.red);
        }else{
            colText.setForeground(Color.black);
        }
        colText.setText(columna.getNumero()+" "+columna.getSimbolo());
    }
    public void mostrar(){
        lastClickLAbel.setText(lastClick.getNumero()+" "+lastClick.getSimbolo());
        Pila act=juego.n1;
        setColor(act.Cabeza, columna1);
        nCol1.setText("+"+act.cant()+" Cartas");
        act=juego.n2;
        setColor(act.Cabeza, columna2);
        nCol2.setText("+"+act.cant()+" Cartas");
        act=juego.n3;
        setColor(act.Cabeza, columna3);
        nCol3.setText("+"+act.cant()+" Cartas");
        act=juego.n4;
        setColor(act.Cabeza, columna4);
        nCol4.setText("+"+act.cant()+" Cartas");
        act=juego.n5;
        setColor(act.Cabeza, columna5);
        nCol5.setText("+"+act.cant()+" Cartas");
        PilaBaraja.setText(juego.baraja.Cabeza.getNumero()+" "+juego.baraja.Cabeza.getSimbolo());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        columna1 = new javax.swing.JTextField();
        columna2 = new javax.swing.JTextField();
        columna3 = new javax.swing.JTextField();
        columna4 = new javax.swing.JTextField();
        columna5 = new javax.swing.JTextField();
        nCol1 = new javax.swing.JTextField();
        nCol2 = new javax.swing.JTextField();
        nCol3 = new javax.swing.JTextField();
        nCol4 = new javax.swing.JTextField();
        nCol5 = new javax.swing.JTextField();
        PilaBaraja = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        lastClickLAbel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jueguito de meli");
        setBackground(new java.awt.Color(0, 102, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        columna1.setEditable(false);
        columna1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        columna1.setForeground(new java.awt.Color(204, 0, 0));
        columna1.setText("    K ♦");
        columna1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                columna1MouseClicked(evt);
            }
        });
        columna1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                columna1ActionPerformed(evt);
            }
        });

        columna2.setEditable(false);
        columna2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        columna2.setForeground(new java.awt.Color(204, 0, 0));
        columna2.setText("    3 ♥");
        columna2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                columna2MouseClicked(evt);
            }
        });

        columna3.setEditable(false);
        columna3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        columna3.setText("     6♠");
        columna3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                columna3MouseClicked(evt);
            }
        });

        columna4.setEditable(false);
        columna4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        columna4.setText("     8 ♣");
        columna4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                columna4MouseClicked(evt);
            }
        });

        columna5.setEditable(false);
        columna5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        columna5.setForeground(new java.awt.Color(204, 0, 0));
        columna5.setText("    1 ♦");
        columna5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                columna5MouseClicked(evt);
            }
        });

        nCol1.setEditable(false);
        nCol1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nCol1.setText("+0 Cartas");
        nCol1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nCol1ActionPerformed(evt);
            }
        });

        nCol2.setEditable(false);
        nCol2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nCol2.setText("+1 Cartas");
        nCol2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nCol2ActionPerformed(evt);
            }
        });

        nCol3.setEditable(false);
        nCol3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nCol3.setText("+2 Cartas");

        nCol4.setEditable(false);
        nCol4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nCol4.setText("+3 Cartas");

        nCol5.setEditable(false);
        nCol5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nCol5.setText("+4 Cartas");

        PilaBaraja.setEditable(false);
        PilaBaraja.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        PilaBaraja.setForeground(new java.awt.Color(204, 0, 0));
        PilaBaraja.setText(" 4 ♥");
        PilaBaraja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PilaBarajaMouseClicked(evt);
            }
        });
        PilaBaraja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PilaBarajaActionPerformed(evt);
            }
        });

        jTextField12.setEditable(false);
        jTextField12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField12.setForeground(new java.awt.Color(204, 0, 0));
        jTextField12.setText(" ♥");
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });

        jTextField13.setEditable(false);
        jTextField13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField13.setForeground(new java.awt.Color(204, 0, 0));
        jTextField13.setText(" ♦");

        jTextField14.setEditable(false);
        jTextField14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField14.setText(" ♣");

        jTextField15.setEditable(false);
        jTextField15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField15.setText(" ♠");
        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });

        lastClickLAbel.setText("LastClick");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(columna1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                .addComponent(columna2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(110, 110, 110)
                                .addComponent(columna4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nCol1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PilaBaraja, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(46, 46, 46))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(nCol2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lastClickLAbel)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(nCol3)
                                                    .addComponent(columna3))
                                                .addGap(18, 18, 18)
                                                .addComponent(nCol4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nCol5)
                            .addComponent(columna5))))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PilaBaraja, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(lastClickLAbel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nCol1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nCol2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nCol3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nCol4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nCol5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(columna1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(columna2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(columna3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(columna4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(columna5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void columna1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_columna1ActionPerformed
       
    }//GEN-LAST:event_columna1ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void nCol1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nCol1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nCol1ActionPerformed

    private void PilaBarajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PilaBarajaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PilaBarajaActionPerformed

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void nCol2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nCol2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nCol2ActionPerformed

    private void cambiarCartas(int n, Pila actual ){
        
        if(lastCol==n){
            actual.push(lastClick);
            lastCol=0;
            lastClick=new Nodo("X", 0, Nodo.TIERRA);
        }else{
            if(lastClick.Simbolo!="X"){
                //verificar sii es color contrario y numero menos 1
                actual.push(lastClick);
                lastClick=new Nodo("X", 0, Nodo.TIERRA);
                lastCol=0;
            }else{
                if(!actual.vacia()){
                    lastClick=actual.pop();
                    lastCol=n;
                }else{
                    lastClick=new Nodo("X", 0, Nodo.TIERRA);
                    lastCol=0;
                }
            }
            mostrar();
        }
    }
    
    private void columna1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_columna1MouseClicked
        cambiarCartas(1, juego.n1);
    }//GEN-LAST:event_columna1MouseClicked

    private void columna2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_columna2MouseClicked
        cambiarCartas(2, juego.n2);
    }//GEN-LAST:event_columna2MouseClicked

    private void columna3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_columna3MouseClicked
       cambiarCartas(3, juego.n3);
    }//GEN-LAST:event_columna3MouseClicked

    private void columna4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_columna4MouseClicked
        cambiarCartas(4, juego.n4);
    }//GEN-LAST:event_columna4MouseClicked

    private void columna5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_columna5MouseClicked
       cambiarCartas(5, juego.n5);
    }//GEN-LAST:event_columna5MouseClicked

    private void PilaBarajaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PilaBarajaMouseClicked
       //cambiar su codigo
        if(lastCol==9){
            juego.baraja.push(lastClick);
            lastCol=0;
            lastClick=new Nodo("X", 0, Nodo.TIERRA);
        }else{
            if(lastClick.Simbolo!="X"){
                juego.baraja.push(lastClick);
                lastClick=new Nodo("X", 0, Nodo.TIERRA);
                lastCol=0;
            }else{
                lastClick=juego.baraja.pop();
                lastCol=9;
            }
       }
        System.out.println(lastClick.numero);
        mostrar();
    }//GEN-LAST:event_PilaBarajaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField PilaBaraja;
    private javax.swing.JTextField columna1;
    private javax.swing.JTextField columna2;
    private javax.swing.JTextField columna3;
    private javax.swing.JTextField columna4;
    private javax.swing.JTextField columna5;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JLabel lastClickLAbel;
    private javax.swing.JTextField nCol1;
    private javax.swing.JTextField nCol2;
    private javax.swing.JTextField nCol3;
    private javax.swing.JTextField nCol4;
    private javax.swing.JTextField nCol5;
    // End of variables declaration//GEN-END:variables
}
