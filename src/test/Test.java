package test;

import linear_algebra.VectorMath;
import linear_algebra.VectorSpace;
import my_utils.MyUtils;

public class Test {

	public static void main(String[] args) {
		MyUtils.println("<======démarage test======>");

		MyUtils.println("---Test Vector Space---");

		VectorSpace vecSpace1 = new VectorSpace(5);
		assert (vecSpace1.getDimension() == 5);

		assert(vecSpace1.add(vecSpace1).isHomeomorphic(vecSpace1));

		VectorSpace vecSpace2 = new VectorSpace(6);
		// vecSpace1.add(vecSpace2); //!Test if it stop the programme, to comment to do other test

		assert(vecSpace1!=vecSpace2);
		MyUtils.println(vecSpace1.toString());
		MyUtils.println(vecSpace2.toString());
		MyUtils.println("=> Ok ✅");

		MyUtils.println("---Test Vector Math---");
		float[] tab1 = {1f,2f,3f};
		float[] tab2 = {3f,2f,1f};
		float[] tab3 = {1f,1f,1f};
		VectorMath vec = new VectorMath(tab1.clone());
		MyUtils.println("vec :"+vec.toString());
		assert vec.get(0) == 1f;
		assert vec.set(0,0f).get(1) == 2f;
		assert vec.get(0) == 0f;

		assert vec.scale_set(5f).get(2) == 15f;
		assert vec.scale(2f) != vec;

		MyUtils.println("vec :"+vec.toString()+"| vec*2 :" + vec.scale(2f).toString());

		VectorMath vec1 = new VectorMath(tab1);
		VectorMath vec2 = new VectorMath(tab2);

		MyUtils.println(vec1.toString() + "+"+ vec2.toString() + "=" + vec1.add(vec2).toString());
		assert vec1.add(vec2) == new VectorMath(tab3); //! equality error !




		MyUtils.println("=> Ok ✅");

	}

}
