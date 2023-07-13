import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleTable {
    private JPanel mainPanel;
    private JPanel bottomPanel;
    private JPanel topPanel;
    private JScrollPane tableScrollPanel;
    private JLabel headerLabel;
    private JTable scoreTable;
    private JButton deleteButton;
    private JButton returnButton;

    public SimpleTable() {

        String[] columnName = {"学号","姓名","成绩"};
        String[][]tableData={{"001","Lily","78"},{"002","Jane","89"},{"003","Alex","67"},
                {"004","Macy","83"},{"005","Nancy","66"},{"006","John","99"}};

        //表格模型
        DefaultTableModel model = new DefaultTableModel(tableData, columnName){
            @Override
            public boolean isCellEditable(int row, int col){
                return false;
            }
        };

        //JTable并不存储自己的数据，而是从表格模型那里获取它的数据
        scoreTable.setModel(model);
        tableScrollPanel.setViewportView(scoreTable);

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int row = scoreTable.getSelectedRow();
                System.out.println(row);
                int result = JOptionPane.showConfirmDialog(deleteButton,
                        "是否确定中删除？");
                if (JOptionPane.YES_OPTION == result && row != -1) {
                    model.removeRow(row);
                }
            }
        });
        returnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayoutDemo.cardLayout.first(CardLayoutDemo.cardPanel);
            }
        });
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("SimpleTable");
        frame.setContentPane(new SimpleTable().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
