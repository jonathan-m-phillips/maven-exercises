import com.google.common.base.Splitter;
import com.google.common.math.DoubleMath;
//import org.apache.commons.codec.binary.StringUtils;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Array;
import java.util.*;

public class MavenExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter something: ");
        String userInput = scan.nextLine();

        boolean valid = false;
        do {
            if (StringUtils.isNumeric(userInput)) {
                System.out.print("This is a number. Try again. \nEnter anything below:\n");
                userInput = scan.nextLine();
            } else {
                valid = true;
            }
        } while (!valid);

        String swapCase = StringUtils.swapCase(userInput);
        System.out.println("Case-swapped: " + "'" + swapCase + "'");

        String reverseString = StringUtils.reverse(userInput);
        System.out.println(userInput + " reversed: " + "'" + reverseString + "'");

        String reverseSwapCase = StringUtils.reverse(swapCase);
        System.out.println("Reversed and case-swapped: " + "'" + reverseSwapCase + "'");

    }
}
