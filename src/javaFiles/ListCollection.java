package javaFiles;

import java.util.ArrayList;

public class ListCollection {

    public static void main(String[] args) {
        printSkillList();

        printResourceArrayList();
    }

    private static void printSkillList() {
        // forEach
        for (String skill : getSkillList()) {
            System.out.println(skill);
        }
    }

    private static String[] getSkillList() {
        // 配列
        String[] skills = new String[5];
        skills[0] = "Java";
        skills[1] = "COBOL";
        skills[2] = "PHP";
        skills[3] = "BASIC";
        skills[4] = "Perl";
        return skills;
    }

    private static void printResourceArrayList() {
        getResourceArrayList().forEach(System.out::println);
    }

    private static ArrayList<Integer> getResourceArrayList() {
        // コレクション
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        return arrayList;
    }
}
