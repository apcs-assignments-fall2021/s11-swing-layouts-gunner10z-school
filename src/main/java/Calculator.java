import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator {

    public Calculator() {
        // 1. Create the frame (the window that will pop up)
        JFrame frame = new JFrame("Calculator");
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        // 2. Choose what happens when you click the exit button
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 3. Create components and put them in the frame

        // YOUR CODE HERE
        JPanel panel1 = new JPanel();
        JTextField field1 = new JTextField(15);
        panel1.add(field1);
        frame.add(panel1);

        JPanel panel2 = new JPanel();
        JButton button9 = new JButton("9");
        panel2.add(button9);
        JButton button8 = new JButton("8");
        panel2.add(button8);
        JButton button7 = new JButton("7");
        panel2.add(button7);
        JButton buttonDiv = new JButton("/");
        panel2.add(buttonDiv);

        frame.add(panel2);

        JPanel panel3 = new JPanel();
        JButton button6 = new JButton("6");
        panel3.add(button6);
        JButton button5 = new JButton("5");
        panel3.add(button5);
        JButton button4 = new JButton("4");
        panel3.add(button4);
        JButton buttonMul = new JButton("*");
        panel3.add(buttonMul);

        frame.add(panel3);

        JPanel panel4 = new JPanel();
        JButton button3 = new JButton("3");
        panel4.add(button3);
        JButton button2 = new JButton("2");
        panel4.add(button2);
        JButton button1 = new JButton("1");
        panel4.add(button1);
        JButton buttonSub = new JButton("-");
        panel4.add(buttonSub);

        frame.add(panel4);

        JPanel panel5 = new JPanel();
        JButton buttonEqu = new JButton("=");
        panel5.add(buttonEqu);
        JButton button0 = new JButton("0");
        panel5.add(button0);
        JButton buttonDec = new JButton(".");
        panel5.add(buttonDec);
        JButton buttonAdd = new JButton("+");
        panel5.add(buttonAdd);


        frame.add(panel5);
        // 4. Size the frame
        frame.pack();

        // 5. Show the frame
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
    }
}
