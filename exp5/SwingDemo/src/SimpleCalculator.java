import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator {

    private JPanel mainPanel;
    private JPanel topPanel;
    private JPanel bottomPanel;
    private JLabel num1Label;
    private JLabel num2Label;
    private JLabel resultLabel;
    private JTextField num2Field;
    private JTextField resultField;
    private JTextField num1Field;
    private JButton addButton;
    private JButton clearButton;
    private JButton subButton;
    private JButton mulButton;


    public SimpleCalculator() {
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num1 = num1Field.getText();
                String num2 = num2Field.getText();
                double result = Double.parseDouble(num1) + Double.parseDouble(num2);
                resultField.setText(result + "");
            }
        });
        subButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num1 = num1Field.getText();
                String num2 = num2Field.getText();
                double result = Double.parseDouble(num1) - Double.parseDouble(num2);
                resultField.setText(result + "");

            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1Field.setText("");
                num2Field.setText("");
                resultField.setText("");
            }
        });
        mulButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num1 = num1Field.getText();
                String num2 = num2Field.getText();
                double result = Double.parseDouble(num1) * Double.parseDouble(num2);
                resultField.setText(result + "");
            }
        });
    }//end constructor

    public JPanel getMainPanel() {
        return mainPanel;
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("SimpleCalculator");
        frame.setContentPane(new SimpleCalculator().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}//end SimpleCalculator
