# CodeJam coding challenge: [Rope Intranet](https://code.google.com/codejam/contest/619102/dashboard#s=p0)
The following problem is copied from: https://code.google.com/codejam/contest/619102/dashboard#s=p0
##Problem
A company is located in two very tall buildings. The company intranet connecting the buildings consists of many wires, each connecting a window on the first building to a window on the second building.

You are looking at those buildings from the side, so that one of the buildings is to the left and one is to the right. The windows on the left building are seen as points on its right wall, and the windows on the right building are seen as points on its left wall. Wires are straight segments connecting a window on the left building to a window on the right building.

![alt tag](https://code.google.com/codejam/contest/images/?image=RopeIntranet.png&p=599117&c=619102)

You've noticed that no two wires share an endpoint (in other words, there's at most one wire going out of each window). However, from your viewpoint, some of the wires intersect midway. You've also noticed that exactly two wires meet at each intersection point.

On the above picture, the intersection points are the black circles, while the windows are the white circles.

How many intersection points do you see?

##Structure of Input & Output

###Input

The first line of the input gives the number of test cases, **T**. **T** test cases follow. Each case begins with a line containing an integer **N**, denoting the number of wires you see.

The next **N** lines each describe one wire with two integers **A<sub>i</sub>** and **B<sub>i</sub>**. These describe the windows that this wire connects: **A<sub>i</sub>** is the height of the window on the left building, and **B<sub>i</sub>** is the height of the window on the right building.

###Output

For each test case, output one line containing "Case #x: y", where x is the case number (starting from 1) and y is the number of intersection points you see.

######Limits

1 ≤ **T** ≤ 15.  
1 ≤ **A<sub>i</sub>** ≤ 10<sup>4</sup>.  
1 ≤ **B<sub>i</sub>** ≤ 10<sup>4</sup>.  
Within each test case, all **A<sub>i</sub>** are different.  
Within each test case, all **B<sub>i</sub>** are different.  
No three wires intersect at the same point.  

######Small dataset

1 ≤ **N** ≤ 2.

######Large dataset

1 ≤ **N** ≤ 1000.

######Sample

|Input |	Output|
|:-----|:-------|
|||
|2 |Case #1: 2|
|3 |Case #2: 0|
|1  10 ||
|5  5 ||
|7  7 ||
|2 ||
|1  1 ||
|2  2 ||


______________________________________________________________________________________________________________________________________
#My Solution
##The Logic:


