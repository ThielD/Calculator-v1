
package calculatorv1;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGui {
    
    private JButton[] buttons;
    private String[] numberText = {"7", "8", "9", "*", "4", "5", "6", "/", "1", "2", "3", "-", "ce", "0", ".", "+"};
    JButton addButton;
    JButton subtractButton;
    JButton multiplyButton;
    JButton divideButton;
    JButton pointButton;
    JButton clearButton;
    JButton numberButton;
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
        JTextField textField = new JTextField();
        mainFrame.setTitle("Calculator" + version);
        mainFrame.setSize(300, 450);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textField.setEditable(false);
        textField.setHorizontalAlignment(JTextField.RIGHT);
        numberPanel.setLayout(new GridLayout(4,4));
        //buttons = new JButton[10];
        
        for (int i = 0; i < numberText.length; i++) {
            //String text = String.valueOf(i);
            String text = numberText[i];
            JButton button = new JButton(text);
            //button.addActionListener((ActionListener) this);
            numberPanel.add(button);
        }
        
        mainFrame.add(BorderLayout.NORTH,textField);
        mainFrame.add(BorderLayout.CENTER,numberPanel);
        mainFrame.setVisible(true);
    }
    
}
