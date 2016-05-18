//this is my second commit
public class WarmUpExercise1 {
	public int[] bubbleSort1(int num[]){
		int temp=0;
		for(int i=0;i<num.length;i++){
			for(int j=0;j<num.length;j++){
				if(num[i]<num[j]){
					temp = num[i];
					num[i]=num[j];
					num[j]=temp;
				}
				//temp=0;
			}
		}
		return num;
	}
	public int[] bubbleSort2(int num[]){
		int temp=0;
		for(int i=0;i<(num.length-1);i++){
			for(int j=0;j<(num.length-i-1);j++){
				if(num[j]>num[j+1]){
					temp = num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
				}
				//temp=0;
			}
		}
		return num;
	}
	public int[] insertionSort(int num[]){
		//int i, key, j;
		int k;
		for(int i=1; i<num.length; i++){
			int key = num[i];
			//int j=i-1;
			/*
			while(j>=0 && num[j]>key){
				num[j+1] = num[j];
				j=j-1;
			}*/
			for( k=i-1;k>=0;k=k-1){
				num[k+1] = num[k];
			}
			num[k+1] = key;
		}
		
		return num;
	}
	public void printAll(int num[]){
		for(int i=0;i<num.length;i++){
			System.out.print(num[i]+" ");
		}
	}
	public static void main(String args[]){
		WarmUpExercise1 obj = new WarmUpExercise1();
		int numbers[] = {64, 25, 12, 22, 10, 45, 67, 29, 34};
		
		obj.printAll(numbers);
		//numbers=obj.bubbleSort2(numbers);
		
		numbers=obj.insertionSort(numbers);
		System.out.println("\nSorted Array");
		obj.printAll(numbers);
		
	}
}
