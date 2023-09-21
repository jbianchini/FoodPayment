package descuento

import descuento.interfaces.EstrategiaDescuento

class Descuento10PorCiento : EstrategiaDescuento {

    companion object {
        private const val DESCUENTO: Double = 0.9
    }

    override fun calcularDescuento(total: Double): Double {
        return total * DESCUENTO
    }
}