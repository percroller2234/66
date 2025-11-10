public class Main {
    public static void main(String[] argc) {
        System.out.println("Тестирование для строки:)");
        
        Cache<String> stringCache = new Cache<>(3);

        System.out.println("\n1. Добавляем:");
        stringCache.add("Одын");
        stringCache.add("Два");
        stringCache.add("Три");
        stringCache.display();


        System.out.println("\n2. Добавляем четыре");
        stringCache.add("Четыре");
        stringCache.display();

        System.out.println("\n3. Глянуть на элементы");
        System.out.println("Второй" + stringCache.exists("Два"));
        System.out.println("Первый" + stringCache.exists("Одын"));

        System.out.println("\n4. первый и последний");
        System.out.println("Первый эл" + stringCache.getFirst());
        System.out.println("Последний эл" + stringCache.getLast());

        System.out.println("\n5. индекс");
        System.out.println("Индекс 0:"+ stringCache.getItemByIndex(0));
        System.out.println("Индекс 1:"+ stringCache.getItemByIndex(2));
        System.out.println("Индекс 6:"+ stringCache.getItemByIndex(6));

        System.out.println("\n6. Удаление");
        System.out.println("Убираем второго:(" + stringCache.remote("Два"));
        System.out.println("Убираем несуществ" + stringCache.remote("Поливинилхлорид"));

        System.out.println("\n Тестируем для чисел");
        Cache<Integer> intCache = new Cache<>(2);

        intCache.add(10);
        intCache.add(15);
        intCache.add(20);
        intCache.display();

        System.out.println("Первый эл -" + intCache.getFirst());
        System.out.println("Есть ли число 17 -" + intCache.exists(17));

    }
}
