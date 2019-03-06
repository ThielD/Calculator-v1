
package calculatorv1;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.*;

public class CalculatorGui {
    
    public void mainWindow(){
        
        double version = 1.0;
        JFrame mainFrame = new JFrame();
        JTextField textField = new JTextField();
        JPanel buttonField = new JPanel();
        JButton buttonZero = new JButton("0");
        JButton buttonOne = new JButton("1");
        JButton buttonTwo = new JButton("2");
        JButton buttonThree = new JButton("3");
        JButton buttonFour = new JButton("4");
        JButton buttonFive = new JButton("5");
        JButton buttonSix = new JButton("6");
        JButton buttonSeven = new JButton("7");
        JButton buttonEight = new JButton("8");
        JButton buttonNine = new JButton("9");
        JButton addButton = new JButton("+");
        JButton subtractButton = new JButton("-");
        JButton multiplyButton = new JButton("*");
        JButton divideButton = new JButton("/");
        JButton equalsButton = new JButton("=");
        JButton clearButton = new JButton("ce");
        JButton periodButton = new JButton(".");
        
        mainFrame.setTitle("Calculator" + version);
        mainFrame.setSize(250, 400);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        buttonField.add(clearButton);
        buttonField.add(buttonZero);
        buttonField.add(periodButton);
        buttonField.add(divideButton);
        buttonField.add(buttonSeven);
        buttonField.add(buttonEight);
        buttonField.add(buttonNine);
        buttonField.add(multiplyButton);
        buttonField.add(buttonFour);
        buttonField.add(buttonFive);
        buttonField.add(buttonSix);
        buttonField.add(subtractButton);
        buttonField.add(buttonOne);
        buttonField.add(buttonTwo);
        buttonField.add(buttonThree);
        buttonField.add(addButton);
        
        textField.setSize(200,150);
        
        buttonField.setLayout(new GridLayout(0, 4, 5, 5));
        buttonField.setSize(200, 300);
        
        mainFrame.add(BorderLayout.NORTH, textField);
        mainFrame.add(BorderLayout.CENTER, buttonField);
        mainFrame.add(BorderLayout.SOUTH, equalsButton);
        
        mainFrame.setVisible(true);
    }
    
}
