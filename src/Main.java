import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        List<Paciente>lstPacientes = new ArrayList<>();

        int opc;

        System.out.println(" Registro de Pacientes\n");

        do {
            System.out.println(" Menú del  Sistema De la Clinica\n");
            System.out.println(" Elije una Opción:");
            System.out.println(" 1. Registrar Paciente Particular ");
            System.out.println(" 2. Registrar Paciente Eps ");
            System.out.println(" 3. Registrar Paciente VIP ");
            System.out.println(" 4. Buscar paciente por Documento ");
            System.out.println(" 5. Mostrar todos los pacientes ");
            System.out.println(" 6. Mostrar pacientes por tipo ");
            System.out.println(" 7. Calcular costo de consulta de un paciente ");
            System.out.println(" 8. Mostrar pacientes con consulta costosa ");
            System.out.println(" 9. Mostrar el paciente que más pagó ");
            System.out.println(" 10. Salir");
            opc = teclado.nextInt();
            switch (opc){
                case 1:

                    System.out.println("Nombre: ");
                    String nombre_pp = teclado.next();
                    System.out.println("Documento: ");
                    int Documento_pp = teclado.nextInt();
                    System.out.println("Costo Consulta: ");
                    double costoConsulta_pp = teclado.nextDouble();
                    lstPacientes.add(new PacienteParticular(costoConsulta_pp,Documento_pp, nombre_pp));

                    System.out.println("Registro Completado..");



                    break;
                case 2:

                    System.out.println("Nombre: ");
                    String nombre_pe = teclado.next();
                    System.out.println("Documento: ");
                    int Documento_pe = teclado.nextInt();
                    System.out.println("Costo Consulta: ");
                    double costoConsulta_pe = teclado.nextDouble();
                    System.out.println("Nombre de la Eps: ");
                    String nombreEps = teclado.next();
                    lstPacientes.add(new PacienteEps(costoConsulta_pe,Documento_pe, nombre_pe, nombreEps));

                    System.out.println("Registro Completado...\n");
                    break;
                case 3:
                    System.out.println("Nombre: ");
                    String nombre_pv = teclado.next();
                    System.out.println("Documento: ");
                    int Documento_pv = teclado.nextInt();
                    System.out.println("Costo Consulta: ");
                    double costoConsulta_pv = teclado.nextDouble();
                    System.out.println("Años de Fidelidad: ");
                    int aniosfidelidad = teclado.nextInt();
                    lstPacientes.add(new PacienteVip(costoConsulta_pv, Documento_pv, nombre_pv, aniosfidelidad));
                    System.out.println("Registro Completado... \n");
                    break;
                case 4:
                    System.out.println("Buscar paciente por documento \n ");
                    System.out.println(" Digite el documento del paciente a buscar:" );
                    int Documentop = teclado.nextInt();
                    if (lstPacientes.isEmpty()){
                        System.out.println("La lista no tiene elementos. \n");
                    }
                    Paciente P1 = null;
                    for (Paciente e : lstPacientes){
                        if(e.getDocumento(){
                            P1 = e;
                            System.out.println(P1.mostrarInfo());
                        }
                    }
                    break;

                case 5:
                    System.out.println(lstPacientes);
                    break;
                case 6:
                    int opc1;
                    System.out.println("Que tipo de paciente desea buscar: ");
                    do {
                        System.out.println(" 1. Paciente particular. ");
                        System.out.println(" 2. Paciente EPS. ");
                        System.out.println(" 3. Paciente VIP. ");
                        System.out.println(" 4. Volver al menú principal.\n ");
                        System.out.println("     Digite una opcion: ");
                        opc1= teclado.nextInt();
                        switch (opc1){
                            case 1:
                                for (Paciente e : lstPacientes){
                                    if (e instanceof PacienteParticular){
                                        System.out.println(e);
                                    }
                                }
                                break;
                            case 2:
                                for (Paciente e : lstPacientes){
                                    if (e instanceof PacienteEps){
                                        System.out.println(e);
                                    }
                                }
                                break;
                            case 3:
                                for (Paciente e : lstPacientes){
                                    if (e instanceof PacienteVip){
                                        System.out.println(e);
                                    }
                                }
                                break;
                            case 4:
                                System.out.println("Volviendo al menu Principal...");
                                break;
                            default:
                                System.out.println("Error....");
                        }
                    }while(opc1 !=4);
                    break;
                case 7:
                    System.out.println(" Digite el documento del paciente: ");
                    int Documentop1 = teclado.nextInt();
                    if (lstPacientes.isEmpty()){
                        System.out.println("La lista no tiene elementos. \n");
                    }
                    Paciente P = null;
                    for (Paciente e : lstPacientes){
                        if(e.getDocumento() {
                            P = e;
                            System.out.println(P1.mostrarInfo());
                        }
                    }
                    P.calcularCostoFinal();
                    break;

                case 8:
                    break;

                case 9:
                    break;
                case 10:
                    break;

                default:
                    System.out.println(" Error ");

            }


        }while (opc != 10);


    }
}