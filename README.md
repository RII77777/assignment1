# assignment1

# Implemented algorithms
- Merge sort (with cutoff for small arrays, buffer reuse)
- Quick sort (randomized pivot, smaller-side recursion)
- Deterministic select (median of medians)
- Closest pair of points (divide and conquer)

# Metrics
- Number of comparisons
- Maximum recursion depth
- Basic allocation count

# Recurrence analysis
- Merge sort: T(n) = 2T(n/2) + O(n) → O(n log n) (master case 2)  
- Quick sort: T(n) =~ T(n/2) + T(n/2) + O(n) → Θ(n log n) average, O(n²) worst-case  
- Deterministic select: T(n) = T(n/5) + T(7n/10) + O(n) → O(n)  
- Closest pair: T(n) = 2T(n/2) + O(n) → O(n log n)

# Results
- Merge sort sorted correctly
- Quick sort sorted correctly
- Select finds k-th smallest element
- Closest pair works (distance for test points)

# Run
Compile and run "main.java"
