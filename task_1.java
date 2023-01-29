import java.util.ArrayList;
import java.util.Random;

/* Задание 1.
Создать список целых чисел (заполнить случайными числами), удалить из списка четные числа. */

/**
 * task_1
 */
public class task_1 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(10);
        ArrayList<Integer> listNew = new ArrayList<Integer>();
        Random random = new Random();
        for (Integer i = 0; i < 10; i++) {
            list.add(random.nextInt(10));
        }
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)%2 != 0){
                listNew.add(list.get(i));
            }
        }
        System.out.println(listNew);
    }
}
