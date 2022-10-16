// This method is good, but it takes more space and time

class Solution {
  public int fib(int n) {
    if(n<=1){
      return n;
    }
    
    return fib(n - 1) + fib(n - 2);
  }
}
