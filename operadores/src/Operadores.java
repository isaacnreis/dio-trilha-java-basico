public class Operadores {
    public static void main(String[] args) throws Exception {

        //Referencia https://glysns.gitbook.io/java-basico/sintaxe/operadores

        String nome = "GLEYSON";
        int idade = 22;
        double peso = 68.5;
        char sexo = 'M';
        boolean doadorOrgao = false;
        //Date dataNascimento = new Date();

        // classe Operadores.java
        int a, b;

        a = 5;
        b = 6;

        /* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        if(a==b)
        resultado = "verdadeiro";
        else
        resultado = "falso";
        */

        //MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        String resultado = (a==b) ? "verdadeiro" : "false";

        System.out.println(resultado);

        // ComparacaoAvancada.java
        /*public static void main(String[] args) {

            String nome1 = "JAVA";
            String nome2 = "JAVA";
            
                System.out.println(nome1 == nome2); //true

                String nome3 = new String("JAVA");
                
                System.out.println(nome1 == nome3); //false

                String nome4 = nome3;

                System.out.println(nome3 == nome4); //true
                
                //equals na parada
                System.out.println(nome1.equals(nome2)); //??
                System.out.println(nome2.equals(nome3)); //??
                System.out.println(nome3.equals(nome4)); //??

        }*/

}
}
