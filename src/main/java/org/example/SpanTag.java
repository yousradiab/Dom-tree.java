package org.example;

public class SpanTag extends Tag {

    //constructor - bliver udført hvor vi laver instansen ("new")
    public SpanTag() {
        this.setTagName("p");
    }

    public SpanTag(String text) {
        this();
        super.setText(text);

    }

    public  boolean hasLineshift() {
        return false;
    }

}
