package FoodOrderingSystem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderingSystem extends JFrame {
    private JButton btnOrder;
    private JCheckBox cPizza;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rbNone;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    private JPanel pMain;
    FoodOrderingSystem(){
        int[] rbDiscount = {0,1,2,3,4};
        JCheckBox[] cbFood = {cPizza,cBurger,cFries,cSoftDrinks,cTea,cSundae};
        int[] prices
        double total = 0;
        int discount;
        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int count = 0;

            }
        });
    }

    public static void main(String[] args) {
        FoodOrderingSystem s = new FoodOrderingSystem();

        s.setContentPane(s.pMain);
        s.setTitle("Simple Calculator");
        s.setSize(800,300);
        s.setDefaultCloseOperation(EXIT_ON_CLOSE);
        s.setVisible(true);
        s.setName("Simple Calculator");
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
