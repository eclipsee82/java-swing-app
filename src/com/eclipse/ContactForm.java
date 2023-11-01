package com.eclipse;

import javax.swing.*;
import java.awt.*;

public class ContactForm extends JFrame {

    public ContactForm() {
        super("Контактная форма");
        super.setBounds(100, 100, 250, 100);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = super.getContentPane();
        container.setLayout(new GridLayout(3, 2, 2, 2));

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

    }

}
