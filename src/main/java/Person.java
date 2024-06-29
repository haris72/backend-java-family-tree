import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private int age;
    private String sex;
    private String lastName;
    private String middleName;
    private List<Person> children = new ArrayList<Person>();
    private List<Person> grandchildren = new ArrayList<Person>();
    private List<Pet> pets = new ArrayList<Pet>();
    private List<Person> siblings = new ArrayList<Person>();
    private Person mother;
    private Person father;

    public Person (String name,  String lastName, int age, String sex) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;


    }

    public Person(String name, String MiddleName, String lastName, int age, String sex) {
        this.name = name;
        this.middleName = MiddleName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;

    }

    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public List<Person> getChildren() {
        return children;
    }

    public void setChildren(List<Person> children) {
        this.children = children;
    }
    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }
    public List<Person> getSiblings() {
        return siblings;
    }

    public void setSiblings(List<Person> siblings) {
        this.siblings = siblings;
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }
    public void addParents(Person father, Person mother) {
        this.father = father;
        this.mother = mother;
        father.addChild(this);
        mother.addChild(this);
    }


    public void addChild(Person child) {
        children.add(child);
        }

    public void addPet(Pet pet) {
        pets.add(pet);
//        pet.setOwner(person, pet);
    }

    public void addSibling(Person sibling) {
        siblings.add(sibling);
    }


    public List<Person> getGrandchildren() {
        for (int i = 0; i < children.toArray().length; i++) {
         if (children.get(i) != null) {
             grandchildren.addAll(children.get(i).children);

         }

        }

        return grandchildren;

    }

    //BONUS 1
    public List<Pet> getGrandchildrenPets() {
        for (int i = 0; i < getGrandchildren().toArray().length; i++) {
            if (getGrandchildren().get(i) != null) {
                pets.addAll(getGrandchildren().get(i).getPets());

            }
        }

        return pets;

    }
        //



//    public void setGrandchildren(List<Person> grandchildren) {
//        this.grandchildren = grandchildren;
//    }



}



