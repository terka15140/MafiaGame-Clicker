package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class BanksTable extends JFrame{

    private JPanel MuneBanksPanel;
    private JButton GoShopButton;
    private JButton GoJewerlyButton;
    private JButton GoBankButton1;
    private JButton GoBankButton2;
    private JButton HomeButton;
    private JLabel GunLabel;
    private JLabel HitmanLabel;


    public BanksTable(){
        setVisible(true);
        setBounds(150,100,1000, 500);
        add(MuneBanksPanel);


        GoJewerlyButton.addActionListener(this::onGoJewerlyButton);
        GoBankButton1.addActionListener(this::onGoBankButton1);
        GoBankButton2.addActionListener(this::onGoBankButton2);
        GoShopButton.addActionListener(this::onGoShopButton);
        HomeButton.addActionListener((x)->this.dispose());


        GunLabel.setText(String.valueOf(GunShop.quantityGun));
        HitmanLabel.setText(String.valueOf(HitmanShop.quantityHitman));
    }

    private void onGoShopButton(ActionEvent e) { safe safe = new safe(); }

    private void onGoJewerlyButton(ActionEvent e) {
        if (GunShop.quantityGun >= 8 )
        {
            safe safe = new safe();
        } else {
            fewGun fewGun = new fewGun();
        }
        if(HitmanShop.quantityHitman >= 7)
        {
            safe safe = new safe();
        }
        else {
            fewHitman fewHitman =  new fewHitman();
        }
    }

    private void onGoBankButton1(ActionEvent actionEvent) {
        if (GunShop.quantityGun >= 30 )
        {
            safe safe = new safe();
        } else {
            fewGun fewGun = new fewGun();
        }
        if(HitmanShop.quantityHitman >= 29)
        {
            safe safe = new safe();
        }
        else {
            fewHitman fewHitman =  new fewHitman();
        }
    }

    private void onGoBankButton2(ActionEvent actionEvent) {
        if (GunShop.quantityGun >= 43 )
        {
            safe safe = new safe();
        } else {
            fewGun fewGun = new fewGun();
        }
        if(HitmanShop.quantityHitman >= 45)
        {
            safe safe = new safe();
        }
        else {
            fewHitman fewHitman =  new fewHitman();
        }
    }
}
