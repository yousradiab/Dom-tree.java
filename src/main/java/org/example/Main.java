package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        HTag hTag = new HTag(2);
        hTag.setText("jeg er et h tag");

        //System.out.println(hTag);
        //System.out.println("nu er jeg på git");
        System.out.println(hTag.toHtmlString());

        // array liste af typen
        List<Tag> hTags = new ArrayList<>();
        for ( int i = 19; i>0; i --) {
            HTag hTag2 = new HTag(5-(i % 5));
            hTag2.setText(" jeg er et " + hTag2.getTagName() + " tag" );
            hTag2.setColor(i*4, i*8, i*5);
            hTags.add(hTag2);
            for ( int j=1; j<5; j++); {
                PTag pTag = new PTag();
                pTag.setText("jeg er en ptag indeni " + hTag2.getTagName());
                pTag.setColor(i+50, i+100, i+200);
                hTags.add(pTag);
            }
        }
        System.out.println(hTags.size());

        // looper igennem Arraylisten og printer listen ud.
for (Tag tag: hTags) {
    //System.out.println(tag.toHtmlString());
}
BodyTag body   = new BodyTag();
body.setChildren(hTags);
        System.out.println(body);
        System.out.println(body.toHtmlString());
        body.ToHtmlStringFile("index.html");
        body.setColor(255, 10, 15);
        System.out.println(body.getColor());
    }
}