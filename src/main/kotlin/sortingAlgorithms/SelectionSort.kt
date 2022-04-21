/*
* Selection Sort:
*
* Sorts an array by repeatedly finding the minimum element
* (or largest, depending on sorting order) in the unsorted list,
* swapping it with the leftmost unsorted element, and moving
* the sublist boundaries one element to the right.
*
* Similar to Insertion Sort, but generally performs worse.
* */
package sortingAlgorithms

fun selectionSort( unsortedArray: Array< Int > ) {
    for( index in unsortedArray.indices ) {
        var minimumIndex = index
        var offsetIndex = minimumIndex + 1
        while( offsetIndex < unsortedArray.size ) {
            if( unsortedArray[ offsetIndex ] < unsortedArray[ minimumIndex ] ) {
                minimumIndex = offsetIndex
            }
            offsetIndex++
        }
        unsortedArray[ index ] = unsortedArray[ minimumIndex ].also {
            unsortedArray[ minimumIndex ] = unsortedArray[ index ]
        }
    }
}