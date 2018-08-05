package org.void404.graph

import me.tatarka.assertk.assert
import me.tatarka.assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

internal class GraphTest {

    @org.junit.jupiter.api.BeforeEach
    fun setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    fun tearDown() {
    }

    @Test
    fun building() {
        val expected = Graph<String>(
                arrayListOf(
                        Node(0, "Node number 0"),
                        Node(1, "Node number 1"),
                        Node<String>(2, null),
                        Node<String>(3, null)
                ),
                arrayListOf(
                        Edge(0, 1),
                        Edge(1, 2),
                        Edge(2, 3),
                        Edge(2, 0),
                        Edge(0, 3)

                ))

        val graph = graph<String> {
            arrayOf("Node number 0", "Node number 1", null, null)
                    .forEachIndexed { i, v ->
                        node {
                            id = i
                            data = v
                        }
                    }

            edges {
                (0..2).forEach { +(it to it + 1) }

                +(2 to 0)
                +(0 to 3)
            }
        }

        assert(graph).isEqualTo(expected)
    }
}