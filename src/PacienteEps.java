public class PacienteEps extends Paciente{

    private String nombreEps;

    public PacienteEps() {
    }

    public PacienteEps(double costoConsulta, int documento, String nombre, String nombreEps) {
        super(costoConsulta, documento, nombre);
        this.nombreEps = nombreEps;
    }

    public String getNombreEps() {
        return nombreEps;
    }

    public void setNombreEps(String nombreEps) {
        this.nombreEps = nombreEps;
    }

    @Override
    public String toString() {
        return "PacienteEps: " +  " Nombre: " + nombre +", documento=" + documento +
                ", NombreEps: '" + nombreEps + '\'' +
                ", Costo Consulta: " + costoConsulta + '\'' ;
    }

    @Override
    public double calcularCostoFinal(){
        double costoFinal = 0;
        if (costoConsulta == 300000){
            System.out.println("Se le asigna un descuento de 25% ");
            System.out.println(costoFinal = costoConsulta-(costoConsulta*(25/100.0))) ;

        } else if (costoConsulta == 200000) {
            System.out.println("Se le asigna un descuento de 20% ");
            System.out.println(costoFinal = costoConsulta-(costoConsulta*(20/100.0)));

        } else {
                System.out.println(" Se le asigna un descuento de 30% ");
                System.out.println(costoFinal = costoConsulta-(costoConsulta * (30 / 100.0)));

            }
        return (costoFinal);
    }
    @Override
    public String mostrarInfo(){
        return "Nombre: " + nombre +
                "\nDocumento: " + documento +
                "\nEPS: " + nombreEps +
                "\nCosto consulta: " + costoConsulta +
                "\nCosto final: " + calcularCostoFinal() + "\n";

    }
}
