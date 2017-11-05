package ex8;

/**
 * Contiene metodos orientados al manejo y validación de datos personales.
 * @author Marvin y Isaac
 */
public class PersonDataTools {
    /**
     * Comprueba si el String recibido por parametros contiene únicamente 
     * letras \p{L} y espacios en blanco \s.
     * @param string contains strng data to check
     * @return true or false
     */
    public static boolean onlyContainsLetters(String string) {
        boolean result = string.matches("^[\\p{L}\\s]+$");
        return result;
    }
    
    /**
     * Comprueba si el primer valor dado por parametros está entre el minimo y el maximo dado en los siguientes parametros.
     * @param number int Numero a comprobar.
     * @param min int Numero mas pequeño posible.
     * @param max int Numero mas grande posible.
     * @return boolean true si el numero a comprobar es igual o superior al mínimo y igual o inferior al maximo, falso en caso contrario.
     */
    public static boolean isBetween(int number, int min, int max) {
        boolean result = false;
        if(number >= min && number <= max) {
            result = true;
        }
        return result;
    }
    
    /**
     * Comprueba si el valor dado por parametros es un valor entero 'int'.
     * @param value String Contiene un numero entero.
     * @return boolean true si el String dado por parametros es un valor entero, false en caso contrario.
     */
    public static boolean isInteger(String value) {
        boolean result = false;
        try {
            Integer.parseInt(value);
            result = true;
        } catch(NumberFormatException e) {
            result = false;
        }
        return result;
    }
    /**
     * Comprueba si el valor dado por parametros es un valor decimal 'double'.
     * @param value String Contiene un numero decimal.
     * @return boolean true si el String dado por parametros es un valor decimal, false en caso contrario.
     */
    public static boolean isDouble(String value) {
        boolean result = false;
        try {
            Double.parseDouble(value);
            result = true;
        } catch(NumberFormatException e) {
            result = false;
        }
        return result;
    }
    
    /**
     * Comprueba si el String recibido por parametros es un DNI valido.
     * @param dni String DNI a validar.
     * @return true en caso de que pase la validación de DNI, caso contrario devuelve false.
     */
    public static boolean isDni(String dni) {
        boolean flag = false;
        dni=dni.toUpperCase();
        if (dni.matches("[0-9]{8}[A-Z]{1}")) {
            String dniLetters = "TRWAGMYFPDXBNJZSQVHLCKE";
            char correctLetter = dniLetters.charAt(Integer.parseInt(dni.substring(0, dni.length() - 1)) % 23);
            if (correctLetter == dni.charAt(dni.length() - 1)) {
                flag = true;
            }
        }
        return flag;
    }
    
    /**
     * Checks an input string to verify that it matches the email format
     * Comprueba si el String recibido por parametros es un correo electrónico valido.
     * @param email String Email a validar.
     * @return true En caso de que pase la validación de correo electrónico o false en caso contrario.
     */
    public static boolean isEmail(String email) {
        boolean result = email.matches("^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@[a-z0-9-]+(\\.[a-z0-9-]+)*(\\.[a-z]{2,3})$");
        return result;
    }
}
