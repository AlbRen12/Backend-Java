package practicaHarry;

public class HermioneGranger {
    public static void main(String[] args) { def();}

    private static void def() {

        HP hermione = new HP();
        hermione.setNombre("Hermione Granger");
        hermione.setGenero("Femenino");
        hermione.setCasa("Gryffindor");
        hermione.setBoggart("Fracaso");
        hermione.setPatronus("Nutria");

        String msg = "Soy Hermione Granger y estas son algunas de mis características";

        msg += "\nNombre: "+hermione.getNombre();
        msg += "\nGenero: "+hermione.getGenero();
        msg += "\nCasa: "+hermione.getCasa();
        msg += "\nBoggart: "+hermione.getBoggart();
        msg += "\nPatronus: "+hermione.getPatronus();

            System.out.println(msg);


    }
}
