package io.ccdc.admin


import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication


@SpringBootApplication(scanBasePackages = ["io.ccdc"])
class AdminApplication

fun main(args: Array<String>) {
    runApplication<AdminApplication>(*args)
}