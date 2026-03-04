public class Recursao {
    
    //Multiplicação de dois números naturais, através de somas sucessivas (Ex.: 6 ∗ 4 = 4 + 4 + 4 + 4 + 4 + 4).
    public static int multiplicar(int a, int b) {
       if (a == 0 || b == 0) {
        return 0;
       }
       if (a == 1) {
        return b;
       }
       return b + multiplicar(a - 1, b);
    }

    //Soma de dois números naturais, através de incrementos sucessivos (Ex.: 3 + 2 = + + (+ + + 1)).
    public static int somar(int a, int b){
        if (b == 0){
            return a;
        }
        return somar(a+1,b-1);
    }

    // 3. Cálculo da série harmônica: 1 + 1/2 + 1/3 + ... + 1/N
    public static double serieHarmonica (int a) {
        if (a==1) return 1.0;
        return (1.0/a) + serieHarmonica(a-1);
    }
    
    //inverter String
    public static String inverterString(String s){
        if (s.isEmpty() || s.length() == 1) return s;
        return s.charAt(s.length() - 1) + inverterString(s.substring(0, s.length() - 1));
    }

    /*
    Gerador da sequência dada por:
        F(1) = 1
        F(2) = 2
        F(n) = 2 ∗ F(n − 1) + 3 ∗ F(n − 2). 
        */
    public static int sequenciaDada(int n){
        if (n==1) return 1;
        if (n==2) return 2;
        return 2*sequenciaDada(n-1)+3*sequenciaDada(n-2);
    }
}
