/**
 * JavaCore. HomeWork4
 *
 * @author Egor Vyatkin
 * @version 14.12.2021
 */
class HomeWork4 {

    public static void main(String[] args) {
        task1();
        task2();
    }

    private static void task1() {
        Map<String, Integer> hm = new HashMap<>();
        String[] words = {
            "Tree", "Orange", "Apple",
            "Shoe", "Snow", "Master",
            "Bench", "Сhair", "Window",
            "Door", "Time", "Tree",
            "Bench", "Snow", "Master",
            "Сhair", "Window", "Door", "Bench"
        };

        for (int i = 0; i < words.length; i++) {
            if (hm.containsKey(words[i]))
                hm.put(words[i], hm.get(words[i]) + 1);
            else
                hm.put(words[i], 1);
        }
        System.out.println(hm);
    }

    private static void task2() {
        Directory directory = new Directory();
        
        directory.add("Ivanov", "89129835625");
        directory.add("Ivanov", "89194555888");
        directory.add("Petrov", "89215685147");
        directory.add("Petrov", "88003004021");
        directory.add("Ivanov", "89223526584");
        directory.add("Sidorov", "89211415456");
        directory.add("Petrov", "89194558965");
        directory.add("Noskov", "89195684582");
        directory.add("Sidorov", "89175485658");

        System.out.println(directory.get("Ivanov"));
        System.out.println(directory.get("Sidorov"));
        System.out.println(directory.get("Petrov"));
        System.out.println(directory.get("Noskov"));
    }


class Directory {
    private Map<String, List<String>> directory_hm = new HashMap<>();
    private List<String> phone_number_list;

    public void add(String surname, String phone_number) {
        if (directory_hm.containsKey(surname)) {
            phone_number_list = directory_hm.get(surname);
            phone_number_list.add(phone_number);
            directory_hm.put(surname, phone_number_list);
        } else {
            phone_number_list = new ArrayList<>();
            phone_number_list.add(phone_number);
            directory_hm.put(surname, phone_number_list);
        }
    }

        public List<String> get(String surname) {
            return directory_hm.get(surname);
        }

    }

}
