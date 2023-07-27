import com.stacks.ArrayStack;
import com.stacks.Employee;

public class Main {
    public static void main(String[] args) {

        ArrayStack stack=new ArrayStack(10);

        stack.push(new Employee("jane","Sloan",123));
        stack.push(new Employee("Kat","Kot",234));
        stack.push(new Employee("Bill","Jill",345));
        stack.push(new Employee("Smart","Boy",678));

        stack.printStack();

        System.out.println(stack.peek());

        System.out.println("popped: " +stack.pop());
        stack.printStack();
    }
}