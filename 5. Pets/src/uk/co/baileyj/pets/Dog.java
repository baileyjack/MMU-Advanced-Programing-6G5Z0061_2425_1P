package uk.co.baileyj.pets;

public class Dog extends Pet implements Strokeable {
    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog() {
    }

    @Override
    public void stroke() {
        System.out.println("Woof!");
    }
}
