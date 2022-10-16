public class Main
{
    public static void main(String[] args)
    {
        int j;
        int k;
        int preset = 16;
        int inset = 12;

        for (int line = 1; line <= 9; line++)
        {
            if (line == 2)
            {
                preset = 19;
            }
            else
            {
                preset = 16;
            }
            if (line >= 4)
            {
                j = line - 3;

                k = 2 * j;

                preset = 16 + j;

                inset = 12 - k;
            }
            for (int i = 1; i <= preset; i++)
            {
                System.out.print(" ");
            }
            for (int i = 1; i <= 3; i++)
            {
                System.out.print("*");
            }
            for (int i = 1; i <= inset; i++)
            {
                System.out.print(" ");
            }
            for (int i = 1; i <= 3; i++)
            {
                System.out.print("*");
            }
            System.out.println("");

        }

    }

}

