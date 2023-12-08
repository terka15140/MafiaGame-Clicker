package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class GunShop extends JFrame {
    public static int quantityGun;
    public static int money;
    public static int factor;

    private JPanel GunShopPanel;
    private JButton HomeButton;
    private JButton GunButton1;
    private JButton GunButton2;
    private JButton GunButton3;
    private JButton GunButton4;
    private JButton GunButton5;
    private JLabel GunLabel1;
    private JLabel GunLabel2;
    private JLabel GunLabel3;
    private JLabel GunLabel4;
    private JLabel GunLabel5;
    private JLabel MoneyLabel2;
    private JLabel GunLabel;

    private int upgrade1 = 1;
    private int upgrade2 = 2;
    private int upgrade3 = 4;
    private int upgrade4 = 6;
    private int upgrade5 = 9;

    private int price1 = 100;
    private int price2 = 550;
    private int price3 = 1750;
    private int price4 = 5400;
    private int price5 = 12500;


    public GunShop(){
        setVisible(true);
        setBounds(150,100,1025,530);
        add(GunShopPanel);

        HomeButton.addActionListener((x)->this.dispose());
        GunButton1.addActionListener(this::onGunButton1);
        GunButton2.addActionListener(this::onGunButton2);
        GunButton3.addActionListener(this::onGunButton3);
        GunButton4.addActionListener(this::onGunButton4);
        GunButton5.addActionListener(this::onGunButton5);

        String pointsStr = Integer.toString(safe.money);
        MoneyLabel2.setText(pointsStr);

        GunLabel.setText(String.valueOf(quantityGun));
    }

    public void onGunButton1(ActionEvent e) {
        if (safe.money >= price1){
            safe.factor++;
            safe.money-=price1;
            safe.factor+=upgrade1;

            MoneyLabel2.setText(String.valueOf(safe.money));

            GunButton1.setText("Купить:"+price1+"");

            quantityGun++;
            GunLabel.setText(String.valueOf(quantityGun));
        }
        else {
            fewMoney fewMoney = new fewMoney();
        }

    }
    public void onGunButton2(ActionEvent e) {
        if (safe.money >= price2){
            safe.factor++;
            safe.money-=price2;
            safe.factor+=upgrade2;

            MoneyLabel2.setText(String.valueOf(safe.money));

            GunButton2.setText("Купить:"+price2+"");

            quantityGun+=2;
            GunLabel.setText(String.valueOf(quantityGun));
        }
        else {
            fewMoney fewMoney = new fewMoney();
        }
    }
    public void onGunButton3(ActionEvent e) {
        if (safe.money >= price3){
            safe.factor++;
            safe.money-=price3;
            safe.factor+=upgrade3;

            MoneyLabel2.setText(String.valueOf(safe.money));

            GunButton3.setText("Купить:"+price3+"");

            quantityGun+=3;
            GunLabel.setText(String.valueOf(quantityGun));
        }
        else {
            fewMoney fewMoney = new fewMoney();
        }
    }
    public void onGunButton4(ActionEvent e) {
        if (safe.money >= price4){
            safe.factor++;
            safe.money-=price4;
            safe.factor+=upgrade4;

            MoneyLabel2.setText(String.valueOf(safe.money));

            GunButton4.setText("Купить:"+price4+"");

            quantityGun+=5;
            GunLabel.setText(String.valueOf(quantityGun));
        }
        else {
            fewMoney fewMoney = new fewMoney();
        }
    }
    public void onGunButton5(ActionEvent e) {
        if (safe.money >= price5){
            safe.factor++;
            safe.money-=price5;
            safe.factor+=upgrade5;

            MoneyLabel2.setText(String.valueOf(safe.money));

            GunButton5.setText("Купить:"+price5+"");

            quantityGun+=8;
            GunLabel.setText(String.valueOf(quantityGun));
        }
        else {
            fewMoney fewMoney = new fewMoney();
        }
    }

}
