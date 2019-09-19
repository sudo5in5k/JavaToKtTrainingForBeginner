package javaFiles;

public class ExtendGreeting extends Greeting {

    public void setGesture(String gesture) {
        this.gesture = gesture;
    }

    private String gesture;

    ExtendGreeting(String language) {
        super(language);
    }

    ExtendGreeting(String language, int length) {
        super(language, length);
    }

    void gesture() {
        System.out.println(gesture);
    }
}
