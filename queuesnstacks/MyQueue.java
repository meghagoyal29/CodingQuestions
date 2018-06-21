package queuesnstacks;

import java.util.Stack;

public class MyQueue<T> {

	Stack<T> instack = new Stack<T>(); //the one with newest element on top

	Stack<T> outstack = new Stack<T>(); // the one with oldest element on top

	public void enqueue(T nextInt) {

		instack.push(nextInt);


	}

	public void dequeue() {

		if(outstack.isEmpty())
			while(!instack.isEmpty()) {
				outstack.push(instack.pop());
			}
		outstack.pop();

	}

	public T peek() {

		if(outstack.isEmpty())
			while(!instack.isEmpty()) {
				outstack.push(instack.pop());
			}
		return outstack.peek();
	}

}
