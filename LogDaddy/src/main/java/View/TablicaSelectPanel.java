package View;

import Controller.Controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TablicaSelectPanel extends JPanel {

    private JComboBox<String> comboBox;
    private JComboBox<String> comboBoxUsers;

    private Controller controller;

    public TablicaSelectPanel() {
        initComps();
        layoutComps();
        activateComps();
    }

    private void initComps() {
        controller = Controller.getControllerInstance();
        controller.connectToDatabase();

        String[] items = {"Student-servis", "Sektor komercijale", "Sektor Tehnike, razvoja i održavanja", "Prometno operativni sektor", "Radnici na određeno", "Radnici na neodređeno"};
        comboBox = new JComboBox<>(items);
        comboBox.setSelectedIndex(-1);

        comboBoxUsers = new JComboBox<>();
    }

    private void layoutComps() {
        add(comboBox);
    }

    private void activateComps(){
        comboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.out.println("Selected item: " + comboBox.getSelectedItem());
                controller.getUserDetailsBySector(comboBox.getSelectedItem().toString());
            }
        });
    }
}