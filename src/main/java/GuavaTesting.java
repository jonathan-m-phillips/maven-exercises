import com.google.common.base.Splitter;
import com.google.common.math.DoubleMath;
import com.google.common.math.IntMath;

import java.util.ArrayList;

public class GuavaTesting {
    public static void main(String[] args) {
        double num = Math.PI;
        double butInt = 7;

        System.out.println(num);

        System.out.println(DoubleMath.isMathematicalInteger(num));
        System.out.println(DoubleMath.isMathematicalInteger(butInt));

        int largeNum = Integer.MAX_VALUE;
        System.out.println(largeNum + 1);
        try {
            System.out.println(IntMath.checkedAdd(largeNum, 1));
        } catch (ArithmeticException e) {
            System.err.println("That number is too big.");
        }

        String nameTag = "Hello,, ,My, Name,,, is,,, Joe!";
        ArrayList<String> cutUpTag = new ArrayList<>();
        Splitter.on(",").trimResults().omitEmptyStrings().split(nameTag).forEach(cutUpTag::add);

        System.out.println(cutUpTag.size());

        for (String s : cutUpTag) {
            System.out.println(s);
        }
    }
}
