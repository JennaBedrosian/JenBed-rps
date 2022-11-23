package garage;

public class Car extends Vehicle{
    protected String color;

    protected Car (String color) {
        super.color = "red";
        super.regNo = "ABF654";

    }
    protected Car (int yearOfManufacturing) {
        this.yearOfManufacturing = 2021;

    }
    protected int numOfBelts = 5;
}
