/*
* Insertion Sort:
*
* A simple sorting algorithm that builds the final sorted array
* one item at a time. It's efficient when sorting a small number
* of elements.
* */
package sortingAlgorithms

fun insertionSort( unsortedArray: Array< Int > ) {
    for( index in 1 until unsortedArray.size ) {
        val key = unsortedArray[ index ]
        var currentItem = index - 1
        while( currentItem > -1 && unsortedArray[ currentItem ] > key ) {
            unsortedArray[ currentItem + 1 ] = unsortedArray[ currentItem ]
            currentItem--
        }
        unsortedArray[ currentItem + 1 ] = key
    }
}