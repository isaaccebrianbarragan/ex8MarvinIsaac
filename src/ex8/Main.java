package ex8;

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
        if(PersonDataTools.onlyContainsLetters("Asdflkjsaáàâ askjaskjsaK s")) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
    
}
