package com.test.one.model

import com.fasterxml.jackson.annotation.JsonBackReference
import jakarta.persistence.*

@Entity
@Table(name = "expense")
class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    var description: String? = null
    var value: Double? = null
    @Column(name = "category_id")
    var categoryId: Long? = null
}