import java.util.Objects;

public class DiceRoll {
    private final int value;
    DiceRoll(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    @Override
    public boolean equals(Object obj){
        if(this==obj){
            return true;
        }
        if(obj==null||getClass()!=obj.getClass()){
            return false;
        }
        DiceRoll diceRoll=(DiceRoll) obj;
        return value==diceRoll.value;
    }
    @Override
    public int hashCode(){
        return Objects.hash(value);
    }
    @Override
    public String toString(){
        return "DiceRoll{"+"value="+value+'}';
    }

}
