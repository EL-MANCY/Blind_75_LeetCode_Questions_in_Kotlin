fun main(){
    println(maxSubArray(intArrayOf(-2,1,-3,4,-1,2,1,-5,4)))
}
fun maxSubArray(nums: IntArray): Int {
    var max:Int = nums[0]
    var sum = Math.max(max,0)
    for(n in 1 until nums.size){
        sum += nums[n]
        max = Math.max(max,sum)
        if(sum<0) sum=0
    }
    return max
}
