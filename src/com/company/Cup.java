package com.company;

public class Cup {

    private String colour;
    private int handleNumber;
    private int volume;

    //------------- Setters
    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setVolume(int vol) {
        this.volume = vol;
    }

    //------------- Getters
    public String getColour() {
        return this.colour;
    }

    //-------------- Methods
    public boolean isBigEnough(String name) {
        name = name.toLowerCase();
        if (name.equals("felix")) {
            if (this.volume > 100) {
                return true;
            }
        }
        return false;
    }
}
