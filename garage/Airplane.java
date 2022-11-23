package garage;

public class Airplane extends Vehicle {
    protected int numOfWings = 2;

    protected Airplane (String color) {
        super.color = color;
        super.regNo = "LJK565";

    }
    protected Airplane (int yearOfManufacturing) {
        this.yearOfManufacturing = 2021;
    }




}
