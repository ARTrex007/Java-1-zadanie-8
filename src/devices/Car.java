package devices;

public class Car
{
    public enum marki
    {
        Ford, Mitsubishi, Opel, Peugeot
    }

    public final String model, producer;
    public String rejestracja;
    public int ilosc_drzwi, pojemnosc;
    public double wartosc;
    public static int counter=0;

    public Car(String model, String producer,String rejestracja, int ilosc_drzwi, int pojemnosc, double wartosc)
    {
        this.model = model;
        this.producer = producer;
        this.rejestracja = rejestracja;
        this.ilosc_drzwi = ilosc_drzwi;
        this.pojemnosc = pojemnosc;
        this.wartosc = wartosc;

        System.out.println("Utworzono obiekt CAR numer: " + counter);
        counter++;
    }

    public String toString()
    {
        return model+" "+producer+" "+rejestracja+" "+ilosc_drzwi+" "+pojemnosc+" "+wartosc;

    }

    void Czy_Marka(marki f)
    {
        switch(f)
        {
            case Ford:
            {
                if(this.producer == "Ford")
                    System.out.println("Tak, podany samochód to " + f);
                else
                    System.out.println("Nie, podany samochód to nie " + f);
                break;
            }

            case Mitsubishi:
            {
                if(this.producer == "Mitsubishi")
                    System.out.println("Tak, podany samochód to " + f);
                else
                    System.out.println("Nie, podany samochód to nie " + f);
                break;
            }

            case Opel:
            {
                if(this.producer == "Opel")
                    System.out.println("Tak, podany samochód to " + f);
                else
                    System.out.println("Nie, podany samochód to nie " + f);
                break;
            }

            case Peugeot:
            {
                if(this.producer == "Peugeot")
                    System.out.println("Tak, podany samochód to " + f);
                else
                    System.out.println("Nie, podany samochód to nie " + f);
                break;
            }

            default:
                {
                System.out.println("Nie ma takiej marki w bazie");
                break;
            }
        }
    }
}
