public class Dog {
   public String hairColor = "Red";

   protected int heartBeatRate = 120;
   //Что бы иметь доступ к привату, нужно создать метод геттер или сеттер
   //
   protected int speed = 20;

   public Dog(){
      //перегрузка конструктора, созданием пустого
   }

   //Конструктор

   public Dog(String hairColor13, int speed){
      this.hairColor = hairColor13;
      //this.getHeartBeatRate();
      //Даже если аргумент назыв
      //-вается по другому, с помощью this. мы обращаемся
      //к обьекту класса, методам текущего обьекта

      this.hairColor = hairColor;//this--обращаемся
      //к полю класса public String hairColor = "Red";
      //Делается что бы не создавать лишних переменных типа
      //hairColor1, hairColor2, ......
      //иначе обращаемся к аргументу, а не полю класса

      this.speed = speed;
      //В конструкторе может быть сколько угодно параметров
      //
   }
   public static void woof(){
      //Статический метод, для элементарных функций,
      //Не требуется создание экземпляра класса-через new.
      //без привязки, соеденить две строки к примеру
      //Где методы не будут зависеть один от другого
      //Но реже использовать, так как рушат ООП
      System.out.println("woof");
   }

   public int getHeartBeatRate() {
      return heartBeatRate;
   }

   public void run() {
      heartBeatRate += 10;
   }

}
