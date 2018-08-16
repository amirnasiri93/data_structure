class Main{
    public static void main(String[] args){
        Stack<String> stack = new Stack<>();
        System.out.println(stack.isEmpty());
        stack.push("Amir");
        stack.push("Nasiri");
        stack.push("age:25");

       
        try {
			System.out.println("The element at the top is: "+stack.top());
		} catch (StackEmptyException e) {
			e.printStackTrace();
		}
        System.out.println(stack.pop());
        try {
			System.out.println("The element at the top is: "+stack.top());
		} catch (StackEmptyException e) {
			e.printStackTrace();
		}
        System.out.println(stack.pop());
        try {
			System.out.println("The element at the top is: "+stack.top());
		} catch (StackEmptyException e) {
			e.printStackTrace();
		}
        System.out.println(stack.pop());
        try {
			System.out.println("The element at the top is: "+stack.top());
		} catch (StackEmptyException e) {
			e.printStackTrace();
		}
        
    }
}