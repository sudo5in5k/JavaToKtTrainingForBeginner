package javaFiles;

class Main {
    public static void main(String[] args) {
        // Greeting
        Greeting javaGreet = new Greeting("Java");
        javaGreet.greeting();

        System.out.println("\n-----------------\n");

        Greeting loopJavaGreet = new Greeting("Java", 3);
        loopJavaGreet.loopGreeting();

        System.out.println("\n-----------------\n");

        // Extends
        ExtendGreeting extendGreeting = new ExtendGreeting("Java8", 2);
        extendGreeting.setGesture("byebye");
        extendGreeting.gesture();

        System.out.println("\n-----------------\n");

        // Book Data
        BookData bookData = new BookData("サポーターズCoLab", "ussy", 50000);
        System.out.printf("著者: %s\n", bookData.getAuthor());
        bookData.printBook();

    }
}