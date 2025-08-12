package daily_task;



import java.util.ArrayList;

public class Mystack {
	static ArrayList <Character> list=new ArrayList<>();
	void push(char c) {
		list.add(c);
	}
	char pop() {
		return list.remove(list.size()-1);
	}
	static String isbalanced(String exp) {
		 Mystack m=new Mystack();
		 for (char ch:exp.toCharArray()) {
			 if(ch =='{' || ch=='[' || ch== '(' ) {
				 m.push(ch);
			 }
			 else if (ch=='}' || ch==']'|| ch==')'){
				 if(list.isEmpty()) return "unbalanced";
				 char top=m.pop();
				 if(!(top=='{'&& ch=='}'||top=='['&&ch==']'|| top=='('&&top==')')) return "unbalanced";
			 }
		 }
		 return "balance";
		 
	 }
	 public static void main(String[] args) {
		System.out.println(isbalanced("{a+b}"));
	}
	
}

