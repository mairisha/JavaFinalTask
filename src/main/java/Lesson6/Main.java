package Lesson6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<NoteBook> n = new ArrayList<NoteBook>();
        n.add(new NoteBook("Aser", 64, "red", 16));
        n.add(new NoteBook("Aser", 64, "red", 16));
        n.add(new NoteBook("MB", 356, "black", 20));
        n.add(new NoteBook("Asus", 322, "blue", 15));
        n.add(new NoteBook("Benq", 500, "green", 14));

        System.out.println("перед сортировкой");
        System.out.println("Model"
                + " "
                + "Memory"
                + " "
                + "Color"
                + " "
                + "Size");
        for (NoteBook noteBook : n) {
            System.out.println(noteBook.model + " "
                    + noteBook.memory + " "
                    + noteBook.color + " "
                    + noteBook.size);
        }
        System.out.println();


        var result = new ArrayList<NoteBook>();

        for (NoteBook noteBook : n) {

            if (noteBook.getMemory() > 10) {

                result.add(noteBook);


            }
        }
        System.out.println(result);
    }
}