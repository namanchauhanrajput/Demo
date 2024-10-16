import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloDemo {
    private JPanel panelMain;
    private JTextField textName;
    private JButton btnClick;

    public HelloDemo(){
        btnClick.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(btnClick,txtName.getText);
            }
        });



    }







}
