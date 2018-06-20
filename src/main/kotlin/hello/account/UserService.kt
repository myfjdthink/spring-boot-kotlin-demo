package hello.account

import hello.account.domain.User
import hello.account.domain.UserRepository
import hello.order.OrderService
import hello.order.OrderType
import org.springframework.stereotype.Component


@Component
class UserService(
        private val userRepository: UserRepository,
        private val orderService: OrderService) {

    private val orderType = OrderType.REGISTER.type

    fun register(user: User): User {
//        orderService.initOrder(this.orderType)
        return userRepository.save(user)
    }

    fun findAll() {

    }
}