package linear_algebra;



///class
/// This class is a pattern for other object that represent some element in a vector space
public class VectorSpace {

    protected int dimension;

    public VectorSpace(int dimension) {
        this.dimension = dimension;
    }

    public VectorSpace scale(float scalar){
        return new VectorSpace(this.dimension);
    }

    public VectorSpace add(VectorSpace vecSpace){
        assert(this.dimension == vecSpace.dimension);
        return new VectorSpace(this.dimension);
    }

    public int getDimension() {
        return dimension;
    }

    @Override
    public String toString() {
        return "Vector space of dimension "+dimension;
    }

    public boolean isHomeomorphic(VectorSpace vecSpace){
        return dimension == vecSpace.dimension;
    }


}
