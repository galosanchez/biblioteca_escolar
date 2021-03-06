package com.galosanchez.view;

import com.galosanchez.controller.BookController;
import com.galosanchez.controller.LoanController;
import com.galosanchez.controller.StudentController;
import com.galosanchez.domain.CopyBook;
import com.galosanchez.domain.Loan;
import com.galosanchez.domain.Student;
import com.galosanchez.domain.User;
import java.awt.Color;
import java.awt.Font;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Esta clase permite crear un nuevo préstamo
 * @author Galo Sánchez
 */
public class DialogNewLoan extends javax.swing.JDialog {

    private int xMouse, yMouse;
    private final JFrame jFrameParent;
    private User user;

    public DialogNewLoan(JFrame parent, boolean modal, User user) {
        super(parent, modal);
        this.jFrameParent = parent;
        this.user = user;
        initComponents();

        /* Fondo de JDialog tranparente */
        this.setBackground(new Color(0, 0, 0, 0));
        bg.setBackground(new Color(0, 0, 0, 0));
        /* Hacer que el jLabel del boton Crear sea focusable */
        jLabelButtonCreate.setFocusable(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelContent = new javax.swing.JPanel();
        jPanelLeft = new javax.swing.JPanel();
        jPanelTop = new javax.swing.JPanel();
        jLabelTitle = new javax.swing.JLabel();
        jPanelClose = new javax.swing.JPanel();
        jImgClose = new javax.swing.JLabel();
        jPanelDivide = new javax.swing.JPanel();
        jPanelForm = new javax.swing.JPanel();
        jLabelName = new javax.swing.JLabel();
        jLabelErrorPrestamo = new javax.swing.JLabel();
        jLabelLastName = new javax.swing.JLabel();
        jLabelErrorDevolucion = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldCode = new javax.swing.JTextField();
        jPanelFocusEmail = new javax.swing.JPanel();
        jLabelErrorCode = new javax.swing.JLabel();
        jLabelCI = new javax.swing.JLabel();
        jLabelPhone = new javax.swing.JLabel();
        jTextFieldCI = new javax.swing.JTextField();
        jPanelFocusPhone = new javax.swing.JPanel();
        jLabelErrorCI = new javax.swing.JLabel();
        jPanelCleanAll = new javax.swing.JPanel();
        jLabelCleanAll = new javax.swing.JLabel();
        jDatePrestamo = new com.toedter.calendar.JDateChooser();
        jPanelButtonCreate = new javax.swing.JPanel();
        jLabelButtonCreate = new javax.swing.JLabel();
        jDateDevolucion = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPaneDetail = new javax.swing.JEditorPane();
        bg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelContent.setBackground(new java.awt.Color(255, 255, 255));
        jPanelContent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelLeft.setBackground(new java.awt.Color(123, 31, 162));

        javax.swing.GroupLayout jPanelLeftLayout = new javax.swing.GroupLayout(jPanelLeft);
        jPanelLeft.setLayout(jPanelLeftLayout);
        jPanelLeftLayout.setHorizontalGroup(
            jPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );
        jPanelLeftLayout.setVerticalGroup(
            jPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 383, Short.MAX_VALUE)
        );

        jPanelContent.add(jPanelLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 15, 383));

