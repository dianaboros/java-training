package code._4_student_effort.Pairs;

public class Boot implements Shoe {
    private int size;
    private String color;

    @Override
    public int getSize(){return this.size;}

    @Override
    public String getColor(){return this.color;}

    public Boot(String color, int size){
        this.size = size;
        this.color = color;
    }
}
