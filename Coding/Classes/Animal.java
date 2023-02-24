package Classes;

public abstract class Animal {
    private boolean trained = true;
    private String name;
    private String birthday; // format(dd-MM-yyyy)

    public boolean isTrained() {
        return trained;
    }

    public void sleep(){
        System.out.println("спит");
    }

    public void voice(){
        System.out.println("кричит");
    }

    public void eat(){
        System.out.println("ест");
    }
    public void specialMethod(){
        System.out.println("Животное что то делает");
    }

    public void training(){
        boolean t = false;
        setTrained(t);

    }
    public void setTrained(boolean trained) {
        this.trained = trained;
    }



    public Animal(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}