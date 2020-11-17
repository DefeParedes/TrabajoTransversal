/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;


import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;

/**
 *
 * @author LucasChaves <DWSLucas>
 */
public class Principal extends javax.swing.JFrame {

    public static final Color VERY_LIGHT_FONDO = new Color(67,119,202);
    listadoMaterias lm = new listadoMaterias();
    abmAlumnos aba = new abmAlumnos();
    abmMaterias abm = new abmMaterias();
    Inscripciones ins = new Inscripciones();
    listadoAlumnos la = new listadoAlumnos();
    nuevaNota nN = new nuevaNota();
    public Principal() {

        initComponents();  


        this.dpPanelAlumnos.add(lm);
        this.dpPanelAlumnos.add(aba);
        this.dpMateria.add(abm);
        this.dpMateria.add(ins);
        this.dpMateria.add(la);
        this.dpMateria.add(nN);
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Pp3 = new javax.swing.JPanel();
        jLabelPanel5 = new javax.swing.JLabel();
        Pp2 = new javax.swing.JPanel();
        jLabelPanel4 = new javax.swing.JLabel();
        Pp1 = new javax.swing.JPanel();
        jLabelPanel1 = new javax.swing.JLabel();
        Panel1 = new javax.swing.JLabel();
        Paneles = new javax.swing.JPanel();
        jPanelPaneInicio = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanelAlumnos = new javax.swing.JPanel();
        btnAgregarAlumno = new javax.swing.JButton();
        btnMateriasde = new javax.swing.JButton();
        dpPanelAlumnos = new javax.swing.JDesktopPane();
        jPanelMaterias = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        dpMateria = new javax.swing.JDesktopPane();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 625));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Grupo 6");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 600, 210, -1));

        Pp3.setBackground(new java.awt.Color(255, 255, 255));
        Pp3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        Pp3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Principal.this.mouseClicked(evt);
            }
        });

        jLabelPanel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelPanel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPanel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/materia.png"))); // NOI18N
        jLabelPanel5.setLabelFor(Pp3);
        jLabelPanel5.setText("Materias");
        jLabelPanel5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout Pp3Layout = new javax.swing.GroupLayout(Pp3);
        Pp3.setLayout(Pp3Layout);
        Pp3Layout.setHorizontalGroup(
            Pp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pp3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                .addContainerGap())
        );
        Pp3Layout.setVerticalGroup(
            Pp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pp3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(Pp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 230, 80));

        Pp2.setBackground(new java.awt.Color(255, 255, 255));
        Pp2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        Pp2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Principal.this.mouseClicked(evt);
            }
        });

        jLabelPanel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelPanel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPanel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/alumno.png"))); // NOI18N
        jLabelPanel4.setLabelFor(Pp2);
        jLabelPanel4.setText("Alumnos");
        jLabelPanel4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout Pp2Layout = new javax.swing.GroupLayout(Pp2);
        Pp2.setLayout(Pp2Layout);
        Pp2Layout.setHorizontalGroup(
            Pp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pp2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                .addContainerGap())
        );
        Pp2Layout.setVerticalGroup(
            Pp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pp2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(Pp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 230, 80));

        Pp1.setBackground(new java.awt.Color(255, 255, 255));
        Pp1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        Pp1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Principal.this.mouseClicked(evt);
            }
        });

        jLabelPanel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelPanel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Webp.net-resizeimage.png"))); // NOI18N
        jLabelPanel1.setLabelFor(Pp1);
        jLabelPanel1.setText("Inicio");
        jLabelPanel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabelPanel1.setIconTextGap(10);

        javax.swing.GroupLayout Pp1Layout = new javax.swing.GroupLayout(Pp1);
        Pp1.setLayout(Pp1Layout);
        Pp1Layout.setHorizontalGroup(
            Pp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pp1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                .addContainerGap())
        );
        Pp1Layout.setVerticalGroup(
            Pp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pp1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(Pp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 230, 80));

        Panel1.setBackground(new java.awt.Color(67, 119, 202));
        Panel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        getContentPane().add(Panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, 640));

        Paneles.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Paneles.setNextFocusableComponent(jPanelPaneInicio);
        Paneles.setLayout(new java.awt.CardLayout());

        jPanelPaneInicio.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(264, 344));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Boton Materias:");

        jLabel10.setText("-Alta de materias");

        jLabel11.setText("-Baja de materias");

        jLabel12.setText("-Modificacion de materias");

        jLabel13.setText("-Listado de alumnos de una materia");

        jLabel14.setText("-Inscripciones/Bajas a materias");

        jLabel15.setText("-Registrar nueva nota");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addContainerGap(187, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Boton Alumnos:");

        jLabel5.setText("-Alta de alumnos");

        jLabel6.setText("-Baja de alumnos");

        jLabel7.setText("-Modificacion de Datos");

        jLabel8.setText("-Listado de materias de un alumno");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addContainerGap(63, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelPaneInicioLayout = new javax.swing.GroupLayout(jPanelPaneInicio);
        jPanelPaneInicio.setLayout(jPanelPaneInicioLayout);
        jPanelPaneInicioLayout.setHorizontalGroup(
            jPanelPaneInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPaneInicioLayout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
        );
        jPanelPaneInicioLayout.setVerticalGroup(
            jPanelPaneInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPaneInicioLayout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addGroup(jPanelPaneInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(82, 82, 82))
        );

        Paneles.add(jPanelPaneInicio, "card2");

        jPanelAlumnos.setBackground(new java.awt.Color(255, 255, 255));

        btnAgregarAlumno.setText("Administracion de Alumnos");
        btnAgregarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAlumnoActionPerformed(evt);
            }
        });

        btnMateriasde.setText("Listado de Materias de un alumno");
        btnMateriasde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMateriasdeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dpPanelAlumnosLayout = new javax.swing.GroupLayout(dpPanelAlumnos);
        dpPanelAlumnos.setLayout(dpPanelAlumnosLayout);
        dpPanelAlumnosLayout.setHorizontalGroup(
            dpPanelAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        dpPanelAlumnosLayout.setVerticalGroup(
            dpPanelAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 427, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelAlumnosLayout = new javax.swing.GroupLayout(jPanelAlumnos);
        jPanelAlumnos.setLayout(jPanelAlumnosLayout);
        jPanelAlumnosLayout.setHorizontalGroup(
            jPanelAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAlumnosLayout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addComponent(btnAgregarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(btnMateriasde, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAlumnosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dpPanelAlumnos)
                .addContainerGap())
        );
        jPanelAlumnosLayout.setVerticalGroup(
            jPanelAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAlumnosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAgregarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMateriasde, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(dpPanelAlumnos)
                .addContainerGap())
        );

        Paneles.add(jPanelAlumnos, "card3");

        jPanelMaterias.setBackground(new java.awt.Color(255, 255, 255));
        jPanelMaterias.setPreferredSize(new java.awt.Dimension(770, 510));

        jButton1.setText("Administrar Materias");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Listado de alumnos de una Materia");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dpMateriaLayout = new javax.swing.GroupLayout(dpMateria);
        dpMateria.setLayout(dpMateriaLayout);
        dpMateriaLayout.setHorizontalGroup(
            dpMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        dpMateriaLayout.setVerticalGroup(
            dpMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 433, Short.MAX_VALUE)
        );

        jButton3.setText("Registrar nueva nota");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Inscripciones/Bajas");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMateriasLayout = new javax.swing.GroupLayout(jPanelMaterias);
        jPanelMaterias.setLayout(jPanelMateriasLayout);
        jPanelMateriasLayout.setHorizontalGroup(
            jPanelMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMateriasLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanelMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dpMateria)
                    .addGroup(jPanelMateriasLayout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelMateriasLayout.setVerticalGroup(
            jPanelMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMateriasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dpMateria)
                .addContainerGap())
        );

        Paneles.add(jPanelMaterias, "card4");

        getContentPane().add(Paneles, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 770, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseClicked
        if ( evt.getSource()== Pp1 ){
            jPanelAlumnos.setVisible(false);
            jPanelMaterias.setVisible(false);
            jPanelPaneInicio.setVisible(true);
        }
        else if ( evt.getSource()== Pp2 ){
            jPanelAlumnos.setVisible(true);
            jPanelMaterias.setVisible(false);
            jPanelPaneInicio.setVisible(false);
        }
        else if ( evt.getSource()== Pp3){
            jPanelAlumnos.setVisible(false);
            jPanelMaterias.setVisible(true);
            jPanelPaneInicio.setVisible(false);
        }
        
    }//GEN-LAST:event_mouseClicked

    private void btnAgregarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAlumnoActionPerformed
        
        if (lm.isShowing()){
            lm.hide();
        }
        aba.show();
    }//GEN-LAST:event_btnAgregarAlumnoActionPerformed

    private void btnMateriasdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMateriasdeActionPerformed
        
        if (aba.isShowing()){
            aba.hide();
        }
        lm.show();
        lm.inicializarLista();
    }//GEN-LAST:event_btnMateriasdeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        abm.show();
        la.hide();
        nN.hide();
        ins.hide();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        la.show();
        abm.hide();
        nN.hide();
        ins.hide();
        la.inicializarLista();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        nN.show();
        abm.hide();
        la.hide();
        ins.hide();
        nN.inicializarLista();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        ins.show();
        la.hide();
        abm.hide();
        nN.hide();
        ins.inicializarLista();
    }//GEN-LAST:event_jButton4ActionPerformed
/*
   */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Panel1;
    private javax.swing.JPanel Paneles;
    private javax.swing.JPanel Pp1;
    private javax.swing.JPanel Pp2;
    private javax.swing.JPanel Pp3;
    private javax.swing.JButton btnAgregarAlumno;
    private javax.swing.JButton btnMateriasde;
    private javax.swing.JDesktopPane dpMateria;
    private javax.swing.JDesktopPane dpPanelAlumnos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelPanel1;
    private javax.swing.JLabel jLabelPanel4;
    private javax.swing.JLabel jLabelPanel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelAlumnos;
    private javax.swing.JPanel jPanelMaterias;
    private javax.swing.JPanel jPanelPaneInicio;
    // End of variables declaration//GEN-END:variables
}
