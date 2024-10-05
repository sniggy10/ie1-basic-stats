//  File to create minimum and maximum of 2 numbers

class CS520_Assignment1
{
    public static void main(String args[])
    {
        int a[] ={4,524,5764,243,875,32,930,3,45};
        CalculateMinMax(a);
    }

    public static void CalculateMinMax(int a[])
    {
        int min =a[0];
        int max=a[0];

        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max = a[i];
            }
            if(a[i]<min)
            {
                min = a[i];
            }
        }

        System.out.println("Minimum:"+min);
        System.out.println("Maximum:"+max);
    }
}