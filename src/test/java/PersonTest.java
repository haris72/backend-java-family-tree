import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    private Person personx;
    @BeforeEach
    void setUp() {
        personx = new Person("Haris", "Mujovic", 52, "man");
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
    void getAge() {
    }

    @Test
    void setAge() {
    }

    @Test
    void getSex() {
    }

    @Test
    void setSex() {
    }

    @Test
    void getLastName() {
    }

    @Test
    void setLastName() {
    }

    @Test
    void getMiddleName() {
    }

    @Test
    void setMiddleName() {
    }

    @Test
    void getChildren() {
    }

    @Test
    void setChildren() {
    }

    @Test
    void getPets() {
    }

    @Test
    void setPets() {
    }

    @Test
    void getSiblings() {
    }

    @Test
    void setSiblings() {
    }

    @Test
    void getMother() {
    }

    @Test
    void setMother() {
    }

    @Test
    void getFather() {
    }

    @Test
    void setFather() {
    }

    @Test
    void addParents() {
    }

    @Test
    void addChild() {
    }

    @Test
    void addPet() {
    }

    @Test
    void addSibling() {
    }

    @Test
    void getGrandchildren() {
    }

    @Test
    void setGrandchildren() {
    }
}