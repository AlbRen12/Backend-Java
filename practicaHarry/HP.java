package practicaHarry;

public class HP {

    public String nombre, genero, casa, boggart, patronus;

    public String getNombre(){  return nombre;  }
    public String getGenero(){  return genero;  }
    public String getCasa(){  return casa;  }
    public String getBoggart(){  return boggart;  }
    public String getPatronus(){  return patronus;  }


    public boolean setNombre(String nombre){
        if(!nombre.isEmpty()){
            this.nombre = nombre;
            return true;
        } else
            return false;
    }

    public boolean setGenero(String genero){
        if(!genero.isEmpty()){
            this.genero = genero;
            return true;
        } else
            return false;
    }

    public boolean setCasa(String casa){
        if(!casa.isEmpty()){
            this.casa = casa;
            return true;
        } else
            return false;
    }

    public boolean setBoggart(String boggart){
        if(!boggart.isEmpty()){
            this.boggart = boggart;
            return true;
        } else
            return false;
    }

    public boolean setPatronus(String patronus){
        if(!patronus.isEmpty()){
            this.patronus = patronus;
            return true;
        } else
            return false;
    }

    public String printState() {
        return "Nombre" + nombre + "\n" +
                "Genero" + genero + "\n" +
                "Casa" + casa + "\n" +
                "Boggart" + boggart + "\n" +
                "Patronus" + patronus;
    }
}
