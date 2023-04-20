fun main(args: Array<String>) {
    val x= maxProfit2(intArrayOf(2,4,1))
    println(x)
}

fun maxProfit2(prices: IntArray): Int {
    var minPrice = prices[0]
    var maxProfit = 0
    for (price in prices) {
        minPrice = Math.min(minPrice, price)
        maxProfit = Math.max(maxProfit, price - minPrice)
    }
    return maxProfit
}

