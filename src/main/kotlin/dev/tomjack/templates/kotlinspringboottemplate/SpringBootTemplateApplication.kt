package dev.tomjack.templates.kotlinspringboottemplate

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBootTemplateApplication

fun main(args: Array<String>) {
    runApplication<SpringBootTemplateApplication>(*args)
}
