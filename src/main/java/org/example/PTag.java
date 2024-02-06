package org.example;

public class PTag extends Tag {

    public PTag() {
        this.setTagName("p");
    }

    public PTag (String text) {
        this();
        super.setText(text);
    }
};
