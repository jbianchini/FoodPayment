package descuento

import descuento.interfaces.EstrategiaDescuento

class SinDescuento: EstrategiaDescuento {

    override fun calcularDescuento(total: Double): Double {
        return total
    }
}