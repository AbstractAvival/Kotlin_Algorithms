/*
* Quick Sort:
*
* A divide and conquer algorithm. It picks an element as
* a pivot point and partitions the given array around said
* pivot into sub-arrays. The sub-arrays are then sorted
* recursively.
* */
package sortingAlgorithms

fun quickSort( unsortedArray: Array< Int >, startIndex: Int, endIndex: Int ) {
    if( startIndex >= endIndex )
        return

    val pivotIndex = Partition( unsortedArray, startIndex, endIndex )
    quickSort( unsortedArray, startIndex, pivotIndex - 1 )
    quickSort( unsortedArray, pivotIndex + 1, endIndex )
}

fun Partition( unsortedArray: Array< Int >, startIndex: Int, endIndex: Int ) : Int {
    var pivotValue = unsortedArray[ endIndex ]
    var currentPivotIndex = startIndex - 1

    for( currentIndex in startIndex until endIndex ) {
        if( unsortedArray[ currentIndex ] <= pivotValue ) {
            currentPivotIndex++
            unsortedArray[ currentIndex ] = unsortedArray[ currentPivotIndex ].also {
                unsortedArray[ currentPivotIndex ] = unsortedArray[ currentIndex ]
            }
        }
    }

    currentPivotIndex++
    unsortedArray[ currentPivotIndex ] = unsortedArray[ endIndex ].also {
        unsortedArray[ endIndex ] = unsortedArray[ currentPivotIndex ]
    }
    return currentPivotIndex
}