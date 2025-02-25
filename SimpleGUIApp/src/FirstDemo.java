import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstDemo {
    private JTextField textNumber1;
    private JTextField textNumber2;
    private JButton addButton;
    private JButton subButton;
    private JButton multiplyButton;
    private JPanel mainPanel;

    public FirstDemo() {
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double result = doAdd(Double.parseDouble(textNumber1.getText()),
                                      Double.parseDouble(textNumber2.getText()));
                displayResult("Result of Add", result+" ");
            }
        });
        subButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double result = doSub(Double.parseDouble(textNumber1.getText()),
                        Double.parseDouble(textNumber2.getText()));
                displayResult("Result of Sub", result+" ");
            }
        });
        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double result = doMultiply(Double.parseDouble(textNumber1.getText()),
                        Double.parseDouble(textNumber2.getText()));
                displayResult("Result of Multiply", result+" ");
            }
        });
    }
    private double doAdd(double n1, double n2){
        return n1+n2;
    }
    private double doSub(double n1, double n2){
        return n1-n2;
    }
    private double doMultiply(double n1, double n2){
        return n1*n2;
    }
    private void displayResult(String title, String msg){
        JOptionPane.showMessageDialog(null, msg, title, JOptionPane.INFORMATION_MESSAGE);
    }

    public JPanel getMainPanel() {
        return this.mainPanel;
    }
}
