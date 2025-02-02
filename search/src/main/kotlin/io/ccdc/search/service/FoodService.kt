package io.ccdc.search.service

import io.ccdc.search.model.Food
import io.ccdc.search.repository.FoodRepository
import org.springframework.data.domain.PageRequest
import org.springframework.stereotype.Service

@Service
class FoodService(private val foodRepository: FoodRepository) {
    fun searchFoods(query: String, limit: Int, offset: Int): List<Food> {
        return foodRepository.searchFoods(query, PageRequest.of(offset, limit))
    }
}