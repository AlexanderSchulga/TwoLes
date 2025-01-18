public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog(); //обращение к класу дог
        //Создается обьект класса собаки с
        //конструктором по умолчанию --()
        FlyingDog flyingDog = new FlyingDog();


        System.out.println(dog.hairColor);
        System.out.println(dog.getHeartBeatRate());
        flyingDog.fly();
    }


}
