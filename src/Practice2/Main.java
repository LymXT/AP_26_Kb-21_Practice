package Practice2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // === ЧАСТИНА 1: ІНФОРМАЦІЯ ПРО ПРИМІТИВНІ ТИПИ ДАНИХ ===
        System.out.println("=== ПРАКТИЧНА РОБОТА №2 ===");
        System.out.println("=== ІНФОРМАЦІЯ ПРО ПРИМІТИВНІ ТИПИ ДАНИХ ===\n");

        System.out.println("Тип: byte");
        System.out.println("  Розмір: " + Byte.SIZE + " біт (" + Byte.BYTES + " байт)");
        System.out.println("  Мін. значення: " + Byte.MIN_VALUE);
        System.out.println("  Макс. значення: " + Byte.MAX_VALUE + "\n");

        System.out.println("Тип: short");
        System.out.println("  Розмір: " + Short.SIZE + " біт (" + Short.BYTES + " байт)");
        System.out.println("  Мін. значення: " + Short.MIN_VALUE);
        System.out.println("  Макс. значення: " + Short.MAX_VALUE + "\n");

        System.out.println("Тип: int");
        System.out.println("  Розмір: " + Integer.SIZE + " біт (" + Integer.BYTES + " байт)");
        System.out.println("  Мін. значення: " + Integer.MIN_VALUE);
        System.out.println("  Макс. значення: " + Integer.MAX_VALUE + "\n");

        System.out.println("Тип: long");
        System.out.println("  Розмір: " + Long.SIZE + " біт (" + Long.BYTES + " байт)");
        System.out.println("  Мін. значення: " + Long.MIN_VALUE);
        System.out.println("  Макс. значення: " + Long.MAX_VALUE + "\n");

        System.out.println("Тип: float");
        System.out.println("  Розмір: " + Float.SIZE + " біт (" + Float.BYTES + " байт)");
        System.out.println("  Мін. значення: " + Float.MIN_VALUE);
        System.out.println("  Макс. значення: " + Float.MAX_VALUE + "\n");

        System.out.println("Тип: double");
        System.out.println("  Розмір: " + Double.SIZE + " біт (" + Double.BYTES + " байт)");
        System.out.println("  Мін. значення: " + Double.MIN_VALUE);
        System.out.println("  Макс. значення: " + Double.MAX_VALUE + "\n");

        System.out.println("Тип: char");
        System.out.println("  Розмір: " + Character.SIZE + " біт (" + Character.BYTES + " байт)");
        System.out.println("  Мін. числове значення: " + (int) Character.MIN_VALUE);
        System.out.println("  Макс. числове значення: " + (int) Character.MAX_VALUE + "\n");

        System.out.println("Тип: boolean");
        System.out.println("  Розмір: залежить від реалізації JVM");
        System.out.println("  Можливі значення: " + Boolean.TRUE + ", " + Boolean.FALSE + "\n");

        // === ЧАСТИНА 2: ВВЕДЕННЯ ТА КОНВЕРТАЦІЯ РЯДКІВ ===
        System.out.println("=== ВВЕДЕННЯ ТА КОНВЕРТАЦІЯ ДАНИХ ===");
        Scanner scanner = new Scanner(System.in);

        // Byte
        System.out.print("Введіть ціле число для типу byte (-128..127): ");
        String byteInput = scanner.nextLine();
        byte byteVal = Byte.parseByte(byteInput);
        System.out.println("Результат (byte): " + byteVal);

        // Short
        System.out.print("Введіть ціле число для типу short (-32768..32767): ");
        String shortInput = scanner.nextLine();
        short shortVal = Short.parseShort(shortInput);
        System.out.println("Результат (short): " + shortVal);

        // Int
        System.out.print("Введіть ціле число для типу int: ");
        String intInput = scanner.nextLine();
        int intVal = Integer.parseInt(intInput);
        System.out.println("Результат (int): " + intVal);

        // Long
        System.out.print("Введіть ціле число для типу long: ");
        String longInput = scanner.nextLine();
        long longVal = Long.parseLong(longInput);
        System.out.println("Результат (long): " + longVal);

        // Float
        System.out.print("Введіть дробове число для типу float (наприклад, 12.5): ");
        String floatInput = scanner.nextLine();
        float floatVal = Float.parseFloat(floatInput);
        System.out.println("Результат (float): " + floatVal);

        // Double
        System.out.print("Введіть дробове число для типу double (наприклад, 123.456): ");
        String doubleInput = scanner.nextLine();
        double doubleVal = Double.parseDouble(doubleInput);
        System.out.println("Результат (double): " + doubleVal);

        // Boolean
        System.out.print("Введіть логічне значення (true або false): ");
        String booleanInput = scanner.nextLine();
        boolean boolVal = Boolean.parseBoolean(booleanInput);
        System.out.println("Результат (boolean): " + boolVal);

        // Char
        System.out.print("Введіть символ для типу char: ");
        String charInput = scanner.nextLine();
        char charVal = charInput.charAt(0);
        System.out.println("Результат (char): " + charVal);

        scanner.close();
        System.out.println("\nПрактична робота №2 успішно виконана!");
    }
}