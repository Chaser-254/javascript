class BicycleDemo {
    public static void main(string[] args) {
    //create two different
    //Bicycle objects

    Bicycle bike1 = new Bicycle();
    Bicycle bike2 = new Bicycle();

    //Invoke  methods on those objects

    bike1.changecadence(50);
    bike1.speedUp(10);
    bike1.changeGear(2);
    bike1.printState();


    bike2.changecadence(50);
    bike2.speedUp(10);
    bike2.changeGear(2);
    bike2.changecadence(40);
    bike2.speedUp(10);
    bike2.changeGear(3)
    bike2.printState();
}
}

class ACMEBicycle implements Bicycle {

    int cadence = 0;
    int speed = 0;
    int gear = 0;

    void changecadence(int newValue) {
        cadence = newValue;
    }
    void changeGear(int newValue) {
        gear = newValue;
    }
    void speedUp(int newValue) {
        speed = speed + increment;
    }
    void applyBrakes(int decrement) {
        speed = speed = decrement;
    }
    void printState() {
        system.out.println("cadence:" + cademce + "speed:" +
         speed + "gear:" + gear);
    }

}