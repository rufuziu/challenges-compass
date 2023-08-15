# challenges-compass

-rank students according to the number of problems solved (Collection.sort by problems)
-ties resolved in alphabetical order (name) (Collections.sort by name)

-Your task in this problem is to write a program that reads the results of Professor 
Wallywow's students and prints the name of the unfortunate student who failed.
(finish removing the last element [z-a][0-9])

INPUT

-first line = integer n ( 1 <= n <= 100) indicating the number of students in the competition
-each of the following n lines contains the name of the student and the number of the problems solved
-name letters[a-z] length <=20
-problems 0 <= 9
-the input ends with end-of-file

OUTPUT
-For each instance, you should print an identifier Instance k, where k is the number of 
the current instance. On the next line, print the name of the unfortunate student who 
failed