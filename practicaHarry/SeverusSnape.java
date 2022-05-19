package practicaHarry;

public class SeverusSnape {
    public static void main(String[] args) { def();}

    private static void def() {

        HP severus = new HP();
        severus.setNombre("Severus Snape");
        severus.setGenero("Masculino");
        severus.setCasa("Slytherin");
        severus.setBoggart("Sr Voldemort");
        severus.setPatronus("Fulano");

        String msg = "Soy Severus Snape y estas son algunas de mis características";

        msg += "\nNombre: "+severus.getNombre();
        msg += "\nGenero: "+severus.getGenero();
        msg += "\nCasa: "+severus.getCasa();
        msg += "\nBoggart: "+severus.getBoggart();
        msg += "\nPatronus: "+severus.getPatronus();

        System.out.print(msg);

    }
}
