import java.util.ArrayList;
import java.util.HashMap;

public class AnnotationSet {
    HashMap<String, UnitSet> map;

    public AnnotationSet() {
        this.map = new HashMap<>();
    }

    public void addUnitSet(UnitSet unitSet){
        map.put(unitSet.idAnnotation, unitSet);
    }

    public void addUnit(Unit u){
        UnitSet set = map.get(u.getIdAnnotation());
        if(set == null){
            set = new UnitSet(u.getIdAnnotation());
            set.addUnit(u);
            map.put(u.getIdAnnotation(), set);
        } else {
            set.addUnit(u);
            map.put(u.getIdAnnotation(), set);
        }
    }
}
