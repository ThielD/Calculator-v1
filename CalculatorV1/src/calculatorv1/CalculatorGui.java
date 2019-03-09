
package calculatorv1;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGui {
    
    JTextField textField = new JTextField();
    
    double numberOne = 0;
    double numberTwo = 0;
    double answer = 0;
    
    enum Operator{
        add, subtract, multiply, divide
    }
    Operator operator;
    
    public CalculatorGui(){
        
        double version = 1.0;
        JFrame mainFrame = new JFrame();
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
        
        buttonZero.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               textField.setText(textField.getText() + "0");
            }
        });        
        
        buttonOne.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               textField.setText(textField.getText() + "1");
            }
        });
        
        buttonTwo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               textField.setText(textField.getText() + "2");
            }
        });
                
        buttonThree.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               textField.setText(textField.getText() + "3");
            }
        });
 
        buttonFour.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               textField.setText(textField.getText() + "4");
            }
        });                
                
         buttonFive.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               textField.setText(textField.getText() + "5");
            }
        });  
         
        buttonSix.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               textField.setText(textField.getText() + "6");
            }
        });  
        
        buttonSeven.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               textField.setText(textField.getText() + "7");
            }
        });  

        buttonEight.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               textField.setText(textField.getText() + "8");
            }
        });  

        buttonNine.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               textField.setText(textField.getText() + "9");
            }
        });

        periodButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               textField.setText(textField.getText() + ".");
            }
        });
        
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                operator = Operator.add;
                String value = textField.getText().toString();
                numberOne = Double.parseDouble(value);
                textField.setText("");
            }
        });
        
        subtractButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                operator = Operator.subtract;
                String value = textField.getText().toString();
                numberOne = Double.parseDouble(value);
                textField.setText("");
            }
        });

        multiplyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                operator = Operator.multiply;
                String value = textField.getText().toString();
                numberOne = Double.parseDouble(value);
                textField.setText("");
            }
        });

        divideButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                operator = Operator.divide;
                String value = textField.getText().toString();
                numberOne = Double.parseDouble(value);
                textField.setText("");
            }
        });

        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                numberOne = 0;
                numberTwo = 0;
                textField.setText("");
            }
        });

        equalsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String value = textField.getText().toString();
                numberTwo = Double.parseDouble(value);
                
                switch(operator){
                    case add:
                        answer = numberOne + numberTwo;
                    break;
                        
                    case subtract:
                        answer = numberOne - numberTwo;
                    break;
                        
                    case multiply:
                        answer = numberOne * numberTwo;
                    break;
                        
                    case divide:
                        if (numberOne == 0.0 || numberTwo == 0.0){
                            textField.setText("Cant divide by 0");
                        } else {
                            answer = numberOne / numberTwo;
                        }
                    break;
                }
                String answerString = String.valueOf(answer);
                textField.setText(answerString);
            }
        });      
   
        textField.setSize(200,150);
        textField.setHorizontalAlignment(JTextField.RIGHT);
        
        buttonField.setLayout(new GridLayout(0, 4, 5, 5));
        buttonField.setSize(200, 300);
        
        mainFrame.add(BorderLayout.NORTH, textField);
        mainFrame.add(BorderLayout.CENTER, buttonField);
        mainFrame.add(BorderLayout.SOUTH, equalsButton);
        
        mainFrame.setVisible(true);
        
    }
    
}
