package io.ccdc.search.model

import jakarta.persistence.*

@Entity
@Table(name = "food")
class Food(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(name = "name", unique = true)
    var name: String,
)
