package org.void404.graph

class EdgesBuilder(val connections: MutableList<Edge> = arrayListOf()){
    operator fun Pair<Int, Int>.unaryPlus(){
        connections.add(Edge(this.first, this.second))
    }

    fun build(): List<Edge> {
        return connections
    }
}