package org.void404.graph

class NodeBuilder<T> {
    var id = 0
    var data: T? = null

    fun build(): Node<T> = Node(id, data)
}