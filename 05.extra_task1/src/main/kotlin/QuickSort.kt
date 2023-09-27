fun CreateAndQuickSort() {
    var array: Array<Int> = CreateRandomArray()
    print("Array: ")
    PrintArray(array)
    print("Sorted (quick sort): ")
    val begin = System.nanoTime()
    val iter_count = QuickSort(array)
    val end = System.nanoTime()
    PrintArray(array)
    println("Function QuickSort took ${end-begin} nanoseconds. Number of iterations: ${iter_count}")
}

fun QuickSort(array: Array<Int>): Int {
    return sort(array, 0, array.size)
}

fun sort(array: Array<Int>, left:Int, right:Int): Int {
    var count = 0
    var i = left
    var j = right-1
    val p = array[(i+j)/2]
    do {
        while (array[i] < p) i++
        while (array[j] > p) j--
        if (i <= j) {
            array[i] = array[j].also { array[j] = array[i] }
            i++
            j--
        }
        count++
    } while (i <= j)
    if (j > left) count += sort(array, left, j+1)
    if (i < right-1) count += sort(array, i, right)
    return count
}
