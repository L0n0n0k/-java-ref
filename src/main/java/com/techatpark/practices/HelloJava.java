package com.techatpark.practices;

public class HelloJava {
    /**
     * Reverse Given String.
     * @param s
     * @return r
     */
    public String[] reverse(final String[] s) {
        int l = s.length;
        // Check if number of words is even
        if (l % 2 == 0) {

            // Find the middle word
            int j = l / 2;

            // Starting from the middle
            // start swapping words at
            // jth position and l-1-j position
            while (j <= l - 1) {
                String temp;
                temp = s[l - j - 1];
                s[l - j - 1] = s[j];
                s[j] = temp;
                j += 1;
            }
        } else {

            // Find the middle word
            int j = (l / 2) + 1;

            // Starting from the middle start
            // swapping the words at jth
            // position and l-1-j position
            while (j <= l - 1) {
                String temp;
                temp = s[l - j - 1];
                s[l - j - 1] = s[j];
                s[j] = temp;
                j += 1;
            }
        }

        // Return the reversed sentence
        return s;
    }
    public static void main(String... args) {
        HelloJava reverser = new HelloJava();
        String s = "i like this program very much";
        String[] words = s.split("\\s");

        words = reverser.reverse(words);

        s = String.join(" ", words);

        System.out.println(s);
}
