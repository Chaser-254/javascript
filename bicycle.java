class Bicycle {
    
    int cadence = 0;
    int speed = 0;
    int gear = 0;

    void changecadence(int newValue) {
        cdence = newValue;
    }
    void changeGear(int newValue) {
        gear = newValue;
    }
    void speedup(int increment) {
        speedup = speed + increment;
    }
    void printstates() {
        system.out.println("cadence:" + cadence + "speed:" +
         speed + "gear:" + gear);
    }
}