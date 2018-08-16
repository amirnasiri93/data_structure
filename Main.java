public class Main{
    public static void main(String[] args){
    		/**
		 * Stack stack = new Stack<>(); System.out.println(stack.isEmpty());
		 * stack.push("Amir"); System.out.println(stack); stack.push("Nasiri");
		 * System.out.println(stack); stack.push("age:25"); System.out.println(stack);
		 * 
		 * try { System.out.println("The element at the top is: "+stack.top()); } catch
		 * (StackEmptyException e) { e.printStackTrace(); }
		 * System.out.println(stack.pop()); try { System.out.println("The element at the
		 * top is: "+stack.top()); } catch (StackEmptyException e) {
		 * e.printStackTrace(); } System.out.println(stack.pop()); try {
		 * System.out.println("The element at the top is: "+stack.top()); } catch
		 * (StackEmptyException e) { e.printStackTrace(); }
		 * System.out.println(stack.pop()); try { System.out.println("The element at the
		 * top is: "+stack.top()); } catch (StackEmptyException e) {
		 * e.printStackTrace(); }
		 */
    		Node<String, Integer> one = new  Node("One",new Node("Two", null));
    		SinglyLinkedList list = new SinglyLinkedList(one);
    		
    		System.out.println(list.size());
    		list.add(new Node("three"),null);
    		
    		
    		
    		
    		
    		

	}
}