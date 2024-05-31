package hello.org.calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Math;

public class Main implements ActionListener {

    JFrame frame;
    JButton[] numButtons = new JButton[10];
    JButton[] funButtons = new JButton[25];

    JButton addButton, subButton, mulButton, divButton, decButton,
            expButton, ansButton, equlButton, deleteButton, acButton;
    JButton  orButton, squareButton, cubeButton, piButton, factorialButton,
            sinButton, cosButton, tanButton;
    JButton rootButton, cuberootButton, logButton, xpowyButton,
            epowxButton, percentButton, eButton;
    JTextField textField;
    JPanel panel;
    Font myfont =  new Font("", Font.BOLD,30);
    double num1=0,num2=0, result=0;

    char operator;
    double ans=0;

    Color mycolor = new Color(239,251,241);
    Color mycolor1 = new Color(197,243,201);
    Color mycolor2 = new Color(210,238,216);


    public static double factorial(double n ){
        if(n == 0 || n ==1){
            return 1;
        }else{
            return n * factorial(n-1);
        }
    }

    Main(){
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(650,800);
        frame.setLayout(null);
        Container contentPane = frame.getContentPane();
        contentPane.setBackground(mycolor);


        textField = new JTextField();
        textField.setBounds(100,25,400,50);
        textField.setFont(myfont);
        textField.setEditable(false);

        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        expButton = new JButton("Exp");
        decButton = new JButton(".");
        ansButton = new JButton("Ans");
        equlButton = new JButton("=");
        deleteButton = new JButton("Del");
        acButton = new JButton("Ac");
        orButton = new JButton("(-)");
        squareButton = new JButton(" x²");
        cubeButton = new JButton("x^3");
        piButton = new JButton("π");
        factorialButton = new JButton("x!");
        sinButton = new JButton("sin");
        cosButton = new JButton("cos");
        tanButton = new JButton("tan");
        rootButton = new JButton("√");
        cuberootButton = new JButton("3√");
        logButton = new JButton("log");
        xpowyButton = new JButton(" x^y");
        epowxButton = new JButton("e^x");
        percentButton = new JButton("%");
        eButton = new JButton("e");

        funButtons[0] = addButton;
        funButtons[1] = subButton;
        funButtons[2] = mulButton;
        funButtons[3] = divButton;
        funButtons[4] = decButton;
        funButtons[5] = expButton;
        funButtons[6] = ansButton;
        funButtons[7] = equlButton;
        funButtons[8] = deleteButton;
        funButtons[9] = acButton;
        funButtons[10] = orButton;
        funButtons[11] = squareButton;
        funButtons[12] = cubeButton;
        funButtons[13] = piButton;
        funButtons[14] = factorialButton;
        funButtons[15] = sinButton;
        funButtons[16] = cosButton;
        funButtons[17] = tanButton;
        funButtons[18] = rootButton;
        funButtons[19] = cuberootButton;
        funButtons[20] = logButton;
        funButtons[21] = xpowyButton;
        funButtons[22] = epowxButton;
        funButtons[23] = percentButton;
        funButtons[24] = eButton;



        for(int i =0;i<25; i++){

            funButtons[i].addActionListener(this);
            funButtons[i].setFont(myfont);
            funButtons[i].setFocusable(false);
            funButtons[i].setBackground(mycolor2);

        }

        for(int i = 0;i<10;i++){
            numButtons[i] = new JButton(String.valueOf(i));
            numButtons[i].addActionListener(this);
            numButtons[i].setFont(myfont);
            numButtons[i].setFocusable(false);
            numButtons[i].setBackground(mycolor1);

        }



        panel = new JPanel();
        panel.setBounds(30,100,550,750);
//        panel.setBackground(Color.BLACK);
        panel.setLayout(new GridLayout(8,5,10,10));

        panel.add(epowxButton);
        panel.add(sinButton);
        panel.add(cosButton);
        panel.add(tanButton);
        panel.add(percentButton);

        panel.add(rootButton);
        panel.add(cuberootButton);
        panel.add(logButton);
        panel.add(xpowyButton);
        panel.add(eButton);

        panel.add(orButton);
        panel.add(squareButton);
        panel.add(cubeButton);
        panel.add(piButton);
        panel.add(factorialButton);

        panel.add(numButtons[7]);
        panel.add(numButtons[8]);
        panel.add(numButtons[9]);
        panel.add(deleteButton);
        panel.add(acButton);

        panel.add(numButtons[4]);
        panel.add(numButtons[5]);
        panel.add(numButtons[6]);
        panel.add(mulButton);
        panel.add(divButton);

        panel.add(numButtons[1]);
        panel.add(numButtons[2]);
        panel.add(numButtons[3]);
        panel.add(addButton);
        panel.add(subButton);


        panel.add(numButtons[0]);
        panel.add(decButton);
        panel.add(expButton);
        panel.add(ansButton);
        panel.add(equlButton);



        frame.add(panel);
        frame.add(textField);
        frame.setVisible(true);
    }


    public static void main(String[] args) {
        Main cal = new Main();

    }

