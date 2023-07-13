import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartMenu {


    private JPanel mainPanel;
    private JButton simpleCalculatorButton;
    private JButton simpleTableButton;

    public StartMenu() {
        simpleCalculatorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayoutDemo.cardPanel.add(new SimpleCalculator().getMainPanel());
                CardLayoutDemo.cardLayout.last(CardLayoutDemo.cardPanel);
            }
        });
        simpleTableButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayoutDemo.cardPanel.add(new SimpleTable().getMainPanel());
                CardLayoutDemo.cardLayout.last(CardLayoutDemo.cardPanel);
            }
        });
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

}