        jPanelTop.setBackground(new java.awt.Color(255, 255, 255));
        jPanelTop.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanelTopMouseDragged(evt);
            }
        });
        jPanelTop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelTopMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelTopLayout = new javax.swing.GroupLayout(jPanelTop);
        jPanelTop.setLayout(jPanelTopLayout);
        jPanelTopLayout.setHorizontalGroup(
            jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        jPanelTopLayout.setVerticalGroup(
            jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanelContent.add(jPanelTop, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 20));

        jLabelTitle.setFont(new java.awt.Font("Hind Siliguri SemiBold", 0, 20)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(123, 31, 162));
        jLabelTitle.setText("Nuevo préstamo");
        jPanelContent.add(jLabelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 0, 200, 65));

        jPanelClose.setBackground(new java.awt.Color(255, 255, 255));

        jImgClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jImgClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/galosanchez/images/ic_close_dialog.png"))); // NOI18N
        jImgClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jImgCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jImgCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jImgCloseMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelCloseLayout = new javax.swing.GroupLayout(jPanelClose);
        jPanelClose.setLayout(jPanelCloseLayout);
        jPanelCloseLayout.setHorizontalGroup(
            jPanelCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jImgClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelCloseLayout.setVerticalGroup(
            jPanelCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jImgClose, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanelContent.add(jPanelClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 14, 40, 40));

        jPanelDivide.setBackground(new java.awt.Color(224, 224, 224));

        javax.swing.GroupLayout jPanelDivideLayout = new javax.swing.GroupLayout(jPanelDivide);
        jPanelDivide.setLayout(jPanelDivideLayout);
        jPanelDivideLayout.setHorizontalGroup(
            jPanelDivideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );
        jPanelDivideLayout.setVerticalGroup(
            jPanelDivideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        jPanelContent.add(jPanelDivide, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 65, 460, 1));

        jPanelForm.setBackground(new java.awt.Color(255, 255, 255));
        jPanelForm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelName.setFont(new java.awt.Font("Hind Siliguri", 0, 14)); // NOI18N
        jLabelName.setForeground(new java.awt.Color(158, 158, 158));
        jLabelName.setText("Fecha de préstamo");
        jPanelForm.add(jLabelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 17));

        jLabelErrorPrestamo.setFont(new java.awt.Font("Hind Siliguri", 0, 12)); // NOI18N
        jLabelErrorPrestamo.setForeground(new java.awt.Color(205, 92, 92));
        jPanelForm.add(jLabelErrorPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 47, 200, 14));

        jLabelLastName.setFont(new java.awt.Font("Hind Siliguri", 0, 14)); // NOI18N
        jLabelLastName.setForeground(new java.awt.Color(158, 158, 158));
        jLabelLastName.setText("Devolución");
        jPanelForm.add(jLabelLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, -1, 16));

        jLabelErrorDevolucion.setFont(new java.awt.Font("Hind Siliguri", 0, 12)); // NOI18N
        jLabelErrorDevolucion.setForeground(new java.awt.Color(205, 92, 92));
        jPanelForm.add(jLabelErrorDevolucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 47, 200, 14));

        jLabelEmail.setFont(new java.awt.Font("Hind Siliguri", 0, 14)); // NOI18N
        jLabelEmail.setForeground(new java.awt.Color(158, 158, 158));
        jLabelEmail.setText("Código de libro");
        jPanelForm.add(jLabelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 69, -1, 17));

        jTextFieldCode.setFont(new java.awt.Font("Hind Siliguri", 0, 16)); // NOI18N
        jTextFieldCode.setForeground(new java.awt.Color(33, 33, 33));
        jTextFieldCode.setBorder(null);
        jTextFieldCode.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldCodeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldCodeFocusLost(evt);
            }
        });
        jPanelForm.add(jTextFieldCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 89, 200, 20));

        jPanelFocusEmail.setBackground(new java.awt.Color(158, 158, 158));

        javax.swing.GroupLayout jPanelFocusEmailLayout = new javax.swing.GroupLayout(jPanelFocusEmail);
        jPanelFocusEmail.setLayout(jPanelFocusEmailLayout);
        jPanelFocusEmailLayout.setHorizontalGroup(
            jPanelFocusEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanelFocusEmailLayout.setVerticalGroup(
            jPanelFocusEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        jPanelForm.add(jPanelFocusEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 113, 200, 1));

        jLabelErrorCode.setFont(new java.awt.Font("Hind Siliguri", 0, 12)); // NOI18N
        jLabelErrorCode.setForeground(new java.awt.Color(205, 92, 92));
        jPanelForm.add(jLabelErrorCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 114, 200, 14));

        jLabelCI.setFont(new java.awt.Font("Hind Siliguri", 0, 14)); // NOI18N
        jLabelCI.setForeground(new java.awt.Color(158, 158, 158));
        jLabelCI.setText("Detalles");
        jPanelForm.add(jLabelCI, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 136, -1, 16));

        jLabelPhone.setFont(new java.awt.Font("Hind Siliguri", 0, 14)); // NOI18N
        jLabelPhone.setForeground(new java.awt.Color(158, 158, 158));
        jLabelPhone.setText("CI del estudiante");
        jPanelForm.add(jLabelPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 69, -1, 16));

        jTextFieldCI.setFont(new java.awt.Font("Hind Siliguri", 0, 16)); // NOI18N
        jTextFieldCI.setForeground(new java.awt.Color(33, 33, 33));
        jTextFieldCI.setBorder(null);
        jTextFieldCI.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldCIFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldCIFocusLost(evt);
            }
        });
        jPanelForm.add(jTextFieldCI, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 89, 200, 20));

        jPanelFocusPhone.setBackground(new java.awt.Color(158, 158, 158));

        javax.swing.GroupLayout jPanelFocusPhoneLayout = new javax.swing.GroupLayout(jPanelFocusPhone);
        jPanelFocusPhone.setLayout(jPanelFocusPhoneLayout);
        jPanelFocusPhoneLayout.setHorizontalGroup(
            jPanelFocusPhoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanelFocusPhoneLayout.setVerticalGroup(
            jPanelFocusPhoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        jPanelForm.add(jPanelFocusPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 113, 200, 1));

        jLabelErrorCI.setFont(new java.awt.Font("Hind Siliguri", 0, 12)); // NOI18N
        jLabelErrorCI.setForeground(new java.awt.Color(205, 92, 92));
        jPanelForm.add(jLabelErrorCI, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 114, 200, 14));

        jPanelCleanAll.setBackground(new java.awt.Color(255, 255, 255));

        jLabelCleanAll.setFont(new java.awt.Font("Hind Siliguri Medium", 0, 14)); // NOI18N
        jLabelCleanAll.setForeground(new java.awt.Color(158, 158, 158));
        jLabelCleanAll.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCleanAll.setText("Limpiar campos");
        jLabelCleanAll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCleanAllMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelCleanAllMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelCleanAllMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelCleanAllLayout = new javax.swing.GroupLayout(jPanelCleanAll);
        jPanelCleanAll.setLayout(jPanelCleanAllLayout);
        jPanelCleanAllLayout.setHorizontalGroup(
            jPanelCleanAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelCleanAll, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanelCleanAllLayout.setVerticalGroup(
            jPanelCleanAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCleanAllLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelCleanAll, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanelForm.add(jPanelCleanAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 245, 100, 32));

        jDatePrestamo.setForeground(new java.awt.Color(33, 33, 33));
        jDatePrestamo.setFont(new Font("Hind Siliguri", Font.PLAIN, 16));
        jPanelForm.add(jDatePrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 22, 200, 25));

        jPanelButtonCreate.setBackground(new java.awt.Color(156, 39, 176));

        jLabelButtonCreate.setFont(new java.awt.Font("Hind Siliguri Medium", 0, 14)); // NOI18N
        jLabelButtonCreate.setForeground(new java.awt.Color(255, 255, 255));
        jLabelButtonCreate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelButtonCreate.setText("Ingresar");
        jLabelButtonCreate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelButtonCreateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelButtonCreateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelButtonCreateMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelButtonCreateLayout = new javax.swing.GroupLayout(jPanelButtonCreate);
        jPanelButtonCreate.setLayout(jPanelButtonCreateLayout);
        jPanelButtonCreateLayout.setHorizontalGroup(
            jPanelButtonCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelButtonCreate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
        );
        jPanelButtonCreateLayout.setVerticalGroup(
            jPanelButtonCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelButtonCreate, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        jPanelForm.add(jPanelButtonCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 245, 78, 32));

        jDateDevolucion.setForeground(new java.awt.Color(33, 33, 33));
        jDateDevolucion.setFont(new Font("Hind Siliguri", Font.PLAIN, 16));
        jPanelForm.add(jDateDevolucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 22, 200, 25));

        jScrollPane1.setFont(new Font("Hind Siliguri", Font.PLAIN, 16));

        jEditorPaneDetail.setFont(new Font("Hind Siliguri", Font.PLAIN, 16));
        jEditorPaneDetail.setForeground(new java.awt.Color(33, 33, 33));
        jEditorPaneDetail.setMaximumSize(new java.awt.Dimension(418, 50));
        jEditorPaneDetail.setMinimumSize(new java.awt.Dimension(418, 50));
        jEditorPaneDetail.setPreferredSize(new java.awt.Dimension(418, 50));
        jScrollPane1.setViewportView(jEditorPaneDetail);

        jPanelForm.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 156, -1, -1));

        jPanelContent.add(jPanelForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 86, 420, 277));

        getContentPane().add(jPanelContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 475, 383));

        bg.setPreferredSize(new java.awt.Dimension(505, 406));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/galosanchez/images/bg_new_student.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(505, 406));
        jLabel1.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel1.setPreferredSize(new java.awt.Dimension(505, 406));

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
        );

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 505, 413));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Eventos que permiten arrastrar la ventana desde la barra superior
     */
    private void jPanelTopMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelTopMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanelTopMousePressed

    private void jPanelTopMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelTopMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanelTopMouseDragged

    /**
     * Eventos que perminen a los botones cerrar y minimizar ventana
     */
    private void jImgCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jImgCloseMouseEntered
        jPanelClose.setBackground(new java.awt.Color(245, 245, 245));
    }//GEN-LAST:event_jImgCloseMouseEntered

    private void jImgCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jImgCloseMouseExited
        jPanelClose.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_jImgCloseMouseExited

    private void jImgCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jImgCloseMouseClicked
        this.dispose();
    }//GEN-LAST:event_jImgCloseMouseClicked

    private void jTextFieldCodeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldCodeFocusGained
        chanceColorFocusSeparator("Gained", jPanelFocusEmail);
    }//GEN-LAST:event_jTextFieldCodeFocusGained

    private void jTextFieldCodeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldCodeFocusLost
        chanceColorFocusSeparator("Lost", jPanelFocusEmail);
    }//GEN-LAST:event_jTextFieldCodeFocusLost

    private void jTextFieldCIFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldCIFocusGained
        chanceColorFocusSeparator("Gained", jPanelFocusPhone);
    }//GEN-LAST:event_jTextFieldCIFocusGained

    private void jTextFieldCIFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldCIFocusLost
        chanceColorFocusSeparator("Lost", jPanelFocusPhone);
    }//GEN-LAST:event_jTextFieldCIFocusLost

    /**
     * Metodo que permite cambiar de color de JPanel que esta debajo de un
     * TextFied para mejorar la experiencia de usurio. Dependiendo del tipo que
     * ingrese "Gained" : color de foco, o "Lost": color normal Ingresa el
     * JPanel al que se aplica el cambio
     *
     * @param tipo
     * @param panelSeparator
     */
    public void chanceColorFocusSeparator(String tipo, JPanel panelSeparator) {
        if (tipo.equals("Gained")) {
            panelSeparator.setBackground(new java.awt.Color(123, 31, 162));
            return;
        }
        if (tipo.equals("Lost")) {
            panelSeparator.setBackground(new java.awt.Color(158, 158, 158));
        }
    }

    /**
     * Eventos de boton para limpiar todos los campos del formulario
     */
    private void jLabelCleanAllMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCleanAllMouseEntered
        jPanelCleanAll.setBackground(new java.awt.Color(245, 245, 245));
    }//GEN-LAST:event_jLabelCleanAllMouseEntered

    private void jLabelCleanAllMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCleanAllMouseExited
        jPanelCleanAll.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_jLabelCleanAllMouseExited

    private void jLabelCleanAllMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCleanAllMouseClicked
        cleanjLabelsError();
        cleanjTextFields();
    }//GEN-LAST:event_jLabelCleanAllMouseClicked

    /**
     * Eventos de boton "Ingresar". Mejorar apariencial al entrar con el
     * mouse
     */
    private void jLabelButtonCreateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelButtonCreateMouseEntered
        jPanelButtonCreate.setBackground(new java.awt.Color(123, 31, 162));
    }//GEN-LAST:event_jLabelButtonCreateMouseEntered

    private void jLabelButtonCreateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelButtonCreateMouseExited
        jPanelButtonCreate.setBackground(new java.awt.Color(156, 39, 176));
    }//GEN-LAST:event_jLabelButtonCreateMouseExited

    /**
     * Evento click del boton "Ingresar".
     */
    private void jLabelButtonCreateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelButtonCreateMouseClicked
        /* Limpiar todos los mensajes de error dentro del formulario */
        cleanjLabelsError();
        /* Validar que todos los campos esten con el formato correcto */
        if (!validarCamposFormato()) {
            return;
        }
        
        /* Validar que el LIBRO exista con el codigo*/
        CopyBook copyBook = null;
        try {
            if (BookController.bookCodeExist(jTextFieldCode.getText()) < 1) {
                jLabelErrorCode.setText("No existe libro con ese código.");
                return;
            }else{
                copyBook = BookController.copyBookBusy(jTextFieldCode.getText());
                if( copyBook == null){
                jLabelErrorCode.setText("El libro está ocupado.");
                return;
                }
            }
            
        } catch (Exception e) {
            if (e.getLocalizedMessage().equals("3011")) {
                openDialogAlert("danger", "No se puede establecer conexión con el","servidor");
            } else {
                openDialogAlert("danger", "Error al momento de consultar al servidor","");
            }
            return;
        }
        
        /* Validar que el estudiante exista con la cédula*/
        Student student = null;
        try {
            student = StudentController.getStudentCedula(jTextFieldCI.getText());
            if ( student == null ) {
                jLabelErrorCI.setText("No existe registro de esta cédula.");
                return;
            }
        } catch (Exception e) {
            if (e.getLocalizedMessage().equals("3011")) {
                openDialogAlert("danger", "No se puede establecer conexión con el","servidor");
            } else {
                openDialogAlert("danger", "Error al momento de consultar al servidor","");
            }
            return;
        }

        /* Crea una objeto Loan(Prestamo) y se asigna los atributos */
        Loan loan = new Loan();
        long dateAux= (jDatePrestamo.getDate()).getTime();
        loan.setDate_prestamo(new java.sql.Date(dateAux));
        long dateAuxDev = (jDateDevolucion.getDate()).getTime();
        loan.setDate_devolucion(new java.sql.Date(dateAuxDev));
        
        loan.setDetail(jEditorPaneDetail.getText());
        loan.setUser(new User(user.getId_user()));
        loan.setStudent(student);
        loan.setCopyBook(copyBook);
        
        /* Enviar datos del nuevo préstamo a la base de datos */
        try {
            // Se comprueba que los datos se inbresen correctamente a la base
            if (LoanController.createLoan(loan) > 0) {
                openDialogAlert("successful", " ","Creado correctamente","");
                // Limpiar campos
                cleanjLabelsError();
                cleanjTextFields();
                jDatePrestamo.requestFocus();
            // Sino lanzar un mensaje de alerta    
            } else {
                openDialogAlert("warning", "Error al crear","");
            }
        } catch (Exception e) {
            // Errores con la base de datos
            if (e.getLocalizedMessage().equals("3011")) {
                openDialogAlert("danger", "No se puede establecer conexión con el","servidor");
            } else {
                openDialogAlert("danger", "Error al momento de consultar al servidor","");
            }
        }

    }//GEN-LAST:event_jLabelButtonCreateMouseClicked

    /* Métodos que crean un alert para lanzar un mensaje */
    private void openDialogAlert(String tipo, String message1, String message2) {
        DialogAlert dialogAlert = new DialogAlert(jFrameParent, true, tipo, message1, message2);
        dialogAlert.setVisible(true);
    }
    
    private void openDialogAlert(String tipo,String title, String message1, String message2) {
        DialogAlert dialogAlert = new DialogAlert(jFrameParent, true, tipo,title, message1, message2);
        dialogAlert.setVisible(true);
    }

    /**
     * Metodo que permite validar los datos que el usuario ingresa antes de
     * enviar hacia la base de datos. Este retornara un boolean para verificar
     * que todos los campos esten correctamente ingresados.
     *
     * @return
     */
    private boolean validarCamposFormato() {
        //variable de verificación de los campos
        boolean verif = true;
        /* Validación de la fecha de prestamo: no debe quedar vacio */
        if(jDatePrestamo.getDate() == null){
            verif = false;
            jLabelErrorPrestamo.setText("Ingrese una fecha válida.");
        }
        /* Validación de la fecha de devolución: no debe quedar vacio */
        if(jDateDevolucion.getDate() == null){
            verif = false;
            jLabelErrorDevolucion.setText("Ingrese una fecha válida.");
        }
        /* Validación del código del libro: no debe quedar vacio */
        if (jTextFieldCode.getText().length() < 1) {
            verif = false;
            jLabelErrorCode.setText("Olvidaste ingresar el código.");
        }
        /* Validación del CI del estudiante: no debe quedar vacio */
        if (jTextFieldCI.getText().length() < 1) {
            verif = false;
            jLabelErrorCI.setText("Olvidaste ingresar la cédula.");
        }
        return verif;
    }

    private boolean validateTextFieldNumber(String cadena) {
        // Si la cadena está vacía, debemos devolver false
        if (cadena.length() == 0) {
            return false;
        }
        for (int x = 0; x < cadena.length(); x++) {
            char c = cadena.charAt(x);
            // Si no está entre 0 y 9
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }
        return true;
    }

    /**
     * Metodo que permite limpiar mensaje de error de los jLabels
     */
    private void cleanjLabelsError() {
        jLabelErrorPrestamo.setText("");
        jLabelErrorDevolucion.setText("");
        jLabelErrorCode.setText("");
        jLabelErrorCI.setText("");
    }

    /**
     * Metodo que permite limpiar todos los campos de TextField
     */
    private void cleanjTextFields() {
        ((javax.swing.JTextField)jDatePrestamo.getDateEditor().getUiComponent()).setText("");
        ((javax.swing.JTextField)jDateDevolucion.getDateEditor().getUiComponent()).setText("");
        jTextFieldCode.setText("");
        jTextFieldCI.setText("");
        jEditorPaneDetail.setText("");
    }

    /**
     * Metodo que valida si un correo electronico tiene el formaro correcto
     *
     * @param email
     * @return
     */
    public static boolean ValidarMail(String email) {
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mather = pattern.matcher(email);
        return mather.find();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private com.toedter.calendar.JDateChooser jDateDevolucion;
    private com.toedter.calendar.JDateChooser jDatePrestamo;
    private javax.swing.JEditorPane jEditorPaneDetail;
    private javax.swing.JLabel jImgClose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelButtonCreate;
    private javax.swing.JLabel jLabelCI;
    private javax.swing.JLabel jLabelCleanAll;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelErrorCI;
    private javax.swing.JLabel jLabelErrorCode;
    private javax.swing.JLabel jLabelErrorDevolucion;
    private javax.swing.JLabel jLabelErrorPrestamo;
    private javax.swing.JLabel jLabelLastName;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelPhone;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanelButtonCreate;
    private javax.swing.JPanel jPanelCleanAll;
    private javax.swing.JPanel jPanelClose;
    private javax.swing.JPanel jPanelContent;
    private javax.swing.JPanel jPanelDivide;
    private javax.swing.JPanel jPanelFocusEmail;
    private javax.swing.JPanel jPanelFocusPhone;
    private javax.swing.JPanel jPanelForm;
    private javax.swing.JPanel jPanelLeft;
    private javax.swing.JPanel jPanelTop;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldCI;
    private javax.swing.JTextField jTextFieldCode;
    // End of variables declaration//GEN-END:variables

}
