# codeChallenge

Java 8+ Streams, Collections, Lambda & Real-World Interview Practice — 5-Year Experience

Interview focus: Don't only memorize Stream syntax. Explain the approach, why each operation is used,

time complexity, edge cases, a non-Stream solution, and optimization.



1. Java Streams — Basic

1. Find the first non-repeated element in a List using Streams.

2. Find the first repeated element in a List.

3. Find all duplicate elements in a List.

4. Find all unique elements in a List.

5. Count the frequency of each element in a List.

6. Find the maximum element from a List using Streams.

7. Find the minimum element from a List.

8. Find the second highest number from a List.

9. Find the second lowest number from a List.

10. Find the third highest number from a List.

11. Find the sum of all numbers using reduce().

12. Find the average of numbers using Streams.

13. Find the product of all numbers using reduce().

14. Count even numbers in a List.

15. Count odd numbers in a List.

16. Find all even numbers.

17. Find all odd numbers.

18. Find numbers greater than 50.

19. Find numbers between 10 and 50.

20. Find the square of every number.

2. String + Streams

21. Find the first non-repeated character in a String. Example: "swiss" → w.

22. Find the first repeated character.

23. Find all duplicate characters.

24. Count frequency of every character.

25. Find unique characters.

26. Count vowels in a String.



27. Count consonants in a String.

28. Count spaces in a String.

29. Count digits in a String.

30. Find the most frequently occurring character.

31. Find the least frequently occurring character.

32. Reverse a String using Streams.

33. Check whether a String is a palindrome.

34. Find the longest word in a sentence.

35. Find the shortest word in a sentence.

36. Sort characters of a String.

37. Remove duplicate characters from a String.

38. Find the first character whose frequency is greater than 1.

39. Find all characters appearing exactly twice.

40. Find all words that occur more than once in a sentence.

3. Array/List Problems

41. Remove duplicate elements from an ArrayList.

42. Sort an ArrayList in ascending order.

43. Sort an ArrayList in descending order.

44. Find the largest number without using Collections.max().

45. Find the smallest number without using Collections.min().

46. Find the top 3 highest numbers.

47. Find the top 3 lowest numbers.

48. Find the sum of even numbers.

49. Find the sum of odd numbers.

50. Find the average of even numbers.

51. Find numbers whose frequency is greater than 1.

52. Find numbers whose frequency is exactly 2.

53. Find the number with the highest frequency.

54. Find the number with the second-highest frequency.

55. Find the missing number from 1, 2, 3, 5, 6. Expected: 4.

56. Find common elements between two Lists.

57. Find elements present in List A but not List B.

58. Find the union of two Lists.

59. Find the intersection of two Lists.

60. Find elements that occur in both Lists more than once.



4. Map + Streams

61. Sort a Map by key.

62. Sort a Map by value.

63. Find the key having the maximum value.

64. Find the key having the minimum value.

65. Find the second-highest value in a Map.

66. Find duplicate values in a Map.

67. Reverse a Map from Employee → Department into Department → Employees.

68. Count the frequency of words using a Map.

69. Find the most frequently occurring word.

70. Find employees grouped by department.

5. Employee-Based Questions

71. Find the employee with the highest salary.

72. Find the employee with the lowest salary.

73. Find the second-highest salary.

74. Find the second-lowest salary.

75. Find the third-highest salary.

76. Find employees having salary greater than 50,000.

77. Find average employee salary.

78. Find total salary of all employees.

79. Find employees grouped by department.

80. Find the highest-paid employee in each department.

81. Find the lowest-paid employee in each department.

82. Find average salary by department.

83. Find total salary by department.

84. Count employees in each department.

85. Find the department having the highest number of employees.

86. Find the department having the highest average salary.

87. Find the second-highest salary in each department.

88. Sort employees by salary ascending.

89. Sort employees by salary descending.

90. Sort employees first by department and then by salary.

6. Advanced Java 8 / Interview Level

91. Find duplicate employees based on employee ID.



92. Remove duplicate employees based on employee ID.

93. Find employees whose names start with "A".

94. Find employees whose names have more than 5 characters.

95. Find the employee with the longest name.

96. Convert List into Map using employee ID as the key.

97. Convert List into Map> grouped by department.

98. Find the highest-paid employee in every department using groupingBy() and maxBy().

99. Find the second-highest salary in every department.

100. Find the top 3 highest-paid employees from each department.



15 Questions to Practice First

1. First non-repeated element — groupingBy, counting, LinkedHashMap, Optional

2. Duplicate elements — Set, Streams

3. Frequency of elements — Map, groupingBy

4. Second highest number — sorted, distinct, skip

5. Sum using reduce — reduce

6. First non-repeated character — Streams + Map

7. Reverse String — Streams

8. Sort List — sorted()

9. Common elements — filter, contains

10. Map max value — max()

11. Second-highest salary — sorted, distinct, skip

12. Group employees by department — groupingBy

13. Highest salary per department — groupingBy + maxBy

14. Second-highest salary per department — grouping + sorting

15. Top 3 employees per department — groupingBy + limit



Key pattern from your current practice

For a first non-repeated element, a common approach is groupingBy + Function.identity() + counting(),

