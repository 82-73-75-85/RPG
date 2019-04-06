class Character{
   private int hp;
   private int mp;
   private int atk;
   private String name;

   public Character(){
      name = "unknown";
      hp = 100;
      mp = 80;
      atk = 40;
   }

   public Character(int hp, int mp, int atk, String name){
      this.name = name;
      this.hp = hp;
      this.mp = mp;
      this.atk = atk;
   }

   public void introduce() {
      System.out.println("私は"+name+",体力は"+hp+",魔力は"+mp+",攻撃力は"+atk+"だ！");
   }

   private void damage(int atk, String name){
      this.hp -= atk;
      System.out.println(this.name+"は"+name+"から" + atk+"の攻撃を受けた！");
   }

   public void attack(Character c){
      System.out.println(name +"の攻撃！");
      c.damage(atk, name);
   }
}
