import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class task2 {
    // 2) Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка

    public static List<Integer> getRandomList(int size) {

        Random random = new Random();
        List<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
          list.add(random.nextInt(20));
        }

        System.out.println(list.toString());
        return list;
    }

    public static void rezult(List<Integer> list) {
        int min = Collections.min(list);
        int max = Collections.max(list);
        double count = list.size();
        double sum = 0;
        
        for (Integer i : list) {
            sum += i;
        }

        double average = sum / count;

        System.out.printf("Минимальное: %d, максимальное: %d, среднее арифметичское: %.2f", min, max, average);

    }

    public static void main(String[] args) {
        rezult(getRandomList(4));
    }

}

