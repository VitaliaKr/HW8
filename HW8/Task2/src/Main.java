import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //todo код программы писать тут
        int[] peopleWeight = new int[5];
        for (int i = 0; i < peopleWeight.length; i++) {
            peopleWeight[i] = new Random().nextInt(60) + 40;
            System.out.println(peopleWeight[i]);
        }
        double sumWeight = 0;
        int weightCount = 0;
        for (int i = 0; i < peopleWeight.length; i++) {
            sumWeight += peopleWeight[i];
        }
        for (int i = 0; i < peopleWeight.length; i++) {
            if (peopleWeight[i] > 40 && peopleWeight[i] < 80) {
                weightCount++;
            }
        }

        System.out.println("Средний вес: " + sumWeight / peopleWeight.length);
        System.out.println("Кол-во людей от 40 до 80: " + weightCount);
    }
}
