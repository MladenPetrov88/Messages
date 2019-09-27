import java.util.Scanner;

public class Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer input = Integer.parseInt(scanner.nextLine());

        int count = input;
        while (input >= 0) {
            input = Integer.parseInt(scanner.nextLine());
            switch (input) {
                case 2:
                    System.out.print("a");
                    count--;
                    break;
                case 22:
                    System.out.print("b");
                    count--;
                    break;
                case 222:
                    System.out.print("c");
                    count--;
                    break;
                case 3:
                    System.out.print("d");
                    count--;
                    break;
                case 33:
                    System.out.print("e");
                    count--;
                    break;
                case 333:
                    System.out.print("f");
                    count--;
                    break;
                case 4:
                    System.out.print("g");
                    count--;
                    break;
                case 44:
                    System.out.print("h");
                    count--;
                    break;
                case 444:
                    System.out.print("i");
                    count--;
                    break;
                case 5:
                    System.out.print("j");
                    count--;
                    break;
                case 55:
                    System.out.print("k");
                    count--;
                    break;
                case 555:
                    System.out.print("l");
                    count--;
                    break;
                case 6:
                    System.out.print("m");
                    count--;
                    break;
                case 66:
                    System.out.print("n");
                    count--;
                    break;
                case 666:
                    System.out.print("o");
                    count--;
                    break;
                case 7:
                    System.out.print("p");
                    count--;
                    break;
                case 77:
                    System.out.print("q");
                    count--;
                    break;
                case 777:
                    System.out.print("r");
                    count--;
                    break;
                case 7777:
                    System.out.print("s");
                    count--;
                    break;
                case 8:
                    System.out.print("t");
                    count--;
                    break;
                case 88:
                    System.out.print("u");
                    count--;
                    break;
                case 888:
                    System.out.print("v");
                    count--;
                    break;
                case 9:
                    System.out.print("w");
                    count--;
                    break;
                case 99:
                    System.out.print("x");
                    count--;
                    break;
                case 999:
                    System.out.print("y");
                    count--;
                    break;
                case 9999:
                    System.out.print("z");
                    count--;
                    break;
                case 0:
                    System.out.print(" ");
                    count--;
                    break;
            }
            if (count == 0) {
                return;
            }
        }
    }
}