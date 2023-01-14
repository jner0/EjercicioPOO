class Main {

    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        Car car = new Car("AMQ123", new Account("Jose Nemecio", "AND123"));
        car.passenger = 4;
        car.printDataCar();

        Car car2 = new Car("AMQ222", new Account("Domenica Rodrigyez", "AND456"));
        car2.passenger = 3;
        car2.printDataCar();
    }
}