public class sum {
    public int sum(int x, int y)
    {
        return (x + y);
    }

    public in sum(int x, int y, int z)
    {
        return (x + y + z);
    }
    public double sum(double x, double y)
    {
        return (x + y);
    }
    public static void main(string args[])
    {
        sum s = new sum();
        system.out.print(s.sum(10, 20));
        system.out.print(s.sum(10,20,30));
        system.out.print(s.sum(10.5,20.5));
    }
}