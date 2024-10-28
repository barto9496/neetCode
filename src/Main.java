public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        DuplicateInteger duplicateInteger = new DuplicateInteger();
        int[] ar = new int[4];
        ar[0] = 1;
        ar[1] = 2;
        ar[2] = 2;
        ar[3] = 3;
        System.out.println(duplicateInteger.hasDuplicate(ar));

        // ************************************* Anagram ******************************************* //
        Anagram anagram = new Anagram();
        String str1 = "listen";
        String str2 = "silent";
        System.out.println("Final anagram details: " + anagram.isAnagram(str1,str2));
    }
}

