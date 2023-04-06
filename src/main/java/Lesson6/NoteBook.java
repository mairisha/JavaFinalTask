package Lesson6;

public class NoteBook {
    String model;
    int memory;
    String color;
    int size;

    NoteBook (String model, int memory, String color, int size)
    {
        this.model = model;
        this.memory = memory;
        this.color = color;
        this.size = size;
    }

    public  int getMemory() {
        return memory;
    }
}
