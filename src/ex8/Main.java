package ex8;

import java.util.Scanner;

/**
 * Esta clase contiene el desarrollo del ejercício 8:
 *  8.- En un programa se'ns demanen els següents camps: nom complet (nom i 
 *  almenys un cognom), DNI sencer,  l'edat, el pes, el sexe (entre les opcions   
 *  d' home i dona), l'estat civil (entre les opcions de solter, casat i 
 *  altres), i el correu electrònic. 
 *  Un cop introduïts el programa és capaç de dir quins errors hem fet i, en cas 
 *  de no fer-ne cap, ens torna els valors introduïts.
 *  NOTA: 
 *      - El nom complet només pot contenir lletres i espais en blanc
 *      - El DNI ha de ser vàlid.
 *      - L'edat ha de ser un enter entre 1 i 100 anys.
 *      - El pes ha de ser un double entre 30 i 200 Kg.
 *      - El correu electrònic ha de ser vàlid.
 * @author Marvin y Isaac
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);  //crear un objeto Scanner
        
        Person p = new Person();
        
        System.out.println("------Escribe tus datos-----\n");
        System.out.println("Nombre:");
        p.setNombre(sc.nextLine());
        System.out.println("DNI:");
        p.setDni(sc.next());
        System.out.println("Edad:");
        p.setEdad(sc.nextInt());
        System.out.println("Peso:");
        p.setPeso(sc.nextDouble());
        System.out.println("Email:");
        p.setCorreo(sc.next());
        
        System.out.println(p.toString());
        
        //comprovamos que nombre sea correcto
        if(PersonDataTools.onlyContainsLetters(p.getNombre())) {
            System.out.println("Nombre valido\n");
        } else {
            System.out.println("*Nombre no valido*\n");
        }
        
        //comprobamos que el DNI es correcto
        if(PersonDataTools.isDni(p.getDni())) {
            System.out.println("DNI valido\n");
        } else {
            System.out.println("*DNI no valido*\n");
        }
        
        //comprobamos la edad que sea entre 1-100
        if(PersonDataTools.isBetween(p.getEdad(),1,100)) {
            System.out.println("Edad valida\n");
        } else {
            System.out.println("*Edad no valido*\n");
        }
        
        //comprobamos el peso que sea entre 30-200 Kg
        if(PersonDataTools.isBetween(p.getPeso(),30,100)) {
            System.out.println("Peso valido\n");
        } else {
            System.out.println("*Peso no valido*\n");
        }
        
        //comprobamos que el correo introducido sea correcto.
        if(PersonDataTools.isEmail(p.getCorreo())) {
            System.out.println("Email valido\n");
        } else {
            System.out.println("*Email no valido*\n");
        }
        
    }
    
}
