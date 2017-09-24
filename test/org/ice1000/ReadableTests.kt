package org.ice1000

import org.junit.Test

/**
 * These tests are readable :D
 */
class ReadableTests {
	@Test
	fun readableTest() {
		val frontStar = FrontStar(3)
		frontStar.addNode("akiris", Node(100, true))
		frontStar.addNode("ice1000", Node(0, false))
		frontStar.addRelation("akiris" to "ice1000") // use pair
		frontStar.addRelation("akiris", "ice1000") // use two parameters
		frontStar.solve()
	}
}