package Classes;

public class Hamster extends Pet{
    boolean trained = true;
    public Hamster(String name, String birthday) {
        super(name, birthday);
    }


    @Override
    public String toString() {
        return "Hamster{" +
                "name='" + super.getName() + '\'' +
                ", birthday='" + super.getBirthday() + '\'' + '}';
    }

    @Override
    public void voice() {
        System.out.println("Хомяк " + getName() + " кричит");
    }

    @Override
    public void eat() {
        System.out.println("Хомяк " + getName() + " жадно ест");
    }

    @Override
    public void sleep() {
        System.out.println("Хомяк " + getName() + " спит");
    }

    @Override
    public void training() {
        this.trained = false;
        System.out.println("Хомяк " + getName() + " Прошел тренировку");
    }

    public void specialMethod() {
        if(trained){
            System.out.println("надо тренировать");
        }
        else
            System.out.println("Хомяк " + getName() + " крутит колесо");
    }
}