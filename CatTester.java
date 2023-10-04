public class CatTester {
    public static void main(String[] args) {
        Cat cat = new Cat("Tom", "Siamese", 2);
        System.out.println("Cat name: " + cat.getName());
        System.out.println("Cat breed: " + cat.getBreed());
        System.out.println("Cat age: " + cat.getAge());
    }
}
