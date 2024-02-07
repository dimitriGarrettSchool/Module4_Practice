public class Problem4
{
    public static void call()
    {
        double balance = 1000.0;

        for (int i = 0; i < 3; ++i)
        {
            balance *= 1.05;
        }

        System.out.println(balance);
    }
}
