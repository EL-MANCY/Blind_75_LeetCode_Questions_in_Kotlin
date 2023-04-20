fun main(args: Array<String>) {
    val x = twoSum(intArrayOf(1, 2, 3, 4, 5, 6), 3)
    println(x)
}

    fun twoSum(nums: IntArray, target: Int): IntArray {
        val n = nums.size
        val list:MutableList<Int> = mutableListOf()
        for (i in 0 until n) {
            for (j in i + 1 until n) {
                if (nums[i] + nums[j] == target) {
                    list.add(i)
                    list.add(j)
                }
            }
        }
        return list.toIntArray()
    }
