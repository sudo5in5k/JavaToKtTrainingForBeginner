package javaFiles;

class Greeting {

    private String language;
    private int length;

    Greeting(String language) {
        this.language = language;
    }

    Greeting(String language, int length) {
        this.language = language;
        this.length = length;
    }

    void greeting() {
        System.out.printf("Hello: %s", this.language);
    }

    void loopGreeting() {
        for (int i =0; i< length; i++) {
            if (i == 0) {
                System.out.printf("%s: Hello: %s\n", i, this.language);
            }
        }
    }
}