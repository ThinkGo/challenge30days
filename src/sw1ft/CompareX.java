package sw1ft;

//i[] > 0-100 values , weight
//compare top two
//if diff diff add array
//
//Class A {
//	int returnLast (int i[]) 
//	{
//		return int;
//	}
//}
public class CompareX {
    public static void main(String[] args) {

//        reverseNumberGivenNumberAndAddBothValueIsPalindrome();
        final String input = "malayalammalayalammalayalammalayalammalayalammalayalammalayalammalayalammalayalammalayalammalayalammalayalammalayalammalayalammalayalammalayalammalayalammalayalammalayalammalayalammalayalammalayalammalayalammalayalammalayalammalayalammalayalammalayalammalayalammalayalam";
        final long l = System.currentTimeMillis();
//        final boolean isPalindrome = isPalindrome2(input);
        final boolean isPalindrome = isPalindromeV1(input);
        final long diff = System.currentTimeMillis() - l;
        System.out.println("took time="+diff +" \t" + input+" isPalindrome="+isPalindrome );

    }

    private static void reverseNumberGivenNumberAndAddBothValueIsPalindrome() {
        String line = "";
        final Integer reverseNumber = getReverseNumber(line);
        final int initialValue = Integer.parseInt(line);

        final Integer sum = initialValue + reverseNumber;
        System.out.println("input   =" +line+"\nreverse ="+reverseNumber);
        final String str = String.valueOf(sum);
        boolean palindrome = isPalindromeV2(str);
        System.out.println(sum+" is" + (palindrome? " " : " NOT ") + "a palindrome");
    }

    private static Integer getReverseNumber(String line) {
        final String s = reverseString(line);
        final Integer integer = Integer.valueOf(s);
        return integer;
    }

    private static String reverseString(String line) {
        int length = line.length();
        char[] reverseChars = new char[length];
        for (int i = 0; i < length; i++) {
            reverseChars[length -i-1]= line.toCharArray()[i];
        }
        return String.valueOf(reverseChars);
    }


    private static boolean isPalindromeNumber(String str) {
        final Integer reverseNumber = getReverseNumber(str);
        return reverseNumber == Integer.parseInt(str);
    }
    private static boolean isPalindromeV1(String str) {
        return str.equals(reverseString(str));
    }
    private static boolean isPalindromeV2(String str) {
        if (str == null || str.length() ==0) {
            return false;
        }
        final int length = str.length();
        if (length == 1) {
            return true;
        }
        final char[] toCharArray = str.toCharArray();
        for (int i = 0; i < length / 2; i++) {
            if(toCharArray[i]!=toCharArray[length-i-1]) return false;
        }
        return true;
    }
    private static int returnLast(int[] stones) {
        for (int i = 0; i < stones.length; i++) {
            int big;
            if(stones[i] > stones[i+1]){
                big=stones[i];
            }
        }
        return -1;
    }
}
