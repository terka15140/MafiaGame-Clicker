package com.company;

import javax.swing.*;

public class fewHitman extends JFrame {
    private JButton OKButton3;
    private JPanel fewHitmanPanel;

    public fewHitman(){
        setVisible(true);
        setBounds(150,100,400,125);
        add(fewHitmanPanel);

        OKButton3.addActionListener((x)->this.dispose());
    }
}
