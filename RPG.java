public class RPG{
   public static void main(String[] args) {
      Character team1[] = new Character[2];
      team1[0] = new Character(1000, 80, 40, "スバル");
      team1[1] = new Knight(3000, 0, 290, "ラインハルト");

      Character team2[] = new Character[2];
      team2[0] = new Character(2000, 180, 80, "エミリア");
      team2[1] = new Witch(1000, 120, 80, "エキドナ");

      for(int i = 0; i <= team1.length-1; i++) {
         team1[i].introduce();
         for(int j = 0; j <= team2.length-1; j++){
           team1[i].attack(team2[j]);
         }
      }

      for(int i = 0; i <= team2.length-1; i++) {
         team2[i].introduce();
         for(int j = 0; j <= team1.length-1; j++){
           team2[i].attack(team1[j]);
         }
      }
   }
}
