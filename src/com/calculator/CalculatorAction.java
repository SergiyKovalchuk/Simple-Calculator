package com.calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Hi-Tech on 10.05.2017.
 */
public class CalculatorAction implements ActionListener {

    private Calculator calc;

    public CalculatorAction(Calculator calc){
        this.calc = calc;
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        JButton currentButton = (JButton) e.getSource();

        String t1 = calc.getDisplay();
        String t2 = currentButton.getText();

        calc.setDisplay(t1+t2);
    }
}
