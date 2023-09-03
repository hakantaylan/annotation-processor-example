package org.example.deneme;

import org.example.deneme.data.StudentWithGetter;

public class Application {

    public static void main(String[] args) {
        StudentWithGetter studentWithGetter = new StudentWithGetter();
        System.out.println(studentWithGetter.name());
        System.out.println(studentWithGetter.age());
    }
}
