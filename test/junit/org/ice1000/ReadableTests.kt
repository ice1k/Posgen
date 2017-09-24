package org.ice1000

import org.junit.Test

/**
 * These tests are readable :D
 */
class ReadableTests {
	@Test
	fun readableTest() {
		val frontStar = FrontStar(3)
		frontStar.addNode("1", Node(100, true))
		frontStar.addNode("2", Node(0, false))
		frontStar.addRelation("1" to "2") // use pair
		frontStar.addRelation("2", "1") // use two parameters
		frontStar.solve()
	}
}