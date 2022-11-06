class Main {
  public static void main(String[] args) {
  int [] array = {1,3,5,71,1,3};
    int search = 71;
  BinarySearch  bn = new BinarySearch(array,search);
  System.out.println(bn.search());
  }
}