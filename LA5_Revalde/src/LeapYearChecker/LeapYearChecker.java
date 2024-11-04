package LeapYearChecker;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearChecker extends JFrame {
    private JPanel pMain;
    private JButton checkYearButton;
    private JTextField yearTextField;

    LeapYearChecker(){
        yearTextField.setName("yearTextField");
        checkYearButton.setName("checkYearButton");
        checkYearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int year = Integer.valueOf(yearTextField.getText());
                boolean leap;
                if(year%4==0){
                    if(year%100 == 0) {
                        if (year % 400 == 0)
                            leap = true;
                        else
                            leap = false;
                    }else{
                        leap = true;
                    }
                }else{
                    leap = false;
                }
                if(leap) {
                    JOptionPane.showMessageDialog(null, "Leap year");
                }else{
                    JOptionPane.showMessageDialog(null, "Not a leap year");
                }
            }
        });

    }
    public static void main(String[] args) {
        LeapYearChecker s = new LeapYearChecker();

        s.setContentPane(s.pMain);
        s.setTitle("Leap Year Checker");
        s.setSize(400,300);
        s.setDefaultCloseOperation(EXIT_ON_CLOSE);
        s.setVisible(true);
        s.setName("Leap Year Checker");
    }
}
