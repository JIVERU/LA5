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
        JRadioButton[] rbDiscount = {rbNone,rb5,rb10,rb15};
        JCheckBox[] cbFood = {cPizza,cBurger,cFries,cSoftDrinks,cTea,cSundae};
        int[] foodPrices = {100,80,65,55,50,40};
        double[] discountPercentage = {0,0.05,0.10,0.15};

        btnOrder.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                double subtotal = 0;
                double discount = 0;
                double total = 0;
                for(int i=0;i<cbFood.length;i++){
                    if(cbFood[i].isSelected()){
                        subtotal += foodPrices[i];
                    }
                }
                for(int j=0;j<rbDiscount.length;j++){
                    if(rbDiscount[j].isSelected()){
                        discount = discountPercentage[j];
                        break;
                    }
                }
                total = subtotal-(subtotal*discount);
                JOptionPane.showMessageDialog(null,"The total price is Php "+String.format("%.2f",total)+" amount.");
            }
        });
    }

    public static void main(String[] args) {
        FoodOrderingSystem s = new FoodOrderingSystem();

        s.setContentPane(s.pMain);
        s.setTitle("Food Ordering System");
        s.setSize(500,300);
        s.setDefaultCloseOperation(EXIT_ON_CLOSE);
        s.setVisible(true);
        s.setName("Food Ordering System");
    }
}
