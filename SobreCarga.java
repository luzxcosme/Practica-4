package inf121;

public class FiguraGeometrica {
	
	double area(double radio){
		return Math.PI * radio * radio;//circulo
	}
	
	double area(float b, double a) {
		return b * a; //rectangulo
	}
	
	double area(double b, double a) {
		return (b * a)/2; //triangulo rectangulo
	}
	
	double area(double base, float basemenor, double altura) {
		return ((base + basemenor) * altura)/2; //trapecio
	}
	
	 double area(float lado, float apotema) {
	        return (5 * lado * apotema)/2; //pentagono
	    }
	
	public static void main(String[] args) {
		FiguraGeometrica f1 = new FiguraGeometrica();
		FiguraGeometrica f2 = new FiguraGeometrica();
		FiguraGeometrica f3 = new FiguraGeometrica();
		FiguraGeometrica f4 = new FiguraGeometrica();
		FiguraGeometrica f5 = new FiguraGeometrica();
		System.out.println("circulo: " + f1.area(1));
		System.out.println("rectangulo: " + f2.area(4,3));
		System.out.println("triangulo: " + f3.area(4,8));
		System.out.println("trapecio: " + f4.area(2,4,6));
		System.out.println("pentagono: " + f5.area(5,3));
	}
}
