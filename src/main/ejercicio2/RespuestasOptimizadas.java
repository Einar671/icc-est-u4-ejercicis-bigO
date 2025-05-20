package main.ejercicio2;

import java.util.HashSet;
import java.util.Set;

public class RespuestasOptimizadas {
    // El estudiante debe escribir aquí las versiones optimizadas y las
    // complejidades

    // 1. Versión optimizada de tieneDuplicados (Complejidad anotada en la variable)
    public static String tieneDuplicadosComplejidad = "O(n)"; // Ej: "O(n)"

    public static boolean tieneDuplicadosOpt(int[] arr) {
        Set<Integer> vistos = new HashSet<>();
            for (int n : arr) {
                if (vistos.contains(n)) {
                     return true;
        }
        vistos.add(n);
    }
    return false;
}

    // 2. Versión optimizada de contarMayores (Complejidad anotada en la variable)
    public static String contarMayoresComplejidad = ""; // Ej: "O(n)"

    public static int contarMayoresOpt(int[] arr, int x) {
    int count = 0;
    int maxHastaAhora = Integer.MIN_VALUE;

    for (int valor : arr) {
        if (valor > x && valor >= maxHastaAhora) {
            count++;
        }
        if (valor > maxHastaAhora) {
            maxHastaAhora = valor;
        }
    }
    return count;
}

    // 3. Versión optimizada de encontrarMaximo (Complejidad anotada en la variable)
    public static String encontrarMaximoComplejidad = ""; // Ej: "O(n)"

    public static int encontrarMaximoOpt(int[] arr) {
        
        return 0;
    }
}
