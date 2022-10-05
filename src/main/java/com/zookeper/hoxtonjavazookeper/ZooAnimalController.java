package com.zookeper.hoxtonjavazookeper;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZooAnimalController {

    @GetMapping("/animals")
    public ArrayList<Animal> getAllAnimals() {
        ArrayList<Animal> animals = new ArrayList<>();
        Animal first = new Animal(1, "Misty", "Panthera", "Northwestern China", false);
        Animal second = new Animal(2, "Dumbo", "Elephant", "Africa", true);
        Animal third = new Animal(3, "Clara Jane", "Zebra", "Africa", true);
        Animal fourth = new Animal(3, "Smurfy", "Hippo", "eastern Africa", true);
        animals.add(first);
        animals.add(second);
        animals.add(third);
        animals.add(fourth);

        return animals;
    }
}

@Entity
class Animal {
    @Id
    public Integer id;
    public String name;
    public String species;
    public String origin;
    public boolean isHungry;

    public Animal(Integer id, String name, String species, String origin, boolean isHungry) {
        this.id = id;
        this.name = name;
        this.species = species;
        this.origin = origin;
        this.isHungry = isHungry;
    }
}