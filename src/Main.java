public class Main {

    public static void main(String[] args) {
        System.out.println("=== Bateria de Testes - Exercícios de POA ===");

        
        // 1. Multiplicação
        System.out.println("\n1. Multiplicação (6 * 4): " + Recursao.multiplicar(6, 4)); // Esperado: 24

        // 2. Soma
        System.out.println("2. Soma (3 + 2): " + Recursao.somar(3, 2)); // Esperado: 5

        // 3. Série Harmônica (1 + 1/2 + 1/3 + 1/4)
        System.out.println("3. Série Harmônica (A=4): " + Recursao.serieHarmonica(4)); // Esperado: ~2.0833

        // 4. Inversão de String
        System.out.println("4. Inversão de String ('algoritmo'): " + Recursao.inverterString("algoritmo")); // Esperado: omtirogla

        // 5. Sequência F(n)
        System.out.println("5. Sequência F(4): " + Recursao.sequenciaDada(4)); // Esperado: F(4)=20)
/*
        // 6. Função de Ackerman
        System.out.println("6. Ackerman A(2, 2): " + Recursao.ackerman(2, 2)); // Esperado: 7
/*
        // 7. Vetor (Soma e Produto)
        int[] vetor = {2, 3, 4, 5};
        System.out.println("\n7. Vetor de teste: [2, 3, 4, 5]");
        System.out.println("   -> Soma do Vetor: " + Recursao.somaVetor(vetor, 0)); // Esperado: 14
        System.out.println("   -> Produto do Vetor: " + Recursao.produtoVetor(vetor, 0)); // Esperado: 120
/*
        // 8. Palíndromo
        System.out.println("\n8. Palíndromo ('abcba'): " + Recursao.isPalindromo("abcba")); // Esperado: true
        System.out.println("   Palíndromo ('xyzzyx'): " + Recursao.isPalindromo("xyzzyx")); // Esperado: true
        System.out.println("   Palíndromo ('pucrs'): " + Recursao.isPalindromo("pucrs")); // Esperado: false
/*
        // 9. Permutações
        System.out.println("\n9. Permutações com 3 letras (n=3):");
        Recursao.iniciarPermutacoes(3); 
        // Esperado: ABC, ACB, BAC, BCA, CAB, CBA (em linhas separadas)
/*
        // 10. Fibonacci Generalizado
        // Usando f0=2, f1=4. A sequência seria: 2, 4, 6, 10, 16, 26...
        System.out.println("\n10. Fibonacci Generalizado (f0=2, f1=4, n=5): " + Recursao.fibonacciGeneralizado(2, 4, 5)); // Esperado: 26
         */

        System.out.println("\n=== Fim dos Testes ===");
    }
}