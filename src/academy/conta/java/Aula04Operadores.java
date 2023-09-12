package academy.conta.java;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 /(double) numero02;
        System.out.println(resultado);

        // %
        int resto = 21 % 7;
        System.out.println(resto);

        // < > <= >=  == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10.0;
        boolean isDezDiferenteDez = 10 != 10.0;
        System.out.println("is dez maior que vinte "+isDezMaiorQueVinte);
        System.out.println("is dez menor que vinte "+isDezMenorQueVinte);
        System.out.println("is dez Igual vinte "+isDezIgualVinte);
        System.out.println("is dez Igual Dez "+isDezIgualDez);
        System.out.println("is dez diferente Dez "+isDezDiferenteDez);


        // && (AND) || (OR)
        int age = 32;
        float salario = 3500;
        boolean isDentrodaleiMaiorQueTrinta = age > 30 && salario >= 4612;
        boolean isDentrodaleiMenorQueTrinta = age < 30 && salario >= 3381;

        System.out.println("is Dentro Da Lei Maior Que Trinta"+isDentrodaleiMaiorQueTrinta);
        System.out.println("is Dentro Da Lei Menor Que Trinta"+isDentrodaleiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupança = 10000;
        float valorPlaystation = 5000;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupança >valorPlaystation;
        System.out.println("is playstation cinco compravel "+isPlaystationCincoCompravel);

        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        // ++ --
        int contador = 0;
        contador++;
        contador--;
        System.out.println(contador);

    }
}
