# Graph

I've always wanted to have some simple library for constructing graphs. 
Just simple way of connecting data on a graph. Without pathfinder, 
without any fancy features. And when I discovered Kotlin with it's DSL 
abilities I knew what had to be done.

## How to use it?

Graph consist of list of nodes and list of edges. 
Nodes can store any type of data, specified on graph creation.

```kotlin
var graph = graph<String> {
    node {
        id = 0
        data = "Foo"
    }
    
    node(1)
    
    node {
        id = 3
        data = null
    }
    
    edges {
        +(0 to 3)
        +(3 to 1)
    }
}
```

## Will this project be expanded?

This project isn't meant to have much more features. 
I'll probably add some helper functions one day.