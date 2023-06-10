package proj;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Romb romb = new Romb(2, 3);
        System.out.println("Высота: " + romb.getHeight());
        System.out.println("Длинна стороны: " + romb.getBase());
        System.out.println("Площадь: " + romb.getArea());
        System.out.println("Перекрию: " + romb.getPerimeter());
        System.out.println("Введите длинну ромба: ");
        int length = scanner.nextInt();
        System.out.println("Введите высоту: ");
        int height = scanner.nextInt();
        System.out.println("Выбранные значения:");
        System.out.println("Длинна: " + length);
        System.out.println("Высота: " + height);
        System.out.println("Введите длинну ромба: ");
        int a = scanner.nextInt();
        System.out.println("Введите высоту: ");
        int b = scanner.nextInt();
        romb = new Romb(a, b);

        romb.setBase(length);
        romb.setHeight(height);
        System.out.println("Ромб после изменения:");
        System.out.println("Высота: " + romb.getHeight());
        System.out.println("Длинна стороны: " + romb.getBase());
        System.out.println("Площадь: " + romb.getArea());
        System.out.println("Перекрию: " + romb.getPerimeter());
        // эта прПРРЫЛРПЫРЛ
    }
}

