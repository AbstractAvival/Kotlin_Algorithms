/*
* Merge Sort:
*
* An efficient, general-purpose, and comparison-based sorting
* algorithm. Merge sort is a divide and conquer algorithm. It
* divides the input array into halves until it has n sublists,
* then it repeatedly merges these sublists until there is only
* one sublist remaining. This final sublist is the sorted list.
* */
package sortingAlgorithms

fun mergeSort( unsortedArray: Array<Int>, initialIndex: Int, finalIndex: Int ) {
    if( initialIndex >= finalIndex  )
        return

    val middleIndex = ( initialIndex + finalIndex ) / 2
    mergeSort( unsortedArray, initialIndex, middleIndex )
    mergeSort( unsortedArray, middleIndex + 1, finalIndex )
    mergeSublists( unsortedArray, initialIndex, middleIndex, finalIndex )
}

fun mergeSublists( unsortedArray: Array< Int >, initialIndex: Int, middleIndex: Int, finalIndex: Int ) {
    val firstArraySize = middleIndex - initialIndex + 1
    val secondArraySize = finalIndex - middleIndex

    val firstArray = arrayListOf< Int >()
}