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
    }

}
