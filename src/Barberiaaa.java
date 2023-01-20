import java.util.ArrayList;

public class Barberiaaa {
    public int getCapacidad() {
        return capacidad;
    }

    private final int capacidad;

    public ArrayList<Persona> getClientesArray() {
        return clientesArray;
    }

    private ArrayList<Persona> clientesArray=new ArrayList<>();
    private Barbero barbero;

    Barberiaaa(int t){
        capacidad=t;
    }
    public synchronized boolean entrar(Persona cliente) throws InterruptedException {
        if(clientesArray.size()>=capacidad){return false;}
        else if(barbero.getBarber()== Barbero.EstatBarber.OCUPAT){
            clientesArray.add(cliente);
            System.out.println(cliente.getName() + " Esperant el seu torn cadira: "+clientesArray.size());
            wait();
        }
        else {
            clientesArray.add(cliente);
            barbero.setBarber(Barbero.EstatBarber.OCUPAT);
            System.out.println(clientesArray.get(0).getName()+" Tallant-se el cabell");
            barbero.tallarCabell();

        }

    return true;}
    public synchronized void sortir(Persona p) {
        barbero.setBarber(Barbero.EstatBarber.LLIURE);
        System.out.println(p.getName()+" surt!");
        clientesArray.remove(p);
        notify();
    }
    public synchronized void setBarbero(Barbero barbero) {
        this.barbero = barbero;
    }
}
