import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class QuadForm {

    public QuadForm() {
        //1. Create the frame.
        JFrame frame = new JFrame("Quadratic Formula");
        // frame.setLayout(...);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        //2. Optional: What happens when the frame closes?
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //3. Create components and put them in the frame.
        //JPanel inputPanel = new JPanel();
        //inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.PAGE_AXIS));
        JLabel label1 = new JLabel("ax^2+bx+c=0");
        frame.add(label1);
        LTPanel panel1=new LTPanel("a=",20);
        frame.add(panel1);
        LTPanel panel2=new LTPanel("b=",20);
        frame.add(panel2);
        LTPanel panel3=new LTPanel("c=",20);
        frame.add(panel3);
        JPanel panel4=new JPanel();
        JButton buttonClear = new JButton("Clear");
        panel4.add(buttonClear);
        JButton buttonCalculate = new JButton("Calculate");
        panel4.add(buttonCalculate);
        frame.add(panel4);
        LTPanel panel5=new LTPanel("Answer:",20);
        frame.add(panel5);
        //4. Size the frame.
        // frame.setSize(400, 400);
        frame.pack();

        //5. Show it.
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        QuadForm qf = new QuadForm();
    }
}
