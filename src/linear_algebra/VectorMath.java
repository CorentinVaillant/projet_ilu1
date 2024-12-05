package linear_algebra;

import java.util.ArrayList;
import java.util.Arrays;

public class VectorMath extends VectorSpace{
    
    private float innerTab[];
    


    //------>constructors<------


    public VectorMath(ArrayList<Float> vec, int size) {
        super(size);
        this.innerTab = new float[size];
        for(int i = 0; i<size;i++){
            innerTab[i] = vec.get(i);
        }
    }

    public VectorMath(float[] tab){
        super(tab.length);
        this.innerTab = tab;
    }

    //usefull to copy object
    public VectorMath(VectorMath other){
        super(other.dimension);
        this.innerTab = other.innerTab.clone();
    }


    //------>getter<------

    public float get(int index){
        assert (index < dimension) && (0 <= index);

        return innerTab[index];
    }

    //------>setter<------

    public VectorMath set(int index, float value){
        assert (index < dimension) && (0 <= index);
        innerTab[index] = value;

        return this;
    }


    //----->toType<-----

    @Override
    public String toString() {
        return "<"+Arrays.toString(innerTab)+">";
    }



    //----->maths<-----
    public VectorMath scale_set(float scalar){
        
        for(int i = 0; i<dimension; i++){
            this.set(i, this.get(i) * scalar);
        }

        return this;
    }

    @Override
    public VectorMath scale(float scalar){
        VectorMath result = new VectorMath(this);

        return result.scale_set(scalar);
    }

    public VectorMath add_set(VectorMath other){
        for(int i = 0; i<dimension; i++){
            this.set(i, this.get(i) + other.get(i));
        }

        return this;
    }

    public VectorMath add(VectorMath other) {
        VectorMath result = new VectorMath(this);

        return result.add_set(other);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() != this.getClass())
            return false;
            
        VectorMath other = (VectorMath) obj;
        if (dimension != other.dimension)
            return false;
        else for(int i = 0; i<dimension; i++){
            if (this.get(i) != other.get(i))
                return false;
        }
        return true;
    }
}
