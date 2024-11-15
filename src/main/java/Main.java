

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> autoMap = new HashMap<>();
        for (int i = 0; i < 3; i++) {
            System.out.println("Введите название: ");
            String name = scanner.next();
            o:
            while (true) {
                int speed;
                System.out.println("Введите скорость: ");
                if (scanner.hasNextInt()) {
                    speed = scanner.nextInt();

                    if (Races.speedLimit(speed)) {
                        autoMap.put(name, speed);
                        break o;
                    } else {
                        System.out.println("Неправильная скорость");


                    }

                } else {
                    System.out.println("Неправильное значение");
                    scanner.next();
                }


            }
        }
        System.out.println(autoMap);
        List<Integer> l = autoMap.values().stream().sorted().toList();
        Integer lMax = l.get(l.size() - 1);
        String autoSpeedMax = "";


        for (Map.Entry<String, Integer> entry : autoMap.entrySet()) {
            if (Objects.equals(entry.getValue(), lMax)) {
                autoSpeedMax = entry.getKey();

            }
        }
        System.out.println("Самая быстрая машина: " + autoSpeedMax);

    }
}

