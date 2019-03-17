
package calculatorv1;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGui {
    
    private String[] numberText = {"7", "8", "9", "*", "4", "5", "6", "/", "1", "2", "3", "-", "ce", "0", ".", "+"};
    JButton equalsButton;
    JButton numberButton;
    JButton button;
    Double numberOne = 0.0;
    Double numberTwo = 0.0;
    Double answer = 0.0;
    Double version = 1.1;
    JTextField textField = new JTextField();
    
    enum Operator{
        add, subtract, multiply, divide
    }
    Operator operator;
    
    public CalculatorGui(){
        
        JFrame mainFrame = new JFrame();
        JPanel numberPanel = new JPanel();
        
        JButton equalsButton = new JButton("=");
        
        mainFrame.setTitle("Calculator" + version);
        mainFrame.setSize(300, 450);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textField.setEditable(false);
        textField.setHorizontalAlignment(JTextField.RIGHT);
        numberPanel.setLayout(new GridLayout(4,4));
        
        
        
        for (int i = 0; i < numberText.length; i++) {
            String text = numberText[i];
            button = new JButton(text);
            button.addActionListener((ActionListener) this);
            numberPanel.add(button);
        }
        
        
        
        mainFrame.add(BorderLayout.SOUTH,equalsButton);
        mainFrame.add(BorderLayout.NORTH,textField);
        mainFrame.add(BorderLayout.CENTER,numberPanel);
        mainFrame.setVisible(true);
    }
    
}
