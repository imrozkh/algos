# Get products of all other elements

Given an array of integer, return a new array such that each element at index _i_ of the new array is the product of all the numbers in the original array except the one at _i_.

### Example:
if the input is:

[1, 2, 3, 4, 5]

the expected output should be:

[120, 60, 40, 30, 24]

_**Follow Up: solve without using division.**_

# Solution 

## Solution 1

The solution is simple, and can be done using 2 pass of the array, if we are allowed to use division.
 
Find the the product of all the numbers in an array (first pass), and then devide the product by each element to find the value at that position(second pass).

**Time complexity:** O(n)
**Space complexity:** O(1)





