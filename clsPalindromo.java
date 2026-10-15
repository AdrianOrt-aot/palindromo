public class clsPalindromo {
    //Metodo main para probar la clase
    public static void main(String[] args) {
        clsPalindromo palindromo = new clsPalindromo();
        String palabra = "";

        if (palindromo.esPalindromo(palabra)) 
            System.out.println(palabra + " es un palindromo.");
        
        else 
            System.out.println(palabra + " no es un palindromo.");
    }

    //Metodo wrapper que recibe la cadena, la valida, la normaliza y llama al metodo recursivo para verificar si es un palindromo
    public boolean esPalindromo(String palabra) {
        //Se verifica si la palabra es nula para evitar errores de null pointer
        if (palabra == null) 
            return false;

        //Se convierte la palabra a minusculas para evitar errores de comparacion
        String palabraN = palabra.toLowerCase();

        //Se llama al metodo recursivo para verificar si la palabra es un palindromo
        return verificar(palabraN, 0, palabraN.length() - 1);
    }

    //Metodo recursivo para verificar si una palabra es un palindromo
    private boolean verificar(String palabra, int inicio, int fin) {
        //Caso base: se realiza de esta manera incio>fin para palabras de longitud impar e inicio==fin para palabras de longitud par
        if (inicio >= fin) 
            return true;

        //Si los caracteres en las posiciones inicio y fin no son iguales, la palabra no es un palindromo
        if (palabra.charAt(inicio) != palabra.charAt(fin)) 
            return false;

        //Llamada recursiva para verificar los siguientes caracteres
        return verificar(palabra, inicio + 1, fin - 1);
    }
}