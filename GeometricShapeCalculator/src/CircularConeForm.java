import it.util.shapes.CircularCone;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CircularConeForm {
    private JTextField textRadius;
    private JTextField textHeight;
    private JButton calculateButton;
    private JButton closeButton;
    private JLabel circularConeLabel;
    private JPanel circularConePanel;
    private JDialog frame;
    public CircularConeForm(){
        circularConeLabel.setIcon(new ImageIcon(this.getClass().getResource("/resources/circularcone2.png")));
        frame = new JDialog((Frame)null, "Circular Cone Shape Area", true);
        frame.setContentPane(circularConePanel);
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
            CircularCone cc = new CircularCone(Double.parseDouble(textRadius.getText()),
                    Double.parseDouble(textHeight.getText()));
            double volume = cc.getVolume(); // call calculate volume method for relative shape in JAR
            double slantHeight = cc.getSlantHeight(); // call calculate slant method for relative shape in JAR
            double totalSurfaceArea = cc.getTotalSurfaceArea(); // call calculate total surface area method for relative shape in JAR
            double lateral = cc.getLateralSurfaceArea();
            double base = cc.getBaseSurfaceArea();
            String result = "Volume = " + volume + "\n" + "Slant Height = " + slantHeight + "\n" + "Lateral Surface Area = " + lateral + "\n" + "Base Surface Area = " + base + "\n" + "Total Surface Area = " + totalSurfaceArea;
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
