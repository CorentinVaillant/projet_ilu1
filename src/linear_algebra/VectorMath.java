package linear_algebra;

import java.util.ArrayList;
import java.util.Arrays;

public class VectorMath {
    private ArrayList<Float> inneVector;
    private int size;

    public VectorMath(ArrayList<Float> inneVector, int size) {
        this.inneVector = inneVector;
        this.size = size;
    }

    public VectorMath(Float[] tab){
        this.size = tab.length;
        this.inneVector = new ArrayList<>(Arrays.asList(tab));
        
    }
}
