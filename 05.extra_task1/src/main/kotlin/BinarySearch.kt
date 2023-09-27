fun SearchAndPrint() {
    var array: Array<Int> = InputArray()
    QuickSort(array)
    print("Enter the searching element: ")
    var element = readln().toInt()
    val begin = System.nanoTime()
    val num = BinarySearch(array, element)
    val end = System.nanoTime()
    if (num == -1) {
        println("No such element")
    } else {
        println("Number of the searched element: ${num}")
    }
    println("Function BinarySearch took ${end-begin} nanoseconds.")
}

fun BinarySearch(array: Array<Int>, element: Int): Int {
    var left = 0
    var right = array.size - 1
    while (left <= right) {
        var middle: Int = (left+right)/2
        var curr = array[middle]
        if (curr == element) return middle
        else if (curr < element) left = middle + 1
        else right = middle - 1
    }
    return -1
}