package hello.order

import hello.order.domain.Order
import hello.order.domain.OrderRepository
import org.springframework.stereotype.Component

@Component
class OrderService(private val orderRepository: OrderRepository) {

    fun initOrder(type: String): Order {
        val order = Order(type = type)
        return orderRepository.save(order)
    }

    fun saveOrder(order: Order): Order {
        return orderRepository.save(order)
    }

    fun findAll() {

    }
}