import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

public class SwingComponentsDemo extends JFrame {

    JLabel label;
    JTextField textField;
    JPasswordField passwordField;
    JTextArea textArea;
    JCheckBox checkBox;
    JRadioButton male, female;
    JComboBox<String> comboBox;
    JList<String> list;
    JSlider slider;
    JSpinner spinner;
    JProgressBar progressBar;
    JScrollBar scrollBar;

    public SwingComponentsDemo() {
        setTitle("Java Swing Components Demo");
        setSize(800, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // JLabel
        label = new JLabel("Java Swing Components");
        add(label);

        // ImageIcon
        ImageIcon icon = new ImageIcon("sample.png"); // Put image in project folder
        JLabel imageLabel = new JLabel(icon);
        add(imageLabel);

        // JTextField
        textField = new JTextField(20);
        add(new JLabel("Name:"));
        add(textField);

        // JPasswordField
        passwordField = new JPasswordField(20);
        add(new JLabel("Password:"));
        add(passwordField);

        // JTextArea
        textArea = new JTextArea(5, 20);
        add(new JScrollPane(textArea));

        // JCheckBox
        checkBox = new JCheckBox("Accept Terms");
        add(checkBox);

        // JRadioButton
        male = new JRadioButton("Male");
        female = new JRadioButton("Female");

        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);

        add(male);
        add(female);

        // JComboBox
        String[] courses = {"Java", "Python", "C++", "JavaScript"};
        comboBox = new JComboBox<>(courses);
        add(comboBox);

        // JList
        String[] items = {"Apple", "Orange", "Mango", "Banana"};
        list = new JList<>(items);
        add(new JScrollPane(list));

        // JSlider
        slider = new JSlider(0, 100, 50);
        add(new JLabel("Slider"));
        add(slider);

        // JSpinner
        spinner = new JSpinner(new SpinnerNumberModel(1, 1, 100, 1));
        add(spinner);

        // JScrollBar
        scrollBar = new JScrollBar(JScrollBar.HORIZONTAL, 0, 10, 0, 100);
        add(scrollBar);

        // JProgressBar
        progressBar = new JProgressBar(0, 100);
        progressBar.setValue(0);
        progressBar.setStringPainted(true);
        add(progressBar);

        JButton progressButton = new JButton("Start Progress");
        add(progressButton);

        progressButton.addActionListener(e -> {
            for (int i = 0; i <= 100; i += 10) {
                progressBar.setValue(i);
                try {
                    Thread.sleep(100);
                } catch (Exception ex) {
                }
            }
        });

        // JColorChooser
        JButton colorButton = new JButton("Choose Color");
        add(colorButton);

        colorButton.addActionListener(e -> {
            Color color = JColorChooser.showDialog(
                    this,
                    "Select Color",
                    Color.WHITE);

            if (color != null) {
                getContentPane().setBackground(color);
            }
        });

        // JFileChooser
        JButton fileButton = new JButton("Choose File");
        add(fileButton);

        fileButton.addActionListener(e -> {
            JFileChooser chooser = new JFileChooser();
            int result = chooser.showOpenDialog(this);

            if (result == JFileChooser.APPROVE_OPTION) {
                File file = chooser.getSelectedFile();
                JOptionPane.showMessageDialog(
                        this,
                        "Selected File: " + file.getAbsolutePath());
            }
        });

        // JOptionPane
        JButton showButton = new JButton("Show Information");
        add(showButton);

        showButton.addActionListener(e -> {
            String name = textField.getText();

            JOptionPane.showMessageDialog(
                    this,
                    "Hello " + name +
                    "\nCourse: " + comboBox.getSelectedItem());
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SwingComponentsDemo());
    }
}