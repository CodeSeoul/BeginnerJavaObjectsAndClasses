package org.learnteachcode.seoul.javaclass.objects.instruments;

public class Piano {
    private int numberOfKeys;
    private int countKeysGetter;

    public Piano(int numberOfKeys) {
        this.numberOfKeys = numberOfKeys;
        this.countKeysGetter = 0;
    }

    public Piano() {
        this(82);
    }

    public int getNumberOfKeys() {
        countKeysGetter++;
        return numberOfKeys;
    }

    public int getCountKeysGetter() {
        return countKeysGetter;
    }
}
