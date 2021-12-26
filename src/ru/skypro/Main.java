package ru.skypro;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int box = 5;
        System.out.println(box);
        box = box + 3;
        System.out.println(box);
        box = box - 3;
        System.out.println(box);
        // Задание 1
        byte apples = 50;
        System.out.println("Яблоки" + apples + "кг");
        short tomatoes = 300;
        System.out.println("Помидоры" + tomatoes + "кг");
        int bananas = 3;
        System.out.println("Бананы" + bananas + "кг");
        long potatoes = 3000L;
        System.out.println("Картошка" + potatoes + "кг");
        float cucumbers = 12.23f;
        System.out.println("Огурцы" + cucumbers + "кг");
        double peppers = 15.1234;
        System.out.println("Перцы" + peppers + "кг");
        // Задание 2
        float first = 78.2f;
        float second = 82.7f;
        float result = first + second;
        System.out.println("first + second = " + result);
        float weight = 82.7f - 78.2f;
        System.out.println("Разница" + weight);
       // Задание 3
        int varAble = 5 * 80;
        System.out.println("Общий вес" + varAble);
        int milk = 105 * 2;
        System.out.println("Общий вес" + milk);
        int iceCream = 100 * 2;
        System.out.println("Общий вес" + iceCream);
        int eggs = 70 * 4;
        System.out.println("Общий вес" + eggs);
        long mix = bananas + milk + iceCream + eggs;
        System.out.println("Общий вес" + mix);
        float kg = 1090.0f / 1000;
        System.out.println("Перевести в кг" + kg);
        long grams = 7 * 1000;
        System.out.println("Переведем в граммы" + grams);
       // Задание 4
        int days = 7000 / 250;
        System.out.println("Дней" + days);
        int days1 = 7000/500;
        System.out.println("Дней1" + days1);
        int medium = (28 + 114) / 2;
        System.out.println("Дней в среднем" + medium);
       // Задание 5
        long masha = (67760 * 10) / 100;
        System.out.println("10%" + masha);
        long denis = (83690 * 10) / 100;
        System.out.println("10%" + denis);
        long kristina = (76230 * 10) / 100;
        System.out.println("10%" + kristina);
        long masha1 = 67760 * 12;
        System. out. println("Годовой доход до повышения" + masha1);
        long mashaAfter = (67760 * 12) + (6760 * 12);
        System.out.println("Годовой доход после повышения" + mashaAfter);
        long masha3 = 894240 - 813120;
        System.out.println("Разница" + masha3);
        long denis1 = 83690 * 12;
        System.out.println("Годовой доход до повышения" + denis1);
        long denisAfter = (83690 * 12) + (8369 * 12);
        System.out.println("Годовой доход после повышения" + denisAfter);
        long denis3 = 1104708 - 1004280;
        System.out.println("Разница" + denis3);
        long kristina1 = 76230 * 12;
        System.out.println("Годовой доход до повышения" + kristina1);
        long kristinaAfter = (76230 * 12) + (7623 * 12);
        System.out.println("Годовой доход после повышения" + kristinaAfter);
        long kristina3 = 1006236 - 914760;
        System.out.println("Разница" + kristina3);


    }
}