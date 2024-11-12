package View;

import Controller.Controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TablicaSelectPanel extends JPanel {

    private JComboBox<String> comboBox;
    private JComboBox<String> comboBoxUsers;

    private String[] userList;

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
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;

        add(comboBox, gbc);
        gbc.gridy++;

        add(new JLabel("Korisnik: "), gbc);
        gbc.gridy++;

        add(comboBoxUsers, gbc);
    }

    private void activateComps(){
        comboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.out.println("Selected item: " + comboBox.getSelectedItem());
                controller.getUserDetailsBySector(comboBox.getSelectedItem().toString());
                userList = new String[controller.getUserDetailsBySector(comboBox.getSelectedItem().toString()).size()];
                for (int i = 0; i < userList.length; i++) {
                    userList[i] = controller.getUserDetailsBySector(comboBox.getSelectedItem().toString()).get(i);
                    System.out.println(userList[i]);
                }
                ComboBoxModel<String> userModel = new DefaultComboBoxModel<>(userList);
                comboBoxUsers.setModel(userModel);
            }
        });
    }
}