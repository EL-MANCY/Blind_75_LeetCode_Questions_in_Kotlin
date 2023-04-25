fun main(){
    println(search(intArrayOf(4,5,6,7,0,1,2),6))

}
fun search(nums: IntArray, target: Int): Int {

    var left = 0
    var right = nums.size - 1

    while (left <= right) {
        val mid = left + (right - left) / 2

        if (nums[mid] == target) {
            return mid
        }

        if (nums[left] <= nums[mid]) { // left half is sorted
            if (target >= nums[left] && target < nums[mid]) {
                right = mid - 1 // search left half
            } else {
                left = mid + 1 // search right half
            }
        } else { // right half is sorted
            if (target > nums[mid] && target <= nums[right]) {
                left = mid + 1 // search right half
            } else {
                right = mid - 1 // search left half
            }
        }
    }

    return -1 // target not found

}

