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
        return "PacienteEps{" +
                "nombreEps='" + nombreEps + '\'' +
                ", costoConsulta=" + costoConsulta +
                ", documento=" + documento +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public double calcularCostoFinal(){
        double costoFinal = 0;
        if (costoConsulta == 300000){
            System.out.println("Se le asigna un descuento de 25% ");
            System.out.println(costoFinal = costoConsulta*(25/100.0));
            System.out.println(costoFinal);
        } else if (costoConsulta == 200000) {
            System.out.println("Se le asigna un descuento de 20% ");
            System.out.println(costoFinal = costoConsulta*(20/100.0));
            System.out.println(costoFinal);
        } else if (costoConsulta != 200000) {
            if (costoConsulta != 300000) {
                System.out.println(" Se le asigna un descuento de 30% ");
                System.out.println(costoFinal = costoConsulta * (30 / 100.0));
                System.out.println(costoFinal);
            } else {
                System.out.println(costoConsulta);
            }
        } else {
            System.out.println(costoConsulta);
        }
        return (costoFinal);
    }


    public String mostrarInfo(){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Documento: "+ documento);
        System.out.println("costoConsulta "+ costoConsulta);
        System.out.println("costoFinal "+ calcularCostoFinal());
        return "";
    }
}
