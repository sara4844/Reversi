# Reversi
Reversi game

This game is almost the same as the original Reversi, except the board
is not an 8x8 grid anymore. 

How does the Program Play?
In order to write a program that plays with your classmates’ programs, you should
write a program, which gets the configuration of the current state of the game as the
input and then prints a proper action as the next move. There is a server (you do not
need to implement the server) that gets two programs and alternately, (i) runs one
program, (ii) gives the current configuration to that as the input, (iii) receives the
program’s action, (iv) applies the action in the game and updates the current
configuration, and finally (v) runs the other program with the updated
configuration. This cycle continues until the game is over.

The Game
This variant of Reversi, is a strategy board game. The board (as shown below) has
88 cells. There are also 88 disks. Each disk has two sides, one with a light color and
one with a dark color. Each side corresponds to one player. Players take turns
placing disks on the board with their assigned color facing up.

Input Specification
Your program has to read inputs from the standard input. The input contains 88
integers, each of them are either 0, 1, or 2. The j-th number in the i-th line of the
input indicates the j-th cell of the i-th row in the board. If a cell is 0, then it is a free
cell. If it is 1, then there is a disk on your side in that cell, and otherwise if it is 2
there is a disk on your opponent’s side in that cell.

Output Specification
Your program has to write the answers into the standard output. The output has to
be two integers, indicating the cell you want to place your new disk. The first integer
denotes the row of the cell and the second integer denotes the column of the cell in
that row.

