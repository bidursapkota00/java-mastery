package com.ui;

public class Button implements UIWidget {
    private int width;
    private int height;

    public Button(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void drag() {
        System.out.println("Button is being dragged...");
    }

    @Override
    public void resize(int size) {
        this.width = this.height = size;
        System.out.println("Button resized to: " + size + "x" + size);
    }

    @Override
    public void resize(int x, int y) {
        this.width = x;
        this.height = y;
        System.out.println("Button resized to: " + x + "x" + y);
    }

    @Override
    public void resizeTo(UIWidget widget) {
        System.out.println("Resizing button to match another widget.");
    }

    @Override
    public void render() {
        System.out.println("Rendering Button of size: " + width + "x" + height);
    }
}
