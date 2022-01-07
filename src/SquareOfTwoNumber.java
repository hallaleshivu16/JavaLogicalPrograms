import jdk.jshell.execution.Util;

import java.lang.Math;
import java.lang.*;
public class SquareOfTwoNumber {
    public static void main(String[] args) {
        double c = Double.parseDouble(args[0]);
        double result = Util.Sqrt(c);
        System.out.println("square root of " +c+" is "+result);
    }
}
