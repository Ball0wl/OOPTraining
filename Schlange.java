public class Schlange {
    int alter;
    String name;

    public Schlange(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    public void klappern() {
        System.out.println(name+": klapper klapper");

    }
}
