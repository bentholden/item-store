package com.showcase.itemstore

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ItemStoreApplication

fun main(args: Array<String>) {
	runApplication<ItemStoreApplication>(*args)
}
