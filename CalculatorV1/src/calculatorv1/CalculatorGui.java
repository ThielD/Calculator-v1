
package calculatorv1;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGui {
    
    JButton button[];
    JButton addButton;
    JButton subtractButton;
    JButton multiplyButton;
    JButton divideButton;
    JButton pointButton;
    JButton clearButton;
    
    Double numberOne = 0.0;
    Double numberTwo = 0.0;
    Double answer = 0.0;
    Double version = 1.1;
    enum Operator{
        add, subtract, multiply, divide
    }
    Operator operator;
    
    public CalculatorGui(){
        
        JFrame mainFrame = new JFrame();
        JPanel numberPanel = new JPanel();
        JPanel operatorPanel = new JPanel();
        JTextField textField = new JTextField();
        
        for (int i = 0; i < 10; i++) {
            button[i] = new JButton(String.valueOf(i));
        }
        
        mainFrame.setTitle("Calculator" + version);
        mainFrame.setSize(300, 450);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        for (int i = 0; i < 10; i++) {
            numberPanel.add(button[i]);
        }
        
        mainFrame.add(numberPanel);
        
        mainFrame.setVisible(true);
    }
    
}
