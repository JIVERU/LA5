import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MostFrequentCharacter extends JFrame {
    private JPanel pMain;
    private JTextArea textArea;
    private JLabel frequentCharLabel;
    MostFrequentCharacter() {
        textArea.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                String text = textArea.getText();
                text = text.toLowerCase();
                if (!text.isEmpty()) {
                    int[] freq = new int[256];
                    for (char c : text.toCharArray()) {
                        freq[c]++;
                    }
                    int max = -1;
                    char result = ' ';
                    for (int i = 0; i < text.length(); i++) {
                        if (max < freq[text.charAt(i)]) {
                            max = freq[text.charAt(i)];
                            result = text.charAt(i);
                        }
                    }
                    frequentCharLabel.setText("Most Frequent Character: " + result);
                } else {
                    frequentCharLabel.setText("Most Frequent Character: ");
                }
            }
        });
    }

    public static void main(String[] args) {
        MostFrequentCharacter s = new MostFrequentCharacter();
        s.setContentPane(s.pMain);
        s.setSize(400,400);
        s.setVisible(true);
        s.setTitle("Most Frequent Char");
        s.setDefaultCloseOperation(EXIT_ON_CLOSE);
        s.setName("Most Frequent Char");
    }
}
