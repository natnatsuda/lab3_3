import javax.swing.*;
import java.awt.*;

public class OXForm {
    private JLabel lblScoreX;
    private JLabel lblScoreDraw;
    private JLabel lblScoreO;
    private JPanel mainPanel;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;


    public static void main(String[] args) {
        JFrame frame = new JFrame();
        OXForm form = new OXForm();
        frame.setContentPane(form.mainPanel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(500,500));
        frame.setVisible(true);
    }
}
