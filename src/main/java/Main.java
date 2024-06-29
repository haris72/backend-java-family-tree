import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Haris", "Mujovic", 52, "man");
        Person person2 = new Person("Gerrit", "Mujovic", 30, "man");
        Person person3 = new Person("Davina", "Mujovic", 25, "vrouw");
        Person person4 = new Person("Veerle", "Mujovic-Bakker", 2, "vrouw");
        Person person5 = new Person("Gerrard", "Mujovic-Bakker", 5, "man");
        Person person6 = new Person("Arno", "Rutte", 0, "man");
        Person person7 = new Person("Pap_Haris", "Mujovic", 82, "man");
        Person person8 = new Person("Mam_Haris", "Mujovic", 78, "vrouw");
        Person person9 = new Person("Sanne", "Mujovic", 54, "vrouw");
        System.out.println(person1.getName() + " " + person1.getLastName() + " " + person1.getAge());
        System.out.println(person2.getName() + " " + person2.getLastName() + " " + person2.getAge());
        System.out.println(person3.getName() + " " + person3.getLastName() + " " + person3.getAge());
        person1.addChild(person2);
        person1.addChild(person3);
        person2.addChild(person4);
        person2.addChild(person5);
        person3.addChild(person6);


        Pet pet1 = new Pet("Micky", 2, "hondje");
        Pet pet2 = new Pet("Roksy", 3, "kat");
        Pet pet3 = new Pet("Rocky", 1, "konijn");


        pet1.setOwner(person5);
        person5.addPet(pet2);
        person5.addPet(pet1);

        pet3.setOwner(person6);
        person6.addPet(pet3);


        System.out.println("De eigenaar van" + " een " + pet2.getSpecies() + " " + pet2.getName() + " is " + person5.getName());
        System.out.println("De eerste pet van " + person5.getName() + " is " + pet2.getSpecies() + " " + person5.getPets().getFirst().getName());
        System.out.println("De eerste pet van " + person6.getName() + " is " + person6.getPets().getFirst().getSpecies() + " " + person6.getPets().getFirst().getName());

        person1.addParents (person7, person8) ;
        System.out.println(person1.getName() + " ouders zijn " + person7.getName() + " en " + person8.getName());
        System.out.println("Mama " + "van " + person1.getName() + " heet " + person1.getMother().getName());

        // BONUS 1
        String pets = "";
        for (Pet pet : person5.getGrandchildrenPets()) {
            pets = pets.concat(pet.getName() + " en ");

        }
        pets = pets.substring(0, pets.length() - 4);
        System.out.println("De dieren van de kleinkinderen van "  + person5.getName() + " zijn " + pets);

        //

        person1.addSibling(person9);

        String siblings1 = "";
        for (Person person : person1.getSiblings()) {
            siblings1 = siblings1.concat(person.getName() + " en ");

        }
        siblings1 = siblings1.substring(0, siblings1.length() - 4);

        System.out.println(person1.getName() + " en " + siblings1  + " zijn siblings ");


        String kinderen1 = "";
        for (Person person : person1.getChildren()) {
            kinderen1 = kinderen1.concat(person.getName() + " en ");

        }
        kinderen1 = kinderen1.substring(0, kinderen1.length() - 4);
        System.out.println("De kinderen van " + person1.getName() + " : " + kinderen1);


        String kinderen2 = "";

        for (Person person : person2.getChildren()) {
            kinderen2 = kinderen2.concat(person.getName() + " en ");

        }
        kinderen2 = kinderen2.substring(0, kinderen2.length() - 4);
        System.out.println("De kinderen van " + person2.getName() + " : " + kinderen2);



        String kleinkinderen1 = "";

        for (Person person : person1.getGrandchildren()){
            kleinkinderen1 = kleinkinderen1.concat(person.getName() + " en ");

        }

        kleinkinderen1 = kleinkinderen1.substring(0, kleinkinderen1.length() - 4);
        System.out.println("De kleinkinderen van " + person1.getName() + " : " + kleinkinderen1);


    }

}
