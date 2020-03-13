package math

// nCk `mod` M
private fun modCombination(n: Long, k: Long, m: Long): Long {
    val num = (n - k + 1..n + 1).asSequence().fold(1L) { acc, x -> acc * x % m }
    val den = (1..k + 1).asSequence().fold(1L) { acc, x -> acc * x % m }

    return num * modPower(den, m - 2, m) % m
}

// n^k `mod` M
private fun modPower(n: Long, k: Long, m: Long): Long {
    if (k <= 0) return 1L

    val p = modPower(n, k / 2, m)
    return if (k % 2 == 0L) {
        p * p % m
    } else {
        (p * p % m) * n % m
    }
}