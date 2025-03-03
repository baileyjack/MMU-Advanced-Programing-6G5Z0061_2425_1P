package uk.co.baileyj.pets;

public class Cat extends Pet implements Strokeable {

    public Cat(String name, int age) {
        super(name, age);
    }

    public Cat() {
    }

    @Override
    public void stroke() {
        System.out.println(name + "wanders out and ignores you");
    }
}
