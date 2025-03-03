package uk.co.baileyj.petStore;

import uk.co.baileyj.pets.Cat;
import uk.co.baileyj.pets.Dog;
import uk.co.baileyj.pets.Goldfish;
import uk.co.baileyj.pets.Pet;

import java.util.ArrayList;

public class PetShop {
    private Pet[] petsForSale;

    public PetShop(Pet[] petsForSale) {
        this.petsForSale = petsForSale;
    }

    public Cat buyCat() {
        for (Pet pet : this.petsForSale) {
            if (pet instanceof Cat) {
                return (Cat) pet;
            }
        }
        return null; // No Cat found
    }

    public Dog buyDog() {
        for (Pet pet : this.petsForSale) {
            if (pet instanceof Dog) {
                return (Dog) pet;
            }
        }
        return null; // No Dog found
    }

    public Goldfish buyGoldfish() {
        for (Pet pet : this.petsForSale) {
            if (pet instanceof Goldfish) {
                return (Goldfish) pet;
            }
        }
        return null; // No Goldfish found
    }
}
