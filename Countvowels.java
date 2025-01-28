public class Countvowels {
    
    public int countVowels(String name){

        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'a' || name.charAt(i) == 'e'
            || name.charAt(i) == 'i' || name.charAt(i) == 'o'
            || name.charAt(i) == 'u') {
                count++;
             }
                }
                return count;
    }
    public static void main(String[] args) {
        
        Countvowels cv = new Countvowels();
        System.out.println(cv.countVowels("Hello World"));
        System.out.println(cv.countVowels("Pankaj"));

    }
}
