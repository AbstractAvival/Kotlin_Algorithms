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
    val firstArray = unsortedArray.copyOfRange( initialIndex, middleIndex + 1 )
    val secondArray = unsortedArray.copyOfRange( middleIndex + 1, finalIndex + 1 )

    var firstArrayIndex = 0
    var secondArrayIndex = 0
    var mergedArrayIndex = initialIndex

    while( firstArrayIndex < firstArray.size && secondArrayIndex < secondArray.size ) {
        if( firstArray[ firstArrayIndex ] < secondArray[ secondArrayIndex ] ) {
            unsortedArray[ mergedArrayIndex ] =  firstArray[ firstArrayIndex ]
            firstArrayIndex++
        }
        else {
            unsortedArray[ mergedArrayIndex ] =  secondArray[ secondArrayIndex ]
            secondArrayIndex++
        }
        mergedArrayIndex++
    }

    while( firstArrayIndex < firstArray.size ) {
        unsortedArray[ mergedArrayIndex ] =  firstArray[ firstArrayIndex ]
        firstArrayIndex++
        mergedArrayIndex++
    }

    while( secondArrayIndex < secondArray.size ) {
        unsortedArray[ mergedArrayIndex ] =  secondArray[ secondArrayIndex ]
        secondArrayIndex++
        mergedArrayIndex++
    }
}