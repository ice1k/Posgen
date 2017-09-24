package org.ice1000

open class FrontStar(val userCount: Int) {
	private val nameIdMap = mutableMapOf<UserID, Int>()
	private val idNodeList = mutableListOf<Node>()
	private val next = mutableListOf<Int>()
	private val head = IntArray(userCount) { -1 }
	private val target = mutableListOf<Int>()
	private val depart = mutableListOf<Int>()
	private var limit = 0
	val avgLimit: Int get() = limit / idNodeList.size
	var edgeCount = 0
		private set
	private val knownUserCount: Int get() = idNodeList.size + 1

	fun addNode(userID: UserID, node: Node) {
		limit += node.weight
		// if (node.weight > 100) node.mark = true
		nameIdMap[userID] = idNodeList.size
		idNodeList += node
	}

	fun solve() = solve(idNodeList.indices.filter { idNodeList[it].mark })
	infix fun nodeMark(userID: UserID): Boolean = idNodeList[nameIdMap[userID]!!].mark
	fun addRelation(from: UserID, to: UserID) = addEdge(nameIdMap[from]!!, nameIdMap[to]!!)
	infix fun nodeWeight(userID: UserID): Int = idNodeList[nameIdMap[userID]!!].weight
	fun addNode(userID: UserID, weight: Int, mark: Boolean) = addNode(userID, Node(weight, mark))
	fun addRelation(relation: Pair<UserID, UserID>) = addRelation(relation.first, relation.second)

	private fun addEdge(from: Int, to: Int) {
		// target[edgeCount] = to
		// depart[edgeCount] = from
		// next[edgeCount] = head[from]
		target += to
		depart += from
		next += head[from]
		head[from] = edgeCount++
	}

	private fun solve(marked: List<Int>) {
		val generatedList = mutableListOf<Int>()
		for (mtfIndex in marked) {
			var j = head[mtfIndex]
			while (j != -1) {
				listOf(idNodeList[target[j]], idNodeList[depart[j]]).forEach {
					it.weight += avgLimit / knownUserCount
					if (!it.mark && it.weight > avgLimit) {
						it.mark = true
						generatedList += target[j]
					}
				}
				j = next[j]
			}
		}
	}
}