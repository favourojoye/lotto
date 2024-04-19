import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.*;

import java.util.Random;


public class lotto extends JPanel {


        private JButton checkResultsButton;
        private JButton Button1;
        private JButton Button2;
        private JButton Button3;
        private JButton Button7;
        private JButton Button6;
        private JButton Button5;
        private JButton Button4;
        private JButton Button14;
        private JButton Button13;
        private JButton Button12;
        private JButton Button11;
        private JButton Button10;
        private JButton Button9;
        private JButton Button21;
        private JButton Button20;
        private JButton Button19;
        private JButton Button18;
        private JButton Button17;
        private JButton Button16;
        private JButton Button28;
        private JButton Button27;
        private JButton Button26;
        private JButton Button25;
        private JButton Button24;
        private JButton Button23;
        private JButton Button22;
        private JButton Button15;
        private JButton Button8;
        private JButton QuickPickButton;
        private JButton purchaseButton;
        private JButton clearSelectionButton;
        private JButton makeDrawButton;
        private JTextField Results;
        private JLabel User;
        private JTextField User1;
        private JTextField User2;
        private JTextField User3;
        private JTextField User4;




            private JButton CheckResultsButton;
            private JButton[] numberButtons = new JButton[28];
            private JButton quickPickButton;
            private JButton ClearSelectionButton;
            private JTextField resultsTextField;
            private JTextField[] userNumberFields = new JTextField[4];
            private JLabel userLabel;

            public lotto() {
                // Initialize components
                userLabel = new JLabel("User:");
                resultsTextField = new JTextField(10);
                checkResultsButton = new JButton("Check Results");
                quickPickButton = new JButton("Quick Pick");
                clearSelectionButton = new JButton("Clear Selection");

                for (int i = 0; i < 28; i++) {
                    numberButtons[i] = new JButton(String.valueOf(i + 1));
                }

                for (int i = 0; i < 4; i++) {
                    userNumberFields[i] = new JTextField(2);
                }

                // Add action listeners
                CheckResultsButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        checkResults();
                    }
                });

                quickPickButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        QuickPick();
                    }
                });

                clearSelectionButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        ClearSelection();
                    }
                });

                // Add number buttons to action listener
                for (int i = 0; i < 28; i++) {
                    numberButtons[i].addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            selectNumber((JButton) e.getSource());
                        }
                    });
                }

                // Layout components
                setLayout(new BorderLayout());
                JPanel topPanel = new JPanel();
                topPanel.setLayout(new GridLayout(2, 5));
                topPanel.add(userLabel);
                for (int i = 0; i < 4; i++) {
                    topPanel.add(userNumberFields[i]);
                }
                topPanel.add(quickPickButton);
                topPanel.add(clearSelectionButton);
                add(topPanel, BorderLayout.NORTH);

                JPanel centerPanel = new JPanel();
                centerPanel.setLayout(new GridLayout(4, 7));
                for (int i = 0; i < 28; i++) {
                    centerPanel.add(numberButtons[i]);
                }
                add(centerPanel, BorderLayout.CENTER);

                JPanel southPanel = new JPanel();
                southPanel.setLayout(new FlowLayout());
                southPanel.add(checkResultsButton);
                southPanel.add(resultsTextField);
                add(southPanel, BorderLayout.SOUTH);
            }

            private void selectNumber(JButton selectedButton) {
                String text = selectedButton.getText();
                for (int i = 0; i < 4; i++) {
                    if (userNumber)

    }

