package hello.account

import hello.account.domain.User
import hello.account.domain.UserRepository
import org.springframework.stereotype.Component

@Component
class UserService(private val userRepository: UserRepository) {
    fun register(user: User): User {
        return userRepository.save(user)
    }

    fun findAll() {

    }
}