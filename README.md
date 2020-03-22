# Problem Set 11

It's time to put your skills to the test. You've already done a little searching and sorting in the last problem set. Now, we're going to take a more manual approach.

## Getting Started

To get started, create a [GitHub](https://github.com/) repository to store your code. When you're finished, clone my skeleton to get all of the starter code and instructions. Setup a remote to push your code to your repository instead of mine.

### Setup

1. Login to your GitHub account and create a new repository named `pset-11`.
2. In the terminal, navigate to your `APCSA` directory on the `Desktop`.

```
$ cd ~/Desktop/APCSA
```

3. Clone my skeleton repository into a directory named `pset-11`.

```
$ git clone git@github.com:ap-java-ucvts/pset-11-skeleton.git pset-11
```

4. Change into your newly created `pset-11` directory.

```
$ cd pset-11
```

5. Overwrite the remote, which originally points at my skeleton repository.

```
$ git remote rename origin upstream
```

6. Add a new remote that points at your `pset-11` repository. Replace `YOUR-USERNAME` with your actual username.

```
$ git remote add origin git@github.com:YOUR-USERNAME/pset-9.git
```

7. Open up the `Exercises.java` file, which is where you'll implement each of your solutions.

The first exercise is partially done for you (the input verification part, anyway). You'll be on your own for the rest. There are a lot of exercises in this problem set, but none of them are too challenging. Take your time and try not to get frustrated.

## Exercises

The method stubs are already written for you, which serve as your guidelines for the accepted inputs and desired outputs.

Work through these exercises on your own. Experiment, make mistakes, ask questions, and fix your mistakes. It's the only way to get good at programming.

### Exercise 1 (`findMe`)

Find the specified number in the list and return the index at which that number is located. For lists that contain more than one instance of the number, you should return the index of the first occurrence of the number. If the number is not found, return `-1`. Your solution must be an implementation of a linear search algorithm, and must account for `null` values wherever possible.

Use the provided `grademe.sh` script to verify your code against my test cases (coming soon).

### Exercise 2 (`findMe`)

Find the specified `String` in the list and return the index at which that `String` is located. For lists that contain more than one instance of the `String`, you should return the index of the first occurrence of the `String`. If the `String` is not found, return `-1`. Your solution must be an implementation of a linear search algorithm, and must account for `null` values wherever possible.

Use the provided `grademe.sh` script to verify your code against my test cases (coming soon).

### Exercise 3 (`findMeFaster`)

Find the specified number in the list and return the index at which that number is located. For lists that contain more than one instance of the number, you may return the index of the number that is located first. If the number is not found, return `-1`. Your solution must be an implementation of a binary search algorithm, and must account for `null` values wherever possible. Assume all lists, if not `null`, are already sorted in ascending order.

Use the provided `grademe.sh` script to verify your code against my test cases (coming soon).

### Exercise 4 (`findMeFaster`)

Find the specified `String` in the list and return the index at which that `String` is located. For lists that contain more than one instance of the `String`, you may return the index of the `String` that is located first. If the `String` is not found, return `-1`. Your solution must be an implementation of a binary search algorithm, and must account for `null` values wherever possible. Assume all lists, if not `null`, are already sorted in ascending order; `null` values appear at the end of the list.

Use the provided `grademe.sh` script to verify your code against my test cases (coming soon).

### Exercise 5 (`bubble`)

Sort the list in either ascending or descending order, and return the sorted list. Your solution must be an implementation of the bubble sort algorithm, and must account for `null` values wherever possible.

Use the provided `grademe.sh` script to verify your code against my test cases (coming soon).

### Exercise 6 (`bubble`)

Sort the list in either ascending or descending order, and return the sorted list. Your solution must be an implementation of the bubble sort algorithm, and must account for `null` values wherever possible. When sorted in both ascending and descending order, `null` values should always be placed at the end of the list.

Use the provided `grademe.sh` script to verify your code against my test cases (coming soon).

### Exercise 7 (`insertion`)

Sort the list in either ascending or descending order, and return the sorted list. Your solution must be an implementation of the insertion sort algorithm, and must account for `null` values wherever possible.

Use the provided `grademe.sh` script to verify your code against my test cases (coming soon).

### Exercise 8 (`insertion`)

Sort the list in either ascending or descending order, and return the sorted list. Your solution must be an implementation of the insertion sort algorithm, and must account for `null` values wherever possible. When sorted in both ascending and descending order, `null` values should always be placed at the end of the list.

Use the provided `grademe.sh` script to verify your code against my test cases (coming soon).

### Exercise 9 (`selection`)

Sort the list in either ascending or descending order, and return the sorted list. Your solution must be an implementation of the selection sort algorithm, and must account for `null` values wherever possible.

Use the provided `grademe.sh` script to verify your code against my test cases (coming soon).

### Exercise 10 (`selection`)

Sort the list in either ascending or descending order, and return the sorted list. Your solution must be an implementation of the selection sort algorithm, and must account for `null` values wherever possible. When sorted in both ascending and descending order, `null` values should always be placed at the end of the list.

Use the provided `grademe.sh` script to verify your code against my test cases (coming soon).

### Exercise 11 (`merge`)

Sort the list in either ascending or descending order, and return the sorted list. Your solution must be a recursive implementation of the merge sort algorithm, and must account for `null` values wherever possible.

Use the provided `grademe.sh` script to verify your code against my test cases (coming soon).

### Exercise 12 (`merge`)

Sort the list in either ascending or descending order, and return the sorted list. Your solution must be a recursive implementation of the merge sort algorithm, and must account for `null` values wherever possible. When sorted in both ascending and descending order, `null` values should always be placed at the end of the list.

Use the provided `grademe.sh` script to verify your code against my test cases (coming soon).

## Tests

To test your code, use the provided `grademe.sh` script. To run the script, use the following command.

```
./grademe.sh exerciseName dataType targetOrAscendingValue
```

It'll output the number passing test cases, as well as the input, expected output, and actual output of any failing test cases. Make sure your code is compiling before running this script, as it depends on the existence of a successfully compiling `Exercises.java` file.

## Deadline

Please read very carefully. Historically, most students lose points on problem sets for simply failing to read the instructions and requirements.

- March 22, 2020, at 11:59pm.

If you submit your problem set at midnight (i.e., March 23, 2020, at 12:00am), it is considered **late**!

### Submission Requirements

- Your code **must** compile. Code that fails to meet this minimum requirement will not be accepted.
- There must be **at least** 25 unique commits to your repository.
- Your code must meet each requirement outlined in the _Exercises_ and _Tests_ sections.
- Your code must adhere to the course style guidelines.

Happy coding!
