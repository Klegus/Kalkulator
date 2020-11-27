package kalkulator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class kalulator extends JFrame implements ActionListener {
    JButton kalkButton0,kalkButton1,kalkButton2,kalkButton3,kalkButton4,kalkButton5,kalkButton6,kalkButton7,kalkButton8,kalkButton9;
    JButton Sum,divide,multi,minus,plus,clear;
    JTextField LABEL;
    double summ =0;
    double labelVAL1 = 0;
    double labelVAL2 = 0;
    String status = "";

    public kalulator(){
        setSize(300, 330);
        setTitle("Kalkulator");
         kalkButton0 = new JButton("0");
         kalkButton1 = new JButton("1");
         kalkButton2 = new JButton("2");
         kalkButton3 = new JButton("3");
         kalkButton4 = new JButton("4");
         kalkButton5 = new JButton("5");
         kalkButton6 = new JButton("6");
         kalkButton7 = new JButton("7");
         kalkButton8 = new JButton("8");
         kalkButton9 = new JButton("9");
         clear = new JButton("CL");
         Sum = new JButton("=");
         plus = new JButton("+");
         minus = new JButton("-");
         divide = new JButton("/");
         multi= new JButton("*");
         kalkButton0.setBounds(70,230,50,30);
        kalkButton1.setBounds(10,200,50,30);
        kalkButton2.setBounds(70,200,50,30);
        kalkButton3.setBounds(130,200,50,30);
        kalkButton4.setBounds(10,170,50,30);
        kalkButton5.setBounds(70,170,50,30);
        kalkButton6.setBounds(130,170,50,30);
        kalkButton7.setBounds(10,140,50,30);
        kalkButton8.setBounds(70,140,50,30);
        kalkButton9.setBounds(130,140,50,30);
        Sum.setBounds(130,230,50,30);
        plus.setBounds(220,140,50,30);
        minus.setBounds(220,170,50,30);
        divide.setBounds(220,200,50,30);
        multi.setBounds(220,230,50,30);
        clear.setBounds(10,230,50,30);

        kalkButton1.addActionListener(this);
            kalkButton2.addActionListener(this);
                kalkButton3.addActionListener(this);
                    kalkButton4.addActionListener(this);
                        kalkButton5.addActionListener(this);
                         kalkButton6.addActionListener(this);
                            kalkButton7.addActionListener(this);
                                kalkButton8.addActionListener(this);
                                    kalkButton9.addActionListener(this);
                                        Sum.addActionListener(this);
                                            plus.addActionListener(this);
                                                minus.addActionListener(this);
                                                    divide.addActionListener(this);
                                                        add(kalkButton0);
                                                            multi.addActionListener(this);
                                                                kalkButton0.addActionListener(this);
                                                                    clear.addActionListener(this);
        add(kalkButton1);
        add(kalkButton2);
        add(kalkButton3);
        add(kalkButton4);
        add(kalkButton4);
        add(kalkButton5);
        add(kalkButton6);
        add(kalkButton7);
        add(kalkButton8);
        add(kalkButton9);
        add(Sum);
        add(plus);
        add(minus);
        add(divide);
        add(multi);
        add(clear);
        setLayout(null);
        Font font = new Font("SansSerif",Font.BOLD,20);
        LABEL = new JTextField("0");
        LABEL.setBounds(10,10,265,50);
        LABEL.setFont(font);
        add(LABEL);
    }
    void clearLABEL(){
        LABEL.setText("");
    }
    public static void main(String[] args)
    {
    kalulator kalk = new kalulator();
    kalk.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    kalk.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();

        if(src == kalkButton1){
            if(LABEL.getText().equals("0") || LABEL.getText() == String.valueOf(summ)){
                clearLABEL();
                summ = 0;
                LABEL.setText(LABEL.getText() + "1");
            }else{

                LABEL.setText(LABEL.getText() + "1");
            }
        }else if(src == kalkButton2|| LABEL.getText() == String.valueOf(summ)){
            if(LABEL.getText().equals("0")){
                clearLABEL();
                summ = 0;
                LABEL.setText(LABEL.getText() + "2");
            }else{

                LABEL.setText(LABEL.getText() + "2");
            }
        }else if(src == kalkButton3 || LABEL.getText() == String.valueOf(summ)){
            if(LABEL.getText().equals("0")){
                clearLABEL();
                summ = 0;
                LABEL.setText(LABEL.getText() + "3");
            }else{

                LABEL.setText(LABEL.getText() + "3");
            }
        }else if(src == kalkButton4 || LABEL.getText() == String.valueOf(summ)){
            if(LABEL.getText().equals("0")){
                clearLABEL();
                summ = 0;
                LABEL.setText(LABEL.getText() + "4");
            }else{

                LABEL.setText(LABEL.getText() + "4");
            }
        }else if(src == kalkButton5 || LABEL.getText() == String.valueOf(summ)){
            if(LABEL.getText().equals("0")){
                clearLABEL();
                summ = 0;
                LABEL.setText(LABEL.getText() + "5");
            }else{

                LABEL.setText(LABEL.getText() + "5");
            }
        }else if(src == kalkButton6 || LABEL.getText() == String.valueOf(summ)){
            if(LABEL.getText().equals("0")){
                clearLABEL();
                summ = 0;
                LABEL.setText(LABEL.getText() + "6");
            }else{

                LABEL.setText(LABEL.getText() + "6");
            }
        }else if(src == kalkButton7 || LABEL.getText() == String.valueOf(summ)){
            if(LABEL.getText().equals("0")){
                clearLABEL();
                summ = 0;
                LABEL.setText(LABEL.getText() + "7");
            }else{

                LABEL.setText(LABEL.getText() + "7");
            }
        }else if(src == kalkButton8 || LABEL.getText() == String.valueOf(summ)){
            if(LABEL.getText().equals("0")){
                clearLABEL();
                summ = 0;
                LABEL.setText(LABEL.getText() + "8");
            }else{

                LABEL.setText(LABEL.getText() + "8");
            }
        }else if(src == kalkButton9 || LABEL.getText() == String.valueOf(summ)){
            if(LABEL.getText().equals("0")){
                clearLABEL();
                summ = 0;
                LABEL.setText(LABEL.getText() + "9");
            }else{

                LABEL.setText(LABEL.getText() + "9");
            }
        }else if(src ==kalkButton0 || LABEL.getText() == String.valueOf(summ)){
            if(LABEL.getText().equals("0")){
                clearLABEL();
                summ = 0;
                LABEL.setText(LABEL.getText() + "0");
            }else{

                LABEL.setText(LABEL.getText() + "0");
            }
        }else if(src == clear){
            LABEL.setText("0");
        }
        else if(src == plus){
            labelVAL1 = Double.parseDouble(LABEL.getText());
            status = "PLUS";
            clearLABEL();

        }else if(src == minus){
            labelVAL1 = Double.parseDouble(LABEL.getText());
            status = "MINUS";
            clearLABEL();
        }else if(src == multi){
            labelVAL1 = Double.parseDouble(LABEL.getText());
            status = "MULTI";
            clearLABEL();
        }else if(src == divide){
            labelVAL1 = Double.parseDouble(LABEL.getText());
            status = "DIVIDE";
            clearLABEL();
        }else if(src == Sum){
            labelVAL2 = Double.parseDouble(LABEL.getText());
            if(status == "PLUS"){
                summ = labelVAL1 + labelVAL2;
                clearLABEL();
                LABEL.setText(String.valueOf(summ));
                status = "";
                labelVAL1 = 0;
                labelVAL2 = 0;

            }else if(status == "MINUS"){
                summ =labelVAL1 - labelVAL2;
                clearLABEL();
                LABEL.setText(String.valueOf(summ));
                status = "";
                labelVAL1 = 0;
                labelVAL2 = 0;

            }else if(status == "MULTI"){
                summ = labelVAL1 * labelVAL2;
                clearLABEL();
                LABEL.setText(String.valueOf(summ));
                status = "";
                labelVAL1 = 0;
                labelVAL2 = 0;
            }else if(status == "DIVIDE"){
                summ = labelVAL1 / labelVAL2;
                clearLABEL();
                LABEL.setText(String.valueOf(summ));
                status = "";
                labelVAL1 = 0;
                labelVAL2 = 0;

            }
        }

    }
}
