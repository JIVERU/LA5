package SimpleCalculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame{
    private JTextField tfNumber1;
    private JTextField tfNumber2;
    private JTextField lblResult;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JLabel firstNumber;
    private JLabel secondNumber;
    private JLabel Result;
    private JPanel pMain;
    SimpleCalculator(){
        lblResult.setName("lblResult");
        tfNumber1.setName("tfNumber1");
        tfNumber2.setName("tfNumber2");
        cbOperations.setName("cbOperations");
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.valueOf(tfNumber1.getText());
                int b = Integer.valueOf(tfNumber2.getText());
                int result = a+b;
                int op = cbOperations.getSelectedIndex();
                 if (op == 1) {
                    result = (a - b);
                }else if (op == 2){
                    result = (a * b);
                }else{
                    if(b == 0)
                        JOptionPane.showMessageDialog(null, "Cannot divide by zero");
                    else
                    result = (a / b);
                }
                    lblResult.setText(String.valueOf(result));
            }

        });
    }
    public static void main(String[] args) {
        SimpleCalculator s = new SimpleCalculator();

        s.setContentPane(s.pMain);
        s.setTitle("Simple Calculator");
        s.setSize(800,300);
        s.setDefaultCloseOperation(EXIT_ON_CLOSE);
        s.setVisible(true);
        s.setName("Simple Calculator");

    }
}
