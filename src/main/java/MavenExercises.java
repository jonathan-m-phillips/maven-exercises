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
        try {
            int userNum = Integer.parseInt(userInput);
        } catch (Exception e) {
            System.err.println("This is not a number.");
        }

        String swapCase = StringUtils.swapCase(userInput);
        System.out.println("Case-swapped: " + "'" + swapCase + "'");



    }
}
