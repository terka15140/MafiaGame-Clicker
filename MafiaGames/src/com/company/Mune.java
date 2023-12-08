package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

    public class Mune extends JFrame {

        private JPanel MunePannel;
        private JButton rodBankButton;
        private JButton GunShopButton;
        private JButton HitmanShopButton;

        public Mune() {
            setVisible(true);
            setBounds(400, 150,400, 225);
            add(MunePannel);

            rodBankButton.addActionListener(this::onRodBankButton);
            GunShopButton.addActionListener(this::onGunShopButton);
            HitmanShopButton.addActionListener(this::onHitmanShopButton);
        }


        private void onHitmanShopButton(ActionEvent e) {
            HitmanShop hitmanShop = new HitmanShop();
        }

        private void onGunShopButton(ActionEvent e) {
            GunShop gunShop = new GunShop();
        }

        private void onRodBankButton(ActionEvent e) {
            BanksTable banksTable = new BanksTable();
        }


    }
