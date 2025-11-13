
//demo for array implementation
public class ArrayDemo {

	public static void main(String[] args) {
		//create an array
		//datatype array name =new datatype[size];
		int arr[]=new int[4];
		arr[0]=22;
		arr[1]=52;
		arr[2]=72;
		arr[3]=32;
		//for loop
		for(int i=0; i<arr.length; i++) {
			System.out.println("the elements in the array"+arr[i]);
			
		}
		//enhanced loop
		for(int num: arr) {
			System.out.println("the elements in the array"+num);
			
		}
		
		
		
	}

}
