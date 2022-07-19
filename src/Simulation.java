import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Simulation {
    private Integer money = 0;
    Automat product1 = new Automat("Бананочипсы", 100);
    Automat product2 = new Automat("Конфета", 75);
    Automat product3 = new Automat("Вода", 25);
    Map<String, Integer> products = new HashMap<>();

    public void printSimulation() {
        products.put(product1.getName(), product1.getPrice());
        products.put(product2.getName(), product2.getPrice());
        products.put(product3.getName(), product3.getPrice());
        System.out.printf("в Автомате доступны: %n[%s] - %s%n[%s] - %s%n[%s] - %s%n",
                product1.getName(), product1.getPrice(),
                product2.getName(), product2.getPrice(),
                product3.getName(), product3.getPrice());
    }

    public void choiseProduct() {
        System.out.printf("Монет на сумму %s %n", money);
        Scanner scn = new Scanner(System.in);
        System.out.println("Что хотите сделать?: 1-закинуть еще монет, 2-выйти?:");
        switch (scn.nextInt()) {
            case 1:
                Scanner scr = new Scanner(System.in);
                System.out.println("Введите сумму:  ");
                addMoney(scr.nextInt());
            case 2:
                break;
        }

    }

    public void choiseProduct2() {
        System.out.println("Монет на сумму: " + money);
        Scanner scanner = new Scanner(System.in);
        String water = "Воды";
        String candy = "Конфеты";
        String bananochips = "бананочипсы";
        System.out.println("Что хотите сделать:");
        while (true){

            if (money < 25){
                System.out.println("Не хватает монет!");
                choiseProduct();
            }
            if (money == 25){
                System.out.println("1 - купить воду");
            }
            if (money == 75){
                System.out.println("1 - купить воду");
                System.out.println("2 - купить конфеты");

            }
            if (money == 100){
                System.out.println("1 - купить воду");
                System.out.println("2 - купить конфеты");
                System.out.println("3 - купить бананочипсы");
            }
            System.out.println("4 - выйти");
            switch (scanner.nextInt()) {
                case 1 -> System.out.printf("Вы купили %s", water);
                case 2 -> System.out.printf("Вы купили %s", candy);
                case 3 -> System.out.printf("Вы купили %s", bananochips);
                case 4 -> System.out.println("Вы вышли!");
            }
        }

    }

    public void addMoney(int m) {
        money = m;
    }

}

