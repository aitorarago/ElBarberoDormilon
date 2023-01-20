public class Main {
    public static void main(String[] args) {
        /*Este problema fue planteado por Edsger Dijkstra. Una barbería tiene una sala de
        espera con N sillas, más la silla de barbero. Si no hay clientes, el barbero se echa a
        dormir. Si un cliente entra en la barbería y encuentra todas las sillas ocupadas, se
        marcha de la barbería. Si el barbero está ocupado, pero hay sillas disponibles, el cliente
        se sienta en una de ellas. Si el barbero está dormido, el cliente lo despierta. Se trata de
        escribir un programa que coordine al barbero y los clientes, cada uno de los cuales se
        corresponde con un hilo*/
        Barberiaaa barbershop = new Barberiaaa(3);
        Barbero barbero = new Barbero("Antonio",barbershop);
        barbershop.setBarbero(barbero);
        Persona home1 = new Persona(barbero,"PEP",barbershop);
        Persona home2 = new Persona(barbero,"MARCOS",barbershop);
        Persona home3 = new Persona(barbero,"JUAN",barbershop);
        Persona dona1 = new Persona(barbero,"MARIA",barbershop);
        Persona dona2 = new Persona(barbero,"IRENE",barbershop);
        Persona dona3 = new Persona(barbero,"SARA",barbershop);
        Persona nen1 = new Persona(barbero,"IKER",barbershop);
        Persona nen2 = new Persona(barbero,"PAULA",barbershop);
        Persona nen3 = new Persona(barbero,"RICARD",barbershop);
        barbero.start();
        dona1.start();
        dona2.start();
        dona3.start();
        home1.start();
        home2.start();
        home3.start();
        //nen1.start();
        //nen2.start();
        //nen3.start();

    }
}