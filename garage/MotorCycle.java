package garage;

public class MotorCycle extends Vehicle {
    protected String color;


    protected MotorCycle (String color) {
        super.color = "blue";
        super.regNo ="JJJ333";

    }
    protected MotorCycle (int yearOfManufacturing) {
        this.yearOfManufacturing = 2020;
    }

    protected int NumOfWheels = 2;

}
