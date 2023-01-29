import java.util.ArrayList;
import java.util.Random;

/* Задание 2:
Создать список целых чисел (заполнить случайными числами).
Найти минимальное, максимальное и среднее из этого списка.
 */
public class task_2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(10);
        Random random = new Random();
        for (Integer i = 0; i < 10; i++) {
            list.add(random.nextInt(20));
        }
        System.out.println(list);

        int max = list.get(0);
        int min = list.get(0);
        double sum = 0;
        
        for (Integer i : list) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        for (Integer i : list) {
            sum += i;

        }
        System.out.println("Max digit of list: " + max);
        System.out.println("Min digit of list: " + min);
        System.out.println("Average of list: "+ sum/list.size());
    }
}
