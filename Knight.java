class Knight extends Character{
   public Knight(int hp, int mp, int atk, String name){
      super(hp, mp, atk, name);
   }

   public void introduce(){
      System.out.println("私は騎士の"+name+"。体力は"+hp+"、攻撃力は"+atk+"だ！");
   }

   public void Sword(Character c){
      System.out.println(name +"は剣で攻撃した!!");
      c.damage(atk,name);
   }

   public void attack(Character c){
      Sword(c);
   }
}
