import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import javax.swing.*;


class MyPanel extends JPanel {

    private JTextArea loremTextArea = new JTextArea(5, 5);
    private JTextField inputNumberField = new JTextField(1);
    ;

    MyPanel() {

        setPreferredSize(new Dimension(365, 335));
        setLayout(null);

        LoremIpsum loremIpsum = new LoremIpsum();

        JButton generateButton = new JButton("Generate");
        JButton copyButton = new JButton("Copy Text");
        JLabel textLabel = new JLabel("Enter number of paragraphs");
        JScrollPane loremScrollPane = new JScrollPane(loremTextArea);

        add(generateButton);
        add(textLabel);
        add(loremScrollPane);
        add(inputNumberField);
        add(copyButton);

        generateButton.setBounds(255, 20, 100, 25);
        generateButton.setFocusable(false);

        textLabel.setBounds(5, 20, 180, 25);

        loremTextArea.setLineWrap(true);
        loremTextArea.setEditable(false);
        loremScrollPane.setBounds(5, 100, 355, 230);

        inputNumberField.setBounds(5, 50, 100, 25);

        copyButton.setBounds(255, 50, 100, 25);
        copyButton.setFocusable(false);

        generateButton.addActionListener(e -> {
            if (!inputNumberField.getText().isEmpty() && Integer.parseInt(inputNumberField.getText()) < 1000 && Integer.parseInt(inputNumberField.getText()) > 0) {
                try {
                    loremTextArea.setText(loremIpsum.getParagraphs(Integer.parseInt(inputNumberField.getText())));
                } catch (Exception e1) {
                    loremTextArea.setText("Sorry, I understand only integers :(");
                }
            } else {
                loremTextArea.setText("Sorry, I'm weak.\nI can't generate more that 999 paragraphs or less that 1.");
            }
        });

        copyButton.addActionListener(e -> {
            if (!loremTextArea.getText().isEmpty()) {
                StringSelection stringSelection = new StringSelection(loremTextArea.getText());
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                clipboard.setContents(stringSelection, null);
            }
        });
    }
}


