package org.learnteachcode.seoul.javaclass.objects;

import org.learnteachcode.seoul.javaclass.objects.instruments.Piano;

public class Main {
    public static void main(String[] args) {
        Piano myFirstPiano = new Piano();
        System.out.println("myFirstPiano: " + myFirstPiano);
        System.out.println("myFirstPiano NumKeys: " + myFirstPiano.getNumberOfKeys());

        Piano mySecondPiano = new Piano(164);
        System.out.println("mySecondPiano: " + mySecondPiano);
        System.out.println("mySecondPiano NumKeys: " + mySecondPiano.getNumberOfKeys());

        System.out.println("myFirstPiano: " + myFirstPiano);
        System.out.println("myFirstPiano NumKeys: " + myFirstPiano.getNumberOfKeys());
        System.out.println("Number of times we've called getNumberOfKeys: "
                + myFirstPiano.getCountKeysGetter());
    }
}
