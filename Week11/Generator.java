/* *****************************************************************************
 **************************************************************************** */

public class Generator {

    public static String randomString(int L, String alpha) {
        char[] a = new char[L];
        for (int i = 0; i < L; i++) {
            int num = (int) (Math.random() * alpha.length());
            a[i] = alpha.charAt(num);
        }

        return new String(a);
    }

    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        int L = Integer.parseInt(args[1]);
        String alpha = args[2];
        for (int i = 0; i < n; i++) {
            System.out.println(randomString(L, alpha));
        }

    }
}
