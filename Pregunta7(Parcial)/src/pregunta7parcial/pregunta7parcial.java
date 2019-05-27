package pregunta7parcial;

public class pregunta7parcial {
	public static void main(String[] args) {
		int x=4, w=9;
		int i1=0;
		for (int i=-1;i<20;i+=3) {
			x++;
			for(int q=4;q<11;q++) {
				do {
					i=+3;
					w=4;
					i=x+w;
					x=w+i;
					i1=i;
				}while(x<15);
			}
		}
		System.out.println("x:"+x+" "+"i:"+i1);
	}

	}
// la consola nos dara el valor de x:69 i:65




	


