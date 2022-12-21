import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Телефонный справочник

        Map<String, String> phonebook = new HashMap<>();
        phonebook.put("Максим Олегович Зайцев", "+79604523515");
        phonebook.put("Антонина Ивановна Кривошея", "+79239268510");
        phonebook.put("Семен Станиславович Крикун", "+79029540261");
        phonebook.put("Ирина Анатольевна Шевелева", "+79409563289");
        phonebook.put("Татьяна Эдуардовна Бисер", "+79239458262");
        phonebook.put("Кристина Петровна Боль", "+79604449035");
        phonebook.put("Виталий Андреевич Перевертайло", "+79029873652");
        phonebook.put("Анатолий Викторович Ломако", "+79542228304");
        phonebook.put("Ксения Сергеевна Липко", "+79983560247");
        phonebook.put("Александр Федорович Селин", "+79905598436");
        phonebook.put("Станислав Петрович Сихварт", "+79604523302");
        phonebook.put("Игорь Евгеньевич Циглер", "+79234523015");
        phonebook.put("Кристина Алексеевна Шабалина", "+79629883113");
        phonebook.put("Евгений Андреевич Потехин", "+79508463279");
        phonebook.put("Светлана Михайловна Незлобина", "+79600023515");
        phonebook.put("Никита Викторович Вельмакин", "+79029450342");
        phonebook.put("Анастасия Витальевна Грушенцова", "+79668273054");
        phonebook.put("Арина Дмитриевна Михеева", "+79609205578");
        phonebook.put("Ковалев Олег Тамерланович", "+79604623533");
        phonebook.put("Роман Валерьевич Куергешев", "+79462589173");

        Phonebook book = new Phonebook(phonebook);
        System.out.println("Телефонный справочник: ");
        for (Map.Entry<String, String> entry : phonebook.entrySet()) {
            System.out.printf("%s - %s\n", entry.getKey(), entry.getValue());
        }
        System.out.println();

        //Задание №3
        Map<String, Integer> map = new HashMap<>();

        map.put("Str1", 1);
        map.put("Str2", 2);
        map.put("Str3", 3);
        map.put("Str4", 4);
        map.put("Str5", 5);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.printf("%s: %s\n", entry.getKey(), entry.getValue());
        }
        System.out.println();

        Task3 tast3 = new Task3(map);
        tast3.putMap("Str5", 0);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.printf("%s: %s\n", entry.getKey(), entry.getValue());
        }
        System.out.println();

        //Задание №4
        Random random = new Random();
        Map<String, List<Integer>> map1 = new HashMap<>();
        int sizeMap = 5;
        int sizeList = 3;
        for(int i = 0; i <sizeMap; i++) {
            List<Integer> numbers = new ArrayList<>(sizeList);
            for(int j = 0; j<sizeList; j++) {
                numbers.add(random.nextInt(1001));
            }
            map1.put(String.valueOf(i), numbers);
        }
        System.out.println(map1);

        Map<String, Integer> newMap1 = new HashMap<>();
        for (Map.Entry<String, List<Integer>> entry : map1.entrySet()) {
            int sum = 0;
            List<Integer> numbers = entry.getValue();
            for(Integer number : numbers) {
                sum += number;
            }
            newMap1.put(entry.getKey(), sum);
        }
        Task4 tast4 = new Task4(newMap1);
        tast4.updateMap(newMap1);
        System.out.println();

        //Задание №5
        Map<Integer, String> map2 = new LinkedHashMap<>();
        map2.put(1, "А");
        map2.put(2, "В");
        map2.put(3, "В");
        map2.put(4, "Г");
        map2.put(5, "Д");
        map2.put(6, "Е");
        map2.put(7, "Ё");
        map2.put(8, "Ж");
        map2.put(9, "З");
        map2.put(10, "И");
        Task5 tast5 = new Task5(map2);
        tast5.getKeyValue(map2);
    }
}