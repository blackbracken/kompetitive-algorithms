private fun solve() {
}

fun main(args: Array<out String>) = solve()
private fun readAtOnce(): List<String> = readLine()!!.split(" ")
private fun readInts(): List<Int> = readAtOnce().map(String::toInt)
private fun readLongs(): List<Long> = readAtOnce().map(String::toLong)
private fun zeroArray(size: Int): IntArray = IntArray(size) { 0 }
private fun Int.repeat(predicate: (Int) -> Unit) = repeat(this, predicate)