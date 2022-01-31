import java.util.*;

public class JavaCore4 {
    public static void main(String[] args) {


        String[] words = {"hello", "allo", "bingo",};
        HashMap<String, Integer> result = new HashMap<>();

        for (String word : words) {
            if (!result.containsKey(word)) {
                result.put(word, 1);
            } else {
                result.put(word, result.get(word) + 1);
            }
        }
        for (Map.Entry<String, Integer> element : result.entrySet()) {
            System.out.println(element.getKey() + " " + element.getValue());
        }
        String[] newWords = {"hello", "allo", "aloha",};
        HashSet<String> hashSet = new HashSet<>();
        List<String> list = Arrays.asList(newWords);
        hashSet.addAll(list);
        System.out.println(hashSet);

        System.out.println("_________");
        Phone telephone = new Phone();

        telephone.init();
        System.out.println("________");
        System.out.println(telephone.get("Ivanov1"));

    }


}
