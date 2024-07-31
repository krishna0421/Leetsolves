class Solution {
   public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    List<Boolean> res = new ArrayList<Boolean>();
    int a = 0;
    int max=maxValue(candies);
        for (int i = 0; i <= candies.length-1; i++){
             a = candies[i] + extraCandies;
             if(a>=max) res.add(true);
             else res.add(false);
        }
        return res;
    }  
    
    public static int maxValue(int[] numbers){
        int max=0;
        for(int i=0; i < numbers.length; i++){
            if(max<numbers[i]) {
                max=numbers[i];
            }
        }return max;
        
    }
}
