public class Katze {
    String name;
    int alter;

    public Katze(String neuerName, int neuesAlter) {
        this.name = neuerName;
        this.alter = neuesAlter;
    }

    public void miau() {
        System.out.println(name+": Miau!");
    }

    public void fressen() {
        System.out.println(name+": nom nom nommmm! brrrr");
    }


}
