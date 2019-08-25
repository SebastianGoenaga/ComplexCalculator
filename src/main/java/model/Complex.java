package model;

public class Complex {
	
	private double pReal;
	private double pImg;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(pImg);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(pReal);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Complex))
			return false;
		Complex other = (Complex) obj;
		if (Double.doubleToLongBits(pImg) != Double.doubleToLongBits(other.pImg))
			return false;
		if (Double.doubleToLongBits(pReal) != Double.doubleToLongBits(other.pReal))
			return false;
		return true;
	}

	public Complex(double real, double img) {
		pReal = real;
		pImg = img;
	}

	public double getpReal() {
		return pReal;
	}

	public double getpImg() {
		return pImg;
	}
	
	@Override
	public String toString() {
		
		return pReal + ", " + pImg + "i";
	}
	
}
