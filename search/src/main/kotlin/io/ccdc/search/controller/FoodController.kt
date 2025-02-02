package io.ccdc.search.controller

import io.ccdc.search.model.Food
import io.ccdc.search.service.FoodService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/food")
class FoodController(
    private val foodService: FoodService,
) {

    @GetMapping
    fun searchFoods(
        @RequestParam(value = "query", required = false, defaultValue = "") query: String,
        @RequestParam(value = "limit", required = false, defaultValue = "10") limit: Int,
        @RequestParam(value = "offset", required = false, defaultValue = "0") offset: Int,
    ): List<Food> {
        return foodService.searchFoods(query, limit, offset)
    }
}
