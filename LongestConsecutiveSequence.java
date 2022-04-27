public class LongestConsecutiveSequence 
{
    public int longestConsecutive(int[] nums)
    {
        Set <Integer> set = new HashSet<>();
        int inOrder = 0;
        for(int n:nums)
        {
            set.add(n);
        }
        for(int n:nums)
        {
            if(!set.contains(n-1))
            {
                int length = 0;
                while(set.contains(n+length))
                      {
                        length++; 
                        inOrder = Math.max(length, inOrder);
                      }
            }
        }return inOrder;   
    }
}
