public class Main {
    public static void main(String[] args) {
        System.out.println("=== Тестирование Cache для строк ===");
        
        Cache<String> stringCache = new Cache<>(3);

        System.out.println("\n1. Добавляем элементы:");
        stringCache.add("Один");
        stringCache.add("Два");
        stringCache.add("Три");
        stringCache.display();

        System.out.println("\n2. Добавляем четвертый элемент (должен удалиться самый старый):");
        stringCache.add("Четыре");
        stringCache.display();

        System.out.println("\n3. Проверка существования элементов:");
        System.out.println("Есть ли 'Два': " + stringCache.exists("Два"));
        System.out.println("Есть ли 'Один': " + stringCache.exists("Один"));

        System.out.println("\n4. Получение первого и последнего элемента:");
        System.out.println("Первый элемент: " + stringCache.getFirst());
        System.out.println("Последний элемент: " + stringCache.getLast());

        System.out.println("\n5. Получение элементов по индексу:");
        System.out.println("Индекс 0: " + stringCache.getItemByIndex(0));
        System.out.println("Индекс 2: " + stringCache.getItemByIndex(2));
        System.out.println("Индекс 6 (несуществующий): " + stringCache.getItemByIndex(6));

        System.out.println("\n6. Удаление элементов:");
        System.out.println("Удаляем 'Два': " + stringCache.remove("Два"));
        System.out.println("Удаляем '334' " + stringCache.remove("334"));
        stringCache.display();

        System.out.println("\n=== Тестирование Cache для чисел ===");
        Cache<Integer> intCache = new Cache<>(2);

        intCache.add(10);
        intCache.add(15);
        intCache.add(20);
        intCache.display();

        System.out.println("Первый элемент: " + intCache.getFirst());
        System.out.println("Есть ли число 17: " + intCache.exists(17));
        System.out.println("Есть ли число 15: " + intCache.exists(15));

        // Дополнительные тесты
        System.out.println("\n=== Дополнительные тесты ===");
        System.out.println("Размер stringCache: " + stringCache.size());
        System.out.println("Размер intCache: " + intCache.size());
        System.out.println("stringCache пустой? " + stringCache.isEmpty());
        
        // Тест очистки
        Cache<String> testCache = new Cache<>(2);
        testCache.add("Тест");
        System.out.println("\nДо очистки:");
        testCache.display();
        testCache.clear();
        System.out.println("После очистки:");
        testCache.display();
        System.out.println("Пустой? " + testCache.isEmpty());
    }
}
