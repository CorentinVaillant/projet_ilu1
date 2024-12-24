package linear_algebra;



///class
/// This class is a pattern for other object that represent some element in a vector space
public class VectorSpace<THIS extends VectorSpace<THIS>> {


    protected int dimension;

    public VectorSpace(int dimension) {
        this.dimension = dimension;
    }

    public THIS scale(float scalar){
        return null;
    }

    public THIS add(THIS other){
        assert(this.dimension == other.dimension);
        return null;
    }

    public THIS substract(THIS other){
        return null;
    }

    public int getDimension() {
        return dimension;
    }

    @Override
    public String toString() {
        return "Vector space of dimension "+dimension;
    }

    public <OTHER extends  VectorSpace<OTHER>> boolean isHomeomorphic(VectorSpace<OTHER> vecSpace){
        return dimension == vecSpace.dimension;
    }

}
