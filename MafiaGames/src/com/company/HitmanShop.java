package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class HitmanShop extends JFrame{

    private JPanel HitmanShopPanel;
    private JButton HitmanButton1;
    private JButton HitmanButton2;
    private JButton HitmanButton3;
    private JButton HitmanButton4;
    private JButton HitmanButton5;
    private JButton HomeButton;
    private JLabel MoneyLabel3;
    private JLabel HitmanLabel;

    public static int money;
    public static int pps;
    public static int quantityHitman;

    private int HitmanUpgrade1 = 1;
    private int HitmanUpgrade2 = 2;
    private int HitmanUpgrade3 = 3;
    private int HitmanUpgrade4 = 5;
    private int HitmanUpgrade5 = 7;

    private int HitmanPrice1 = 150;
    private int HitmanPrice2 = 610;
    private int HitmanPrice3 = 1550;
    private int HitmanPrice4 = 4200;
    private int HitmanPrice5 = 10000;

    public HitmanShop() {
        setVisible(true);
        setBounds(0, 0,1200, 1600);
        add(HitmanShopPanel);

        HomeButton.addActionListener((x)->this.dispose());
        HitmanButton1.addActionListener(this::onHitmanButton1);
        HitmanButton2.addActionListener(this::onHitmanButton2);
        HitmanButton3.addActionListener(this::onHitmanButton3);
        HitmanButton4.addActionListener(this::onHitmanButton4);
        HitmanButton5.addActionListener(this::onHitmanButton5);

        String pointsStr = Integer.toString(safe.money);
        MoneyLabel3.setText("Количество денег:" +pointsStr);
    }

    private void onHitmanButton1(ActionEvent actionEvent) {
        if (safe.money >= HitmanPrice1){
            safe.pps++;
            safe.money-=HitmanPrice1;
            safe.pps+=HitmanUpgrade1;

            MoneyLabel3.setText(String.valueOf(safe.money));

            HitmanButton1.setText("Купить:"+HitmanPrice1+"");

            quantityHitman++;
            HitmanLabel.setText("Количестов Наёмников:" + quantityHitman);

            String pointsStr = Integer.toString(safe.money);
            MoneyLabel3.setText("Количество денег:" +pointsStr);
        }
        else {
            fewMoney fewMoney = new fewMoney();
        }
    }

    private void onHitmanButton2(ActionEvent actionEvent) {
        if (safe.money >= HitmanPrice2){
            safe.pps++;
            safe.money-=HitmanPrice2;
            safe.pps+=HitmanUpgrade2;

            MoneyLabel3.setText(String.valueOf(safe.money));

            HitmanButton2.setText("Купить:"+HitmanPrice2+"");

            quantityHitman+=2;
            HitmanLabel.setText("Количестов Наёмников:" + quantityHitman);

            String pointsStr = Integer.toString(safe.money);
            MoneyLabel3.setText("Количество денег:" +pointsStr);
        }
        else {
            fewMoney fewMoney = new fewMoney();
        }
    }

    private void onHitmanButton3(ActionEvent actionEvent) {
        if (safe.money >= HitmanPrice3){
            safe.pps++;
            safe.money-=HitmanPrice3;
            safe.pps+=HitmanUpgrade3;

            MoneyLabel3.setText(String.valueOf(safe.money));

            HitmanButton3.setText("Купить:"+HitmanPrice3+"");

            quantityHitman++;
            HitmanLabel.setText("Количестов Наёмников:" + quantityHitman);

            String pointsStr = Integer.toString(safe.money);
            MoneyLabel3.setText("Количество денег:" +pointsStr);
        }
        else {
            fewMoney fewMoney = new fewMoney();
        }
    }

    private void onHitmanButton4(ActionEvent actionEvent) {
        if (safe.money >= HitmanPrice4){
            safe.pps++;
            safe.money-=HitmanPrice4;
            safe.pps+=HitmanUpgrade4;

            MoneyLabel3.setText(String.valueOf(safe.money));

            HitmanButton4.setText("Купить:"+HitmanPrice4+"");

            quantityHitman++;
            HitmanLabel.setText("Количестов Наёмников:" + quantityHitman);

            String pointsStr = Integer.toString(safe.money);
            MoneyLabel3.setText("Количество денег:" +pointsStr);
        }
        else {
            fewMoney fewMoney = new fewMoney();
        }
    }

    private void onHitmanButton5(ActionEvent actionEvent) {
        if (safe.money >= HitmanPrice5){
            safe.pps++;
            safe.money-=HitmanPrice5;
            safe.pps+=HitmanUpgrade5;

            MoneyLabel3.setText(String.valueOf(safe.money));

            HitmanButton5.setText("Купить:"+HitmanPrice5+"");

            quantityHitman+=4;
            HitmanLabel.setText("Количестов Наёмников:" + quantityHitman);

            String pointsStr = Integer.toString(safe.money);
            MoneyLabel3.setText("Количество денег:" +pointsStr);
        }
        else {
            fewMoney fewMoney = new fewMoney();
        }
    }

}





