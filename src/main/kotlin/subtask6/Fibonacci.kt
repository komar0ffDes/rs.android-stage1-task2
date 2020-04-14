package subtask6

class Fibonacci {

    fun productFibonacciSequenceFor(n: Int): IntArray {
        val fib = ArrayList<Int>()
        fib.add(0)
        fib.add(1)
        while (fib.last() * fib[fib.lastIndex - 1] < n) {
            fib.add(fib.last() + fib[fib.lastIndex - 1])
        }
        return if (fib.last() * fib[fib.lastIndex - 1] == n) {
            intArrayOf(fib[fib.lastIndex - 1], fib.last(), 1)
        } else {
            intArrayOf(fib[fib.lastIndex - 1], fib.last(), 0)
        }
    }
}
