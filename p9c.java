class sh
{
    void show()
    {
        System.out.println("Inside Class-A");
    }
}
class sho extends sh
{
    void show()
    {
        System.out.println("Inside Class-B");
    }
}
class p9c
{
    public static void main(String[] args)
    {
        sho obj = new sho();
        obj.show();
    }
}