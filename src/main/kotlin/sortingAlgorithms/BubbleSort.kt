/*
* Bubble Sort:
*
*A sorting algorithm that compares two adjacent elements and
* swaps them if they are in the wrong order. This is repeated
* until the list is sorted. Bubble sort is not a practical
* sorting algorithm.
* */
package sortingAlgorithms

fun bubbleSort( unsortedArray: Array< Int > ) {
    for( count in unsortedArray.indices ) {
        for( swapIndex in 0 until unsortedArray.size - count - 1 ) {
            if( unsortedArray[ swapIndex ] > unsortedArray[ swapIndex + 1 ] ) {
                unsortedArray[ swapIndex ] = unsortedArray[ swapIndex + 1 ].also {
                    unsortedArray[ swapIndex + 1 ] = unsortedArray[ swapIndex ]
                }
            }
        }
    }
}