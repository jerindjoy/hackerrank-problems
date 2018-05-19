package www.hackerrank.com;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Kangaroo {

    static String kangaroo(int x1, int v1, int x2, int v2) {
        int rv = v1-v2;
        int rx = x1-x2;
        if((rv > 0 && rx > 0) || (rv < 0 && rx < 0) || (rx == 0 && rv!=0) || (rv==0 && rx!=0)) {
            return "NO";
        }
        else {
            if(rx%rv == 0)
                return "YES";
            else
                return "NO";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}