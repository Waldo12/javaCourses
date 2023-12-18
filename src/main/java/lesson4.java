import java.util.Arrays;
import java.util.Scanner;

public class lesson4 {

    public static void main(String[] args)
    {
    System.out.println(getPow());

    int[] array = {1,2,3,5,4,3,2,1,2,3,5};
    int b = 2;

    System.out.println("Є масив:" + Arrays.toString(array) + " і зараз ми будемо рахувати в ньому скільки повторюється число " + b + " = " + counterCatch(array, b) + " рази");

    }

    // Завдання 1. Напишите метод, например public static int getSum(int a) и перегрузите его 6 раз,
    // т.е. у вас должно получиться всего 6 методов с одинаковым названием, но разным количеством атрибутов и разными типами данных

    public static int getSum (int a){
        return a = 300;
    }

    public static int getSum (int a, int b){
        return a + b;
    }

    public static int getSum (int a, double b){
        return (int) (b - a);
    }

    public static int getSum (int a, int b, int c){
        return a * b + c;
    }

    public static double getSum (double a, double b){
        return a / b;
    }

    public static String getSum (String a){
        return a = "Smth went wrong";
    }

     //Завдання 2. Написать метод который возвращает куб числа и вывести на экран.
    // Можно использовать метод возведения числа в степень в библиотеке Math, метод называется pow. Либо самостоятельно написать логику

    public static double getPow (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введть число яке хочете возвести в куб: ");
        double a = scanner.nextInt();
        double result = Math.pow(a,3);
        return result;
    }

    //Завдання 3. Создайте массивы int[] со значениями [1,2,3,5,4,3,2,1,2,3,5] - далее нужно создать метод в который принимает некое число и массив,
    // суть в том что бы когда вызывался метод и подставлялась, например цифра 2, метод вел подсчет какое количество дубликата.
    // Например counterCatch(array, 2) -> должен вернуть количество повторений цифры 2 в массиве array

    public static int counterCatch (int[] array, int b)
    {
        int dublicateCounter = 0;

    for (int i = 0; i < array.length; i++)
    {
        if (array[i] == b) { 
            
            dublicateCounter++;
        }
    }
    return dublicateCounter;
    }

}


