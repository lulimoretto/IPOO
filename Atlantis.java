public class Atlantis {

    private static final int capacidad_Tanque = 50000;

    private int combustible;
    private boolean enOrbita;
    private Capsula cap;

    public Atlantis(Capsula cap){
        combustible = capacidad_Tanque;
        enOrbita = false;
        cap = this.cap; //porque cap = cap;
    }
    public void colocarSacarDeOrbita(){
        enOrbita = !enOrbita;
    }
    public void copy(Atlantis a){
        combustible = obtenerCombustible();
        enOrbita = obtenerEnOrbita();
        cap.copy(a.obtenerCapsula());
    }
    public boolean puedeDespegar(){
        boolean puede = false; // boolean aux
        if (!enOrbita && cap.obtenerPureza() == 'e'); 
        //para usar un metodo de la clase capsula uso mi atributo de instacia (cap) de la clase Capsula
        return puede;
    }
    public Atlantis clone(){ // le doy los mismos atributos a a
        Atlantis a = new Atlantis(cap.clone());
        a.establecerCombustible(combustible);
        if (enOrbita)
        a.colocarSacarDeOrbita(); 
    }
    public boolean equals (Atlantis a){
        return combustible == a.obtenerCombustible() && enOrbita == a.obtenerEnOrbita() && cap == a.obtenerCapsula();
    }
    public Atlantis coheteConMasTripulacion(Atlantis a){
        Atlantis cohete = null;
        if (cap.obtenerTripulacion() > a.obtenerCapsula().obtenerTripulacion()) 
            cohete = this;
        //a.obtenerCapsula() es un objeto de tipo Capsula y a ese le puedo pedir la tripulacion porque es un metodo de la clase Capsula
        else {
            if (cap.obtenerCapsula() <  a.obtenerCapsula().obtenerTripulacion())
            return cohete;
        }

    }
      



    
}
//cuando es en profundidad llamo al mismo metodo
//cuando es superficial no llamo al metodo