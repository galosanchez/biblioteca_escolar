package com.galosanchez.view;

import com.galosanchez.domain.User;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * Esta clase es el paner general que permite navegar por los items
 * @author Galo Sánchez
 */

public class Home extends javax.swing.JFrame {

    private User user;
    private int xMouse, yMouse;
    private String itemSelect;
    private javax.swing.JPanel jPanelCenter;

    public Home(User user) {
        
        this.user = user;
        initComponents();
        /* Asignar ícino de barra de tareas*/
        setIconImage(new ImageIcon(getClass().getResource("/com/galosanchez/images/icon_main.png")).getImage());
        /* Insertar el panel Home */
        jPanelCenter = new JPanelHome(this);
        jScrollPaneCenter.getViewport().setBackground(new java.awt.Color(245, 245, 245));
        jScrollPaneCenter.setViewportView(jPanelCenter);
        this.itemSelect = "itemHome";
        /* Asignar el usuario al item de cuenta */
        jLabelUser.setText(this.user.getUser());
        /* Si el usuario no es administrador ocultar el item de Usuarios */
        if(user.getType()!='A')
        jPanelUsers.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        top = new javax.swing.JPanel();
        jPanelConTop = new javax.swing.JPanel();
        jPanelMinimize = new javax.swing.JPanel();
        jLabelImageMinize = new javax.swing.JLabel();
        jPanelClose = new javax.swing.JPanel();
        jLabelImageClose = new javax.swing.JLabel();
        left = new javax.swing.JPanel();
        jLabelLogo = new javax.swing.JLabel();
        jLabelNameSchool = new javax.swing.JLabel();
        jPanelHome = new javax.swing.JPanel();
        jLabelIcHome = new javax.swing.JLabel();
        jLabelHome = new javax.swing.JLabel();
        jPanelLoans = new javax.swing.JPanel();
        jLabelIcLoans = new javax.swing.JLabel();
        jLabelLoans = new javax.swing.JLabel();
        jPanelBooks = new javax.swing.JPanel();
        jLabelIcBooks = new javax.swing.JLabel();
        jLabelBooks = new javax.swing.JLabel();
        jPanelStudents = new javax.swing.JPanel();
        jLabelIcStudents = new javax.swing.JLabel();
        jLabelStudents = new javax.swing.JLabel();
        jPanelReports = new javax.swing.JPanel();
        jLabelIcReports = new javax.swing.JLabel();
        jLabelReports = new javax.swing.JLabel();
        jPanelUsers = new javax.swing.JPanel();
        jLabelIcUsers = new javax.swing.JLabel();
        jLabelUsers = new javax.swing.JLabel();
        jPanelUser = new javax.swing.JPanel();
        jLabelIcUser = new javax.swing.JLabel();
        jLabelUser = new javax.swing.JLabel();
        jPanelSeparatorMenu = new javax.swing.JPanel();
        bottom = new javax.swing.JPanel();
        center = new javax.swing.JPanel();
        jScrollPaneCenter = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        background.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(158, 158, 158)));
        background.setLayout(new java.awt.BorderLayout());

        top.setBackground(new java.awt.Color(245, 245, 245));
        top.setPreferredSize(new java.awt.Dimension(998, 24));
        top.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                topMouseDragged(evt);
            }
        });
        top.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                topMousePressed(evt);
            }
        });

        jPanelConTop.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelMinimize.setBackground(new java.awt.Color(245, 245, 245));

        jLabelImageMinize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/galosanchez/images/img_minimize_normal.png"))); // NOI18N
        jLabelImageMinize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelImageMinizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelImageMinizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelImageMinizeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelMinimizeLayout = new javax.swing.GroupLayout(jPanelMinimize);
        jPanelMinimize.setLayout(jPanelMinimizeLayout);
        jPanelMinimizeLayout.setHorizontalGroup(
            jPanelMinimizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMinimizeLayout.createSequentialGroup()
                .addComponent(jLabelImageMinize, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelMinimizeLayout.setVerticalGroup(
            jPanelMinimizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelImageMinize, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelConTop.add(jPanelMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 34, 24));

        jPanelClose.setBackground(new java.awt.Color(245, 245, 245));

        jLabelImageClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/galosanchez/images/img_close_normal.png"))); // NOI18N
        jLabelImageClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelImageCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelImageCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelImageCloseMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelCloseLayout = new javax.swing.GroupLayout(jPanelClose);
        jPanelClose.setLayout(jPanelCloseLayout);
        jPanelCloseLayout.setHorizontalGroup(
            jPanelCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCloseLayout.createSequentialGroup()
                .addComponent(jLabelImageClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelCloseLayout.setVerticalGroup(
            jPanelCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelImageClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelConTop.add(jPanelClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 0, 34, 24));

        javax.swing.GroupLayout topLayout = new javax.swing.GroupLayout(top);
        top.setLayout(topLayout);
        topLayout.setHorizontalGroup(
            topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topLayout.createSequentialGroup()
                .addGap(0, 1033, Short.MAX_VALUE)
                .addComponent(jPanelConTop, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        topLayout.setVerticalGroup(
            topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelConTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        background.add(top, java.awt.BorderLayout.PAGE_START);

        left.setBackground(new java.awt.Color(245, 245, 245));
        left.setMinimumSize(new java.awt.Dimension(0, 0));
        left.setPreferredSize(new java.awt.Dimension(180, 588));
        left.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/galosanchez/images/img_logo_school.png"))); // NOI18N
        left.add(jLabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 16, 50, 50));

        jLabelNameSchool.setFont(new java.awt.Font("Hind Siliguri", 1, 16)); // NOI18N
        jLabelNameSchool.setForeground(new java.awt.Color(123, 31, 162));
        jLabelNameSchool.setText("Escuela GS");
        left.add(jLabelNameSchool, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 16, 100, 50));

        jPanelHome.setBackground(new java.awt.Color(221, 202, 228));
        jPanelHome.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelHomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelHomeMouseExited(evt);
            }
        });
        jPanelHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelIcHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/galosanchez/images/ic_home_focus.png"))); // NOI18N
        jPanelHome.add(jLabelIcHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 0, 28, 36));

        jLabelHome.setFont(new java.awt.Font("Hind Siliguri SemiBold", 0, 16)); // NOI18N
        jLabelHome.setForeground(new java.awt.Color(123, 31, 162));
        jLabelHome.setText("Inicio");
        jPanelHome.add(jLabelHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 92, 36));

        left.add(jPanelHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 90, 164, 36));

        jPanelLoans.setBackground(new java.awt.Color(245, 245, 245));
        jPanelLoans.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelLoans.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelLoansMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelLoansMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelLoansMouseExited(evt);
            }
        });
        jPanelLoans.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelIcLoans.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/galosanchez/images/ic_lending.png"))); // NOI18N
        jPanelLoans.add(jLabelIcLoans, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 0, 28, 36));

        jLabelLoans.setFont(new java.awt.Font("Hind Siliguri SemiBold", 0, 16)); // NOI18N
        jLabelLoans.setForeground(new java.awt.Color(117, 117, 117));
        jLabelLoans.setText("Préstamos");
        jPanelLoans.add(jLabelLoans, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 92, 36));

        left.add(jPanelLoans, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 138, 164, 36));

        jPanelBooks.setBackground(new java.awt.Color(245, 245, 245));
        jPanelBooks.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelBooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelBooksMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelBooksMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelBooksMouseExited(evt);
            }
        });
        jPanelBooks.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelIcBooks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/galosanchez/images/ic_book.png"))); // NOI18N
        jPanelBooks.add(jLabelIcBooks, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 0, 28, 36));

        jLabelBooks.setFont(new java.awt.Font("Hind Siliguri SemiBold", 0, 16)); // NOI18N
        jLabelBooks.setForeground(new java.awt.Color(117, 117, 117));
        jLabelBooks.setText("Libros");
        jPanelBooks.add(jLabelBooks, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 92, 36));

        left.add(jPanelBooks, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 186, 164, 36));

        jPanelStudents.setBackground(new java.awt.Color(245, 245, 245));
        jPanelStudents.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelStudents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelStudentsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelStudentsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelStudentsMouseExited(evt);
            }
        });
        jPanelStudents.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelIcStudents.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/galosanchez/images/ic_students.png"))); // NOI18N
        jPanelStudents.add(jLabelIcStudents, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 0, 28, 36));

        jLabelStudents.setFont(new java.awt.Font("Hind Siliguri SemiBold", 0, 16)); // NOI18N
        jLabelStudents.setForeground(new java.awt.Color(117, 117, 117));
        jLabelStudents.setText("Estudiantes");
        jPanelStudents.add(jLabelStudents, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 92, 36));

        left.add(jPanelStudents, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 234, 164, 36));

        jPanelReports.setBackground(new java.awt.Color(245, 245, 245));
        jPanelReports.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelReports.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelReportsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelReportsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelReportsMouseExited(evt);
            }
        });
        jPanelReports.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelIcReports.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/galosanchez/images/ic_reports.png"))); // NOI18N
        jPanelReports.add(jLabelIcReports, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 0, 28, 36));

        jLabelReports.setFont(new java.awt.Font("Hind Siliguri SemiBold", 0, 16)); // NOI18N
        jLabelReports.setForeground(new java.awt.Color(117, 117, 117));
        jLabelReports.setText("Reportes");
        jPanelReports.add(jLabelReports, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 92, 36));

        left.add(jPanelReports, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 282, 164, 36));

        jPanelUsers.setBackground(new java.awt.Color(245, 245, 245));
        jPanelUsers.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelUsersMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelUsersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelUsersMouseExited(evt);
            }
        });
        jPanelUsers.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelIcUsers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/galosanchez/images/ic_users.png"))); // NOI18N
        jLabelIcUsers.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelUsers.add(jLabelIcUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 0, 28, 36));

        jLabelUsers.setFont(new java.awt.Font("Hind Siliguri SemiBold", 0, 16)); // NOI18N
        jLabelUsers.setForeground(new java.awt.Color(117, 117, 117));
        jLabelUsers.setText("Usiarios");
        jPanelUsers.add(jLabelUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 92, 36));

        left.add(jPanelUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 330, 164, 36));

        jPanelUser.setBackground(new java.awt.Color(245, 245, 245));
        jPanelUser.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelUserMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelUserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelUserMouseExited(evt);
            }
        });
        jPanelUser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelIcUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/galosanchez/images/ic_user.png"))); // NOI18N
        jLabelIcUser.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelUser.add(jLabelIcUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 0, 28, 36));

        jLabelUser.setFont(new java.awt.Font("Hind Siliguri SemiBold", 0, 16)); // NOI18N
        jLabelUser.setForeground(new java.awt.Color(117, 117, 117));
        jLabelUser.setText("User");
        jPanelUser.add(jLabelUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 92, 36));

        left.add(jPanelUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 550, 164, 36));

        jPanelSeparatorMenu.setBackground(new java.awt.Color(158, 158, 158));

        javax.swing.GroupLayout jPanelSeparatorMenuLayout = new javax.swing.GroupLayout(jPanelSeparatorMenu);
        jPanelSeparatorMenu.setLayout(jPanelSeparatorMenuLayout);
        jPanelSeparatorMenuLayout.setHorizontalGroup(
            jPanelSeparatorMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );
        jPanelSeparatorMenuLayout.setVerticalGroup(
            jPanelSeparatorMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 588, Short.MAX_VALUE)
        );

        left.add(jPanelSeparatorMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 0, 1, 588));

        background.add(left, java.awt.BorderLayout.LINE_START);

        bottom.setBackground(new java.awt.Color(245, 245, 245));
        bottom.setPreferredSize(new java.awt.Dimension(998, 8));

        javax.swing.GroupLayout bottomLayout = new javax.swing.GroupLayout(bottom);
        bottom.setLayout(bottomLayout);
        bottomLayout.setHorizontalGroup(
            bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1101, Short.MAX_VALUE)
        );
        bottomLayout.setVerticalGroup(
            bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        background.add(bottom, java.awt.BorderLayout.PAGE_END);

        center.setBackground(new java.awt.Color(245, 245, 245));
        center.setPreferredSize(new java.awt.Dimension(923, 588));

        jScrollPaneCenter.setBackground(new java.awt.Color(245, 245, 245));
        jScrollPaneCenter.setBorder(null);
        jScrollPaneCenter.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPaneCenter.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        javax.swing.GroupLayout centerLayout = new javax.swing.GroupLayout(center);
        center.setLayout(centerLayout);
        centerLayout.setHorizontalGroup(
            centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneCenter, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        centerLayout.setVerticalGroup(
            centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneCenter)
        );

        background.add(center, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /* Eventos de barra superior */
    private void topMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_topMousePressed

    private void topMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_topMouseDragged

    private void jLabelImageMinizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelImageMinizeMouseEntered
        jLabelImageMinize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/galosanchez/images/img_minimize_click.png")));
        jPanelMinimize.setBackground(new java.awt.Color(158, 158, 158));
    }//GEN-LAST:event_jLabelImageMinizeMouseEntered

    private void jLabelImageMinizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelImageMinizeMouseExited
        jLabelImageMinize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/galosanchez/images/img_minimize_normal.png")));
        jPanelMinimize.setBackground(new java.awt.Color(245, 245, 245));
    }//GEN-LAST:event_jLabelImageMinizeMouseExited

    private void jLabelImageMinizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelImageMinizeMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jLabelImageMinizeMouseClicked

    private void jLabelImageCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelImageCloseMouseEntered
        jLabelImageClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/galosanchez/images/img_close_click.png")));
        jPanelClose.setBackground(new java.awt.Color(205, 92, 92));
    }//GEN-LAST:event_jLabelImageCloseMouseEntered

    private void jLabelImageCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelImageCloseMouseExited
        jLabelImageClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/galosanchez/images/img_close_normal.png")));
        jPanelClose.setBackground(new java.awt.Color(245, 245, 245));
    }//GEN-LAST:event_jLabelImageCloseMouseExited

    private void jLabelImageCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelImageCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelImageCloseMouseClicked

    /* Eventos mouse (Entered-Exited) del menu lateral */
    private void jPanelHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHomeMouseEntered
        changeSelectItemMenu(true, "itemHome", jLabelIcHome, jLabelHome, getClass());
    }//GEN-LAST:event_jPanelHomeMouseEntered

    private void jPanelHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHomeMouseExited
        changeSelectItemMenu(false, "itemHome", jLabelIcHome, jLabelHome, getClass());
    }//GEN-LAST:event_jPanelHomeMouseExited

    private void jPanelLoansMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelLoansMouseEntered
        changeSelectItemMenu(true, "itemLending", jLabelIcLoans, jLabelLoans, getClass());
    }//GEN-LAST:event_jPanelLoansMouseEntered

    private void jPanelLoansMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelLoansMouseExited
        changeSelectItemMenu(false, "itemLending", jLabelIcLoans, jLabelLoans, getClass());
    }//GEN-LAST:event_jPanelLoansMouseExited

    private void jPanelBooksMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBooksMouseEntered
        changeSelectItemMenu(true, "itemBooks", jLabelIcBooks, jLabelBooks, getClass());
    }//GEN-LAST:event_jPanelBooksMouseEntered

    private void jPanelBooksMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBooksMouseExited
        changeSelectItemMenu(false, "itemBooks", jLabelIcBooks, jLabelBooks, getClass());
    }//GEN-LAST:event_jPanelBooksMouseExited

    private void jPanelStudentsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelStudentsMouseEntered
        changeSelectItemMenu(true, "itemStudents", jLabelIcStudents, jLabelStudents, getClass());
    }//GEN-LAST:event_jPanelStudentsMouseEntered

    private void jPanelStudentsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelStudentsMouseExited
        changeSelectItemMenu(false, "itemStudents", jLabelIcStudents, jLabelStudents, getClass());
    }//GEN-LAST:event_jPanelStudentsMouseExited

    private void jPanelReportsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelReportsMouseEntered
        changeSelectItemMenu(true, "itemReports", jLabelIcReports, jLabelReports, getClass());
    }//GEN-LAST:event_jPanelReportsMouseEntered

    private void jPanelReportsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelReportsMouseExited
        changeSelectItemMenu(false, "itemReports", jLabelIcReports, jLabelReports, getClass());
    }//GEN-LAST:event_jPanelReportsMouseExited

    private void jPanelUsersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelUsersMouseEntered
        changeSelectItemMenu(true, "itemUsers", jLabelIcUsers, jLabelUsers, getClass());
    }//GEN-LAST:event_jPanelUsersMouseEntered

    private void jPanelUsersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelUsersMouseExited
        changeSelectItemMenu(false, "itemUsers", jLabelIcUsers, jLabelUsers, getClass());
    }//GEN-LAST:event_jPanelUsersMouseExited

    private void jPanelUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelUserMouseEntered
        changeSelectItemMenu(true, "itemUser", jLabelIcUser, jLabelUser, getClass());
    }//GEN-LAST:event_jPanelUserMouseEntered

    private void jPanelUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelUserMouseExited
        changeSelectItemMenu(false, "itemUser", jLabelIcUser, jLabelUser, getClass());
    }//GEN-LAST:event_jPanelUserMouseExited

    private void changeSelectItemMenu(Boolean tipo, String item, JLabel labelIcon, JLabel label, Class clase) {
        if (item.equals(itemSelect)) {
            return;
        }
        String icon;
        switch (item) {
            case "itemHome":
                icon = (tipo) ? "ic_home_focus.png" : "ic_home.png";
                break;
            case "itemLending":
                icon = (tipo) ? "ic_lending_focus.png" : "ic_lending.png";
                break;
            case "itemBooks":
                icon = (tipo) ? "ic_book_focus.png" : "ic_book.png";
                break;
            case "itemStudents":
                icon = (tipo) ? "ic_students_focus.png" : "ic_students.png";
                break;
            case "itemReports":
                icon = (tipo) ? "ic_reports_focus.png" : "ic_reports.png";
                break;
            case "itemUsers":
                icon = (tipo) ? "ic_users_focus.png" : "ic_users.png";
                break;
            case "itemUser":
                icon = (tipo) ? "ic_user_focus.png" : "ic_user.png";
                break;
            default:
                icon = null;
        }
        if (icon != null) {
            labelIcon.setIcon(new javax.swing.ImageIcon(clase.getResource("/com/galosanchez/images/" + icon)));
        }
        if (tipo) {
            label.setForeground(new java.awt.Color(123, 31, 162));
        } else {
            label.setForeground(new java.awt.Color(117, 117, 117));
        }
    }

    /* Eventos mouse (Clicked) del menu lateral */
    private void jPanelHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHomeMouseClicked
        boolean state = changeComponentItemClick("itemHome", jPanelHome, jLabelIcHome, jLabelHome);
        if (state) {
            jPanelCenter = new JPanelHome(this);
            jScrollPaneCenter.setViewportView(jPanelCenter);
        }
    }//GEN-LAST:event_jPanelHomeMouseClicked

    private void jPanelLoansMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelLoansMouseClicked
        boolean state = changeComponentItemClick("itemLending", jPanelLoans, jLabelIcLoans, jLabelLoans);
        if (state) {
            jPanelCenter = new JPanelPrestamos(this, user);
            jScrollPaneCenter.setViewportView(jPanelCenter);
        }
    }//GEN-LAST:event_jPanelLoansMouseClicked

    private void jPanelBooksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBooksMouseClicked
        boolean state = changeComponentItemClick("itemBooks", jPanelBooks, jLabelIcBooks, jLabelBooks);
        if (state) {
            jPanelCenter = new JPanelBooks(this);
            jScrollPaneCenter.setViewportView(jPanelCenter);
        }
    }//GEN-LAST:event_jPanelBooksMouseClicked

    private void jPanelStudentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelStudentsMouseClicked
        boolean state = changeComponentItemClick("itemStudents", jPanelStudents, jLabelIcStudents, jLabelStudents);
        if (state) {
            jPanelCenter = new JPanelStudents(this);
            jScrollPaneCenter.setViewportView(jPanelCenter);
        }
    }//GEN-LAST:event_jPanelStudentsMouseClicked

    private void jPanelReportsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelReportsMouseClicked
        boolean state = changeComponentItemClick("itemReports", jPanelReports, jLabelIcReports, jLabelReports);
        if (state) {
            
        }
    }//GEN-LAST:event_jPanelReportsMouseClicked

    private void jPanelUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelUsersMouseClicked
        if(user.getType()!='A') return;
        
        boolean state = changeComponentItemClick("itemUsers", jPanelUsers, jLabelIcUsers, jLabelUsers);
        if (state) {
            jPanelCenter = new JPanelUsers(this);
            jScrollPaneCenter.setViewportView(jPanelCenter);
        }
    }//GEN-LAST:event_jPanelUsersMouseClicked

    private void jPanelUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelUserMouseClicked
        boolean state = changeComponentItemClick("itemUser", jPanelUser, jLabelIcUser, jLabelUser);
        if (state) {
            jPanelCenter = new JPanelCount(this,user);
            jScrollPaneCenter.setViewportView(jPanelCenter);
        }
    }//GEN-LAST:event_jPanelUserMouseClicked

    private boolean changeComponentItemClick(String item, javax.swing.JPanel jPanel, JLabel labelIcon, JLabel label) {
        if (item.equals(itemSelect)) {
            return false;
        }
        String icon;
        switch (item) {
            case "itemHome":
                icon = "ic_home_focus.png";
                break;
            case "itemLending":
                icon = "ic_lending_focus.png";
                break;
            case "itemBooks":
                icon = "ic_book_focus.png";
                break;
            case "itemStudents":
                icon = "ic_students_focus.png";
                break;
            case "itemReports":
                icon = "ic_reports_focus.png";
                break;
            case "itemUsers":
                icon = "ic_users_focus.png";
                break;
            case "itemUser":
                icon = "ic_user_focus.png";
                break;
            default:
                icon = null;
        }
        jPanel.setBackground(new java.awt.Color(221, 202, 228));
        labelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/galosanchez/images/" + icon)));
        label.setForeground(new java.awt.Color(123, 31, 162));
        changeNormalComponentItem(itemSelect);
        itemSelect = item;
        return true;
    }

    private void changeNormalComponentItem(String item) {
        switch (item) {
            case "itemHome":
                jPanelHome.setBackground(new java.awt.Color(245, 245, 245));
                jLabelIcHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/galosanchez/images/ic_home.png")));
                jLabelHome.setForeground(new java.awt.Color(117, 117, 117));
                break;
            case "itemLending":
                jPanelLoans.setBackground(new java.awt.Color(245, 245, 245));
                jLabelIcLoans.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/galosanchez/images/ic_lending.png")));
                jLabelLoans.setForeground(new java.awt.Color(117, 117, 117));
                break;
            case "itemBooks":
                jPanelBooks.setBackground(new java.awt.Color(245, 245, 245));
                jLabelIcBooks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/galosanchez/images/ic_book.png")));
                jLabelBooks.setForeground(new java.awt.Color(117, 117, 117));
                break;
            case "itemStudents":
                jPanelStudents.setBackground(new java.awt.Color(245, 245, 245));
                jLabelIcStudents.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/galosanchez/images/ic_students.png")));
                jLabelStudents.setForeground(new java.awt.Color(117, 117, 117));
                break;
            case "itemReports":
                jPanelReports.setBackground(new java.awt.Color(245, 245, 245));
                jLabelIcReports.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/galosanchez/images/ic_reports.png")));
                jLabelReports.setForeground(new java.awt.Color(117, 117, 117));
                break;
            case "itemUsers":
                jPanelUsers.setBackground(new java.awt.Color(245, 245, 245));
                jLabelIcUsers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/galosanchez/images/ic_users.png")));
                jLabelUsers.setForeground(new java.awt.Color(117, 117, 117));
                break;
            case "itemUser":
                jPanelUser.setBackground(new java.awt.Color(245, 245, 245));
                jLabelIcUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/galosanchez/images/ic_user.png")));
                jLabelUser.setForeground(new java.awt.Color(117, 117, 117));
                break;
            default:
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel bottom;
    private javax.swing.JPanel center;
    private javax.swing.JLabel jLabelBooks;
    private javax.swing.JLabel jLabelHome;
    private javax.swing.JLabel jLabelIcBooks;
    private javax.swing.JLabel jLabelIcHome;
    private javax.swing.JLabel jLabelIcLoans;
    private javax.swing.JLabel jLabelIcReports;
    private javax.swing.JLabel jLabelIcStudents;
    private javax.swing.JLabel jLabelIcUser;
    private javax.swing.JLabel jLabelIcUsers;
    private javax.swing.JLabel jLabelImageClose;
    private javax.swing.JLabel jLabelImageMinize;
    private javax.swing.JLabel jLabelLoans;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelNameSchool;
    private javax.swing.JLabel jLabelReports;
    private javax.swing.JLabel jLabelStudents;
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JLabel jLabelUsers;
    private javax.swing.JPanel jPanelBooks;
    private javax.swing.JPanel jPanelClose;
    private javax.swing.JPanel jPanelConTop;
    private javax.swing.JPanel jPanelHome;
    private javax.swing.JPanel jPanelLoans;
    private javax.swing.JPanel jPanelMinimize;
    private javax.swing.JPanel jPanelReports;
    private javax.swing.JPanel jPanelSeparatorMenu;
    private javax.swing.JPanel jPanelStudents;
    private javax.swing.JPanel jPanelUser;
    private javax.swing.JPanel jPanelUsers;
    private javax.swing.JScrollPane jScrollPaneCenter;
    private javax.swing.JPanel left;
    private javax.swing.JPanel top;
    // End of variables declaration//GEN-END:variables
}
