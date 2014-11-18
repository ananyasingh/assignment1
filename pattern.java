
class pattern
{

    public static void main(String args[])
    {
        int i,j,k,c=0;
        for(i=16;i>=1;i=i-2)
        {
            for(k=1;k<=c;k=k+1)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                if(j%2==0)
                System.out.print(" ");
                else
                System.out.print("*");
            }
            c=c+1;
            System.out.println();
        }
    }
}
