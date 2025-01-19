public abstract class AbstractDog {
    //Могут быть модификаторы доступа
    //Могут быть поля класса


  public void woof(){
      //Могут быть методы, которые определяют реализацию
      System.out.println("woooooooof"); //к примеру все собаки лают
      //протяжно
  };
  //и этот метод определяем, а на пользователя накладываем обязанность
    //определять только оставшиеся методы
  public abstract void pipi();
    public abstract void walk();

}
