import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainJava extends JFrame {

    private JLabel JsFirstName;
    private JTextField textField1;
    private JButton clickhereButton;
    private JPanel MainPanel;

    public MainJava() {
        setContentPane(MainPanel);
        setTitle("simple Gui");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,400);
        setLocationRelativeTo(null);
        setVisible(true);

        clickhereButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String FirstName = textField1.getText();
                JOptionPane.showMessageDialog(MainJava.this,"yai"+ " "+FirstName);
            }
        });
    }

    public static void main(String[] args) {
        new MainJava();
    }
}
