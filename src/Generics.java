import java.util.Collections;

//this is git commit

class Store<T>{
	
	public T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}

//added :: between item name and value
  public String toString()
  {
	  ///changes by user1
	  
	  String str="item::"+item;
	  return str;
  }
}

public class Generics {

	
	public static void main(String[] args) {

		
	Store<String> Item1=new Store<>();
	Item1.setItem("New Book");
	
	String book=Item1.getItem();
	System.out.println(book); 
	}
}
