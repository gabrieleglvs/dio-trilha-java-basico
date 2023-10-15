// CONDICIONAL COMPOSTA - ResultadoEscolar.java
public class ResultadoEscolar {
    public static void main(String[] args) {

       int nota = 6;
       
       if(nota >= 7)
        System.out.println("Aprovado");

       else
        System.out.println("Reprovado");
    }

    //ENCADEADA
    /*
     * int nota = 6;

	if (nota >= 7)
		System.out.println("Aprovado");
	else if (nota >= 5 && nota < 7)
		System.out.println("Recuperação");
	else
		System.out.println("Reprovado");
     */

    //TERNÁRIO - CENÁRIO 1
    /*
    * int nota = 7;
	String resultado = nota >=7 ? "Aprovado" : "Reprovado";
	System.out.println(resultado);
    */

    //TERNÁRIO - CENÁRIO 2
    /*
     * int nota = 6;
	String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
	System.out.println(resultado);
     */
}