# CSX42: Assignment 1
## Name: Madhan Thangavel
## B NO: B00814916

-----------------------------------------------------------------------
-----------------------------------------------------------------------

## Note:
    1. As I registered for the course of late, I was given a extension of 5 days to submit the assignment. Kindly consider.


Following are the commands and the instructions to run ANT on your project.
#### Note: build.xml is present in wordPlay/src folder.

-----------------------------------------------------------------------
## Instruction to clean:

####Command: ant -buildfile wordPlay/src/build.xml clean

Description: It cleans up all the .class files that were generated when you
compiled your code.

-----------------------------------------------------------------------
## Instruction to compile:

####Command: ant -buildfile wordPlay/src/build.xml all

Description: Compiles your code and generates .class files inside the BUILD folder.

-----------------------------------------------------------------------
## Instruction to run:

####Command: ant -buildfile wordPlay/src/build.xml run -Dinput="input.txt" -Doutput="output.txt" -Dmetrics="metrics.txt"

Note: Arguments accept the absolute path of the files.


-----------------------------------------------------------------------
## Description:

It is simple Java program to process a input file of type string and print the output in the output file.

Program takes the input and rotates each word based on their index in line and writes it in result file.

Example: 

Input.txt --> Welcome to design patterns summer 2020.
Output.txt --> eWelcom to igndes ernspatt ummers 2020.

The resultant computation is placed in metrics.txt

Example:

Mertics.txt ---> AVG_NUM_WORDS_PER_SENTENCE - 6.0  AVG_WORD_LENGTH - 5.67

-----------------------------------------------------------------------
### Academic Honesty statement:
-----------------------------------------------------------------------

"I have done this assignment completely on my own. I have not copied
it, nor have I given my solution to anyone else. I understand that if
I am involved in plagiarism or cheating an official form will be
submitted to the Academic Honesty Committee of the Watson School to
determine the action that needs to be taken. "

Date: [15 JUNE 2020]


