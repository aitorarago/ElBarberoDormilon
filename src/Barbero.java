public class Barbero extends Persona{

    Barbero( String e, Barberiaaa sala_espera) {
        super(e);
        barber=EstatBarber.LLIURE;
        this.sala_espera=sala_espera;
    }

    enum EstatBarber{
        LLIURE, OCUPAT}
    private EstatBarber barber;
    Barberiaaa sala_espera;

    public EstatBarber getBarber() {
        return barber;
    }

    public void setBarber(EstatBarber barber) {
        this.barber = barber;
    }
    @Override
    public void run() {
        for(;;){
           if(barber!=EstatBarber.OCUPAT && sala_espera.getClientesArray().size()==0)dormir();
           else tallarCabell();
        }
    }
    public void tallarCabell(){
        try {
            Thread.sleep((long) (Math.random() * 1000)+5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void dormir(){
        System.out.println(" durmiintt...!");
        try {
            Thread.sleep((long) (Math.random() * 1000) +1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
