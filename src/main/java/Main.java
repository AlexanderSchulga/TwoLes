public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog(); //обращение к класу дог
        //Создается обьект класса собаки с
        //конструктором по умолчанию --()

         FlyingDog flyingDog = new FlyingDog();

        //Dog flyingDog = new FlyingDog();//FlyingDog в Dog может
        //при таком полиморфизме переменная fly может обращаться
        //только к методам класса Dog
        //И тут превратили flyingDog в обычную собаку
        //Делается для того, когда хотим что бы в один и тотже
        //метод передавались разные коллекции

        // System.out.println(dog.hairColor);
        System.out.println(dog.getHeartBeatRate());

        woof(dog);
        woof(flyingDog);
        flyingDog.run();
    }
    //К примеру обе сабаки умеют лаять
    public static void woof(Dog dog){

        System.out.println(dog.hairColor);
        System.out.println("woof");
    }

}
