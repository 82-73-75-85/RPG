public class RPG{
   public static void main(String[] args) {
      Character a = new Character();

      a.hp = 100;
      a.mp = 80;
      a.name = "スバル";

      Character b = new Character();

      b.hp = 200;
      b.mp = 130;
      b.name = "エミリア";

      a.introduce();
      b.introduce();
   }
}
