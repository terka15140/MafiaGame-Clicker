package com.company;

import javax.swing.*;

public class fewMoney extends JFrame {

    private JButton OKButton;
    private JPanel fewMoneyPanel;

    public fewMoney(){
        setVisible(true);
        setBounds(150,100,350,125);
        add(fewMoneyPanel);

        OKButton.addActionListener((x)->this.dispose());
    }
}
