package dev.tomjack.examples.kotlinspringboottemplate

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles

@SpringBootTest
@ActiveProfiles("test")
class MainTests {

    @Test
    fun contextLoads() {
    }

}
