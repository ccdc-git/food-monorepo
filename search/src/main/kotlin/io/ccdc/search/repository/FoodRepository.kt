package io.ccdc.search.repository

import io.ccdc.search.model.Food
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

interface FoodRepository : JpaRepository<Food, Long> {
    @Query("SELECT f FROM Food f WHERE LOWER(f.name) LIKE LOWER(CONCAT('%', :query, '%'))")
    fun searchFoods(@Param("query") query: String, pageable: Pageable): List<Food>
}
