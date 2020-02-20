
public class MostWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = {1,8,6,2,5,4,8,3,7};
		int ans = mostWater(height);
		System.out.println("Container with most water is:");
		System.out.println(ans);
	}
	public static int mostWater(int[] height) {
	        
	        int result = 0;
	        int left = 0, right = height.length -1;
	        
	        while(left < right){
	            result = Math.max(result, Math.min(height[left],height[right])*(right - left));
	            
	            if(height[left] < height[right]){
	                left++;
	            }
	            else{
	                right--;
	            }
	                
	        }                
	        
	        
	        return result;
	    }
		
	
	}
