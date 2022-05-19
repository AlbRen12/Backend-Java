package practicaHarry;

public class DracoMalfoy {
    public static void main(String[] args) { def();}

    private static void def() {

        HP draco = new HP();
        draco.setNombre("Draco Lucius Malfoy");
        draco.setGenero("Masculino");
        draco.setCasa("Slytherin");
        draco.setBoggart("Sr. Voldemort");
        draco.setPatronus("Ninguno");

        String msg = "Soy Draco Malfoy y estoas son algunas de mis características";

        msg += "\nNombre: "+draco.getNombre();
        msg += "\nGenero: "+draco.getGenero();
        msg += "\nCasa: "+draco.getCasa();
        msg += "\nBoggart: "+draco.getBoggart();
        msg += "\nPatronus: "+draco.getPatronus();

        System.out.print(msg);

    }

}
