	• Create a slide deck or other component to present to the class that helps organize your thoughts. It should, at a minimum, address...
		○ What is the interview question you are addressing?
		Find the difference between comparison-based sorting algorithms (quick sort, merge sort) and non-comparison based ones (radix sort, counting sort)
		○ What companies could you find that have asked this question in interviews?
		None
		○ Where did you find this question?
		○ What is the overall data structure or algorithm being addressed in this question?
	• Produce and demonstrate working Java code that addresses the answer to the interview question. Show this working code to the class.
	• Walk through the core algorithm or data structure using the Java debugging tools and your working code example. 
	• Keep the presentation within the allotted time frame of 10 minutes. 
	• Both members of the group must present. You can break the presentation into two parts, or you can make it more of a conversation between the two of you.
	• Be well prepared and review all materials for bugs and grammar/spelling errors.
	• Be sure to cite all sources used to assemble your document.
	• Post all of your materials to the discussion forum thread that will be provided for this assignment at the beginning of Week 14. This is how other students will watch your presentation.
	• Submit your presentation materials using this assignment. This is how I will grade your presentation.

Intro:
	• The interview question I am addressing is finding the difference between comparison-based sorting algorithms (quick sort, merge sort) and non-comparison based ones (radix sort, counting sort)
	• Companies like Amazon, Microsoft, Netflix, Airbnb, Shopify often ask sorting algorithm questions like this one in interviews.
	• I found this question on Commonly Asked Sorting Algorithm Interview Questions from geeksforgeeks and Sorting Algorithms Interview Questions from devinterview
	• Sorting algorithms are being addressed in this question.

Comparison Based Algorithms
	• Relies on comparison to sort its elements in order
	• Examples: QuickSort, Bubble Sort, Merge Sort, Selection Sort, Insertion Sort, Heap Sort
	• Can achieve a O(nLogn) time complexity, proven mathematically
	
Non-Comparison Based Sorting Algorithms
	• Relies on factors other than comparison to sort its elements, such as counting occurrences or recursion
	• Examples: Counting Sort, Radix Sort, Bucket Sort
	• Can achieve a linear/O(N) time complexity under proper conditions
	
Difference
	• Non-comparison algorithms can have a faster time complexity than O(nlogn) under the right conditions such as, while comparison based cannot perform better than O(nlogn)
	• Non-comparison is generally more stable, comparison often shuffles around elements that have equivalent values
	• Non-comparison can be more useful for larger data sets
	• Non-comparison's time complexity can also depend on input size
	• Non-comparison can also take up more space
	• Comparison-based is more popular and compatible with more use cases than non-comparison-based
	
Non-Comparison Algorithm limitations
		○ Radix Sort, sorts the integers of an array from least significant to most significant. As such the elements need to either be integers or strings with fixed sizes. It is most effective if the element with the maximum integer is located at the end of the array from the start.
		○ Counting Sort counts occurrences of an element in a list and then places them in order based on that count. Similar to Radix Sort, the elements have to be integers. The range of integers also shouldn't be larger than the size of the array
		○ Bucket Sort: Creates an array of buckets, distributes elements of another array into those buckets, uses another sorting algorithm or recursion to sort the buckets, and then merges them back to the original array. It is best effective when the elements of the array can be distributed into buckets neatly and uniformly. I Can be considered to be comparison based if something like selection algorithm is called upon during bucket sorting. 
	
Code Example
Compare and walkthrough a comparison and non-comparison based algorithm.
	• Selection Sort
		○ O(N^2) time (number of elements squared)
		○ Worse for larger datasets
		○ Takes less space, supports in place sorting
		○ Less stable
		○ Compatible with more data types
	• Radix Sort
		○ O(N*K) time (number of elements * number of digits)
		○ Better for larger datasets
		○ Takes more space, does not support in place sorting
		○ More stable
		○ Less compatible (e.g. needs to be rewritten to accommodate negative integers)
		

Citations
https://www.geeksforgeeks.org/dsa/commonly-asked-algorithm-interview-questions-set-1/
https://github.com/Devinterview-io/sorting-algorithms-interview-questions
https://www.geeksforgeeks.org/dsa/analysis-of-different-sorting-techniques/
https://interviewing.io/sorting-interview-questions
https://medium.com/@sonal98roche/comparing-popular-sorting-algorithms-a-practical-overview-f7e41ecbd1e3
https://www.geeksforgeeks.org/dsa/counting-sort/
https://www.geeksforgeeks.org/dsa/applications-advantages-and-disadvantages-of-radix-sort/
https://www.geeksforgeeks.org/dsa/selection-sort-algorithm-2/
