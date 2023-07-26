fun main(){
    println(maxProduct(intArrayOf(0,2)))

}
fun maxProduct(nums: IntArray): Int {
    var result: Int = nums.get(0)
    val n: Int = nums.size

    for (i in 0 until n) {
        var mul: Int = nums.get(i)
        // traversing in current subarray
        for (j in i + 1 until n) {
            // updating result every time to keep an eye
            // over the maximum product
            result = Math.max(result, mul)
            mul *= nums.get(j)
        }
        // updating the result for (n-1)th index.
        result = Math.max(result, mul)
    }
    return result
}

