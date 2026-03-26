public class PacienteVip extends Paciente{

    private int aniosFidelidad;

    public PacienteVip() {
    }

    public PacienteVip(double costoConsulta, int documento, String nombre, int aniosFidelidad) {
        super(costoConsulta, documento, nombre);
        this.aniosFidelidad = aniosFidelidad;
    }

    public int getAniosFidelidad() {
        return aniosFidelidad;
    }

    public void setAniosFidelidad(int aniosFidelidad) {
        this.aniosFidelidad = aniosFidelidad;
    }

    @Override
    public String toString() {
        return "PacienteVip: " + " Nombre: " + nombre+
                ", Documento: " + documento +
                "  aniosFidelidad: " + aniosFidelidad +
                ",  CostoConsulta: " + costoConsulta + '\'';
    }
    @Override
    public double calcularCostoFinal(){
        double costoFinal = 0;
        if (costoFinal < 300000){
            if (aniosFidelidad== 10){
                System.out.println("Se le asigna un descuento de 40% ");
                System.out.println(costoFinal = costoConsulta-(costoConsulta * (40 / 100.0)));

            } else if (aniosFidelidad == 5) {
                System.out.println("Se le asigna un descuento de 30% ");
                System.out.println(costoFinal = costoConsulta-(costoConsulta*(30/100.0)));

            } else if (aniosFidelidad != (10 & 5)) {
                System.out.println(" Se le asigna un descuento de 20% ");
                System.out.println(costoFinal = costoConsulta-(costoConsulta*(20/100.0)));

            }else {
                System.out.println(costoConsulta);
            }
        }else {
            System.out.println("El valor supera a los 300000");
        }
        return (costoFinal);
    }

    @Override
    public String mostrarInfo(){
        return "Nombre: " + nombre +
                "\nDocumento: " + documento +
                "\nAños fidelidad: " + aniosFidelidad +
                "\nCosto consulta: " + costoConsulta +
                "\nCosto final: " + calcularCostoFinal() + "\n";
    }

}
