package com.pauloelienay.slinkykotlinstarter.repository

import com.pauloelienay.slinky.generics.IGenericRepository
import com.pauloelienay.slinkykotlinstarter.model.Todo

interface TodoRepository : IGenericRepository<Todo, Long>