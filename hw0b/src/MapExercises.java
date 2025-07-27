import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapExercises {
    /** Returns a map from every lower case letter to the number corresponding to that letter, where 'a' is
     * 1, 'b' is 2, 'c' is 3, ..., 'z' is 26.
     */
    public static Map<Character, Integer> letterToNum() {
        // TODO: Fill in this function.
        Map<Character, Integer> treeMap = new TreeMap<>();
        for (int i = 97; i <= 122; i++) {
            char ch = (char) i; // translate ascii code to characters
            treeMap.put(ch, i - 96);
        }

        return treeMap;
    }

    /** Returns a map from the integers in the list to their squares. For example, if the input list
     *  is [1, 3, 6, 7], the returned map goes from 1 to 1, 3 to 9, 6 to 36, and 7 to 49.
     */
    public static Map<Integer, Integer> squares(List<Integer> nums) {
        // TODO: Fill in this function.
        Map<Integer, Integer> squareMap = new TreeMap<>();
        for (Integer num : nums) { // here you need to specify the type of elements that the collection contains in Java
            int square = (int)Math.pow(num, 2); // the type of return value is double
            squareMap.put(num, square);
        }

        return squareMap;
    }

    /** Returns a map of the counts of all words that appear in a list of words. */
    public static Map<String, Integer> countWords(List<String> words) {
        // TODO: Fill in this function.
        Map<String, Integer> countMap = new TreeMap<>();
        for (String word : words) {
//            int sum = 0;
//            for (String wordSub : words) {
//                if (wordSub.contains(word)) {
//                    sum++;
//                }
//            }
//            countMap.put(word, sum);
            countMap.put(word, countMap.getOrDefault(word, 0) + 1);
        }
        return countMap;
    }
}
