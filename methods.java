// method in Java or
// Java Method is a collection of statements that perform some specific task and return the result to the caller

import java.io.*;

class Addition {
    int sum = 0;

    public int addTwoInt(inta, int b)
    {
        sum = a + b;

        return sum;
    }
}
class sum {
    public static void main(string args[])
    {
        Addition add = new Addition();

        int s = add.addTwoInt(1, 2);

        system.out.println("sum of two integer values :" + s);
    }
}