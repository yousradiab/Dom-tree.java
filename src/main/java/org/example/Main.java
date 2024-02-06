package org.example;

import java.util.*;

public class Main {

    public static void main(String[] args) {

int i1 = "abe".compareTo("hej");
        System.out.println("abe".compareTo("hej"));
        System.out.println("pabe".compareTo("hej"));
        System.out.println("abe".compareTo("abe"));


        List<Tag> tags = new ArrayList<>();

    long start = System.currentTimeMillis();
        for (int i = 1; i < 4; i++) {
        HTag hTag = new HTag(1, "Hej" + i);
        hTag.setId(hTag.getText());
        tags.add(hTag);
        PTag pTag = new PTag("Hej p" + i);
        pTag.setId(pTag.getText());
        tags.add(pTag);
    }
        Collections.sort(tags);
        System.out.println(tags);

    }
}


