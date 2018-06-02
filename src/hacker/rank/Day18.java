package hacker.rank;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Day18 {

	// Stack and Queue challenge
    Stack<Character> stack = new Stack<Character>();
    Queue<Character> queue = new LinkedList<Character>();
    void pushCharacter(char ch)
        {
        stack.push(ch);
    }
     void enqueueCharacter(char ch){
        queue.add(ch);
     }
    char popCharacter() {
        return stack.pop();
    }

    char dequeueCharacter()
        {
        return queue.remove();
    }
}