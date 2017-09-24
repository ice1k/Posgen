var Posgen = require('posgen')

var posgen = new Posgen(10)
posgen.addNodeData('1', 10, false)
posgen.addNodeData('2', 100, true)
posgen.solveAll()
