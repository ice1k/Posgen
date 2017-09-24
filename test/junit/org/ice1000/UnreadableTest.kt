package org.ice1000

import org.junit.Test
import kotlin.test.*

/**
 * These tests are unreadable
 */
class UnreadableTest {
	@Test
	fun realizeGlavo() = FrontStar(3).run {
		addNode("0", 150, true)
		addNode("01", 100, true)
		addNode("10", 110, false)
		addRelation("0" to "01")
		addRelation("01" to "0")
		addRelation("01" to "10")
		solve()
		println(avgLimit)
		println(nodeWeight("10"))
		assertTrue(nodeMark("10"))
		assertEquals(3, userCount)
	}

	@Test
	fun realizeGlavoWhileSizeIsLarger() = FrontStar(10).run {
		addNode("0", 150, true)
		addNode("01", 100, true)
		addNode("10", 110, false)
		addRelation("0" to "01")
		addRelation("01" to "0")
		addRelation("01" to "10")
		solve()
		println(avgLimit)
		println(nodeWeight("10"))
		assertTrue(nodeMark("10"))
	}

	@Test
	fun notRealizeGlavo() = FrontStar(3).run {
		addNode("0", 150, true)
		addNode("01", 100, false)
		addNode("10", 110, false)
		addRelation("0" to "01")
		addRelation("01" to "0")
		addRelation("01" to "10")
		solve()
		println(avgLimit)
		println(nodeWeight("10"))
		assertFalse(nodeMark("10"))
	}
}
