fun main(){
    println( containsDuplicate(intArrayOf(2,14,18,22,22)))
}

fun containsDuplicate(nums: IntArray): Boolean {
    var flag = false
    for(n in nums.indices){
        for (m in 0 until n) {
            if(nums[n]==nums[m]) {
                flag = true
                break
            }
        }
    }
    return flag
}