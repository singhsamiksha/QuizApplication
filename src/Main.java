import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Quiz Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        JLabel heading = new JLabel("Welcome to the Quiz");
        JButton button = new JButton("Start");

        frame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.CENTER;
        frame.add(heading, gbc);

        // Update GridBagConstraints for the button
        gbc.gridy = 1; // Set the row to 1 to position the button below the heading
        gbc.anchor = GridBagConstraints.CENTER; // Reset anchor to center
        frame.add(button, gbc);

        frame.setVisible(true);
    }
}
