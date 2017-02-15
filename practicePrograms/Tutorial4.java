
/*
this is a simple array that i created to practice the
concept of how an array works. this array will add all of its  stored
numbers and will output them on the the screen.
*/

public class Tutorial4 {
  public static void main(String [] args) {

    int [] counter = { 2,4,6,8,10};
    int sum =0;

    for(int i=0; i< counter.length ; i++) {
      sum += counter[i];
    }
    System.out.println( sum);
  }
}
