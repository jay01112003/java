interface P1
{
    int I = 1;
    void showI();
}
interface P2
{
    int J = 2;
    void showJ();
}
interface P12 extends P1, P2
{
    int K = 3;
    void showK();
}
class Q implements P12
{
    public void showI()
    {
        System.out.println("I : " + I);
    }

    public void showJ()
    {
        System.out.println("J : " + J);
    }
    public void showK()
    {
        System.out.println("K : " + K);
    }
}
 class p9b
{
    public static void main(String[] args)
    {
        Q obj = new Q();
        obj.showI();
        obj.showJ();
        obj.showK();
    }
}