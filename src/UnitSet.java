import java.util.ArrayList;

public class UnitSet {
    String idAnnotation;
    ArrayList<Unit> units;

    protected UnitSet(String idAnnotation) {
        this.idAnnotation = idAnnotation;
        units = new ArrayList<>();
    }

    public void addUnit(Unit u){
        units.add(u);
    }

    @Override
    public String toString() {
        return "UnitSet{" +
                "idAnnotation='" + idAnnotation + '\'' +
                ", units=" + units +
                '}';
    }
}