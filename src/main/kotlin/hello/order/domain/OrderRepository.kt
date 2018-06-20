package hello.order.domain

import org.springframework.data.repository.CrudRepository

interface OrderRepository : CrudRepository<Order, Long> {

    fun findByType(type: String): Iterable<Order>
}
