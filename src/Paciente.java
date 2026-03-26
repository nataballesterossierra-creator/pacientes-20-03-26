import java.util.List;

public class Paciente {

    protected String nombre;
    protected int documento;
    protected double costoConsulta;

    public Paciente() {
    }

    public Paciente(double costoConsulta, int documento, String nombre) {
        this.costoConsulta = costoConsulta;
        this.documento = documento;
        this.nombre = nombre;
    }

    public double getCostoConsulta() {
        return costoConsulta;
    }

    public void setCostoConsulta(double costoConsulta) {
        this.costoConsulta = costoConsulta;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Paciente: " + " Nombre: " + nombre + " Documento: " + documento +
                ", Costo Consulta=" + costoConsulta +'\'' ;
    }

    public double calcularCostoFinal(){
     return costoConsulta;
    }
    public String mostrarInfo(){

        return "Nombre: " + nombre +
                        "\nDocumento: " + documento +
                        "\ncostoConsulta: " + costoConsulta +
                        "\ncostoFinal: " + calcularCostoFinal() +
                        "\n";
    }



    public static void mostrarPacientesCostosos(List<Paciente> lista) {
        System.out.println("\nPacientes con costo final mayor a 300000:\n");

        for (Paciente p : lista) {
            if (p.calcularCostoFinal() > 300000) {
                System.out.println(p.mostrarInfo());
            }
        }
    }



    public static Paciente pacienteQueMasPago(List<Paciente> lista){
        if(lista.isEmpty()) return null;

        Paciente mayor = lista.get(0);

        for(Paciente p : lista){
            if (p.calcularCostoFinal() > mayor.calcularCostoFinal()){
                mayor = p;
            }
        }
        return mayor;
    }





}
