package hangman;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        // Créer la première fenêtre
        JFrame frame1 = new JFrame();
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Ajouter l'image de la fenêtre de démarrage
        ImageIcon startImageIcon = new ImageIcon("C:/Users/pc/eclipse-workspace/HangmanGame/src/images/debut.png");
        JLabel startImageLabel = new JLabel(startImageIcon);
        startImageLabel.setBounds(0, 0, startImageIcon.getIconWidth(), startImageIcon.getIconHeight());

        // Ajouter l'image de la fenêtre principale
        ImageIcon mainImageIcon = new ImageIcon("C:/Users/pc/eclipse-workspace/HangmanGame/src/images/debut.png");
        JLabel mainImageLabel = new JLabel(mainImageIcon);
        mainImageLabel.setBounds(0, 0, mainImageIcon.getIconWidth(), mainImageIcon.getIconHeight());

        // Ajouter les composants à la fenêtre de démarrage
        JPanel startPanel = new JPanel(null);
        startPanel.add(startImageLabel);
        frame1.getContentPane().add(startPanel);

        // Afficher la première fenêtre
        frame1.pack();
        frame1.setLocationRelativeTo(null);
        frame1.setVisible(true);

        // Créer un Timer pour passer à la fenêtre principale après 5 secondes
        Timer timer = new Timer(5000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Fermer la première fenêtre
                frame1.dispose();

                // Créer la deuxième fenêtre
                JFrame frame2 = new JFrame();
                frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                // Ajouter les composants à la fenêtre principale
                JPanel mainPanel = new JPanel(null);
                mainPanel.add(mainImageLabel);
                frame2.getContentPane().add(mainPanel);

                // Afficher la deuxième fenêtre
                frame2.pack();
                frame2.setLocationRelativeTo(null);
                frame2.setVisible(true);
            }
        });
        timer.setRepeats(false); // Ne pas répéter le Timer

        // Démarrer le Timer
        timer.start();
    }
}

