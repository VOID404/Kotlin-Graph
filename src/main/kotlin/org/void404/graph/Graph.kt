package org.void404.graph

data class Graph<T> (val nodes: List<Node<T>>, val edges: List<Edge>) {
    constructor(): this(arrayListOf<Node<T>>(), arrayListOf<Edge>())
}