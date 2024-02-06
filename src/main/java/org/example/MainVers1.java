package org.example;

import java.util.*;

public class MainVers1 {
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



        SpanTag sp = new SpanTag("hej");
        //System.out.println(sp);
        PTag ptag = new PTag("nyt ptag");
        // System.out.println(ptag);
        HTag htag = new HTag(1, "hej HTag");
        // System.out.println(htag);



        // OPG loop der kører 20, lave arraylist, htag og ptag.
        // OPG nyt loop hvor vi fjerner alle h tags.

        long start = System.currentTimeMillis();

        List<Tag> tags = new LinkedList<>();
        for (int i = 1; i < 20; i++) {
            tags.add(new HTag(1, "jeg er hTag" + i));
            tags.add(new PTag("jeg er pTag" + i));


        }
        long end = System.currentTimeMillis();
        System.out.println("loop1=" + (end-start));
        System.out.println(tags.size());

        int sz = tags.size();
        Iterator<Tag> it = tags.iterator();
        while (it.hasNext()) {
            Tag tag = it.next();
            if (tag instanceof HTag) {
                it.remove();
            }
            System.out.println(tags.size());

        }

       /* for (int i = sz -1; i>0; i-- ) {
            Tag tag = tags.get(i);
            if (tag instanceof HTag) {
                tags.remove(tag);
            }*/
    }
    long slet = System.currentTimeMillis();
    //System.out.println("slet=" + (slet-end));



    /*Set<Tag> tags = new HashSet<>();

    long start = System.currentTimeMillis();
    Set<Integer> hashCodes = new HashSet<>();

        for (int i = 1; i < 20; i++) {
        HTag hTag = new HTag(1, "Hej" + i);
        tags.add(hTag);
        hashCodes.add(hTag.hashCode());

        //tags.add(new HTag(1, "jeg er hTag" + i));
        PTag pTag = new PTag("hej p" + i);
        tags.add(pTag);
        hashCodes.add(pTag.hashCode());
    }
            System.out.println("hashCodesz" = + hashCodes.size());

    long end = System.currentTimeMillis();
        System.out.println("loop1=" + (end-start));
        System.out.println(tags.size());

    int sz = tags.size();
    Iterator<Tag> it = tags.iterator();
        while (it.hasNext()) {
        Tag tag = it.next();
        if (tag instanceof HTag) {
            it.remove();
        }
        System.out.println(tags.size());
        System.out.println();

    }

    long slet = System.currentTimeMillis();
        System.out.println("slet=" + (slet-end));
    //htag2.setId(hTag.getId());
*/


}

