
class Solution {
    public boolean isPalindrome(int x) {
           int sum =0, target = x;
            while(x>0){
                int rem = x %10;
                x = x /10;
                sum = sum * 10 + rem;
            }
            return sum == target ;
        }
    }
