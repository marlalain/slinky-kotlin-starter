package com.pauloelienay.slinkykotlinstarter

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SlinkyKotlinStarterApplication

fun main(args: Array<String>) {
	runApplication<SlinkyKotlinStarterApplication>(*args)
}
