package dev.tomjack.examples.kotlinspringboottemplate

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Profile
import java.util.concurrent.CountDownLatch

@SpringBootApplication
class Main {

    @Bean
    @Profile("!test")
    fun commandLineRunner(): CommandLineRunner = CommandLineRunner {
        println("Hello, world!")
        CountDownLatch(1).await()
    }
}

fun main(args: Array<String>) {
    runApplication<Main>(*args)
}
