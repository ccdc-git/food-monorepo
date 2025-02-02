package io.ccdc.admin.repository

import io.ccdc.admin.model.Food
import org.springframework.data.jpa.repository.JpaRepository

interface FoodRepository : JpaRepository<Food, Long>
