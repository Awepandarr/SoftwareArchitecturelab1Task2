import java.util.Objects;

public class TwoDiceRoll {
    private final DiceRoll one;
    private final DiceRoll two;
    TwoDiceRoll(DiceRoll one, DiceRoll two) {
        this.one = one;
        this.two = two;
    }

    public DiceRoll getOne() {
        return one;
    }

    public DiceRoll getTwo() {
        return two;
    }
    @Override
    public boolean equals(Object obj){
        if(this==obj){
            return true;
        }
        if(obj==null||getClass()!=obj.getClass()){
            return false;
        }
        TwoDiceRoll that=(TwoDiceRoll) obj;
        return Objects.equals(one,that.one) && Objects.equals(two,that.two);
    }

    @Override
    public int hashCode(){
        return Objects.hash(one,two);
    }
    @Override
    public String toString(){
        return "TwoDiceRoll{"+"one="+one+", two="+two+'}';
    }


}
