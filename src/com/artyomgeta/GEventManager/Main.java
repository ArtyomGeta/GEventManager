package com.artyomgeta.GEventManager;

import javax.swing.*;

@SuppressWarnings("rawtypes")
public class Main {

    public static DefaultListModel
    returnFilteredModel(DefaultListModel<AbstractListModel<String>> model, char... symbol) {
        String[] returnable = new String[model.getSize()];
        for (int j = 0; j < symbol.length; j++) {
            for (int i = 0; i < model.getSize(); i++) {
                if (model.get(i).toString().charAt(j) == symbol[j]) {
                    returnable[i] = model.get(i).toString();

                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        // write your code here
    }
}
