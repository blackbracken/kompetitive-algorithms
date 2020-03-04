package matrix

private fun <T> List<List<T>>.isEmptyMatrix() = this.firstOrNull()?.firstOrNull() == null

private fun <T> List<List<T>>.transposed(): List<List<T>> {
    if (this.isEmptyMatrix()) return listOf(listOf())

    val transposedHead = listOf(map { it.first() })
    val addition = map { it.drop(1) }.transposed()

    return if (addition.isEmptyMatrix()) transposedHead else transposedHead + addition
}