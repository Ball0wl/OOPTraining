public class Hund {
    //wenn klasse für OOP programmierung erstelllt wird, besteht klasse aus genau 2 Teilen!!
    //1. Attribute also Eigenschaften

    String name;
    int alter;
    //Konstruktor
    public Hund(String name, int alter){
        this.name = name;
        this.alter = alter;
    }


    //2. Methoden : was kann der Hund?

    public void bellen() {
        System.out.println(name+": Wuff wuff");


        
    }

    public void friss() {
        System.out.println(name+": nom nom");
    }
}
