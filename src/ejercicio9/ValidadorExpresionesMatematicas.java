package ejercicio9;

import java.util.Stack;
import java.util.Scanner;

public class ValidadorExpresionesMatematicas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la expresión matemática: ");
        String expresion = scanner.nextLine();

        if (validarExpresion(expresion)) {
            System.out.println("La expresión es válida.");
        } else {
            System.out.println("La expresión no es válida. Inténtelo de nuevo.");
        }
    }

    public static boolean validarExpresion(String expresion) {
        return comprobarSintaxis(expresion) && verificarParentesisBalanceados(expresion);
    }

    public static boolean comprobarSintaxis(String expresion) {
        String caracteresValidos = "0123456789+-*/()";

        for (char c : expresion.toCharArray()) {
            if (caracteresValidos.indexOf(c) == -1) {
                return false; // Carácter no válido
            }
        }

        return true;
    }

    public static boolean verificarParentesisBalanceados(String expresion) {
        Stack<Character> stack = new Stack<>();

        for (char c : expresion.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty() || !esParValido(stack.pop(), c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static boolean esParValido(char parAbierto, char parCerrado) {
        return (parAbierto == '(' && parCerrado == ')') ||
                (parAbierto == '[' && parCerrado == ']') ||
                (parAbierto == '{' && parCerrado == '}');
    }
}
