package tree

private class UnionFind(N: Int) {
    private val parent = IntArray(N) { -1 }
    private val rank = IntArray(N) { 0 }

    fun findRoot(x: Int): Int =
        if (parent[x] < 0) {
            x
        } else {
            parent[x] = findRoot(parent[x])
            parent[x]
        }

    fun unite(x: Int, y: Int) {
        val rootX = findRoot(x)
        val rootY = findRoot(y)
        if (rootX == rootY) return

        if (rank[rootX] < rank[rootY]) {
            parent[rootY] += parent[rootX]
            parent[rootX] = rootY
        } else {
            parent[rootX] += parent[rootY]
            parent[rootY] = rootX
            if (rank[rootX] == rank[rootY]) rank[rootX]++
        }
    }

    fun hasInSameGroup(x: Int, y: Int): Boolean = findRoot(x) == findRoot(y)

    fun groupSizeOf(belongs: Int) = -parent[findRoot(belongs)]
}