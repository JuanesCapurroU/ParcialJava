package org.example;

public class CabinaTelefonica {

    private int codigoCabina;
    private int numeroDeLlamadas;
    private int duracionLlamadas;
    private Double costoLlamadas;

    public CabinaTelefonica() {

    }

    public CabinaTelefonica(int codigoCabina, int numeroDeLlamadas, int duracionLlamadas, Double costoLlamadas) {
        this.codigoCabina = codigoCabina;
        this.numeroDeLlamadas = numeroDeLlamadas;
        this.duracionLlamadas = duracionLlamadas;
        this.costoLlamadas = costoLlamadas;
    }

    public int getCodigoCabina() {
        return codigoCabina;
    }

    public void setCodigoCabina(int codigoCabina) {
        this.codigoCabina = codigoCabina;
    }

    public int getNumeroDeLlamadas() {
        return numeroDeLlamadas;
    }

    public void setNumeroDeLlamadas(int numeroDeLlamadas) {
        this.numeroDeLlamadas = numeroDeLlamadas;
    }

    public int getDuracionLlamadas() {
        return duracionLlamadas;
    }

    public void setDuracionLlamadas(int duracionLlamadas) {
        this.duracionLlamadas = duracionLlamadas;
    }

    public Double getCostoLlamadas() {
        return costoLlamadas;
    }

    public void setCostoLlamadas(Double costoLlamadas) {
        this.costoLlamadas = costoLlamadas;
    }

    @Override
    public String toString() {
        return "CabinaTelefonica{" +
                "codigoCabina=" + codigoCabina +
                ", numeroDeLlamadas=" + numeroDeLlamadas +
                ", duracionLlamadas=" + duracionLlamadas +
                ", costoLlamadas=" + costoLlamadas +
                '}';
    }

    public void hacerLlamadaLocal(int duracionLlamadas){
        int calculo= duracionLlamadas * 50;
        this.costoLlamadas+= calculo;
        numeroDeLlamadas+=1;
        this.duracionLlamadas+=duracionLlamadas;
        System.out.println("La duracion de esta llanada en minutos fue: "+ duracionLlamadas + " el costo fue: "+calculo);


    }
    public void hacerLlamadaLargaDistancia(int duracionLlamadas){

        int calculo= duracionLlamadas * 350;
        this.costoLlamadas+= calculo;
        numeroDeLlamadas+=1;
        this.duracionLlamadas+=duracionLlamadas;
        System.out.println("La duracion de esta llanada en minutos fue: "+ duracionLlamadas + " el costo fue: "+calculo);

    }
    public void hacerLlamadaCelular(int duracionLlamadas){
        int calculo= duracionLlamadas * 150;
        this.costoLlamadas+= calculo;
        numeroDeLlamadas+=1;
        this.duracionLlamadas+=duracionLlamadas;
        System.out.println("La duracion de esta llanada en minutos fue: "+ duracionLlamadas + " el costo fue: "+calculo);
    }

    public void mostrarInfo(){
        System.out.println("El ID de la cabina seleccionada es: "+codigoCabina);
        System.out.println("El numero de llamadas que ha tenido es: "+ numeroDeLlamadas);
        System.out.println("Duracion total de llamadas: "+ duracionLlamadas);
        System.out.println("El costo total de todas las llamadas han sido de: $"+costoLlamadas);
    }
    public void reiniciarCabina(){
        numeroDeLlamadas=0;
        duracionLlamadas=0;
        costoLlamadas=0.0;
    }
}
