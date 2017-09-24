package org.ice1000

import org.junit.Test
import kotlin.test.*

/**
 * These tests are unreadable
 */
class UnreadableTest {
	@Test
	fun realizeGlavo() = FrontStar(3).run {
		addNode("akiris", 150, true)
		addNode("ice1000", 100, true)
		addNode("glavo", 110, false)
		addRelation("akiris" to "ice1000")
		addRelation("ice1000" to "akiris")
		addRelation("ice1000" to "glavo")
		solve()
		println(avgLimit)
		println(nodeWeight("glavo"))
		assertTrue(nodeMark("glavo"))
		assertEquals(3, userCount)
	}

	@Test
	fun realizeGlavoWhileSizeIsLarger() = FrontStar(10).run {
		addNode("akiris", 150, true)
		addNode("ice1000", 100, true)
		addNode("glavo", 110, false)
		addRelation("akiris" to "ice1000")
		addRelation("ice1000" to "akiris")
		addRelation("ice1000" to "glavo")
		solve()
		println(avgLimit)
		println(nodeWeight("glavo"))
		assertTrue(nodeMark("glavo"))
	}

	@Test
	fun notRealizeGlavo() = FrontStar(3).run {
		addNode("akiris", 150, true)
		addNode("ice1000", 100, false)
		addNode("glavo", 110, false)
		addRelation("akiris" to "ice1000")
		addRelation("ice1000" to "akiris")
		addRelation("ice1000" to "glavo")
		solve()
		println(avgLimit)
		println(nodeWeight("glavo"))
		assertFalse(nodeMark("glavo"))
	}
}
