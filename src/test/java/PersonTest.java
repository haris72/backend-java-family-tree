import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    private Person personx;
    private Pet petx;
    @BeforeEach
    void setUp() {

        personx = new Person("Haris", "Mujovic", 52, "man");
        petx = new Pet("pet", 2, "boxer");
    }

    @Test
    void getName() {
    }

    @Test
    void setName() {
        //arrange
        var name = "Haris";

        //act
        personx.setName(name);
        //assert
        assertEquals(name, personx.getName());

    }

    @Test
    void addParents() {

        //arrange
        var father = "Haris_Pa";
        var mother = "Haris_Ma";

        var parent1 = new Person(father, "Mujovic", 90, "man");
        var parent2 = new Person(mother, "Garibovic", 90, "vrouw");

        //act
        personx.addParents(parent1, parent2);
        //assert
        assertEquals(father, personx.getFather().getName());
        assertEquals(mother, personx.getMother().getName());

    }

    @Test
    void addChild() {
        //arrange
        var nameChild = "child";
        var child = new Person(nameChild, "Mujovic", 10, "man" );
        //act
        personx.addChild(child);
        //assert
        assertEquals(1,personx.getChildren().stream().count());
        assertEquals(nameChild,personx.getChildren().getFirst().getName());
    }


    @Test
    void addPet() {
        //arrange
        var namePet = "pet_Haris";
        var nameOwner = "Haris";
        var petx = new Pet(namePet, 2, " boxer" );
        //act
        personx.addPet(petx);
        petx.setOwner(personx);
        //assert
        assertEquals(namePet,personx.getPets().getFirst().getName());
        assertEquals(nameOwner,personx.getPets().getFirst().getOwner().getName());
    }

    @Test
    void addSibling() {
        //arrange
        var father = "Haris_Pa";
        var mother = "Haris_Ma";

        var parent1 = new Person(father, "Mujovic", 90, "man");
        var parent2 = new Person(mother, "Garibovic", 90, "vrouw");

        //act
        personx.addParents(parent1, parent2);
        //assert
        assertEquals(father, personx.getFather().getName());
        assertEquals(mother, personx.getMother().getName());

    }

    @Test
    void getGrandchildren() {
        var father = "Haris_Pa";
        var mother = "Haris_Ma";
        var kind = "Haris_zon";
        var parent1 = new Person(father, "Mujovic", 90, "man");
        var parent2 = new Person(mother, "Garibovic", 90, "vrouw");
        var child1 = new Person(kind, "Mujovic", 25, "man");
        personx.addParents(parent1, parent2);
        personx.addChild(child1);
//        personx.getGrandchildren();
        assertEquals(kind, personx.getFather().getGrandchildren().getFirst().getName());
        assertEquals(kind, personx.getMother().getGrandchildren().getFirst().getName());

    }

}