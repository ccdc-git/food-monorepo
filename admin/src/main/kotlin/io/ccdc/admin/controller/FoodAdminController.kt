package io.ccdc.admin.controller

import io.ccdc.admin.controller.dto.FoodRequest
import io.ccdc.admin.service.FoodService
import io.ccdc.shared.persistence.model.Food
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/food")
class FoodAdminController(private val foodService: FoodService) {
    @PostMapping
    fun addFood(@RequestBody request: FoodRequest): ResponseEntity<Food> {
        val food = foodService.createFood(request.name)
        return ResponseEntity.ok(food)
    }
}
