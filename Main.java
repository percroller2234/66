public class Main {
    public static void main(String[] args) {
        // Создаём массив машин для тестирования
        Car[] cars = {
            new Car(1, "Toyota", "Camry", 2020, "Black", 25000, "A123BC"),
            new Car(2, "Honda", "Civic", 2019, "White", 22000, "B456DE"),
            new Car(3, "Toyota", "Corolla", 2021, "Red", 20000, "C789FG")
        };
        
        // Тестируем метод getCarByBrend
        Car[] toyotaCars = getCarByBrend(cars, "Toyota");
        System.out.println("Найдено машин Toyota: " + toyotaCars.length);
    }
    
    public static Car[] getCarByBrend(Car[] cars, String brend) {
        // Считаем сколько машин нужной марки
        int count = 0;
        for (Car car : cars) {
            if (car.getBrand().equals(brend)) {
                count++;
            }
        }
        
        // Создаём массив нужного размера
        Car[] result = new Car[count];
        int index = 0;
        
        // Заполняем массив
        for (Car car : cars) {
            if (car.getBrand().equals(brend)) {
                result[index] = car;
                index++;
            }
        }
        
        return result;
    }
}

