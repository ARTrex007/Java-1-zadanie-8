import devices.*;

public class Main
{
    public static void main(String[] args)
    {
        Human human1 = new Human("Stefan", "Czarnecki", "Lekarz", 28, 73, 2500 );
        Animal animal1 = new Animal("Ryszard", "Kot", false, 4);
        Car car1 = new Car("Lancer VII", "Mitsubishi", "GKE 122RW", 4, 2500, 15000);
        Phone phone1 = new Phone("Redmi", "Xiaomi", 0.5);

        System.out.println(human1);
        System.out.println(animal1);
        System.out.println(car1);
        System.out.println(phone1);
    }
}