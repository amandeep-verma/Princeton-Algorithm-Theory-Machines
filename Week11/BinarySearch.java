/* *****************************************************************************
Binary Search Non-Recursive
 **************************************************************************** */

public class BinarySearch {

    public static int search(String key, String[] a) {
        int low = 0;
        int high = a.length;
        int mid;

        while (high >= low) {
            mid = (low + high) / 2;
            if (a[mid].compareTo(key) > 0) {
                high = mid - 1;
            }
            else if (a[mid].compareTo(key) < 0) {
                low = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] names = {
                "alison", "amanda", "azona", "bambo", "carroas", "daref", "mpcsdf", "pdsfs"
        };

        for (int i = 0; i < names.length; i++) {
            System.out.println(search(names[i], names));
        }

    }
}
