import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
        test5();
        task1();
        task2();
        task3();
        task4();
    }

    public static void test1() {
        System.out.println("Тестовые задачи 1");
        int[] bigBux = {5, 6, 12};
        System.out.println(bigBux[0]);
    }

    public static void test2() {
        System.out.println("Тестовые задачи 2");
        int[] weights = new int[12];
        weights[0] = 90;
        int januaryWeight = weights[0];
        System.out.println(januaryWeight);
        System.out.println(weights[0]);
        System.out.println(weights[4]);
        int january = 0;
        System.out.println(weights[january]);
    }

    public static void test3() {
        System.out.println("Тестовые задачи 3");
        int[] weights = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
        weights[0] = 90;
        for (int i = 0; i < weights.length; i++) {
            System.out.println(weights[i]);
        }
    }

    public static void test4() {
        System.out.println("Тестовые задачи 4");
        int[] arr = new int[10];
        for (int index = 0; index < arr.length; index++) {
            if (index == arr.length - 1) {
                System.out.println(arr[index]);
                break;
            }
            System.out.print(arr[index] + " ");
        }
    }

    public static void test5() {
        System.out.println("Тестовые задачи 5");
        int[] arr = new int[10];
        System.out.println(Arrays.toString(arr));
    }

    public static void task1() {
        System.out.println("Задание 1");
        int[] array1 = new int[3];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = i + 1;
        }
        System.out.println(Arrays.toString(array1));
//        Можно и так, но вариант выше по приятней.
//        array1[0] = 1;
//        array1[1] = 2;
//        array1[2] = 3;
//        System.out.println(Arrays.toString(array1));

        float[] array2 = new float[]{1.57f, 7.654f, 9.986f};
        System.out.println(Arrays.toString(array2));

        double[] array3 = new double[6];
        array3[0] = 55;
        array3[1] = 99;
        array3[2] = 0.123;
        array3[3] = 666.999;
        array3[4] = 0.25;
        array3[5] = 51.225;
        System.out.println(Arrays.toString(array3));
    }

    public static void task2() {
        //Тут либо уже как в первой задаче я сделал через Arrays.toString(), что намного удобнее/ Либо вот так.
        System.out.println("Задача 2");
        int[] array4 = new int[3];
        for (int i = 0; i < array4.length; i++) {
            array4[i] = i + 1;
            if (i == array4.length - 1) {
                System.out.println(array4[i]);
                break;
            }
            System.out.print(array4[i] + ", ");
        }
        float[] array5 = new float[]{1.57f, 7.654f, 9.986f};
        for (int i1 = 0; i1 < array5.length; i1++) {
            if (i1 == array5.length - 1) {
                System.out.println(array5[i1]);
                break;
            }
            System.out.print(array5[i1] + ", ");
        }
        double[] array6 = new double[6];
        array6[0] = 55;
        array6[1] = 99;
        array6[2] = 0.123;
        array6[3] = 666.999;
        array6[4] = 0.25;
        array6[5] = 51.225;
        for (int i2 = 0; i2 < array6.length; i2++) {
            if (i2 == array6.length - 1) {
                System.out.println(array6[i2]);
                break;
            }
            System.out.print(array6[i2] + ", ");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] array7 = new int[3];
        for (int i = 2; i < array7.length; i = i - 1) {
            array7[i] = i + 1;
            if (i == array7.length - 3) {
                System.out.println(array7[i]);
                break;
            }
            System.out.print(array7[i] + ", ");
        }
        float[] array8 = new float[]{1.57f, 7.654f, 9.986f};
        for (int i1 = 2; i1 < array8.length; i1 = i1 - 1) {
            if (i1 == array8.length - 3) {
                System.out.println(array8[i1]);
                break;
            }
            System.out.print(array8[i1] + ", ");
        }
        double[] array9 = {55, 99 ,0.123, 666.999, 0.25, 51.225};
        for (int i2 = array9.length - 1; i2 > 0; i2--) {
            System.out.print(array9[i2]);
            if (i2 != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

        public static void task4() {
            System.out.println("Задание 4");
            int[] array1 = {1, 2, 3};
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] % 2 != 0) {
                    array1[i]++;
                }
            }
            System.out.println(Arrays.toString(array1));
        }
}