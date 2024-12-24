package test;

import java.time.Duration;
import java.time.Instant;
import java.util.function.Function;
import linear_algebra.VectorMath;
import my_utils.MyUtils;

public class Test extends MyUtils {

	public static double time_test(Function<Void,Void> f){
		Instant start = Instant.now();
		f.apply(null);
		Instant end = Instant.now();
		double timeElapsed = ((double) Duration.between(start, end).toNanos()) / 10e9;

        println("✅ Test done in "+timeElapsed +"s ✅");
		return timeElapsed;
	}


    public static void test_vector_math() {
        println("---Test Vector Math---");
        float[] tab1 = {1f, 2f, 3f};
        float[] tab2 = {3f, 2f, 1f};
        float[] tab3 = {4f, 4f, 4f};

        float[] tab4 = {1f, 2f, 3f};
        VectorMath vec4 = new VectorMath(tab4);
        VectorMath vec = new VectorMath(tab1.clone());

	//test equal
        assert vec.equals(vec4);

	//test toString
		assert vec.toString().equals("<[1.0, 2.0, 3.0]>");

	//test get/set
		assert vec.get(0) == 1f;
        assert vec.set(0, 0f).get(1) == 2f;
        assert vec.get(0) == 0f;

	//test scale
        assert vec.scale_set(5f).get(2) == 15f;
        assert vec.scale(2f) != vec;


	//test add
        VectorMath vec1 = new VectorMath(tab1);
        VectorMath vec2 = new VectorMath(tab2);

        VectorMath vec3 = new VectorMath(tab3);

        assert (vec1.add(vec2).equals(vec3));
		MyUtils.println("\t=> Ok ✅");

	//test dot
		float[] tabOfOnes = {1f,1f,1f};
		VectorMath vecOfOnes = new VectorMath(tabOfOnes);
		assert vecOfOnes.dot(vecOfOnes) == 3;

		assert vec1.dot(vec2) == 10;
		assert vec2.dot(vec1) == 10;
		assert vec3.dot(vec1) == 24;
    }

    public static void main(String[] args) {
		MyUtils.println("<======démarage test======>");
		Instant start = Instant.now();
        test_vector_math();

		Instant end = Instant.now();
		double timeElapsed = ((double) Duration.between(start, end).toNanos()) / 10e9;
        println("✅ Test done in "+timeElapsed +"s ✅");


    }

}
