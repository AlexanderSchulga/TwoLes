public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog(); //для перегруженного конструктора
        //Так как создан конструктор с параметрами
        //В доге, тут можем изменять и задавать свойства
        Dog dog = new Dog("green", 130);
        System.out.println(dog.hairColor);

        System.out.println(dog1.hairColor);//для перегруженного конструктора

    }

}
