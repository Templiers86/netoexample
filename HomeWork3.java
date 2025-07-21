import java.util.Scanner;

public class HomeWork3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ну привет.ХодЮт тут, ходЮт!!!");

        System.out.println("Введите цену товара (в руб.):");
        int price = scanner.nextInt();

        System.out.println("Введите вес товара (в кг.):");
        int weight = scanner.nextInt();

        int dudy = calculateCustoms(price, weight);
        System.out.println("Размер пошлины (в руб.)" + dudy);
    }

        public static int calculateCustoms(int price, int weight) {
        int result = price + weight * 100;
        return result;

    }


}







