import it.util.shapes.CircularCylinder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CircularCylinderForm {
    private JTextField textRadius;
    private JTextField textHeight;
    private JButton calculateButton;
    private JButton closeButton;
    private JLabel circularCylinderLabel;
    private JPanel circularCylinderPanel;
    private JDialog frame;
    public CircularCylinderForm(){
        circularCylinderLabel.setIcon(new ImageIcon(this.getClass().getResource("/resources/circularcylinder2.png")));
        frame = new JDialog((Frame)null, "Circular Cylinder Shape Area", true);
        frame.setContentPane(circularCylinderPanel);
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
            CircularCylinder cc = new CircularCylinder(Double.parseDouble(textRadius.getText()),
                    Double.parseDouble(textHeight.getText()));
            double volume = cc.getVolume(); // call calculate volume method for relative shape in JAR
            double lateral = cc.getLateralSurfaceArea(); // call calculate slant method for relative shape in JAR
            double topsurface = cc.getTopSurfaceArea();
            double bottomsurface = cc.getBottomSurfaceArea();
            double totalSurfaceArea = cc.getTotalSurfaceArea(); // call calculate total surface area method for relative shape in JAR
            String result = "Volume = " + volume + "\n" + "Lateral Surface Area = " + lateral + "\n" + "Top Surface Area = " + topsurface + "\n" + "Bottom Surface Area = " + bottomsurface + "\n" + "Total Surface Area = " + totalSurfaceArea;
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


