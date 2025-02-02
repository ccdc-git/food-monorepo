package io.ccdc.admin.service

import io.ccdc.admin.exception.FoodAlreadyExistsException
import io.ccdc.shared.persistence.model.Food
import io.ccdc.shared.persistence.repository.FoodRepository
import org.springframework.dao.DataIntegrityViolationException
import org.springframework.stereotype.Service

@Service
class FoodService(private val foodRepository: FoodRepository) {
    fun createFood(name: String): Food {
        try {
            return foodRepository.save(Food(name = name))
        } catch (e: DataIntegrityViolationException) {
            throw FoodAlreadyExistsException("Duplicate food name $name")
        }
    }
}