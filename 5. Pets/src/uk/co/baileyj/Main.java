package uk.co.baileyj;

import uk.co.baileyj.pets.Cat;
import uk.co.baileyj.pets.Dog;
import uk.co.baileyj.pets.Goldfish;
import uk.co.baileyj.pets.Pet;
import uk.co.baileyj.petStore.PetShop;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Pet[] availablePets = { new Cat("Milo", 2), new Dog("Jeremy", 4), new Goldfish("Fishy", 1) };

        PetShop petShop = new PetShop(availablePets);

        Cat cat = petShop.buyCat();
        Dog dog = petShop.buyDog();
        Goldfish goldfish = petShop.buyGoldfish();

        System.out.println("Bought a cat: " + (cat != null));
        System.out.println("Bought a dog: " + (dog != null));
        System.out.println("Bought a goldfish: " + (goldfish != null));

    }
}