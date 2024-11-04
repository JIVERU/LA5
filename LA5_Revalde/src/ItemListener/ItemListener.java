package ItemListener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.util.ArrayList;

public class ItemListener extends JFrame{
    private JCheckBox cCheckBox;
    private JCheckBox cppCheckBox;
    private JCheckBox cSharpCheckBox;
    private JCheckBox javaCheckBox;
    private JCheckBox pythonCheckBox;
    private JComboBox proficiencyComboBox;
    private JPanel pMain;
    private JLabel languageLabel;
    private JLabel proficiencyLabel;

    ItemListener() {
        JCheckBox[] cbLanguages = {cCheckBox, cppCheckBox, cSharpCheckBox, javaCheckBox, pythonCheckBox};
        ArrayList<JCheckBox> lang = new ArrayList<>();
        for (JCheckBox j : cbLanguages) {
            j.addItemListener(e -> {
                if (j.isSelected()) {
                    lang.add(j);
                } else {
                    lang.remove(j);
                }
                String text = "Selected languages: ";
                for (int i = 0; i < lang.size(); i++) {
                    text += lang.get(i).getText();
                    if (i < lang.size() - 1) {
                        text += ", ";
                    }
                }
                languageLabel.setText(text);
            });
        }


        proficiencyComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                proficiencyLabel.setText("Proficiency: " + (String)proficiencyComboBox.getSelectedItem());
            }
        });
    }

    public static void main(String[] args) {
        ItemListener s = new ItemListener();
        s.setContentPane(s.pMain);
        s.setSize(400,400);
        s.setVisible(true);
        s.setTitle("Item Listener");
        s.setDefaultCloseOperation(EXIT_ON_CLOSE);
        s.setName("Item Listener");
    }
}
