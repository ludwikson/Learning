public class learning {

    public static void main(String[] args) {

//        byte temperatureInCelcius = 12;
//        System.out.println(temperatureInCelcius);
//        System.out.println("Kocham Bubu!");
//        int a = 1;
//        int b = 3;
//        System.out.println(a/b);
//
//        Rzutowanie
//        final double a = 3.14;
//        int b = 2;
//        System.out.println(a + b);
//
//        Rzutowanie vol. 2:
//        System.out.println((double) 1 / 5);
//        int a = 5;
//        int b = 2;
//        int c = a % b;
//        if (c < 0) {
//        System.out.println("Cokolwiek");
//        System.out.println(c);
//        }
//        Operatory arytmetyczne:
//        int a = 15;
//        a %= 4;
//        System.out.println(a);
//
//        int a = 1;
//        System.out.println(a++);
//
//        final double narty = 3.14;
//        int wStanach = 2;
//        System.out.println(narty + cokolwiek);
//
//
//        Operatory relacyjne, zmienna boleean i rzutowanie:
//        int a = 1;
//        int b = 2;
//        int c = 1;
//        int d = 4;
//
//        double x = (double) a / b;
//        double y = c / (double) d;
//
//        System.out.println(x);
//        System.out.println(y);
//
//        boolean isTrue = x == y;
//        System.out.println(isTrue);
//        int a = 1;
//        int b = 2;
//        int c = 1;
//
//
//        int d = 4;
//
//        double x = (double) a / b;
//        double y = c / (double) d;
//
//
//        if (x != y)
//            System.out.println("Well done!");
//
//
//        Operatory logiczne:
//
//
//        int a = 5 + 2;
//        int b = 7 + 2;
//        int c = 9 - 1;
//
//        if (a != b || c > a)
//            System.out.println("Brawo, niczego nie zepsułeś." +
//                    "\nTwój program działa znakomicie!");
//
//        if (a < c || b != a)
//            System.out.println("\nNadal jesteś gość!");
//
//        Operatory bitowe - więcej w magicznym zeszycie i plikach "Java - ściągawka"
//        System.out.println(~-3);
//
//
//        int a = 2;
//        int b = 5;
//        System.out.println(a != b);
//
//
//        int a = 6,
//                b = 12;
//
//        if (b == a * 1)
//            System.out.println("gituwa");
//        else if (b == 12) {
//            System.out.println("Masz 7 dni.");
//            System.out.println("Kolego szanowny.");
//        }
//
//
//        int a = 50;
//        switch (a) {
//            case 50:
//                System.out.println("A jest równe 50.");
//            case 100:
//                System.out.println("A jest równe 100.");
//            default:
//                System.out.println("A jest równe " + a);
//
//
//                int x = 3;
//                if (x % 2 == 0)
//                    System.out.println("Parzysta");
//                else
//                    System.out.println("Nieparzysta");
//
//
//                int a = 5;
//                System.out.println(a % 2 == 0 ? "Parzysta" : "Nieparzysta");
//
//
//                int[] tab = new int[9];
//                int[] tab = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
//                while (tab <= 100) {
//                    System.out.println(tab);
//                    tab + 10;
//
//                }
//
//
//                int[] tab = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
//
//                System.out.println(tab[0]);
//                System.out.println(tab[1]);
//                System.out.println(tab[2]);
//                System.out.println(tab[3]);
//                System.out.println(tab[4]);
//                System.out.println(tab[5]);
//                System.out.println(tab[6]);
//                System.out.println(tab[7]);
//                System.out.println(tab[8]);
//                System.out.println(tab[9]);


//                int[] tab = new int[10];
//                for (int a = 0; a < tab.length; a++) {
//                    tab[a] = (a + 1) * 10;
//                    System.out.println(tab[a]);
//                }

//    class Main
//    {
//        static void printArray(int[] array)
//        {
//            for (int i : array)
//            {
//                System.out.print(i + " ");
//            }
//        }
//        public static void main (String[] args) throws java.lang.Exception
//        {
//            // robisz sobie zadanko
//            int[] array = new int[10];
//            for (int i = 0; i < 10; ++i)
//            {
//                array[i] = (i+1) * 10;
//            }
//
//            // drukujesz wyniki
//            printArray(array);
//        }
//    }

//                for (int i = 1; i <= 10; i++)
//                {
//                    for (int j = 1; j <= 10; j++)
//                    {
//
//                        System.out.print(j * i + " ");
//                    }
//
//                    System.out.println();
//                }
//
//
//

        for (int i = 1; i <= 10; i++)
        {
            for (int j = 1; j <= 10; j++)
            {
                if (i % 2 == 0)
                    continue;

                System.out.print(j * i + " ");

            }
            System.out.println();


        }




    }


}


