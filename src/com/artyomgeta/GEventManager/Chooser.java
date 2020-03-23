package com.artyomgeta.GEventManager;

import javax.swing.*;

public class Chooser extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JList list1;
    private JCheckBox showFreeOnlyCheckBox;

    public Chooser() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

    }

    public static void main(String[] args) {
    }
}
