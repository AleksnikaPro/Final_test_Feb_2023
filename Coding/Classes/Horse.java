package Classes;

public class Horse extends PackAnimal{
    boolean trained = true;
    public Horse(String name, String birthday) {
        super(name, birthday);
    }


    @Override
    public String toString() {
        return "Horse{" +
                "name='" + super.getName() + '\'' +
                ", birthday='" + super.getBirthday() + '\'' + '}';
    }

    @Override
    public void voice() {
        System.out.println("Horse " + getName() + " кричит");
    }

    @Override
    public void eat() {
        System.out.println("Horse " + getName() + " ест");
    }

    @Override
    public void sleep() {
        System.out.println("Horse " + getName() + " спит");
    }

    @Override
    public void training() {
        this.trained = false;
        System.out.println("Лошадь " + getName() + " Прошела тренировку");
    }

    public void specialMethod() {
        if(trained){
            System.out.println("надо тренировать");
        }
        else
            System.out.println("Лошадь " + getName() + " делает и го го");
    }
}