import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // Задание 1
        int[] data = new int[3];
        data[0] = 1;
        data[1] = 2;
        data[2] = 3;
        for (int i = 0; i < 3; i++) {
            System.out.println(data[i]);
        }


        // Задание 2

        double[] exep = {1.57, 7.654, 9.986};
        exep[0] = 1.57;
        for (int i = 0; i < exep.length; i++) {
            System.out.println(exep[i]);
        }


        // Задание 3
        double[] flourNumbers = {1.3, 4.2, 15.15, 22.22, 51.51, 70.70};
        flourNumbers[0] = 1.3;
        for (int i = 0; i < flourNumbers.length; i++) {
            System.out.println(flourNumbers[i]);
        }

        // Задание 4
        int[] data1 = new int[3];
        data1[0] = 1;
        data1[1] = 2;
        data1[2] = 3;
        for (int i = 0; i < 3; i++) {
            if (i == data1.length - 1) {
                System.out.print(data1[i]);
            } else {
                System.out.print(data1[i] + ", ");
            }
        }
        System.out.println(" ");
        double[] exep1 = {1.57, 7.654, 9.986};
        exep1[0] = 1.57;
        for (int a = 0; a < exep1.length; a++) {
            if (a == exep1.length - 1) {
                System.out.print(exep1[a]);
            } else {
                System.out.print(exep1[a] + " , ");
            }
        }
        System.out.print(" ");

        double[] flourNumbers1 = {1.3, 4.2, 15.15, 22.22, 51.51, 70.70};
        flourNumbers1[0] = 1.3;
        for (int b = 0; b < flourNumbers1.length; b++) {
            if (b == flourNumbers1.length - 1) {
                System.out.print(flourNumbers1[b]);
            } else {
                System.out.print(flourNumbers1[b] + " , ");
            }

        }
        System.out.println(" ");

        for (int i = data1.length - 1; i >= 0; i--) {
            System.out.print(data1[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");

        for (int i = exep1.length - 1; i >= 0; i--) {
            System.out.print(exep1[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");


        for (int i = flourNumbers1.length - 1; i >= 0; i--) {
            System.out.print(flourNumbers1[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        for (int i = exep1.length - 1; i >= 0; i--) {
            System.out.print(exep1[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");

        //Задание 4
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 != 0) {
                data[i] += 1;
            }
            System.out.println(data[i]);
        }

    }

}


