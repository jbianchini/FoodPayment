package descuento.interfaces

interface EstrategiaDescuento {
    fun calcularDescuento(total: Double): Double
}