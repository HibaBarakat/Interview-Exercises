"# Interview-Exercises" 

Here you can find the questions and the solutions , solutions were submitted and named by the number of the question 

Question 1:
Given a binary search tree, rearrange the tree in in-order so that the leftmost node in the tree is now the root of the tree, and every node has no left child and only 1 right child.

Question 2:
(test2.java) is the solution
You have a lock in front of you with 4 circular wheels. Each wheel has 10 slots: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'. The wheels can rotate freely and wrap around: for example we can turn '9' to be '0', or '0' to be '9'. Each move consists of turning one wheel one slot.

The lock initially starts at '0000', a string representing the state of the 4 wheels.

You are given a list of deadends dead ends, meaning if the lock displays any of these codes, the wheels of the lock will stop turning and you will be unable to open it.

Given a target representing the value of the wheels that will unlock the lock, return the minimum total number of turns required to open the lock, or -1 if it is impossible.

Example 1:
Input: deadends = ["0201","0101","0102","1212","2002"], target = "0202"
Output: 6
Explanation:
A sequence of valid moves would be "0000" -> "1000" -> "1100" -> "1200" -> "1201" -> "1202" -> "0202".
Note that a sequence like "0000" -> "0001" -> "0002" -> "0102" -> "0202" would be invalid,
because the wheels of the lock become stuck after the display becomes the dead end "0102".

^^^^^^^^^^^^^^^^^^^^^^     Algorithm    ^^^^^^^^^^^^^^^^^^^^^^

1) We have two sets (deadends and visited).
deadends >> if we reach one of the deadends then this way is locked and you can't reach target and we have to try again from other place
visited >> to make sure that this node will not be visited again.

2) define a distance variable.
  > check if the target is ("0000") return 0
  > if it is a deadend return -1 
3) We will define a queue (BFS), the starting point ("0000") will be added to the queue.
4) while the queue is not empty 
  > the code will be polled from the queue
  > check the code if it is a deadend so to continue
  > check if the target equals the polled code so to return the distance
  > the polled code which contain of 4 slots, each slot moves step forward or step backwards so we need two for loops
  > check if the generated code is dead or visited if not add it to the queue and and visited 
  
 5) keep loop until reach target
  

 
