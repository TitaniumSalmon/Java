import it.util.shapes.RectangularPrism;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RectangularPrism1 {
    private JTextField textWidth;
    private JTextField textHeight;
    private JTextField textLenght;
    private JButton calculateButton;
    private JButton closeButton;
    private JLabel rectangularPrismLabel;
    private JPanel rectangularPrismPanel;
    private JDialog frame;

    public RectangularPrism1(){
        rectangularPrismLabel.setIcon(new ImageIcon(this.getClass().getResource("/resources/rectangularprism2.png")));
        frame = new JDialog((Frame)null, "Rectangular Shape Area", true);
        frame.setContentPane(rectangularPrismPanel);
        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        closeButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            dispose();
        }
    });
        calculateButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            doCalculate();
        }
    });
    }
private void doCalculate(){
    try {
        RectangularPrism cc = new RectangularPrism(Double.parseDouble(textWidth.getText()),
                Double.parseDouble(textHeight.getText()),
                Double.parseDouble(textLenght.getText()));
        double volume = cc.getVolume(); // call calculate volume method for relative shape in JAR
        double diagonal = cc.getDiagonal(); // call calculate slant method for relative shape in JAR
        double totalSurfaceArea = cc.getTotalSurfaceArea(); // call calculate total surface area method for relative shape in JAR
        String result = "Volume = " + volume + "\n" + "Diagonal = " + diagonal + "\n" + "Total Surface Area = " + totalSurfaceArea;
        displayResult(result, "Result of Circular Cone Shape", JOptionPane.INFORMATION_MESSAGE);
    } catch (NumberFormatException err){
        displayResult("Please input numberic only","ERROR",JOptionPane.ERROR_MESSAGE);
    }
}
public void displayResult(String resultMsg, String title, int type) {
    JOptionPane.showMessageDialog(null, resultMsg, title, type);
}
public void show(){
    frame.setVisible(true);
}
public void dispose(){
    frame.setVisible(false);
    frame.dispose();
}
}

