package challenges;

//On a cool Christmas tree the placement of toys is very important. There are several levels of toys, with exactly one toy at the topmost level. Every toy is connected to exactly one toy at the level directly above (but for the topmost toy) and to some (maybe none) toys at the level directly below.
//Each toy has its unique number in range from 0 to n - 1 . The topmost toy has number 0.
//Now that it's time to take the Christmas tree down, the toys should be stored away carefully. Toys from the same level should be put into one box so that the leftmost toy on that level is the first in the box, the second from the left is the second in the box etc.
//Knowing how the toys are connected, determine how they should be stored.
//Example//
//For toys = [[6, 2, 4], [], [], [], [5, 1], [], [3]], the output should be
//christmasToys(toys) = [[0], [6, 2, 4], [3, 5, 1]].
//The toys' positions are shown in the picture below.
//
//Input/Output
//[execution time limit] 3 seconds (java)
//[input] array.array.integer toys
//An array of arrays containing at least one non-empty array as an element. Array at the ith position represents the toys that are connected to the ith toy and are located at the lower level. The toys are given in the left-to-right order.
//Guaranteed constraints:
//5 ≤ toys.length ≤ 25,
//0 ≤ toys[i].length ≤ 10,
//1 ≤ toys[i][j] ≤ 25.
//
//[output] array.array.integer
//
//Configuration of the toys in boxes. The first box corresponds to the topmost level, the second box - to the second one, etc.

public class Christmas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
