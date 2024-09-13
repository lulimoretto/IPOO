public class Capsula {
    
    private int tripulacion;
    private char purezaOxigeno;

    // constructor se llama igual que la clase
public Capsula(int trip; char pureza){
    tripulacion = trip; //primero atributos de instancia, luego parametros
    purezaOxigeno = pureza;
}
public void copy(Capsula c){
    tripulacion = c.obtenerTripulacion();
    purezaOxigeno = c.obtenerPureza();
}
public Capsula clone(){
    Capsula c = new Capsula(tripulacion, purezaOxigeno); //le paso mis atributos porque quiero que sea igual a mi capsula
    return c;    
}
public boolean equals(Capsula c){
    // como esta ligado no verifico
    return tripulacion == c.obtenerTripulacion() && purezaOxigeno == c.obtenerPureza();
}    
}