

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
        person4.addChild(person6);


        Pet pet1 = new Pet("Micky", 2, "hondje");
        Pet pet2 = new Pet("Roksy", 3, "kat");

        pet1.setOwner(person7);
        System.out.println("De eigenaar van" + " een " + pet1.getSpecies() +  " " + pet1.getName() + " is " + pet1.getOwner().getName());

        person1.addParents (person7, person8) ;
        System.out.println(person1.getName() + " ouders zijn " + person7.getName() + " en " + person8.getName());

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

        for (Person person : person7.getGrandchildren()){
            kleinkinderen1 = kleinkinderen1.concat(person.getName() + " en ");

        }

        kleinkinderen1 = kleinkinderen1.substring(0, kleinkinderen1.length() - 4);
        System.out.println("De kleinkinderen van " + person7.getName() + " : " + kleinkinderen1);


    }

}
