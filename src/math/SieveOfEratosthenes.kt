package math

private fun primes(max: Int): IntArray {
    if (max < 2) return emptyArray<Int>().toIntArray()

    val primes = mutableListOf(2)
    for (proved in 3..max step 2) {
        if (primes.none { prime -> proved % prime == 0 }) {
            primes += proved
        }
    }

    return primes.toIntArray()
}