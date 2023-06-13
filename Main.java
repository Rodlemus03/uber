public class Main{
    public static void main(String[] args) {
        Conductor c1= new Conductor("asdffb", true, "c", "Diego", "Morales", "1231287", "Guatemala");
        Cliente cl1= new Cliente("Tarjeta", "Zona 1", "Zona 10", "Julio", "Lemus", "57567564", "Guatemala");
        Admin a1= new Admin("Contabilidad", 3000, "Perito contador", "Rodrigo", "Molina", "34565678", "Guatemala");
        c1.respirar();
        //String variable;
        //variable= cl1.uber();
        //System.out.println(variable);
        cl1.uber();
        a1.administrar();
        
    }
}