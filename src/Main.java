import java.util.Scanner;
import ru.netology.service.CustomsService;

public class Main  {
    public static void main(String[] args) {
        System.out.println("Приветствую тебя, пользователь! Но кажется, я неправильно понял условия задачи...");
        System.out.println();
        System.out.println("Программа расчета пошлины");
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите цену товара (в руб.): ");
        int price = scanner.nextInt();
        System.out.print("Введите вес товара (в кг.):   ");
        int weight = scanner.nextInt();
        int result = CustomsService.calculateCustoms(price, weight);
        System.out.println("Размер пошлины (в руб.) составит: " + result);
    }
}
