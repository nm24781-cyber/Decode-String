public class Main
{
	public static void main(String[] args) {
	    
		String n="3[NEERAJ]";
		//4[mahajan]
	    String r=n.replace("[","*");
        String p=r.replace(']','\t');
	    System.out.println(p);
	    for(int i=0;i<p.length();i++){
	        
	        char ch=p.charAt(i);
	        if(i+1<p.length() && p.charAt(i+1)=='*' ){
	            if(0<=Character.getNumericValue(ch)){
	                for(int k=0;k<Character.getNumericValue(ch);k++){
	                    
	                    //System.out.println("success");
	                    int s=i+2;
	                    int count;
	                    if(s<p.length())
	                    {
	                        s++;
	                       count=0;                        
	                        while(p.charAt(s)!='*')
	                        {
	                         count++;   
	                        }
	                        for(int j=i+2;j<count;j++){
                            System.out.println(p.charAt(j));
                        }
	                    }
	                    
                        	                    
	                }
	            
	            }   
	       }
	        
	    }
	}
}
