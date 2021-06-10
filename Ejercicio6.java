import java.util.* ;
public class Ejercicio6{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//me son las edades >= 25
		// ne son las edades < 25
		//e es edad
		int me = 0;
		int i = 0;
		int ne = 0;
		int suma1 = 0;
		int suma2 = 0;
		double p1;
		double p2;

		System.out.println("");
		System.out.println("*********Ejercicio6************");
		System.out.println("");

		while(i <= 100){
			int aleatorio = (int)(Math.random()*100+1);
			System.out.println(aleatorio + "");
			if(aleatorio < 25){
				suma1 = suma1 + aleatorio;
				ne = ne + 1;
			}
			if(aleatorio >= 25){
				suma2 = suma2 + aleatorio;
				me = me + 1;
			}
			i= i + 1;
		}

		p1 = suma1 / ne;
		p2 = suma2 / me;


		System.out.println("El promedio de las edades >=25 es: " + p2);
		System.out.println("El promedio de las edades <25 es: " + p1);
		
	}
}