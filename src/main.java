import javax.swing.*;

public class main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Lorem Ipsum Generator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new MyPanel());
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);
    }
}
