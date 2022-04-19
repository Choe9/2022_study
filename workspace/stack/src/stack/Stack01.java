package stack;

import java.util.Stack;

public class Stack01 {
	
	static Stack<Integer> stack = new Stack<>();

	public static void main(String[] args) {
		//test data
        args = new String[8];
        args[0] = "7";
        args[1] = "pop";
        args[2] = "top";
        args[3] = "push 123";
        args[4] = "top";
        args[5] = "pop";
        args[6] = "top";
        args[7] = "pop";

        for(String exeStr : args){
            switch (exeStr.split(" ")[0]){
                case "push" : push(Integer.parseInt(exeStr.split(" ")[1])); break;
                case "pop"  : pop();    break;
                case "size" : size();   break;
                case "empty": empty();  break;
                case "top"  : top();    break;
            }
        }
    }

    //push X: 정수 X를 스택에 넣는 연산이다.
    public static void push(int x){
        stack.push(x);
    }

    //pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    public static void pop(){
        System.out.println(stack.isEmpty() ? -1 : stack.pop());
    }

    //size: 스택에 들어있는 정수의 개수를 출력한다.
    public static void size(){
        System.out.println(stack.size());
    }

    //empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
    public static void empty(){
        System.out.println(stack.empty() ? 1 : 0);
    }

    //top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    public static void top(){
        System.out.println(stack.empty() ? -1 : stack.peek());
    }
    
}
