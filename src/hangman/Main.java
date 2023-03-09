package hangman; 

import javax.swing.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

        final int WIDTH = 800;
        final int HEIGHT = 600;
        final String TITLE = "Hangman (Java Edition)";
        final ImageIcon backgroundImg = new ImageIcon("C:/Users/pc/eclipse-workspace/HangmanGame/src/images/Backgroundt.jpg");



        JFrame screen = new JFrame();
        CardLayout cardLayout = new CardLayout();
        screen.setSize(new Dimension(WIDTH, HEIGHT));
        screen.setTitle(TITLE);
        screen.setLocationRelativeTo(null);
        screen.setResizable(false);
        screen.setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel container = new JPanel();
        container.setLayout(cardLayout);
        screen.add(container);

        Words words = new Words();
        //SplashWindow splashWindow = new SplashWindow();
        StartScreenPanel startScreenPanel = new StartScreenPanel(WIDTH, HEIGHT, backgroundImg, container, cardLayout);
        MainGamePanel mainGamePanel = new MainGamePanel(WIDTH, HEIGHT, container, cardLayout, words);
        CategoryScreenPanel categoryScreenPanel = new CategoryScreenPanel(WIDTH, HEIGHT, backgroundImg, container, cardLayout, mainGamePanel, words);
        
        //container.add(splashWindow, "1");
        
        container.add(startScreenPanel, "1");
        container.add(categoryScreenPanel, "2");
        container.add(mainGamePanel, "3");

        screen.setVisible(true);

/*        // Créer un Timer pour passer à la fenêtre principale après 5 secondes
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
*/
    }
}
