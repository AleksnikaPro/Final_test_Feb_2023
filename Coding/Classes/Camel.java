package Classes;

public class Camel extends PackAnimal{

    boolean trained = true;
    public Camel(String name, String birthday) {
        super(name, birthday);
    }


    @Override
    public String toString() {
        return "Camel{" +
                "name='" + super.getName() + '\'' +
                ", birthday='" + super.getBirthday() + '\'' + '}';
    }

    @Override
    public void voice() {
        System.out.println("Camel " + getName() + " кричит");
    }

    @Override
    public void eat() {
        System.out.println("Camel " + getName() + " ест");
    }

    @Override
    public void sleep() {
        System.out.println("Camel " + getName() + " спит");
    }

    @Override
    public void training() {
        this.trained = false;
        System.out.println("Верблюд " + getName() + " Прошел тренировку");
    }
    @Override
    public void specialMethod() {
        if(trained){
            System.out.println(getName() + "надо тренировать");
        }
        else
            System.out.println("Верблюд " + getName() + " плюнул");
    }
}