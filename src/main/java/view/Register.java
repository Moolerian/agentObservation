
package view;

public class Register extends javax.swing.JFrame {

    public Register() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        bg_panel = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        lastNameLabel = new javax.swing.JLabel();
        lastNameTextField = new javax.swing.JTextField();
        genderLabel = new javax.swing.JLabel();
        genderComboBox = new javax.swing.JComboBox<>();
        userNameLabel = new javax.swing.JLabel();
        userNameTextField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        re_passwordLabel = new javax.swing.JLabel();
        re_passwordField = new javax.swing.JPasswordField();
        registerButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        image = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        exitButton = new javax.swing.JButton();
        backgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        bg_panel.setLayout(null);

        nameLabel.setFont(new java.awt.Font("sansserif", 1, 22)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 51));
        nameLabel.setText("نام");
        bg_panel.add(nameLabel);
        nameLabel.setBounds(600, 70, 20, 29);
        bg_panel.add(nameTextField);
        nameTextField.setBounds(400, 70, 180, 28);

        lastNameLabel.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        lastNameLabel.setForeground(new java.awt.Color(255, 255, 0));
        lastNameLabel.setText("نام خانوادگی");
        bg_panel.add(lastNameLabel);
        lastNameLabel.setBounds(590, 120, 81, 26);
        bg_panel.add(lastNameTextField);
        lastNameTextField.setBounds(400, 120, 180, 28);

        genderLabel.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        genderLabel.setForeground(new java.awt.Color(255, 255, 0));
        genderLabel.setText("جنسیت");
        bg_panel.add(genderLabel);
        genderLabel.setBounds(600, 170, 51, 29);

        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "مرد", "زن" }));
        bg_panel.add(genderComboBox);
        genderComboBox.setBounds(460, 170, 90, 26);

        userNameLabel.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        userNameLabel.setForeground(new java.awt.Color(255, 255, 0));
        userNameLabel.setText("نام کاربری");
        bg_panel.add(userNameLabel);
        userNameLabel.setBounds(600, 230, 80, 29);
        bg_panel.add(userNameTextField);
        userNameTextField.setBounds(400, 230, 180, 28);

        passwordLabel.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(255, 255, 0));
        passwordLabel.setText("کلمه عبور");
        bg_panel.add(passwordLabel);
        passwordLabel.setBounds(600, 280, 68, 26);
        bg_panel.add(passwordField);
        passwordField.setBounds(400, 280, 180, 28);

        re_passwordLabel.setFont(new java.awt.Font("sansserif", 1, 19)); // NOI18N
        re_passwordLabel.setForeground(new java.awt.Color(255, 255, 0));
        re_passwordLabel.setText("تکرار کلمه عبور");
        bg_panel.add(re_passwordLabel);
        re_passwordLabel.setBounds(600, 330, 104, 25);
        bg_panel.add(re_passwordField);
        re_passwordField.setBounds(400, 330, 180, 28);

        registerButton.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        registerButton.setForeground(new java.awt.Color(0, 0, 102));
        registerButton.setText("ثبت نام");
        bg_panel.add(registerButton);
        registerButton.setBounds(410, 420, 100, 50);

        cancelButton.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(0, 0, 102));
        cancelButton.setText("انصراف");
        bg_panel.add(cancelButton);
        cancelButton.setBounds(300, 420, 100, 50);

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/b.png"))); // NOI18N
        bg_panel.add(image);
        image.setBounds(30, 20, 130, 140);

        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("سازمان جغرافیایی نیروهای مسلح جمهوری اسلامی ایران");
        bg_panel.add(jLabel1);
        jLabel1.setBounds(20, 470, 218, 16);

        exitButton.setBackground(new java.awt.Color(0, 0, 0));
        exitButton.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        exitButton.setForeground(new java.awt.Color(255, 0, 51));
        exitButton.setText("X");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        bg_panel.add(exitButton);
        exitButton.setBounds(693, 0, 40, 30);

        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg2.png"))); // NOI18N
        bg_panel.add(backgroundLabel);
        backgroundLabel.setBounds(0, 0, 740, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(bg_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(bg_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JPanel bg_panel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JComboBox<String> genderComboBox;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField re_passwordField;
    private javax.swing.JLabel re_passwordLabel;
    private javax.swing.JButton registerButton;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JTextField userNameTextField;
    // End of variables declaration
}
