import java.util.Random;
import java.util.Scanner;

public class SelectionAndBubbleSort {
	
	
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		//ask the user how big of an array they want and multiply it by 5
		System.out.print("Enter the size of the array you want to sort: ");
		
		int size = scan.nextInt();
		
		int[] array = new int[size*5];
		
		//this loop will fill the array with values
		for(int i = 0; i < array.length; i++){
			//put random numbers into the array
			Random rand = new Random();
			array[i] = rand.nextInt(1000);
		}
		
		//prints the values of the array
		for(int n: array){
			System.out.println(n);
		}
		
		//sort the array using bubble sort
		BubbleSort(array);
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("Bubble Sorted Array");
		
		//prints the values of the array
		for(int n: array){
			System.out.println(n);
		}
		
		System.out.println("");
		System.out.println("");
		
		//sorts array by selection sorting
		SelectionSort(array);
		
		//prints the values of the array
		for(int n: array){
			System.out.println(n);
		}
		
		
		
	}//End of Main
	
	private static void BubbleSort(int[] bubArray){
		
		//make a variable that contains the length of the array since it will used a lot
		int n = bubArray.length;
		//have a temp value so i can swap values with it
        int temp = 0;
        
        //iterates the length of the array
        for(int i=0; i < n; i++){
        	//iterates one less than the array so it doesn't sort the last number because it will already be sorted
        	for(int j=1; j < (n-i); j++){        		
                //if the value before j is bigger than swap the values        
                if(bubArray[j-1] > bubArray[j]){
                    //swap the numbers
                    temp = bubArray[j-1];
                    bubArray[j-1] = bubArray[j];
                    bubArray[j] = temp;
               }
                        
          }
        }
        
	}//End of Bubble Sort Method
	
	private static void SelectionSort(int[] selectArray){
		int temp;
		int n = selectArray.length;
		for(int i = 0; i < (n - 2); i++ ){
			int min = i;
			for (int j = i; j < (n -1); j++){
				if (selectArray[j] < selectArray[min]){
					min = j;
				}
				//swap the values
				temp = selectArray[min];
				selectArray[i] = temp;
				selectArray[min] = selectArray[i];
				
			}
		}
		
	}
}
