package bss;

public class BSS //Bilateral-Selection-Sort
{ 
	static void BSSort(int[] arr){ 
		/* 
		 * Idea behind this sorting technique is to pick two elements
		 * 	1. Smallest Element 2. Largest Element 
		 * Place further selected element to the left end and right end of the array and shrink the iteration to the center
		 * to get the sorted array
		 * */
		int n = arr.length; //length of array
		int rightshrink=n-1; // get the right most end of array
		int temp=0,min,max,getindexmin,getindexmax;
		
		for(int i = 0;i <(n/2); i++) //Entire iteration runs (n/2) times which works for even length as well odd length 
		{ 
			min = max = arr[i]; // initial min max value to the arr[ith] location 
			getindexmin = getindexmax = i; // initial min_index max_index value to the ith location
			
			for (int leftshrink = i; leftshrink <= rightshrink; leftshrink++) // This is shrink loop which shrinks from both the ends towards center on each outer iteration 
			{ 
				//Below are the swapping conditions and getting the mix and max element along with its index
				if (arr[leftshrink] > max){	
					max = arr[leftshrink]; 
					getindexmax = leftshrink; 
				} 
				else if (arr[leftshrink] < min){
					min = arr[leftshrink]; 
					getindexmin = leftshrink; 
				} 
			}
			
			/*
			* Placing the mix max elements with left and right ith position of array by
			* swapping Following conditions needs to write in the same order to the desired sorted array
			*/
			temp = arr[i];
			arr[i]=arr[getindexmin];
			arr[getindexmin]=temp;
			
			if (arr[getindexmin] == max) {
				temp = arr[rightshrink];
				arr[rightshrink]=arr[getindexmin];
				arr[getindexmin]=temp;
			} 
			else {
				temp = arr[rightshrink];
				arr[rightshrink]=arr[getindexmax];
				arr[getindexmax]=temp;
			} 
			--rightshrink; // As the element are fixed on proper location decrease the right end.
		}
	} 

	public static void main(String[] args){ 
		int arr[] = {5,4,3,2,1}; 
		BSSort(arr);
		System.out.printf("Sorted array:\n"); 
		
		for (int i = 0; i < arr.length; i++) 
			System.out.print(arr[i] + " "); 
		System.out.println("\n");
		 	
	} 
} 