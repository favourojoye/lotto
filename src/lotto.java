import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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


    private JLabel userLabel;

    private JButton[] numberButtons = new JButton[28];
    private JTextField[] userNumberFields = new JTextField[4];
    private JTextField resultsTextField;

    public lotto (){
        // Initialize components
        userLabel = new JLabel("User:");
        resultsTextField = new JTextField(10);
        checkResultsButton = new JButton("Check Results");
        QuickPickButton = new JButton ("Quick Pick");
        clearSelectionButton = new JButton("Clear Selection");

        for (int i = 0; i < 28; i++) {
            numberButtons[i] = new JButton(String.valueOf(i + 1));
        }

        for (int i = 0; i < 4; i++) {
            userNumberFields[i] = new JTextField(2);
        }

        // Add action listeners
        checkResultsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkResults();
            }
        });

        QuickPickButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                quickPick();
            }
        });

        clearSelectionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearSelection();
            }
        });

        // Add number buttons to action listener
        for (int i = 0; i < 28; i++) {
            final int number = i + 1;
            numberButtons[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    selectNumber(number);
                }
            });
        }

        // Layout components
        setLayout(new BorderLayout());
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout());
        topPanel.add(userLabel);
        for (int i = 0; i < 4; i++) {
            topPanel.add(userNumberFields[i]);
        }
        topPanel.add(QuickPickButton);
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

    private void selectNumber(int number) {
        for (int i = 0; i < 4; i++) {
            if (userNumberFields[i].getText().isEmpty()) {
                userNumberFields[i].setText(String.valueOf(number));
                break;
            }
        }
    }

    private void quickPick() {
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            userNumberFields[i].setText(String.valueOf(random.nextInt(28) + 1));
        }
    }

    private void clearSelection() {
        for (int i = 0; i < 4; i++) {
            userNumberFields[i].setText("");
        }
    }

    private void checkResults() {
        // Implement the logic to check the user's numbers against the winning numbers
        // This method will compare the user's numbers from userNumberFields with the results and update resultsTextField accordingly.
        resultsTextField.setText("Checking results...");
        // You need to write the logic here to determine and display the results.
        }



    public static void main(String[] args) {
        JFrame frame = new JFrame("Lotto Game");
        lotto lottoPanel = new lotto();
        frame.add(lottoPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}