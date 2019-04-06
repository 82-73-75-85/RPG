class Witch extends Character{
   public Witch(int hp, int mp, int atk, String name){
      super(hp, mp, atk, name);
   }

   public void introduce(){
      System.out.println("私は魔女の"+name+"。体力は"+hp+"、魔力は"+mp+"だ！");
   }

   public void Magic(Character c){
      System.out.println(name +"の魔法で攻撃した!!");
      c.damage(atk*2,name);
   }

   public void attack(Character c){
      Magic(c);
   }
}
