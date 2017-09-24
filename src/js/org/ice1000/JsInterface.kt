package org.ice1000

@JsName("Posgen")
class JsInterface(nodeCount: Int) : FrontStar(nodeCount) {
	@JsName("addRelationData")
	fun addRelationImpl(from: UserID, to: UserID) = super.addRelation(from, to)

	@JsName("addRelation")
	fun addRelationDataImpl(pair: Pair<UserID, UserID>) = super.addRelation(pair)

	@JsName("weight")
	fun weightImpl(userID: UserID) = super.nodeWeight(userID)

	@JsName("solveAll")
	fun solveImpl() = super.solve()

	@JsName("mark")
	fun markImpl(userID: UserID): Boolean = super.nodeMark(userID)

	@JsName("addNode")
	fun addNodeImpl(userID: UserID, node: Node) = super.addNode(userID, mtf)

	@JsName("addNodeData")
	fun addNodeDataImpl(userID: UserID, weight: Int, mark: Boolean) = super.addNode(userID, weight, mark)
}
