package io.ccdc.admin.exception

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class GlobalExceptionHandler {
    @ExceptionHandler(FoodAlreadyExistsException::class)
    fun handleFoodAlreadyExistsException(e: FoodAlreadyExistsException): ResponseEntity<Map<String, String>> {
        return ResponseEntity.status(400).body(mapOf("error" to e.message!!))
    }
}