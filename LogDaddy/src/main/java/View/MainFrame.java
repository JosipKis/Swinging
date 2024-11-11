package View;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private TablicaSelectPanel tablicaSelectPanel;

    public MainFrame() {
        super("Log Manager");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setVisible(true);
        initComps();
        layoutComps();
        activateComps();
    }

    private void initComps() {
        tablicaSelectPanel = new TablicaSelectPanel();
    }

    private void layoutComps() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridy = 0;

        add(new JLabel("Izaberite sektor:"), gbc);
        gbc.gridy++;

        add(tablicaSelectPanel, gbc);
        gbc.gridy++;
    }

    private void activateComps() {

    }
}