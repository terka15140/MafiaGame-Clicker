package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.*;
import java.nio.CharBuffer;


public class safe extends JFrame{

        public static int factor = 1;
        public static int  money  = 0;
        public static int pps = 1;


        private JButton robButton;
        private JPanel rootPanel;
        public JLabel MoneyLabel;
        private JButton homeButton;
        private JLabel MoneyLable2;


    public safe(){
            setVisible(true);
            setBounds(250, 150, 400, 250);
            add(rootPanel);


            robButton.addActionListener(this::onRobButton);
            homeButton.addActionListener((x) -> this.dispose());

            MoneyLable2.setText(String.valueOf(pps * factor));
        }

            public void onRobButton(ActionEvent e) { //если человек нажимает эту кнопку
                money  += pps * factor;              //ему начисляются денгежки

                updateText();        //вызов функции
            }

        private void updateText() {
            String pointsStr = Integer.toString( money );
            MoneyLabel.setText(pointsStr);      //текс изменяется на количество денег
        }


}

