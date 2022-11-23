package garage;

public class Boat extends Vehicle {


    protected Boat (String color) {
        super.color = color;
        super.regNo = "HGH717";

    }

    protected Boat (int yearOfManufacturing) {
        this.yearOfManufacturing = 2021;
    }

    protected int NumOfPropeller = 2;


}