followed by filtering entries with count 1 and using findFirst(). If preserving the original encounter order is

required, use a LinkedHashMap in groupingBy. Avoid calling Optional.get() unless you have established that

a value exists; prefer orElse(), orElseGet(), orElseThrow(), etc.





create readme.md file for same

Your README.md file is ready.

MD icon
README
 MD 
Open
This README file provides a structured overview of the 100 questions, categorized by topic, along with the interview philosophy and foundational patterns you requested for your 5-year experience level preparation.




Gemini is AI and can make mistakes.

Analyzing
# 100 Java Coding Questions (Java 8+)

A comprehensive collection of Java 8+ coding challenges focusing on Streams, Collections, and Lambdas, curated for 5-year+ experienced professionals preparing for technical interviews.

## 🚀 Interview Philosophy
Don't just memorize Stream syntax. To succeed in senior-level interviews:
- **Explain the Approach:** Why choose `groupingBy` over a simple loop?
- **Understand the Cost:** What is the Time and Space complexity?
- **Edge Cases:** Handle `null`, empty lists, and single-element datasets.
- **Compare:** Be prepared to provide the non-Stream (imperative) alternative.
- **Optimization:** Know when Streams are faster or slower than traditional loops.

---

## 📋 The 100 Questions

### 1. Java Streams — Basic
1. Find the first non-repeated element in a List.
2. Find the first repeated element in a List.
3. Find all duplicate elements in a List.
4. Find all unique elements in a List.
5. Count the frequency of each element in a List.
6. Find the maximum element from a List.
7. Find the minimum element from a List.
8. Find the second highest number from a List.
9. Find the second lowest number from a List.
10. Find the third highest number from a List.
11. Find the sum of all numbers using `reduce()`.
12. Find the average of numbers.
13. Find the product of all numbers using `reduce()`.
14. Count even numbers in a List.
15. Count odd numbers in a List.
16. Find all even numbers.
17. Find all odd numbers.
18. Find numbers greater than 50.
19. Find numbers between 10 and 50.
20. Find the square of every number.

### 2. String + Streams
21. Find the first non-repeated character in a String (e.g., "swiss" → w).
22. Find the first repeated character.
23. Find all duplicate characters.
24. Count frequency of every character.
25. Find unique characters.
26. Count vowels in a String.
27. Count consonants in a String.
28. Count spaces in a String.
29. Count digits in a String.
30. Find the most frequently occurring character.
31. Find the least frequently occurring character.
32. Reverse a String using Streams.
33. Check whether a String is a palindrome.
34. Find the longest word in a sentence.
35. Find the shortest word in a sentence.
36. Sort characters of a String.
37. Remove duplicate characters from a String.
38. Find the first character whose frequency > 1.
39. Find all characters appearing exactly twice.
40. Find all words that occur more than once in a sentence.

### 3. Array/List Problems
41. Remove duplicate elements from an ArrayList.
42. Sort an ArrayList in ascending order.
43. Sort an ArrayList in descending order.
44. Find largest/smallest number without `Collections.max/min`.
45. Find the top 3 highest/lowest numbers.
46. Find the sum/average of even/odd numbers.
47. Find elements with frequency > 1 or exactly 2.
48. Find the number with the highest/second-highest frequency.
49. Find missing number (1, 2, 3, 5, 6 → 4).
50. Set Operations: Union, Intersection, Difference between two Lists.

### 4. Map + Streams
61. Sort a Map by key or by value.
62. Find key with max/min value.
63. Find second-highest value in a Map.
64. Find duplicate values in a Map.
65. Invert a Map: Employee → Department to Department → List<Employees>.
66. Count frequency of words using Map.
67. Find most frequent word.

### 5. Employee-Based Problems (Real-World Modeling)
71. Find max/min salary.
72. Find Nth highest/lowest salary.
73. Find employees by salary range, department, or name patterns.
74. Aggregate functions: Total/Average salary by department.
75. Grouping: Employees per department, highest-paid per department.
76. Sorting: Multi-level (Department then Salary).
77. Complex: Top 3 highest-paid employees in *each* department.

### 6. Advanced Java 8+ / Patterns
91. Deduplicate objects based on ID.
92. List to Map transformation (using ID as key).
93. Advanced grouping: `groupingBy` with `maxBy`, `mapping`, or `collectingAndThen`.

---

## 🎯 Top 15 to Practice First (Foundational)
*If you are short on time, master these patterns:*
1. **First non-repeated:** `groupingBy` + `LinkedHashMap` + `counting`.
2. **Frequency counting:** `groupingBy` + `counting`.
3. **Second highest:** `sorted` + `distinct` + `skip`.
4. **Summing:** `reduce` vs `summingInt`.
5. **Grouping/Aggregation:** `groupingBy` with downstream collectors (`maxBy`, `averagingDouble`, `counting`).
6. **Object Deduplication:** Using a custom `Set` with `TreeSet` or `filter` + `Map.putIfAbsent`.

> **Pro Tip:** Avoid `Optional.get()`. Always use `orElse()`, `orElseGet()`, or `orElseThrow()` to handle empty streams gracefully.
README.md
Displaying README.md.