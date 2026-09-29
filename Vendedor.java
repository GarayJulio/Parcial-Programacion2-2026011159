public class Vendedor extends Empleado {
    public Vendedor(String nombre, double ventasMes, EstrategiaComision estrategia) {
        super(nombre, ventasMes, estrategia);
    }
    @Override
    public void mostrarDetalle() {
        double comision = estrategia.calcularComision(ventasMes);
        System.out.println("Vendedor: " + nombre);
        System.out.println("Ventas Totales: " + ventasMes);
        System.out.println("Comision: " + comision);
    }
}