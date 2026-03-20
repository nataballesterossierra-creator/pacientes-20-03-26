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
        return "Paciente{" +
                "costoConsulta=" + costoConsulta +
                ", nombre='" + nombre + '\'' +
                ", documento=" + documento +
                '}';
    }

    public double calcularCostoFinal(){
     return costoConsulta;
    }
    public String mostrarInfo(){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Documento: "+ documento);
        System.out.println("costoConsulta "+ costoConsulta);
        System.out.println("costoFinal "+ calcularCostoFinal());
        return "";
    }

}
