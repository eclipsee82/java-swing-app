package com.eclipse;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContactForm extends JFrame {

    public ContactForm() {
        super("Контактная форма");
        super.setBounds(100, 100, 300, 230);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = super.getContentPane();
        container.setLayout(new GridLayout(5, 2, 2, 10));

        JLabel name = new JLabel("Введите имя");
        JTextField name_field = new JTextField("", 1);

        JLabel email = new JLabel("Введите email");
        JTextField email_field = new JTextField("", 1);

        container.add(name);
        container.add(name_field);
        container.add(email);
        container.add(email_field);

        JRadioButton male = new JRadioButton("Мужской");
        JRadioButton female = new JRadioButton("Женский");

        JCheckBox check = new JCheckBox("Согласен", false);

        JButton sendButton = new JButton("Отправить");

        male.setSelected(true);
        container.add(male);
        container.add(female);

        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);

        container.add(check);
        container.add(sendButton);


        sendButton.addActionListener(new ButtonEventManager());

    }

    class ButtonEventManager implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
        }
    }

}
