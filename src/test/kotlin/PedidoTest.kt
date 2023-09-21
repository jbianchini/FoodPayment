import descuento.Descuento10PorCiento
import descuento.DescuentoFijo
import descuento.SinDescuento
import org.junit.jupiter.api.Test
import pedido.Item
import pedido.Pedido
import kotlin.test.assertEquals

class PedidoTest {

    @Test
    fun `calcularTotal, dado un pedido y una estrategia sin descuento, debe devolver el total del pedido`() {
        val pedido = Pedido(SinDescuento())

        val itemsPedido = listOf(Item("Hamburguesa", 5.0), Item("Refresco", 2.0))

        assertEquals(7.0, pedido.calcularTotal(itemsPedido))
    }

    @Test
    fun `calcularTotal, dado un pedido y una estrategia de descuento del 10 por ciento, debe devolver el total del pedido`() {
        val pedido = Pedido(Descuento10PorCiento())

        val itemsPedido = listOf(Item("Pizza", 8.0), Item("Ensalada", 4.0))

        assertEquals(10.8, pedido.calcularTotal(itemsPedido))
    }

    @Test
    fun `calcularTotal, dado un pedido y una estrategia de descuento fijo, debe devolver el total del pedido`() {
        val pedido = Pedido(DescuentoFijo())

        val itemsPedido = listOf(Item("Sushi", 12.0), Item("Sopa", 3.0))

        assertEquals(10.0, pedido.calcularTotal(itemsPedido))
    }
}