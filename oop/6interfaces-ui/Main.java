package com.ui;

public class Main {
    public static void main(String[] args) {
        UIWidget button = new Button(100, 50);

        Dragger dragger = new Dragger();

        button.render();
        dragger.drag(button);
        button.resize(150, 75);
        button.render();
    }
}
