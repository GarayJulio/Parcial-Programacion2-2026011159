public class ComisionPersonalizada implements EstrategiaComision {
    @Override
    public double calcularComision(double montoVenta) {
        double porcentaje = 0.10; 
        return montoVenta * porcentaje;
    }
}