
package view;

import java.awt.Color;
import javax.swing.JPanel;


public class Home extends javax.swing.JFrame {


    public Home() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        bg_panel = new javax.swing.JPanel();
        side_panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        facilityPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        proposalPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        sendFilePanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        editPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        exitButton = new javax.swing.JButton();
        main_panel = new javax.swing.JPanel();
        main_panel_facility = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        startDateTextField = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        endDateTextField = new javax.swing.JFormattedTextField();
        calculateButton = new javax.swing.JButton();
        latTextField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        lonTextField = new javax.swing.JTextField();
        main_panel_proposal = new javax.swing.JPanel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        proposalTable = new javax.swing.JTable();
        sendProposalButton = new javax.swing.JButton();
        main_panel_sendInfo = new javax.swing.JPanel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        sendInfoTable = new javax.swing.JTable();
        sendProposalButton2 = new javax.swing.JButton();
        fileNameLabel = new javax.swing.JLabel();
        selectFileButton = new javax.swing.JButton();
        main_panel_summary = new javax.swing.JPanel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        bg_panel.setBackground(new java.awt.Color(0, 0, 0));
        bg_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        side_panel.setBackground(new java.awt.Color(51, 0, 51));
        side_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/b.png"))); // NOI18N
        side_panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));
        side_panel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 250, 10));

        facilityPanel.setBackground(new java.awt.Color(117, 89, 117));
        facilityPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                facilityPanelMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 17)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 51));
        jLabel2.setText("تعیین موقعیت و مشخصات تجهیزات");

        javax.swing.GroupLayout facilityPanelLayout = new javax.swing.GroupLayout(facilityPanel);
        facilityPanel.setLayout(facilityPanelLayout);
        facilityPanelLayout.setHorizontalGroup(
                facilityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(facilityPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addContainerGap(41, Short.MAX_VALUE))
        );
        facilityPanelLayout.setVerticalGroup(
                facilityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, facilityPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                                .addContainerGap())
        );

        side_panel.add(facilityPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 250, 60));

        proposalPanel.setBackground(new java.awt.Color(64, 43, 100));
        proposalPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                proposalPanelMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("ارسال اطلاعات پایش آسمان");

        javax.swing.GroupLayout proposalPanelLayout = new javax.swing.GroupLayout(proposalPanel);
        proposalPanel.setLayout(proposalPanelLayout);
        proposalPanelLayout.setHorizontalGroup(
                proposalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(proposalPanelLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel4)
                                .addContainerGap(45, Short.MAX_VALUE))
        );
        proposalPanelLayout.setVerticalGroup(
                proposalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(proposalPanelLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel4)
                                .addContainerGap(19, Short.MAX_VALUE))
        );

        side_panel.add(proposalPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 250, 60));

        sendFilePanel.setBackground(new java.awt.Color(64, 43, 100));
        sendFilePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sendFilePanelMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("راهنما");

        javax.swing.GroupLayout sendFilePanelLayout = new javax.swing.GroupLayout(sendFilePanel);
        sendFilePanel.setLayout(sendFilePanelLayout);
        sendFilePanelLayout.setHorizontalGroup(
                sendFilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sendFilePanelLayout.createSequentialGroup()
                                .addContainerGap(112, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(102, 102, 102))
        );
        sendFilePanelLayout.setVerticalGroup(
                sendFilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sendFilePanelLayout.createSequentialGroup()
                                .addContainerGap(10, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(16, 16, 16))
        );

        side_panel.add(sendFilePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 250, 50));
        side_panel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 250, 10));

        editPanel.setBackground(new java.awt.Color(64, 43, 100));
        editPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editPanelMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("انتخاب پیشنهاد برای پایش آسمان");

        javax.swing.GroupLayout editPanelLayout = new javax.swing.GroupLayout(editPanel);
        editPanel.setLayout(editPanelLayout);
        editPanelLayout.setHorizontalGroup(
                editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(editPanelLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel6)
                                .addContainerGap(33, Short.MAX_VALUE))
        );
        editPanelLayout.setVerticalGroup(
                editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editPanelLayout.createSequentialGroup()
                                .addContainerGap(19, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(17, 17, 17))
        );

        side_panel.add(editPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 250, 60));

        exitButton.setBackground(new java.awt.Color(0, 0, 0));
        exitButton.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        exitButton.setForeground(new java.awt.Color(255, 0, 51));
        exitButton.setText("X");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        side_panel.add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, -1, -1));

        bg_panel.add(side_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 250, 560));

        main_panel.setBackground(new java.awt.Color(0, 0, 0));
        main_panel.setLayout(new java.awt.CardLayout());

        main_panel_facility.setBackground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("بر اساس اطلاعات وارد شده در قسمت زیر  سیستم پیشنهاد برای پایش ارائه میکند");

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 255, 255));
        jLabel7.setText("عرض جغرافیایی");

        jLabel8.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("نوع تلسکوب");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel9.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("تاریخ شروع");

        try {
            startDateTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####/##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel10.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("تاریخ پایان");

        try {
            endDateTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####/##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        calculateButton.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        calculateButton.setForeground(new java.awt.Color(0, 0, 51));
        calculateButton.setText("محاسبه");

        jLabel12.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("طول جغرافیایی");

        javax.swing.GroupLayout main_panel_facilityLayout = new javax.swing.GroupLayout(main_panel_facility);
        main_panel_facility.setLayout(main_panel_facilityLayout);
        main_panel_facilityLayout.setHorizontalGroup(
                main_panel_facilityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(main_panel_facilityLayout.createSequentialGroup()
                                .addGroup(main_panel_facilityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main_panel_facilityLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jSeparator3))
                                        .addGroup(main_panel_facilityLayout.createSequentialGroup()
                                                .addGap(130, 130, 130)
                                                .addComponent(jLabel3)
                                                .addGap(0, 126, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main_panel_facilityLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(main_panel_facilityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main_panel_facilityLayout.createSequentialGroup()
                                                .addGroup(main_panel_facilityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(endDateTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                                                        .addComponent(lonTextField))
                                                .addGap(18, 18, 18)
                                                .addGroup(main_panel_facilityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel10)
                                                        .addComponent(jLabel12))
                                                .addGap(56, 56, 56)
                                                .addGroup(main_panel_facilityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(startDateTextField)
                                                        .addComponent(jComboBox1, 0, 223, Short.MAX_VALUE)
                                                        .addComponent(latTextField))
                                                .addGap(18, 18, 18)
                                                .addGroup(main_panel_facilityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel9)
                                                        .addComponent(jLabel8))
                                                .addGap(42, 42, 42))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main_panel_facilityLayout.createSequentialGroup()
                                                .addComponent(calculateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(299, 299, 299))))
        );
        main_panel_facilityLayout.setVerticalGroup(
                main_panel_facilityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(main_panel_facilityLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addGroup(main_panel_facilityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(latTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel12)
                                        .addComponent(lonTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(main_panel_facilityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(main_panel_facilityLayout.createSequentialGroup()
                                                .addGap(35, 35, 35)
                                                .addGroup(main_panel_facilityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(startDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel9)))
                                        .addGroup(main_panel_facilityLayout.createSequentialGroup()
                                                .addGap(43, 43, 43)
                                                .addGroup(main_panel_facilityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(endDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel10))))
                                .addGap(16, 16, 16)
                                .addGroup(main_panel_facilityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel8)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 225, Short.MAX_VALUE)
                                .addComponent(calculateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
        );

        main_panel.add(main_panel_facility, "card2");

        main_panel_proposal.setBackground(new java.awt.Color(0, 0, 0));

        jLabel11.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("بر اساس موقعیت مکانی و زمانی و دیگر اطلاعات پیشنهاد هایی برای انتخاب ارائه میشود");

        proposalTable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        proposalTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "زمان پایان", "زمان شروع", "منطقه مورد نظر", "نام پیشنهاد"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                    false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        proposalTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        proposalTable.setGridColor(new java.awt.Color(0, 0, 0));
        proposalTable.setRowHeight(40);
        proposalTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        proposalTable.setUpdateSelectionOnSort(false);
        jScrollPane1.setViewportView(proposalTable);

        sendProposalButton.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        sendProposalButton.setForeground(new java.awt.Color(0, 0, 153));
        sendProposalButton.setText("انتخاب");
        sendProposalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendProposalButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout main_panel_proposalLayout = new javax.swing.GroupLayout(main_panel_proposal);
        main_panel_proposal.setLayout(main_panel_proposalLayout);
        main_panel_proposalLayout.setHorizontalGroup(
                main_panel_proposalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(main_panel_proposalLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jSeparator4, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(main_panel_proposalLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main_panel_proposalLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(main_panel_proposalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main_panel_proposalLayout.createSequentialGroup()
                                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(60, 60, 60))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main_panel_proposalLayout.createSequentialGroup()
                                                .addComponent(sendProposalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(283, 283, 283))))
        );
        main_panel_proposalLayout.setVerticalGroup(
                main_panel_proposalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(main_panel_proposalLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                                .addComponent(sendProposalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        main_panel.add(main_panel_proposal, "card3");

        main_panel_sendInfo.setBackground(new java.awt.Color(0, 0, 0));

        jLabel14.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("انتخاب فایل شامل اطلاعات پایش آسمان بر اساس پیشنهاد ارائه شده سیستم");

        sendInfoTable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sendInfoTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "زمان ارسال", "نام فایل", "زمان پایان", "زمان شروع", "منطقه مورد نظر", "نام پیشنهاد"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                    true, true, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        sendInfoTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sendInfoTable.setGridColor(new java.awt.Color(0, 0, 0));
        sendInfoTable.setRowHeight(40);
        sendInfoTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        sendInfoTable.setUpdateSelectionOnSort(false);
        jScrollPane3.setViewportView(sendInfoTable);

        sendProposalButton2.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        sendProposalButton2.setForeground(new java.awt.Color(0, 0, 153));
        sendProposalButton2.setText("ارسال");
        sendProposalButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendProposalButton2ActionPerformed(evt);
            }
        });

        fileNameLabel.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        fileNameLabel.setForeground(new java.awt.Color(255, 255, 51));
        fileNameLabel.setText("fileName...");

        selectFileButton.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        selectFileButton.setForeground(new java.awt.Color(0, 0, 51));
        selectFileButton.setText("انتخاب فایل");

        javax.swing.GroupLayout main_panel_sendInfoLayout = new javax.swing.GroupLayout(main_panel_sendInfo);
        main_panel_sendInfo.setLayout(main_panel_sendInfoLayout);
        main_panel_sendInfoLayout.setHorizontalGroup(
                main_panel_sendInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main_panel_sendInfoLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(main_panel_sendInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main_panel_sendInfoLayout.createSequentialGroup()
                                                .addComponent(sendProposalButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(283, 283, 283))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main_panel_sendInfoLayout.createSequentialGroup()
                                                .addComponent(fileNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(selectFileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(77, 77, 77))))
                        .addGroup(main_panel_sendInfoLayout.createSequentialGroup()
                                .addGroup(main_panel_sendInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(main_panel_sendInfoLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jSeparator6, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE))
                                        .addGroup(main_panel_sendInfoLayout.createSequentialGroup()
                                                .addGroup(main_panel_sendInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(main_panel_sendInfoLayout.createSequentialGroup()
                                                                .addGap(29, 29, 29)
                                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(main_panel_sendInfoLayout.createSequentialGroup()
                                                                .addGap(147, 147, 147)
                                                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        main_panel_sendInfoLayout.setVerticalGroup(
                main_panel_sendInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(main_panel_sendInfoLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addGroup(main_panel_sendInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(fileNameLabel)
                                        .addComponent(selectFileButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                                .addComponent(sendProposalButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        main_panel.add(main_panel_sendInfo, "card3");

        main_panel_summary.setBackground(new java.awt.Color(0, 0, 0));

        jLabel15.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("راهنمایی استفاده از نرم افزار ارسال اطلاعات پایش آسمان براساس موقعیت زمانی و مکانی عامل انسانی");

        javax.swing.GroupLayout main_panel_summaryLayout = new javax.swing.GroupLayout(main_panel_summary);
        main_panel_summary.setLayout(main_panel_summaryLayout);
        main_panel_summaryLayout.setHorizontalGroup(
                main_panel_summaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(main_panel_summaryLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jSeparator7, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main_panel_summaryLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58))
        );
        main_panel_summaryLayout.setVerticalGroup(
                main_panel_summaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(main_panel_summaryLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel15)
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(486, Short.MAX_VALUE))
        );

        main_panel.add(main_panel_summary, "card3");

        bg_panel.add(main_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(bg_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(bg_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>

    private void facilityPanelMouseClicked(java.awt.event.MouseEvent evt) {

        main_panel.removeAll();
        main_panel.repaint();
        main_panel.revalidate();

        main_panel.add(main_panel_facility);
        main_panel.repaint();
        main_panel.revalidate();

        setColor(facilityPanel);
        resetColor(proposalPanel);

    }

    private void proposalPanelMouseClicked(java.awt.event.MouseEvent evt) {

        main_panel.removeAll();
        main_panel.repaint();
        main_panel.revalidate();

        main_panel.add(main_panel_proposal);
        main_panel.repaint();
        main_panel.revalidate();

        setColor(proposalPanel);
        resetColor(facilityPanel);

    }

    private void sendFilePanelMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void editPanelMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void sendProposalButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void sendProposalButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }


    void setColor(JPanel panel){
        panel.setBackground(new Color(117,89,117));
    }

    void resetColor(JPanel panel){
        panel.setBackground(new Color(64,43,100));
    }


    // Variables declaration - do not modify
    private javax.swing.JPanel bg_panel;
    private javax.swing.JButton calculateButton;
    private javax.swing.JPanel editPanel;
    private javax.swing.JFormattedTextField endDateTextField;
    private javax.swing.JButton exitButton;
    private javax.swing.JPanel facilityPanel;
    private javax.swing.JLabel fileNameLabel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField latTextField;
    private javax.swing.JTextField lonTextField;
    private javax.swing.JPanel main_panel;
    private javax.swing.JPanel main_panel_facility;
    private javax.swing.JPanel main_panel_proposal;
    private javax.swing.JPanel main_panel_sendInfo;
    private javax.swing.JPanel main_panel_summary;
    private javax.swing.JPanel proposalPanel;
    private javax.swing.JTable proposalTable;
    private javax.swing.JButton selectFileButton;
    private javax.swing.JPanel sendFilePanel;
    private javax.swing.JTable sendInfoTable;
    private javax.swing.JButton sendProposalButton;
    private javax.swing.JButton sendProposalButton2;
    private javax.swing.JPanel side_panel;
    private javax.swing.JFormattedTextField startDateTextField;
    // End of variables declaration
}
