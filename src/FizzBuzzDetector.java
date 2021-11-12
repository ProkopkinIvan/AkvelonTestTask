import java.util.*;

public class FizzBuzzDetector
{
    public static void main(String[]args) {
        getOverlappings();
        }

    public static void getOverlappings () {
        String s = new Scanner(System.in).useDelimiter("\\z").next();
        String[] words = s.split("\\s+");
        int count= 0;
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("[^\\w]", "");
        }
        for (int j = 0; j < words.length; j++) {
            if (((j+1) % 3 == 0) && ((j+1) % 5 == 0) )  {
                count++;
                System.out.print("FizzBuzz" + " ");
            } else if (((j+1) % 3 == 0) ) {
                count++;
                System.out.print("Fizz" + " ");
            } else if (((j+1) % 5 == 0)) {
                count++;
                System.out.print("Buzz" + " ");
            }
            else {
                System.out.print(words[j] + " ");
            }
        }

        System.out.println("count is" + " " + count);

    }
}

