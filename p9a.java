class dec{
    static boolean checkYear(int year)
    {
        if (year % 400 == 0)
            return true;

        if (year % 100 == 0)
            return false;

        if (year % 4 == 0)
            return true;
        return false;
    }
}
class p9a extends dec
{
    public static void main(String[] args)
    {
        int year = 2020;
        System.out.println( checkYear(2500)? "Leap Year" :
                "Not a Leap Year" );
    }
}