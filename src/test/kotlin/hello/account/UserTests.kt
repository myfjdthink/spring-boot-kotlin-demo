package hello.account

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.test.context.junit.jupiter.SpringExtension
import java.util.*


@ExtendWith(SpringExtension::class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class UserTests(@Autowired private val restTemplate: TestRestTemplate) {

    @Test
    fun register() {
        val content = """{"firstName":"Nick","lastName":"Feng","id":6}"""
        val userMap = HashMap<String, String>()
        userMap.put("firstName", "Nick")
        userMap.put("lastName", "Feng")
//        var response:ResponseEntity<User> = restTemplate.postForEntity("/user/register", userMap, User::class.java)
//        assertEquals(content, response.body)
        val user = restTemplate.postForObject("/users/register", userMap, String::class.java)
        assertEquals(content, user)

        val fUser = restTemplate.getForObject("/users/6", String::class.java)
        assertEquals(content, fUser)
    }

}
