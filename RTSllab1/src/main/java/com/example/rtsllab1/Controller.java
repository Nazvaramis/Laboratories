package com.example.rtsllab1;

public class Controller {
    private final Model model;

    public Controller(Model model) {
        this.model = model;
    }

    public void setProgressValue(int id, int value) {
        model.setProgressValue(id, value);
    }
}