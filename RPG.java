public class RPG{
   public static void main(String[] args) {
      Character a = new Character(100, 80, 40, "スバル");

      a.introduce();

      Character b = new Character(200, 180, 80, "エミリア");

      b.introduce();
      a.attack(b);

      Witch c = new Witch(100, 120, 80, "エキドナ");
      c.introduce();
      c.attack(a);

      Knight d = new Knight(300, 0, 290, "ラインハルト");
      d.introduce();
      d.attack(c);
   }
}
