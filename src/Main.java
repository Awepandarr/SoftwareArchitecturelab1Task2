public class Main {
    public static void main(String[] args) {

      DiceRoll dice1=new DiceRoll(3);
      DiceRoll dice2=new DiceRoll(4);
      DiceRoll dice3=new DiceRoll(5);
      DiceRoll dice4=new DiceRoll(3);

      TwoDiceRoll roll1=new TwoDiceRoll(dice1,dice2);
      TwoDiceRoll roll2=new TwoDiceRoll(dice3,dice4);
      TwoDiceRoll roll3=new TwoDiceRoll(dice1,dice4);
        System.out.println(roll1.equals(roll2));
        System.out.println(roll1.equals(roll3));
        System.out.println(roll2.equals(roll3));
        System.out.println(roll1.toString());
        System.out.println(roll2.toString());
        System.out.println(roll3.toString());
    }
}