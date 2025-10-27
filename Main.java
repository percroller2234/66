import com.sibsutis.devices.Device;
import com.sibsutis.devices.PersonalComputer;
import com.sibsutis.devices.Phone;

public class Main {
    public static void main(String[] args) {
        // Создаём устройства
        Device pc1 = new PersonalComputer(1, 50000, "192.168.1.100");
        Device pc2 = new PersonalComputer(2, 45000);
        Device phone1 = new Phone(3, 30000, "192.168.1.101");
        Device phone2 = new Phone(4, 25000);
        
        // Тестируем методы
        System.out.println("=== Информация об устройствах ===");
        System.out.println(pc1.sprint());
        System.out.println(pc2.sprint());
        System.out.println(phone1.sprint());
        System.out.println(phone2.sprint());
        
        // Тестируем getDeviceType
        System.out.println("\n=== Типы устройств ===");
        System.out.println("Тип pc1: " + pc1.getDeviceType());
        System.out.println("Тип phone1: " + phone1.getDeviceType());
        
        // Тестируем equals
        System.out.println("\n=== Проверка equals ===");
        System.out.println("pc1 equals pc2: " + pc1.equals(pc2));
        System.out.println("phone1 equals phone1: " + phone1.equals(phone1));
        
        // Тестируем split
        System.out.println("\n=== Метод split() ===");
        System.out.println("pc1.split(): " + pc1.split());
        System.out.println("phone1.split(): " + phone1.split());
    }
}
