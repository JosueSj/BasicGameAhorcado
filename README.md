>[!NOTE]
>El juego distingue entre letras correctas e incorrectas. Las letras correctas se muestran en la posición correspondiente en la palabra a adivinar.

> [!TIP]
> Puedes modificar la palabra secreta y los intentos máximos cambiando los valores en las siguientes líneas de código:  
> ```java
> String palabraSecreta = "inteligencia"; // Cambia la palabra secreta aquí
> int intentosMax = 5;                    // Cambia el número máximo de intentos aquí
> ```

> [!IMPORTANT]
> Actualmente, no hay opción para que el jugador reinicie el juego sin cerrar y volver a ejecutar el programa.
> El programa no maneja casos donde el jugador ingrese símbolos, números o espacios en blanco.

> [!WARNING]
> Si el jugador agota todos sus intentos sin adivinar la palabra, el juego terminará con un mensaje de "GAME OVER".

> [!CAUTION]
> El programa es sensible a las mayúsculas y minúsculas. Asegúrate de ingresar letras en minúsculas, ya que la palabra secreta está en minúsculas. Si ingresas una letra mayúscula, el programa no la reconocerá como correcta.

**Future improvements:**
- Implementar soporte para distinguir entre mayúsculas y minúsculas.
- Añadir la opción de que el jugador pueda reiniciar el juego tras "GAME OVER".
- Añadir una interfaz gráfica para una mejor experiencia de usuario.