import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
    
        Scanner scanner = new Scanner(System.in);

        String palabraSecreta = "inteligencia";
        int intentosMax = 5;
        int intentos = 0;
        boolean palabraAdivinadada = false;

        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        for(int i = 0; i < letrasAdivinadas.length; i ++){
            letrasAdivinadas[i] = '_';
        }
       
        while (!palabraAdivinadada && intentos < intentosMax) {
            
            System.out.println("Palabra a adivinar " + String.valueOf(letrasAdivinadas));

            System.out.print("Ingreso una letra por favor: ");

            char letra = scanner.next().charAt(0);

            boolean letraCorrecta = false;

            for(int i = 0; i < palabraSecreta.length(); i++){
                if (palabraSecreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;

                    letraCorrecta = true;
                } 
            }

            if (!letraCorrecta) {
                intentos ++;
                System.out.println("Incorrecto! Te quedan " + (intentosMax - intentos) + " intentos");
            }

            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                palabraAdivinadada = true;
                System.out.println("Felicidades la palabra es: " + palabraSecreta);
            }
        }

        if (intentos == intentosMax) {
            System.out.println("GAME OVER" +
                                "\n No tienes mas intentos");
        }

    }
}
