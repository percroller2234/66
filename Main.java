public static void main(String[] args) {
    // Создаём массив машин для тестирования
    Car[] cars = {
        new Car(1, "Toyota", "Camry", 2020, "Black", 25000, "A123BC"),
        new Car(2, "Honda", "Civic", 2019, "White", 22000, "B456DE"),
        new Car(3, "Toyota", "Corolla", 2021, "Red", 20000, "C789FG"),
        new Car(4, "Toyota", "RAV4", 2018, "Blue", 28000, "D012HI")
    };
    
    // Тестируем метод getCarByBrend
    Car[] toyotaCars = getCarByBrend(cars, "Toyota");
    System.out.println("Найдено машин Toyota: " + toyotaCars.length);
    
    // Тестируем метод getCarByBrendAndYearOperational
    Car[] oldToyotaCars = getCarByBrendAndYearOperational(cars, "Toyota", 3);
    System.out.println("Найдено машин Toyota старше 3 лет: " + oldToyotaCars.length);
}
