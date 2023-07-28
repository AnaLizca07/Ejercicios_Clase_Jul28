package constructor;

public class MainCar {
    public static void main(String[] args) {
        Car car = new Car( "12as",12);
        Car car1 = new Car("qw12",123);

        car.setPlate("xxx1234");
        System.out.println(car.getPlate());
    }
}
