package practicaHarry;

public class HarryPotter {
    public static void main(String[] args) {
        def();
    }

    private static void def() {

        HP harry = new HP();
        harry.setNombre("Harry Potter");
        harry.setGenero("Masculino");
        harry.setCasa("Gryffindor");
        harry.setBoggart("Dementor");
        harry.setPatronus("Ciervo");

        String msg = "Soy Harry Potter y estas son algunas de mis características";

        msg += "\nNombre: "+harry.getNombre();
        msg += "\nGenero: "+harry.getGenero();
        msg += "\nCasa: "+harry.getCasa();
        msg += "\nBoggart: "+harry.getBoggart();
        msg += "\nPatronus: "+harry.getPatronus();


        System.out.print(msg);

    }
}
