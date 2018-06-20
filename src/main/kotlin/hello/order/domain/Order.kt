package hello.order.domain

import hello.order.OrderStatus
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Order(
        val amount: Double = 0.0,
        @Column(name="O_TYPE")
        val type: String,
        @Column(name="O_STATUS")
        val status: String = OrderStatus.PENDING.status,
        @Id @GeneratedValue
        val id: Long = -1)