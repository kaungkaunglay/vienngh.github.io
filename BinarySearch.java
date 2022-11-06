import java.util.Arrays;
class BinarySearch{
  private int [] BiArray; 
  private int searchValue ; 
  private boolean isNotFound; 
  private int midpoint; 
  public BinarySearch(int [] array, int value){
        SelectionSort s = new SelectionSort(array);
        BiArray = s.sort();
        searchValue = value;
        isNotFound = true;
        midpoint = BiArray.length/2;
  }
  public boolean search(){
    while(isNotFound){
      if(searchValue < BiArray[midpoint]){
        midpoint = midpoint /2; 
      }
      else if (searchValue > BiArray[midpoint]){
        midpoint  = (midpoint + BiArray.length) /2 ;
      }else if(searchValue ==  BiArray[midpoint]){
          return true;
      }
  }
   return false;
}
}