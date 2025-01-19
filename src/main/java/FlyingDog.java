public class FlyingDog extends Dog{

    @Override //Переопределяем метод, так как такой же есть в
    //родительском Dog
    public void run(){
        heartBeatRate += 70; //В классе Dog поле Private,
        //Что бы все функцион. делается оно там Protected
    }
public void fly() {
    speed = 100;
}
}
