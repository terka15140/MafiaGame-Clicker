package com.company;

import javax.swing.*;

public class fewGun extends JFrame{

    private JButton OKButton2;
    private JPanel fewGunPanel;

    public fewGun(){
        setVisible(true);
        setBounds(150,100,415,125);
        add(fewGunPanel);

        OKButton2.addActionListener((x)->this.dispose());
    }
}
