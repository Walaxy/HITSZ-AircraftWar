import javax.swing.*;
import java.awt.*;

public class CardLayoutDemo {

    static final CardLayout cardLayout = new CardLayout(0,0);
    static final JPanel cardPanel = new JPanel(cardLayout);

    public static void main(String[] args) {

        JFrame frame = new JFrame("CardLayout Demo");
        frame.setSize(800, 1024);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(cardPanel);

        StartMenu start = new StartMenu();
        cardPanel.add(start.getMainPanel());
        frame.setVisible(true);
    }
}
