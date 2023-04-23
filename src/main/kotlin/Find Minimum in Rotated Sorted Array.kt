fun main(){
   println(findMin(intArrayOf(4,5,6,7,0,1,2)))
}


fun findMin(nums: IntArray): Int {
    nums.sort()
    return nums[0]
}
fun findMin2(nums: IntArray): Int {

    // **** sanity check(s) ****
    if (nums.size == 1) return nums[0]

    // **** initialization ****
    var left = 0
    var right = nums.size - 1

    // **** check if there is no rotation ****
    if (nums[right] > nums[left]) return nums[left]

    // **** binary search approach ****
    while (left < right) {

        // **** compute mid point ****
        val mid = left + (right - left) / 2

        // **** check if we found min ****
        if (nums[mid] > nums[mid + 1]) return nums[mid + 1]
        if (nums[mid - 1] > nums[mid]) return nums[mid]

        // **** decide which way to go ****
        if (nums[mid] > nums[0]) left = mid + 1 // go right
        else right = mid - 1 // go left
    }

    // **** min not found
    return 0
}