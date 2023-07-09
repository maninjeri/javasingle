package org.msgin.design.pattern.singleton;

public class EarlySingleton {

    private static EarlySingleton instance = new EarlySingleton();

    private Integer count = 0;

    private EarlySingleton(){
        count = ++count;
    }

    public static EarlySingleton getInstance() {
        System.out.println("Count = " + instance.count);
        return instance;
    }

    public static void main(String[] args) {
        EarlySingleton firstSingleton = EarlySingleton.getInstance();
        EarlySingleton secondSingleton = EarlySingleton.getInstance();
        System.out.println("firstSingleton : count = " + firstSingleton.count);
        System.out.println("secondSingleton : count = " + secondSingleton.count);

        System.out.println("hashcode of firstSingleton " + firstSingleton.hashCode());
        System.out.println("hashcode of secondSingleton " + secondSingleton.hashCode());

        if(firstSingleton==secondSingleton) {
            System.out.println("firstSingleton is same as secondSingleton");
        } else {
            System.out.println("firstSingleton is not same as secondSingleton");
        }
    }
}
