public class PacienteParticular extends Paciente{


    public PacienteParticular() {
    }

    public PacienteParticular(double costoConsulta, int documento, String nombre) {
        super(costoConsulta, documento, nombre);
    }

    @Override
    public String toString() {
        return "PacienteParticular: " + " Nombre: " + nombre + ", Documento: " + documento +
                ", Costo Consulta=" + costoConsulta + '\'' ;
    }
    @Override
    public double calcularCostoFinal(){
        double costoFinal = 0;
        if (costoConsulta == 400000){
            System.out.println("Se le asigna un descuento de 15% ");
            System.out.println(costoFinal = costoConsulta-(costoConsulta*(15/100.0)));
            
        } else if (costoConsulta == 200000) {
            System.out.println("Se le asigna un descuento de 10% ");
            System.out.println(costoFinal = costoConsulta-(costoConsulta*(10/100.0)));
           
        } else if (costoConsulta== 50000) {
            System.out.println(" Se le asigna un descuento de 5% ");
            System.out.println(costoFinal = costoConsulta-(costoConsulta*(5/100.0)));
            
        }else {
            System.out.println(costoConsulta);
        }
        return (costoFinal);
    }


    @Override
    public String mostrarInfo(){
        return "Nombre: " + nombre +
                "\nDocumento: " + documento +
                "\nCosto consulta: " + costoConsulta +
                "\nCosto final: " + calcularCostoFinal() + "\n";

    }
}
