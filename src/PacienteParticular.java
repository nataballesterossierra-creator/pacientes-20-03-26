public class PacienteParticular extends Paciente{


    public PacienteParticular() {
    }

    public PacienteParticular(double costoConsulta, int documento, String nombre) {
        super(costoConsulta, documento, nombre);
    }

    @Override
    public String toString() {
        return "PacienteParticular{" +
                "costoConsulta=" + costoConsulta +
                ", documento=" + documento +
                ", nombre='" + nombre + '\'' +
                '}';
    }
    @Override
    public double calcularCostoFinal(){
        double costoFinal = 0;
        if (costoConsulta == 400000){
            System.out.println("Se le asigna un descuento de 15% ");
            System.out.println(costoFinal = costoConsulta*(15/100.0));
            System.out.println(costoFinal);
        } else if (costoConsulta == 200000) {
            System.out.println("Se le asigna un descuento de 10% ");
            System.out.println(costoFinal = costoConsulta*(10/100.0));
            System.out.println(costoFinal);
        } else if (costoConsulta== 50000) {
            System.out.println(" Se le asigna un descuento de 5% ");
            System.out.println(costoFinal = costoConsulta*(5/100.0));
            System.out.println(costoFinal);
        }else {
            System.out.println(costoConsulta);
        }
        return (costoFinal);
    }


    @Override
    public String mostrarInfo(){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Documento: "+ documento);
        System.out.println("costoConsulta "+ costoConsulta);
        System.out.println("costoFinal "+calcularCostoFinal() );
        return "";
    }
}
