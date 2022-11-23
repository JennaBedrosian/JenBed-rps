package garage;

public class Bus extends Vehicle {
    protected String color;

    protected Bus (String color) {
        super.color = "yellow";
        super.regNo ="KTR898";

    }
    protected Bus (int yearOfManufacturing) {
        this.yearOfManufacturing = 2022;
    }

    protected int NumOfSeats = 32;

}
