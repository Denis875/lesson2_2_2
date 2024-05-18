package web.model;

public class Car {
    private String motor;
    private String color;
    private int horsepower;

    public Car(String motor, String color, int horsepower) {
        this.motor = motor;
        this.color = color;
        this.horsepower = horsepower;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }
}
