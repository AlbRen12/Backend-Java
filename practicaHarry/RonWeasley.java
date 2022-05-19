package practicaHarry;

public class RonWeasley {
    public static void main(String[] args) { def();}

    private static void def() {

        HP ron = new HP();
        ron.setNombre("Ronald Weasley");
        ron.setGenero("Masculino");
        ron.setCasa("Gryffindor");
        ron.setBoggart("Aragog");
        ron.setPatronus("Jack Russell terrier");

        String msg = "Soy Ron Weasley y estas son algunas de mis características";

        msg += "\nNombre: "+ron.getNombre();
        msg += "\nGenero: "+ron.getGenero();
        msg += "\nCasa: "+ron.getCasa();
        msg += "\nBoggart: "+ron.getBoggart();
        msg += "\nPatronus: "+ron.getPatronus();

        System.out.print(msg);

    }
}
