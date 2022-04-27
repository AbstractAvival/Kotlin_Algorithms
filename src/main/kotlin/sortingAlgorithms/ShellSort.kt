/*
* Shell Sort:
*
* An improved insertion sort. Starts by sorting pairs of
* elements far apart from each other, then progressively
* reduces the gap between elements to be compared. Running
* time is heavily dependent on the gap sequence used.
* */
package sortingAlgorithms

//using shell sort's original gap sequence: k = n / 2
fun shellSort( unsortedArray: Array< Int > ) {
    var interval = unsortedArray.size / 2
    while( interval > 0 ) {
        for( currentIndex in 0..interval ) {
            for( sortPosition in currentIndex..unsortedArray.size step interval ) {
                val placeholder = unsortedArray[ sortPosition ]
                var reversePosition = sortPosition
                while( reversePosition >= interval ) {
                    if( unsortedArray[ reversePosition - interval ] > placeholder ) {
                        unsortedArray[ reversePosition ] = unsortedArray[ reversePosition - interval ]
                    }
                }
                unsortedArray[ reversePosition ] = placeholder
            }
        }
        interval /= 2
    }
}