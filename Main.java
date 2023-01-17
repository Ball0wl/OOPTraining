

public class Main {
    public static void main(String[] args) {
        //Klassen, Objekte, Konstruktoren lernen => gutes verständniss für OOP
        //Jedes hundObjekt hat eigene Eigenschaften(Attribute) z.b einen Namen, ein Alter

        Hund hundObjekt = new Hund("Dr.Wuff", 5);
        Katze katzenObjekt = new Katze("Alice", 9);
        Schlange schlangenObjekt = new Schlange("Snek",3);

        schlangenObjekt.klappern();
        hundObjekt.bellen();
        katzenObjekt.miau();


    }
}