package pedido

import descuento.interfaces.EstrategiaDescuento

class Pedido(private val estrategiaDescuento: EstrategiaDescuento) {

    fun calcularTotal(items: List<Item>):Double{
        return estrategiaDescuento.calcularDescuento(items.sumOf(Item::precio))
    }
}