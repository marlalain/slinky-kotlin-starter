package com.pauloelienay.slinkykotlinstarter.repository

import com.pauloelienay.slinky.generics.GenericRepository
import com.pauloelienay.slinkykotlinstarter.model.Todo
import org.springframework.stereotype.Repository
import javax.persistence.EntityManager

@Repository
class TodoRepository(entityManager: EntityManager)
	: GenericRepository<Todo, Long>(Todo::class.java, entityManager)