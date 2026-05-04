package Sesiunea2.modul2;

public class PetHomework {
    private String name;
    private int age;


    public PetHomework(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void makeSound() {
        System.out.println(" ");
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age" + age);
    }

}
    class Dog extends PetHomework {
        public Dog(String name, int age) {
            super(name, age);
        }

        @Override
        public void makeSound() {
            System.out.println("Dog Barks");
        }
    }
        class Cat extends PetHomework {
            public Cat(String name, int age) {
                super(name, age);
            }

            @Override
            public void makeSound() {
                System.out.println("Cat Meows");
            }

        }




        class main{
    public static void main(String[] args) {
        PetHomework dog = new Dog("Rex",7);
        PetHomework cat = new Cat("Tom", 10);


        dog.displayInfo();
        dog.makeSound();

        cat.displayInfo();
        cat.makeSound();

    }
}



