package calculator;

import model.Complex;

public class Functions {
	
	public static Complex CSum(Complex c1, Complex c2) {
		return new Complex(c1.getpReal() + c2.getpReal(), c1.getpImg() + c2.getpImg());

	}

	public static Complex CRest(Complex c1, Complex c2) {
		return new Complex(c1.getpReal() - c2.getpReal(), c1.getpImg() - c2.getpImg());
	}

	public static Complex CProduct(Complex c1, Complex c2) {

		double real = (c1.getpReal() * c2.getpReal()) + (c1.getpImg() * c2.getpImg() * -1);
		double img = (c1.getpReal() * c2.getpImg()) + (c1.getpImg() * c2.getpReal());

		Complex c3 = new Complex(real, img);
		return c3;

	}
	
	public static Complex CDivision(Complex c1, Complex c2) {
		Complex polar1 = CartesianToPolar(c1);
		Complex polar2 = CartesianToPolar(c2);
		
		return PolarToCartesian(new Complex(polar1.getpReal()/polar2.getpReal(), polar1.getpImg()-polar2.getpImg()));
	}

	public static double Modulus(Complex c) {
		return Math.sqrt(Math.pow(c.getpReal(), 2) + Math.pow(c.getpImg(), 2));
	}

	public static double Phase (Complex c) {
		return Math.toDegrees(Math.atan(c.getpImg()/c.getpReal()));
	}

	public static Complex Conjugate (Complex c) {
		return new Complex(c.getpReal(), -c.getpImg());
	}
	
	public static Complex PolarToCartesian(Complex c) {
		return new Complex(c.getpReal() *Math.cos(Math.toRadians(c.getpImg())), c.getpReal() * Math.sin(Math.toRadians(c.getpImg())));
	}
	
	public static Complex CartesianToPolar(Complex c) {
		return new Complex(Modulus(c), Phase(c));
	}

}
