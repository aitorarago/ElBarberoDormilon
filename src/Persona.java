import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class Persona extends Thread{
    Barbero barbero;
    Barberiaaa sala_espera;
    Persona(Barbero b, String e, Barberiaaa sala_espera) {
        super(e);
        barbero=b;
        this.sala_espera=sala_espera;

    }
    Persona(String e){
        super(e);
    }

    @Override
    public void run() {
        for(;;){
        try {
        Thread.sleep((long) (Math.random() * 1000) +700);

        if(sala_espera.getClientesArray().size()<sala_espera.getCapacidad()){

                boolean o =sala_espera.entrar(this);
                if(o)sala_espera.sortir(this);
                try {
                    Thread.sleep((long) (Math.random() * 10) +7000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            else {
                Thread.sleep((long) (Math.random() * 30) +100);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
            }
        }
    }
}