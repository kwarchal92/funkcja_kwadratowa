package funkcja_kwadratowa;

import java.io.*;
public class FunkcjaKwadratowa {

    public static void main(String[] args)
        throws IOException
    {
        double a, b, c, delta, x1, x2;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            System.out.println("Podaj liczbe a:");
            a = Double.parseDouble(br.readLine());

            if (a == 0)
            {
                System.out.println("To nie jest funkcja kwadratowa");
            }
            else
            {
                System.out.println("Podaj liczbe b:");
                b = Double.parseDouble(br.readLine());
                System.out.println("Podaj liczbe c:");
                c = Double.parseDouble(br.readLine());

                delta = b * b - 4 * a * c;
                //System.out.println("delta wynosi:" + delta);

                if (delta < 0) //delta mniejsza od zera
                {
                    System.out.println("Brak pierwiasktow.");
                }
                else
                {
                    if (delta == 0) //delta rowna zeru
                    {
                        x1 = -1 * b / (2 * a);
                        System.out.printf("Funkcja posiada jeden pierwiastek wynoszacy: x1 = %4.2f", x1);
                    }
                    else
                    {
                        if (delta > 0) //delta wieksza od zera
                        {
                            x1 = (-b -Math.sqrt(delta)) / (2 * a);
                            x2 = (-b +Math.sqrt(delta)) / (2 * a);
                            System.out.printf("Funkcja posiada dwa pierwiastki \nx1 = %4.2f", x1);
                            System.out.printf("\nx2 = %4.2f", x2);
                        }

                    }

                }

            }

        }
        catch (NumberFormatException exception)
        {
            System.out.println("Nie prawidlowe dane. Koniec programu");
        }


    }
}
