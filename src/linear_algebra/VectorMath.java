package linear_algebra;

import java.util.ArrayList;
import java.util.Arrays;

public class VectorMath extends EuclidianSpace<VectorMath>{
    
    private final float innerTab[];

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

    @Override
    protected Object clone() throws CloneNotSupportedException {
        super.clone();
        return new VectorMath(this);
        
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

    //----->other<-----


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass())
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

    @Override
    public int hashCode() {
        return super.hashCode();
    }


/********************************************************
 <=================== Mathematics ======================>
********************************************************/

    //---->VectorSpace<----
    
    public VectorMath scale_set(float scalar){
        
        for(int i = 0; i<dimension; i++){
            this.set(i, this.get(i) * scalar);
        }

        return this;
    }

    public VectorMath add_set(VectorMath other){
        assert other.dimension == this.dimension;
        for(int i = 0; i<dimension; i++){
            this.set(i, this.get(i) + other.get(i));
        }

        return this;
    }

    @Override
    public VectorMath scale(float scalar) {
        VectorMath result = new VectorMath(this);

        return result.scale_set(scalar);
    }

    @Override
    public VectorMath add(VectorMath other) {
        VectorMath result = new VectorMath(this);

        return result.add_set(other);
    }

    //---->EuclidianSpace<----

    @Override
    public float dot(VectorMath other){
        assert other.dimension == this.dimension;
        float result = 0f;
        for(int i = 0; i< dimension; i++){
            result += this.innerTab[i] * other.innerTab[i];
        }
        return result;
    }

    @Override
    public float lenght(){
        float result = 0f;

        for(int i=0;i<dimension;i++)
            result+=  innerTab[i]*innerTab[i];

        return (float) Math.sqrt(result);
    }


    
}
