package com.pauloelienay.slinkykotlinstarter.model

import com.pauloelienay.slinky.generics.IGenericEntity
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "todos")
data class Todo(
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	override var id: Long?,
	var name: String?,
	var description: String?,
	var completed: Boolean?
) : IGenericEntity<Long>
