package javaFiles;

public class EnumMain {

    public static void main(String[] args) {
        ParticipantType type = ParticipantType.AGED;
        showPrice(type);
    }

    protected enum ParticipantType {
        STUDENT(900),
        NORMAL(1200),
        AGED(800);

        private int price;

        ParticipantType(int price) {
            this.price = price;
        }
    }

    private static void showPrice(ParticipantType type) {
        switch (type) {
            case STUDENT:
                System.out.printf("入館料金は%s円です", ParticipantType.STUDENT.price);
            case NORMAL:
                System.out.printf("入館料金は%s円です", ParticipantType.NORMAL.price);
            case AGED:
                System.out.printf("入館料金は%s円です", ParticipantType.AGED.price);
        }
    }
}
