package io.ccdc.search.service

import io.ccdc.shared.persistence.model.Food
import io.ccdc.shared.persistence.repository.FoodRepository
import org.springframework.data.domain.PageRequest
import org.springframework.stereotype.Service

@Service
class FoodService(private val foodRepository: FoodRepository) {
    fun searchFoods(query: String, limit: Int, offset: Int): List<Food> {
        return foodRepository.searchFoods(query, PageRequest.of(offset, limit))
    }
}
