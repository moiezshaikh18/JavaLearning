import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class MouseEvents extends JFrame {

    JLabel l1, l2, l3, l4;

    JTextField t1;

    JPasswordField t2;

    JButton b1, b2, b3, b4;

    Cursor c1;

    Font f1;

    MouseEvents(String s1) {
        super(s1);
    }

    MouseEvents() {
    }

    void setComponents() {

        f1 = new Font("Times New Roman", Font.BOLD, 28);

        l1 = new JLabel("WElcome to JAVA Class");
        l2 = new JLabel("UserName");
        l3 = new JLabel("Password");
        l4 = new JLabel();

        l1.setFont(f1);
        l1.setForeground(Color.red);

        t1 = new JTextField();

        t2 = new JPasswordField();

        b1 = new JButton("Login Me !!!!");
        b2 = new JButton("Clear");
        b3 = new JButton("Add");
        b4 = new JButton("Auto Fill");

        c1 = new Cursor(Cursor.HAND_CURSOR);

        b1.setCursor(c1);
        setLayout(null);

        add(l1);
        add(l2);
        add(l3);
        add(l4);

        add(t1);
        add(t2);

        add(b1);
        add(b2);
        add(b3);
        add(b4);

        l1.setBounds(300, 50, 300, 30);
        l2.setBounds(100, 200, 100, 30);
        l3.setBounds(100, 350, 100, 30);
        l4.setBounds(100, 550, 100, 100);

        t1.setBounds(350, 200, 100, 30);
        t2.setBounds(350, 350, 100, 30);

        b1.setBounds(200, 450, 100, 30);
        b2.setBounds(400, 450, 100, 30);
        b3.setBounds(500, 550, 100, 30);
        b4.setBounds(500, 600, 100, 30);

        b1.addActionListener(new Log());
        b2.addActionListener(new Clear());
        b3.addActionListener(new Add());
        b4.addActionListener(new AutoFill());

        l1.addMouseListener(new MouseL());

    }

    public static void main(String[] args) {

        MouseEvents l1 = new MouseEvents("Welcome to JAVA classes");

        l1.setVisible(true);
        l1.setSize(700, 700);
        l1.setBackground(Color.GREEN);

        l1.setComponents();

        l1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    class MouseL implements MouseListener {

        public void mouseClicked(MouseEvent e) {
            l1.setText("Mouse Clicked");
        }

        public void mousePressed(MouseEvent e) {
            l1.setText("Mouse Pressed");

        }

        public void mouseReleased(MouseEvent e) {
            l1.setText("Mouse Released");

        }

        public void mouseEntered(MouseEvent e) {
            l1.setForeground(Color.red);
        }

        public void mouseExited(MouseEvent e) {
            l1.setForeground(Color.black);

        }

    }

    class Log implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String s1 = t1.getText();
            String s2 = t2.getText();

            if (s1.equals("coding") && s2.equals("password")) {
                l4.setText("Login SuccessFull");
            } else {
                l4.setText("Login Unsuccesfull");
            }

        }
    }

    class Clear implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            t1.setText("");
            t2.setText("");
        }
    }

    class Add implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            try {
                int a = Integer.parseInt(t1.getText());

                l4.setText("Count Char" + a);
            } catch (Exception e1) {
                System.out.println("Wrong Data");
            }

        }
    }

    class AutoFill implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            t1.setText("coding");
            t2.setText("password");

        }
    }
}