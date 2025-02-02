package io.ccdc.search

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["io.ccdc"])
class SearchApplication

fun main(args: Array<String>) {
    runApplication<SearchApplication>(*args)
}
