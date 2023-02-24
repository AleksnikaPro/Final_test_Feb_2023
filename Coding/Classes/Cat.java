package Classes;

public class Cat extends Pet{

    boolean trained = true;
    public Cat(String name, String birthday) {
        super(name, birthday);

    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + super.getName() + '\'' +
                ", birthday='" + super.getBirthday() + '\'' + '}';
    }

    @Override
    public void voice() {
        System.out.println("Кот " + getName() + " кричит");
    }

    @Override
    public void eat() {
        System.out.println("Кот " + getName() + " ест");
    }

    @Override
    public void sleep() {
        System.out.println("Кот " + getName() + " спит");
    }

    @Override
    public void training() {
        this.trained = false;
        System.out.println("Кот " + getName() + " Прошел тренировку");
    }

    @Override
    public void specialMethod() {
        if(trained){
            System.out.println(getName() + " надо тренировать");
        }
        else
            System.out.println("Кот " + getName() + " залазит в кострюлю");
    }


}