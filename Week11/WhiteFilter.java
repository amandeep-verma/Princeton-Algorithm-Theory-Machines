/* *****************************************************************************

 **************************************************************************** */

public class WhiteFilter {

    private static int search(String key, String[] words) {
        for (int i = 0; i < words.length; i++) {
            if (key.compareTo(words[i]) == 0) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        In f = new In(args[0]);
        String[] words = f.readAllStrings();
        while (!StdIn.isEmpty()) {
            String key = StdIn.readString();
            if (search(key, words) != -1)
                System.out.println(key);
        }
    }
}
