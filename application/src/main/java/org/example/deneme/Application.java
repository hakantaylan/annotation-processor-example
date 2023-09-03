package org.example.deneme;

public class Application {

    public static void main(String[] args) {
        StudentWithGetter studentWithGetter = new StudentWithGetter();
        System.out.println(studentWithGetter.name());
        System.out.println(studentWithGetter.age());
    }
}
