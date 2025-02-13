package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignupForm extends JFrame {
    private JTextField nameField, emailField, mobileNumberField, addrrField, answerField;
    private JPasswordField passwordField;
    private JButton saveButton, clearButton, exitButton, loginButton, forgotPasswordButton;
    private JComboBox<String> securityQuestionBox;



    SignupForm() {
        this.setTitle("Cafe Management System - Signup");
        this.setSize(600, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());


        JPanel headerPanel = new JPanel();
        headerPanel.setLayout(new BoxLayout(headerPanel, BoxLayout.Y_AXIS));
        headerPanel.setBackground(Color.CYAN);

        JLabel cafeHeaderLabel = new JLabel("Cafe Management System", JLabel.CENTER);
        cafeHeaderLabel.setFont(new Font("Arial", Font.BOLD, 24));
        cafeHeaderLabel.setForeground(Color.black);
        cafeHeaderLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel signupLabel = new JLabel("Signup", JLabel.CENTER);
        signupLabel.setFont(new Font("Arial", Font.BOLD, 20));
        signupLabel.setForeground(Color.RED);
        signupLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        headerPanel.add(cafeHeaderLabel);
        headerPanel.add(signupLabel);

        // Add header panel to the top
        this.add(headerPanel, BorderLayout.NORTH);





        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(10, 20, 20, 20));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        Font labelFont = new Font("Times New Roman", Font.PLAIN, 16);
        Font textFieldFont = new Font("Times New Roman", Font.PLAIN, 14);

        gbc.gridy = 0;
        gbc.gridx = 0;
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setFont(labelFont);
        panel.add(nameLabel, gbc);

        gbc.gridx = 1;
        nameField = new JTextField(20);
        nameField.setFont(textFieldFont);
        panel.add(nameField, gbc);

        gbc.gridy = 1;
        gbc.gridx = 0;
        JLabel emailLabel = new JLabel("E-Mail:");
        emailLabel.setFont(labelFont);
        panel.add(emailLabel, gbc);

        gbc.gridx = 1;
        emailField = new JTextField(20);
        emailField.setFont(textFieldFont);
        panel.add(emailField, gbc);

        gbc.gridy = 2;
        gbc.gridx = 0;
        JLabel mobileLabel = new JLabel("Mobile Number:");
        mobileLabel.setFont(labelFont);
        panel.add(mobileLabel, gbc);

        gbc.gridx = 1;
        mobileNumberField = new JTextField(20);
        mobileNumberField.setFont(textFieldFont);
        panel.add(mobileNumberField, gbc);

        gbc.gridy = 3;
        gbc.gridx = 0;
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setFont(labelFont);
        panel.add(passwordLabel, gbc);

        gbc.gridx = 1;
        passwordField = new JPasswordField(20);
        passwordField.setFont(textFieldFont);
        panel.add(passwordField, gbc);

        gbc.gridy = 4;
        gbc.gridx = 0;
        JLabel addressLabel = new JLabel("Address:");
        addressLabel.setFont(labelFont);
        panel.add(addressLabel, gbc);

        gbc.gridx = 1;
        addrrField = new JTextField(20);
        addrrField.setFont(textFieldFont);
        panel.add(addrrField, gbc);

        gbc.gridy = 5;
        gbc.gridx = 0;
        JLabel securityLabel = new JLabel("Security Question:");
        securityLabel.setFont(labelFont);
        panel.add(securityLabel, gbc);

        gbc.gridx = 1;
        String[] securityQuestions = {
                "What is your pet's name?",
                "What is your mother's maiden name?",
                "What was the name of your first school?",
                "What is your favorite book?",
                "What city were you born in?"
        };
        securityQuestionBox = new JComboBox<String>(securityQuestions);
        securityQuestionBox.setFont(textFieldFont);
        panel.add(securityQuestionBox, gbc);

        gbc.gridy = 6;
        gbc.gridx = 0;
        JLabel answerLabel = new JLabel("Answer:");
        answerLabel.setFont(labelFont);
        panel.add(answerLabel, gbc);

        gbc.gridx = 1;
        answerField = new JTextField(20);
        answerField.setFont(textFieldFont);
        panel.add(answerField, gbc);

        JPanel buttonPanel = new JPanel(new FlowLayout());
        saveButton= new JButton("Save");
        exitButton=new JButton("Exit");
        clearButton = new JButton("Clear");
        loginButton=new JButton("Login");
        forgotPasswordButton=new JButton("Forgot Password");

        buttonPanel.add(saveButton);
        buttonPanel.add(exitButton);
        buttonPanel.add(clearButton);
        buttonPanel.add(loginButton);
        buttonPanel.add(forgotPasswordButton);

        this.add(buttonPanel, BorderLayout.SOUTH);
        this.add(panel, BorderLayout.CENTER);


        //Adding Action Listener to Save Button
        saveButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Save button clicked!");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                saveButton.setText("saving...");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                saveButton.setText("Saved");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                saveButton.setForeground(Color.GREEN);

            }

            @Override
            public void mouseExited(MouseEvent e) {
                saveButton.setForeground(null);
            }
        });
        //Adding Action Listener to Exit Button
        exitButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(null,"You clicked Exit Button");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                exitButton.setText("Exiting");

            }

            @Override
            public void mouseReleased(MouseEvent e) {
                exitButton.setText("Exited");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                exitButton.setForeground(Color.GREEN);
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
        //Adding Action Listener to clear button
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearButton.setForeground(Color.GREEN);
                nameField.setText("");
                emailField.setText("");
                mobileNumberField.setText("");
                passwordField.setText("");
                addrrField.setText("");
                answerField.setText("");
    }
});
        loginButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(null,"Logged In");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                loginButton.setText("Logging..");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                loginButton.setText("Logged");

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                loginButton.setForeground(Color.GREEN);
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });


        //Adding Action listener to Forgot Pass word
        forgotPasswordButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Reset the Password");
                forgotPasswordButton.setForeground(Color.GREEN);
            }
        });

        this.setBackground(Color.RED);
    this.setVisible(true);
    }

    public static void main(String[] args) {

        new SignupForm();
    }
}
