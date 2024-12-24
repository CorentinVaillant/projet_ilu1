package linear_algebra;

public class EuclidianSpace<THIS extends EuclidianSpace<THIS>> extends VectorSpace<THIS> {

    public EuclidianSpace(int dimension) {
        super(dimension);
    }

    ///Perform the dot product between this vector and another one.
    public float dot(THIS other){
        return 0f;
    }


    ///Compute the Euclidian norme of this vector.
    public float lenght(){
        return 0f;
    }

    ///Compute the distance between two vectors
    public float distance(THIS other){
        return  0f;
    }

    ///Compute the angle between two vector
    ///@return The angle between this vector and `other` if none of them is zero.  
    /// In the other case returns `NaN` if this or other is a zero vector (in math this is undifined).
    public float angle(THIS other){

        return (float)Math.acos((double)(
            (this.dot(other) / (this.lenght() * other.lenght())
            )));
    }

    public boolean is_orthongonal(THIS other){
        return this.dot(other) == 0f;
    }
    
}
