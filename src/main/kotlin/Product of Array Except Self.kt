fun main(){
    val x =productExceptSelf(intArrayOf(1,2,3,4))
    for(i in x){
        println(i)
    }
}

fun productExceptSelf(nums: IntArray): IntArray {
    val size = nums.size
    val productArray = IntArray(size) { 1 }

    var leftProduct = 1
    for (i in 0 until size) {
        productArray[i] *= leftProduct
        leftProduct *= nums[i]
        //1,2,3,4
        //[1,1,2,6]
    }

    var rightProduct = 1
    for (i in size - 1 downTo 0) {
        productArray[i] *= rightProduct //1,4,
        rightProduct *= nums[i]         //1,4,12,24,24
        //1,2,3,4
        //[1, 1, 2,6]
        //[24,12,8,6]
    }

    return productArray
}
