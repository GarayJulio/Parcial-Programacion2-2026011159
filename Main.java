public class Main {
    public static void main(String[] args) {
        Empleado vendedor = new Vendedor("Julio Garay", 68.00, new ComisionEstandar());
        vendedor.mostrarDetalle();
    }
}