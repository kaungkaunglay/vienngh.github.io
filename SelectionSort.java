class SelectionSort{
  private int unsorted [];
  //private int sorted[]; 
  public SelectionSort(int array[]){
    unsorted = array;
  }
  public int[] sort(){ 
    for(int i=0; i< unsorted.length ; i++){
    int temp = unsorted[i];
      for(int j=0; j < unsorted.length; j++){
        if(temp < unsorted[j]){ // change this ascending or descending
          temp = unsorted[j];
        }
        int index = IndexOf.indexOf(unsorted, temp);
        int swap = unsorted[i];
        unsorted[i] = temp;
        unsorted[index] = swap;
    }
    }
    return unsorted;
  }
}