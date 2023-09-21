package descuento

import descuento.interfaces.EstrategiaDescuento

class DescuentoFijo : EstrategiaDescuento {

    companion object {
        private const val DESCUENTO: Double = 5.0
    }

    override fun calcularDescuento(total: Double): Double {
        return total - DESCUENTO
    }
}