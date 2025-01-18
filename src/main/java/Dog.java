public class Dog {
   public String hairColor = "Red";


   private int heartBeatRate = 120;
   //Что бы иметь доступ к привату, нужно создать метод геттер или сеттер
   //

   protected int speed = 20;

   public int getHeartBeatRate() {
      return heartBeatRate;
   }

   public void run() {
      heartBeatRate += 10;
   }

}
