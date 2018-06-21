import java.util.ArrayList;
import java.util.List;

public class MSQuiz {
	public static void main(String[] args) {
		
		
	}
	public void orderPriority(String[] products) {
		
		String[] oneArr = new String[products.length];
		String[] twoArr = new String[products.length];
		String[] threeArr = new String[products.length];
		int oneIndex = 0,twoIndex  = 0 ,threeindex = 0, index = 0;
		
		for(int i= 0; i<products.length; i++) {
			if(getPriority(products[i])==1) {
				oneArr[oneIndex]=products[i];
				oneIndex++;
			}else if(getPriority(products[i])==2) {
				twoArr[twoIndex]=products[i];
				twoIndex++;
			}else{
				threeArr[threeindex]=products[i];
				threeindex++;
			}
					
		}
		for(int j=0; j<=oneIndex;j++ ) {
			products[index] = oneArr[j];
			index++;
		}
		for(int j=0; j<=twoIndex;j++ ) {
			products[index] = twoArr[j];
			index++;
		}
		for(int j=0; j<=threeindex;j++ ) {
			products[index] = threeArr[j];
			index++;
		}
		
		
	}
	
	public int getPriority(String s) {
		return (int) (Math.random()/10);
	}
	
	public int maxBW(int[][] channelData) {
		List<Integer> bandwidth = new ArrayList();
		int maxBWid = 0;
		for(int i=0;i<channelData.length;i++) {
			int start = channelData[i][0];	
			int end = channelData[i][1];
			int bw = channelData[i][2];
			for(int j=start;j<=end;j++) {
				bandwidth.set(j, bandwidth.get(j)+bw) ;
				if(bandwidth.get(j)>maxBWid)
					maxBWid = bandwidth.get(j);
			}
							
		}
		return maxBWid;
	}

	public String reversal(String str) {
		
		return str;
		
	}
	
	public int myAtoi(String str) {
        int i = 0;
		double sum=0;
        boolean isNegative = false;
        while(str.charAt(i)==' '){
            i++;
        }
        if(str.charAt(i) == '-'){
            isNegative = true;
            i++;
        }
       int index = i;
       while(str.charAt(i)<=57 && str.charAt(i)>=48){
           i++;
       }
        for(;i>=index;i--){
            sum = sum+(str.charAt(i)-48)*(Math.pow(10,(i-index)));
            
        }
        
        return (int) (isNegative?-1*sum:sum);
                
    }
}
