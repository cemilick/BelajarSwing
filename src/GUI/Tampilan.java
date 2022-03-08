/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.*;

/**
 *
 * @author cemil
 */
public class Tampilan extends JFrame {
    JLabel label = new JLabel("ini adalah label");
    JTextField form = new JTextField();
    JButton tombol = new JButton("Tekan aku");
    JRadioButton radio = new JRadioButton("ini tombol radio");
    JCheckBox checkbox = new JCheckBox("ini adalah checkbox");
    String[] arr = {
        "Opsi 1", "Opsi 2", "Opsi 3"
    };
    JComboBox combobox = new JComboBox(arr);
    public Tampilan(){
        setTitle("Belajar Swing PBO");
        setSize(500,300);
        setVisible(true);
        setDefaultCloseOperation(3);
        setLocation(580,250);
        setLayout(null);
        
        add(combobox);
        add(checkbox);
        add(label);
        add(form);
        add(tombol);
        add(radio);
        
        combobox.setBounds(10,10,100,20);
        label.setBounds(10,40,100,20);
        form.setBounds(120,40,100,20);
        checkbox.setBounds(120,10,150,20);
        radio.setBounds(270,10,150,20);
        tombol.setBounds(10,70,100,20);
        
    }
}
