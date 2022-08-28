# Recursion

## Intro

![recursion xkcd](https://bookdown.org/hneth/ds4psy/images/xkcd/xkcd_recursion.png)

>Recursion:
a computer programming technique involving the use of a procedure, subroutine, function, or algorithm
that calls itself one or more times until a specified condition is met
at which time the rest of each repetition is processed from the last one called to the first.


A **recursive function** solves a task by:
- reducing it to a base case, which produces a simple result,
- and reducing it to a simpler case of itself, until we reach the base case. (the function calls itself)

Example: (countdown to zero)
```java
public static void countDown(int n){
    if(n < 0) return; // <- Base case
    System.out.println(n);
    countDown(n - 1); // <- Recursive call
}

```

![recursion xkcd](https://lh4.googleusercontent.com/ZYW5kD_bW5d_QpvKTDzl2fYwGUcvTkx1sH0Uzi9teKMupeV0I5OcKe4imw2o3_oW--WSkX3aFYoLORJ3gt-dfIixRaSxZKbIX1YBIhUCPQ2UNaKpy_-1FWWyLrJNocEb1tKLJRY)
 
## Practice tasks

### Tasks
- 1 Print all elements of the array, with recursion
- 2 Calculate the sum of the first n numbers
- 2b Calculate the minimum of given numbers with recursion 
- 3 Calculate the sum of the given numbers
- 4 Determine, if the parameter is palindrome or not
- 5 Calculate of the factorial of the given number
- 6 Calculate the n-th fibonacchi number
- 7 implement the merge sort algorithm:
  - first implement the merge step
  - implement the sorting
- 8 Create a binary tree, and using recursion:
  - find the maximal depth of the tree.
  - returns the contents of the tree in order
  - implement the `boolean contains(int element)` method for the tree
  - Repeating elements should not count, behaves like a set.

### Possible problems:

- StackOverflowError

Solution: Tail call optimization/elimination (Java doesn't have it (yet!).)
