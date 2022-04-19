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

    //push X: ���� X�� ���ÿ� �ִ� �����̴�.
    public static void push(int x){
        stack.push(x);
    }

    //pop: ���ÿ��� ���� ���� �ִ� ������ ����, �� ���� ����Ѵ�. ���� ���ÿ� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
    public static void pop(){
        System.out.println(stack.isEmpty() ? -1 : stack.pop());
    }

    //size: ���ÿ� ����ִ� ������ ������ ����Ѵ�.
    public static void size(){
        System.out.println(stack.size());
    }

    //empty: ������ ��������� 1, �ƴϸ� 0�� ����Ѵ�.
    public static void empty(){
        System.out.println(stack.empty() ? 1 : 0);
    }

    //top: ������ ���� ���� �ִ� ������ ����Ѵ�. ���� ���ÿ� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
    public static void top(){
        System.out.println(stack.empty() ? -1 : stack.peek());
    }
    
}
