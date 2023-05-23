import java.awt.Color;
import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hobbies extends JFrame {

    Hobbies() {

        JLabel imageLabel = new JLabel();
        ImageIcon hobbiesImage = new ImageIcon("Hobbies.gif");
        imageLabel.setIcon(hobbiesImage);
        this.add(imageLabel);

        JButton homeButton = new JButton();
        ImageIcon homeB = new ImageIcon("Back to Home.png");
        homeButton.setIcon(homeB);
        homeButton.setBounds(700, 550, 230, 40);

        EventHandler handler = new EventHandler();
        homeButton.addActionListener(handler);

        // Next Button
        JButton nextButton = new JButton();
        ImageIcon nextB = new ImageIcon("Next.png");
        nextButton.setIcon(nextB);
        nextButton.setBounds(40, 550, 230, 40);

        // Event handler for next button
        EventHandler1 handler1 = new EventHandler1();
        nextButton.addActionListener(handler1);

        imageLabel.add(homeButton);
        imageLabel.add(nextButton);

        this.setLayout(new FlowLayout());
        this.setTitle("My Portfolio");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1000, 650);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.MAGENTA);
        this.setResizable(false);
    }

    private class EventHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {

            // goes to game frame
            new Main();
            dispose();
        }
    }

    private class EventHandler1 implements ActionListener {

        public void actionPerformed(ActionEvent event) {

            // goes to game frame
            new Works();

            dispose();

        }
    }
}