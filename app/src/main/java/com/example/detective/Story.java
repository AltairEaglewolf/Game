package com.example.detective;

public class Story {
    Story[] direction;
    String name,text;

    public Story (String name,String text, int variants) {
        this.name = name;
        this.text = text;
        direction=new Story[variants];
    }
}

