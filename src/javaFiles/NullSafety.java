package javaFiles;

public class NullSafety {

    public static void main(String[] args) {
        Integer age = 10;
        System.out.println(age.compareTo(20));
        age = null;
        //if (age == null) return;
        System.out.println(age.compareTo(20));
    }
}