    @java.lang.Override
    public void actionPerformed(java.awt.event.ActionEvent e) {

        for(int i =0; i<10;i++){
            if(e.getSource() == numButtons[i]){
                textField.setText(textField.getText().concat(String.valueOf(i)));
            }
        }
        if(e.getSource() == addButton){
            num1 = Double.parseDouble(textField.getText());
            operator = '+';
            textField.setText("");
        }
        if(e.getSource() == subButton){
            num1 = Double.parseDouble(textField.getText());
            operator = '-';
            textField.setText("");
        }
        if(e.getSource() == mulButton){
            num1 = Double.parseDouble(textField.getText());
            operator= '*';
            textField.setText("");
        }
        if(e.getSource() == divButton){
            num1 = Double.parseDouble(textField.getText());
            operator ='/';
            textField.setText("");
        }
        if(e.getSource() == decButton){
            textField.setText(textField.getText().concat("."));
        }
        if(e.getSource() == acButton){
            textField.setText("");
        }
        if(e.getSource() == deleteButton){
            String string = textField.getText();
            textField.setText("");
            for(int i = 0;i<string.length()-1;i++) {
                textField.setText(textField.getText() + string.charAt(i));
            }
        }

        if(e.getSource() == expButton){
            num1 = 10;
            textField.setText("");
            operator = 'x';
        }
        if(e.getSource() == orButton){
            double temp = Double.parseDouble(textField.getText());
            temp *= -1;
            textField.setText(String.valueOf(temp));
        }
        if(e.getSource() == squareButton){
            num1= Double.parseDouble(textField.getText());
            operator = 's';
            textField.setText("x^" + textField.getText());
        }
        if(e.getSource() == cubeButton){
            num1= Double.parseDouble(textField.getText());
            operator = 'c';
            textField.setText("");
        }
        if(e.getSource() == piButton){
            num1 = 3.14159265359;
            operator = 'p';
            textField.setText(String.valueOf(num1));
        }
        if(e.getSource() == factorialButton){
            num1 = Double.parseDouble(textField.getText());
            operator = 'f';
            textField.setText(textField.getText() + "!");
        }
        if(e.getSource() == rootButton){
            num1= Double.parseDouble(textField.getText());
            operator = 'r';
            textField.setText("√" + textField.getText());
        }
        if(e.getSource() == cuberootButton){
            num1= Double.parseDouble(textField.getText());
            operator = 'v';
            textField.setText("3√" + textField.getText());
        }
        if(e.getSource() == logButton){
            num1 = Double.parseDouble(textField.getText());
            operator='l';
            textField.setText("log" + textField.getText());
        }
        if(e.getSource() == xpowyButton){
            num1 = Double.parseDouble(textField.getText());
            operator = 't';
            textField.setText("");
        }
        if(e.getSource() == eButton){
            num1 = 2.71828182846;
            operator = 'e';
            textField.setText(String.valueOf(num1));
        }
        if(e.getSource() == epowxButton){
            num1 = 2.71828182846;
            operator = 'q';
            textField.setText("");
        }
        if(e.getSource() == sinButton){
            num1 = Double.parseDouble(textField.getText());
            operator = 'i';
            textField.setText("Sin" + textField.getText());
        }
        if(e.getSource() == cosButton){
            num1 = Double.parseDouble(textField.getText());
            operator = 'o';
            textField.setText("Cos" + textField.getText());
        }
        if(e.getSource() == tanButton){
            num1 = Double.parseDouble(textField.getText());
            operator = 'n';
            textField.setText("tan" + textField.getText());
        }
        if(e.getSource() == percentButton){
            num1 = Double.parseDouble(textField.getText());
            operator = '%';
            textField.setText(textField.getText() + "%");
        }





        if(e.getSource() == equlButton){
            if(operator == '+' || operator == '-' || operator =='*' || operator == '/' || operator == 'x' || operator=='p' || operator == 't' || operator == 'e' || operator == 'q'){
                num2 = Double.parseDouble(textField.getText());
            }

            switch (operator){
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                case 'x':
                    result = Math.pow(num1,num2);
                    break;
                case 's':
                    num2 = 2;
                    result = Math.pow(num1,num2);
                    break;
                case 'c':
                    num2 = 3;
                    result = Math.pow(num1,num2);
                    break;
                case 'f':
                    result = Main.factorial(num1);
                    break;
                case 'r':
                    result = Math.sqrt(num1);
                    break;
                case 'v':
                    result = Math.cbrt(num1);
                    break;
                case 'l':
                    result = Math.log(num1);
                    break;
                case 't':
                    result = Math.pow(num1,num2);
                    break;
                case 'q':
                    result = Math.pow(num1,num2);
                    break;
                case 'i':
                    result = Math.sin(num1);
                    break;
                case 'o':
                    result = Math.cos(num1);
                    break;
                case 'n':
                    result = Math.tan(num1);
                    break;
                case '%':
                    num2 = 100;
                    result = num1 /num2;
                    break;
            }
            textField.setText(String.valueOf(result));
            num1 = result;
        }
        if(e.getSource() == ansButton){
            ans = result;
            textField.setText(String.valueOf(ans));
            num1 = ans;
        }
    }
}
