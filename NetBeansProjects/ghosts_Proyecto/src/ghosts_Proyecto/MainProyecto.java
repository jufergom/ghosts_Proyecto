/*
**************Este es el main de todo el programa aca cree los arreglos para guardar los nombres
de usuarios y las contraseñas y asi queden almacenadas hasta que el programa se cierre**************
 */
package ghosts_Proyecto;


public class MainProyecto {
//comentario
    public static Usuario usuarios[];//el arreglo donde se almacenaran los nombres de usuarios
    public static MenuCrearUsuario crear = new MenuCrearUsuario();//creo un objeto de la clase MenuCrearUusario
    private static int contador;// es un contador que se usa mas abajo....
    public static Menu_inicio m = new Menu_inicio();// crea un objeto de la clase Menu_inicio
    //public static JuegoTablero nm = new JuegoTablero();
    

    public static void main(String[] args) {
        usuarios = new Usuario[100];//aca instancio el arreglo que cree arriba y le asigno hasta cuantos usuarios podra almacenar
/******Este ciclo for hace que se creen 100 usuarios, pero con campos vacios sin nada almacenados
 esto lo hago para que a la hora de preguntar si hay algo almacenado en el arreglo me diga que si hay ya pero vacios.
 */
        for (int i = 0; i < 100; i++) {
            usuarios[i] = new Usuario("","");
        }
        
        contador = 0;//este es el contador que inicialize arriba, aca le asigno valor
        m.setVisible(true);//aca llamo para que sea visible el Menu de incio y aparezca.
    }
//**********Este es el metodo usado para poder crear un nuevo usuario*************
    public static void crearUsuario(String nombUsuario, String contra) {
        usuarios[contador].setNombUsuario(nombUsuario);//aca se hace uso del metodo set para agregar un nombre de usuario en la posicion que tenga de numero la variable contador
        usuarios[contador].setContra(contra);//aca se hace lo mismo que la de arriba solo que para la contraseña
        contador++;// se aumenta la variable contador para que luego que se ingrese otro usuario sea almacenado en otra posicion distinta
    }
    public static int posicionUsuario;
        
//*******Este metodo sirve para comprobar si el nombre del usuario ya esta*************8
    public static boolean comprobarUsuario(String nombUsuario) {
        boolean k = false;
//este for itera en cada uno de los usuarios que esten almacenados en el arreglo Usuarios.
        for (int x = 0; x < 100; x++) {
            String a = usuarios[x].getNombUsuario();
            if (a.equals(nombUsuario)) {
                    posicionUsuario = x;
                    return true;
            }
        }
        return k;

    }
// este metodo es parecido al de comprobarUsuario, solo que aca se comprueba usuario y contraseña
    public static boolean comprobarUsuarioIni(String nombUsuario, String contra) {
        boolean k = false;
        for (int x = 0; x < 100; x++) {
            String a = usuarios[x].getNombUsuario();
            String b = usuarios[x].getContra();
            if (a.equals(nombUsuario) && b.equals(contra)) {
                    return true;
            }
        }
        return k;

    }
    int cantGhosts;
    public static int randomio(int max){
        int numAleatorio = (int) (Math.random() * max) + 1;
        return numAleatorio;
    }
}