import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Simulation {
    private Integer money = 0;
    Automat product1 = new Automat("�����������", 100);
    Automat product2 = new Automat("�������", 75);
    Automat product3 = new Automat("����", 25);
    Map<String, Integer> products = new HashMap<>();

    public void printSimulation() {
        products.put(product1.getName(), product1.getPrice());
        products.put(product2.getName(), product2.getPrice());
        products.put(product3.getName(), product3.getPrice());
        System.out.printf("� �������� ��������: %n[%s] - %s%n[%s] - %s%n[%s] - %s%n",
                product1.getName(), product1.getPrice(),
                product2.getName(), product2.getPrice(),
                product3.getName(), product3.getPrice());
    }

    public void choiseProduct() {
        System.out.printf("����� �� ����� %s %n", money);
        Scanner scn = new Scanner(System.in);
        System.out.println("��� ������ �������?: 1-�������� ��� �����, 2-�����?:");
        switch (scn.nextInt()) {
            case 1:
                Scanner scr = new Scanner(System.in);
                System.out.println("������� �����:  ");
                addMoney(scr.nextInt());
            case 2:
                break;
        }

    }

    public void choiseProduct2() {
        System.out.println("����� �� �����: " + money);
        Scanner scanner = new Scanner(System.in);
        String water = "����";
        String candy = "�������";
        String bananochips = "�����������";
        System.out.println("��� ������ �������:");
        while (true){

            if (money < 25){
                System.out.println("�� ������� �����!");
                choiseProduct();
            }
            if (money == 25){
                System.out.println("1 - ������ ����");
            }
            if (money == 75){
                System.out.println("1 - ������ ����");
                System.out.println("2 - ������ �������");

            }
            if (money == 100){
                System.out.println("1 - ������ ����");
                System.out.println("2 - ������ �������");
                System.out.println("3 - ������ �����������");
            }
            System.out.println("4 - �����");
            switch (scanner.nextInt()) {
                case 1 -> System.out.printf("�� ������ %s", water);
                case 2 -> System.out.printf("�� ������ %s", candy);
                case 3 -> System.out.printf("�� ������ %s", bananochips);
                case 4 -> System.out.println("�� �����!");
            }
        }

    }

    public void addMoney(int m) {
        money = m;
    }

}

