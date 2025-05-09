package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class vectorLIst {
    public static void main(String[] args) {
        Vector<Integer> vc = new Vector<>(5,3);
        vc.add(1);
        vc.add(1);
        vc.add(1);
        vc.add(1);
        vc.add(1);
        System.out.println("Original capacity "+ vc.capacity());
        vc.add(1);
        System.out.println("New capacity " + vc.capacity());

        Stack<Integer> stack = new Stack<>();
        stack.isEmpty();



    }


}
