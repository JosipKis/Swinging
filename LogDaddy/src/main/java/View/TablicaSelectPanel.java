package View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TablicaSelectPanel extends JPanel {

    private JComboBox<String> comboBox;

    public TablicaSelectPanel() {
        initComps();
        layoutComps();
        activateComps();
    }

    private void initComps() {
        String[] items = {"Student-servis", "Sektor komercijale", "Sektor Tehnike, razvoja i održavanja", "Prometno operativni sektor", "Radnici na određeno", "Radnici na neodređeno"};
        comboBox = new JComboBox<>(items);
        comboBox.setSelectedIndex(-1);
    }

    private void layoutComps() {
        add(comboBox);
    }

    private void activateComps(){
        comboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.out.println("Selected item: " + comboBox.getSelectedItem());
            }
        });
    }
}