import java.util.Random;
import java.util.Scanner;

public class Sorts {
	
	
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		//ask the user how big of an array they want and multiply it by 5
		System.out.print("Enter the size of the array you want to sort: ");
		
		int size = scan.nextInt();
		
		System.out.println("");
		System.out.println("");
		
		//creates array based on the user input
		int[] array = createIntArray(size);
		
		System.out.println("Unsorted Array");
		//prints the values of the array
		for(int n: array){
			System.out.print(n + " ");
		}
		
		//sort the array using bubble sort
		BubbleSort(array);
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("Bubble Sorted Array");
		
		//prints the values of the array
		for(int n: array){
			System.out.print(n + " ");
		}
		
		System.out.println("");
		System.out.println("");
		
		int[] arrayTwo = createIntArray(size);
		
		System.out.println("Unsorted array");
		
		//prints the values of the unsorted array
		for(int n: arrayTwo){
			System.out.print(n + " ");
		}
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("Selection Sorted Array");
		
		//sorts array by selection sorting
		SelectionSort(arrayTwo);
		
		//prints the values of the sorted array
		for(int n: arrayTwo){
			System.out.print(n + " ");
		}
		
		
		
	}//End of Main
	
	private static void BubbleSort(int[] bubArray){
		
		// make a variable that contains the length of the array since it will used a lot
		int n = bubArray.length;
		// have a temp value so i can swap values with it
        int temp = 0;
        
        // iterates the length of the array
        for(int i=0; i < n; i++){
        	// initializes a swap value to make the algorithm more efficient by not sorting if the array had no swaps
        	int swap = 0;
        	// iterates one less than the array so it doesn't sort the last number because it will already be sorted
        	for(int j=1; j < (n-i); j++){        		
                // if the value before j is bigger than swap the values        
                if(bubArray[j-1] > bubArray[j]){
                    // swap the numbers
                    temp = bubArray[j-1];
                    bubArray[j-1] = bubArray[j];
                    bubArray[j] = temp;
                    swap++;
               }
                        
          }
        	// if there are no swaps then exit the loop
        	if(swap == 0){
        		break;
        	}
        }
        
	}//End of Bubble Sort Method
	
	private static void SelectionSort(int[] selectArray){
		
		int n = selectArray.length;
		
		 for (int i = 0; i < n - 1; i++)
	        {
			 	//stores the index of the value of i
	            int index = i;
	            for (int j = i + 1; j < n; j++)
	            	// if the array at index j is less than the array at index then index = j
	                if (selectArray[j] < selectArray[index]){
	                	index = j;
	                }
	                    
	            // this smaller number is equal to the array at index
	            int smallerNumber = selectArray[index]; 
	            // makes the value at index equal value at index i
	            selectArray[index] = selectArray[i];
	            // value at index i will now be the value of the smaller number
	            selectArray[i] = smallerNumber;
	        }
	        
	    }
	
		
	
	private static int[] createIntArray(int size){
		int[] array = new int[size];
		
		//this loop will fill the array with values
		for(int i = 0; i < array.length; i++){
			//put random numbers into the array
			Random rand = new Random();
			//makes the random numbers 5 times the size of the array the user wants
			array[i] = rand.nextInt((size*5)) + 1;
		}
		return array;
	}
}
