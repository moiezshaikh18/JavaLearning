import javax.swing.*;
import java.awt.event.*;

class LoginScreen extends JFrame {

    JLabel l1, l2, l3, l4;

    JTextField t1;

    JPasswordField t2;

    JButton b1, b2, b3;

    LoginScreen(String s1) {
        super(s1);
    }

    LoginScreen() {
    }

    void setComponents() {
        l1 = new JLabel("WElcome to JAVA Class");
        l2 = new JLabel("UserName");
        l3 = new JLabel("Password");
        l4 = new JLabel();

        t1 = new JTextField();

        t2 = new JPasswordField();

        b1 = new JButton("Login Me !!!!");
        b2 = new JButton("Clear");
        b3 = new JButton("Add");

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

        l1.setBounds(300, 50, 300, 30);
        l2.setBounds(100, 200, 100, 30);
        l3.setBounds(100, 350, 100, 30);
        l4.setBounds(100, 550, 100, 100);

        t1.setBounds(350, 200, 100, 30);
        t2.setBounds(350, 350, 100, 30);

        b1.setBounds(200, 450, 100, 30);
        b2.setBounds(400, 450, 100, 30);
        b3.setBounds(500, 550, 100, 30);

        b1.addActionListener(new Log());
        b2.addActionListener(new Clear());
        b3.addActionListener(new Add());
    }

    public static void main(String[] args) {

        LoginScreen l1 = new LoginScreen("Welcome to JAVA classes");

        l1.setVisible(true);
        l1.setSize(700, 700);

        l1.setComponents();

        l1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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
}