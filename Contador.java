
public class Contador
{
   private int cuenta;
   private final String id;
   
   public Contador(String id) {
    this.id = id;
        cuenta = 0;
    }
   public void incrementar() {
    cuenta = cuenta + 1;
    }
   public void decrementar() {
    cuenta = cuenta - 1;
    }
   public int incrementos() {
    return cuenta;
    }
   public String toString() {
       String msj = "\n id: "+ id +"\n cuenta: "+ cuenta;
       return msj;
    }
}
