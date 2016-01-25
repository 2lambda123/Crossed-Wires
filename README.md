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

For each test case, output one line containing "Case #**x**: **y**", where **x** is the case number (starting from 1) and **y** is the number of intersection points you see.

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
A wire **x** can only intersect a wire **y** 

if the floor number of the right buliding **x>y** and  floor number of the left buliding **x<y**</br>
or </br>
if the floor number of the right buliding **x<y** and number of the left buliding **x>y**</br>

It is not nessesiary to calculate the values for where these intersections occur as the challange states:</br>
"You've also noticed that *exactly two wires meet at each intersection point*."

##My Method:
I have taken each new wire an compared it to a stored list of existing wires and used a counter to track the number of 
additional intersections created by each addtional wire.

##Files

There are 4 java files in this program:

- [Intersections.java] (https://github.com/ya2287c/Crossed-Wires/blob/master/Intersections.java)
  * This file takes in the set of wires and tracks the number of intersections created base on the logic
     explained above
- [Wire.java] (https://github.com/ya2287c/Crossed-Wires/blob/master/Wire.java)
  * This file contains the wire class which is the fundamental object of this challenge.  
- [FileInput.java] (https://github.com/ya2287c/Crossed-Wires/blob/master/FileInput.java)
  * This file passes the input from the text files provided by the challenge, these text file names are hard coded 
    into the java file 
- [Runner.java] (https://github.com/ya2287c/Crossed-Wires/blob/master/Runner.java)
  * This file just runs the program, it's only purpose to start, run, and end the program.
    I've assumed a 'smart' user design in that the progam prompts to user only once whether
    to run the 'small' input-file or the 'large' input-file
    the program only reponds to an input of 'small' or 'large' and exits upon completion
    users who want to run both the small and large input-files must execute the program twice

Additionally, I've included the 2 text files provided by the CodeJam coding challenge at:</br>
https://code.google.com/codejam/contest/619102/dashboard#s=p0
- A-large-practice.in
- A-small-practice.in

Lastly, I've included my results in 2 text files:
- large.out
- small.out


