package KeyEventActivity;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEventActviity extends JFrame {
    private JTextArea editableTextArea;
    private JTextArea nonEditableTextArea;
    private JPanel pMain;
    KeyEventActviity(){
        editableTextArea.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                String s = editableTextArea.getText().toLowerCase();
                char c;
                String newString = "";
                for (int i = 0; i < s.length(); i++) {
                    c = s.charAt(i);
                    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                        newString += Character.toUpperCase(c);
                    }else{
                        newString += c;
                    }
                }
                nonEditableTextArea.setText(newString);
            }
        });
    }

    public static void main(String[] args) {
        KeyEventActviity s = new KeyEventActviity();
        s.setContentPane(s.pMain);
        s.setSize(400,400);
        s.setVisible(true);
        s.setTitle("Key Event Class");
        s.setDefaultCloseOperation(EXIT_ON_CLOSE);
        s.setName("Key Event Class");
    }
}
