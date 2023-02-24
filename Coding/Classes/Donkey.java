package Classes;

public class Donkey extends PackAnimal{
    boolean trained = true;
    public Donkey(String name, String birthday) {
        super(name, birthday);
    }


    @Override
    public String toString() {
        return "Donkey{" +
                "name='" + super.getName() + '\'' +
                ", birthday='" + super.getBirthday() + '\'' + '}';
    }

    @Override
    public void voice() {
        System.out.println("Donkey " + getName() + " кричит");
    }

    @Override
    public void eat() {
        System.out.println("Donkey " + getName() + " ест");
    }

    @Override
    public void sleep() {
        System.out.println("Donkey " + getName() + " спит");
    }

    @Override
    public void training() {
        this.trained = false;
        System.out.println("Осел " + getName() + " Прошел тренировку");
    }

    public void specialMethod() {
        if(trained){
            System.out.println("Осла"+ getName() + "надо тренировать");
        }
        else
            System.out.println("Осел " + getName() + " тупой ничего не делает");
    }
}