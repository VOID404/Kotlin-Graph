package org.void404.graph

class GraphBuilder<T>(val nodes: MutableList<Node<T>>, var edges: MutableList<Edge>) {
    constructor() : this(arrayListOf<Node<T>>(), arrayListOf<Edge>())

    fun node(block: NodeBuilder<T>.() -> Unit) {
        val builder = NodeBuilder<T>()
        builder.block()
        nodes.add(builder.build())
    }

    fun edges(block: EdgesBuilder.() -> Unit) {
        val builder = EdgesBuilder()
        builder.block()

//        builder + (10 to 20)

        this.edges.addAll(builder.build())
    }

    fun node(id: Int) {
        nodes.add(Node(id, null))
    }

    fun build(): Graph<T> {
        return Graph(nodes, edges)
    }
}

fun <T> graph(block: GraphBuilder<T>.() -> Unit): Graph<T> {
    val builder = GraphBuilder<T>()
    builder.block()

    return builder.build()
}