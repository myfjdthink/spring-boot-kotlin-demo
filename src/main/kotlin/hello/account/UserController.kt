package hello.account

import hello.account.domain.User
import hello.account.domain.UserRepository
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/users")
class UserController(
        private val userService: UserService,
        private val userRepository: UserRepository) {


    @GetMapping("/test/{id}")
    fun test(@PathVariable id: String) = "User(id=$id, name=admin, password=123)"

    @PostMapping("/register")
    fun findAll(@RequestBody user: User): User {
        return userService.register(user)
    }

    @GetMapping("/{id}")
    fun findOne(@PathVariable id: Long): User = userRepository.findById(id).get()

    @GetMapping("/findByLastName/{lastName}")
    fun findByLastName(@PathVariable lastName: String) = userRepository.findByLastName(lastName)
}