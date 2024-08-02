//Program to print whether the given two strings have same frequency of repeating characters
//Input = apple tenth Output = yes
//other than p and t of freq 2 all other char have freq 1 so the sequence of freq of char is same
//Input = aaaabbbccd pqqqrrssss Output = yes

import java.util.*;
public class Hello {
    public static Object traverse(String s){
        Map<Character,Integer> m = new HashMap<>();
        Set<Character> set=new HashSet<Character>();
        for(int i=0; i<s.length(); i++){
            Character ic = s.charAt(i);
            System.out.println(!set.contains(ic));
            if(!set.contains(ic)){
                set.add(ic);
                m.put(ic,1);
            }
            else{
                int c = m.get(ic);
                System.out.println(c);
                m.put(ic,c++);
            }
        }
        return m.values();
    }
    public static void main(String[] args) {
// 		Your Code Here
        // Set<Integer> set1 = new HashSet<Integer>();
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
// 		set1.addAll(traverse(s1));
		Object arr = traverse(s1);
// 		while(!set2.isEmpty())
// 		{
// 		    if()
// 		}
        System.out.println(arr);
        // for(Integer i:arr){
        //     System.out.print(i);
        // }

	}
}
