package kadai;
	
	import java.util.Scanner;
	
	public class IntToEng {
		// メインメソッド
	    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	        int input = sc.nextInt();
	        System.out.println(translateEng(input));
	        }
	    // 数値を英訳する変換するメソッド
	    static String translateEng(int n) {
	    	String ans = "";
	    	String a="";
	
	    	if(n==0) ans="zero";
	        if(n==1) ans="one";
	      	if(n==2) ans="two";
	      	if(n==3) ans="three";
	      	if(n==4) ans="four";
	      	if(n==5) ans="five";
	      	if(n==6) ans="six";
	      	if(n==7) ans="seven";
	      	if(n==8) ans="eight";
	      	if(n==9) ans="nine";
	    	if(n==10) ans="ten";
	    	if(n==11) ans="eleven";
	    	if(n==12) ans="twelve";
	    	if(n==13) ans="thriteen";
	    	if(n==14) ans="fourteen";
	    	if(n==15) ans="fifteen";
	    	if(n==16) ans="sixteen";
	    	if(n==17) ans="seventeen";
	    	if(n==18) ans="eighteen";
	    	if(n==19) ans="nineteen";
	
	    	 int keta = String.valueOf( n ).length();
	    	 int b=0;
	    	 int c=0;
	    	 
	    	 if(keta==4){
		    		c=n/1000;
		    		 b=n%1000;//1245->245
		    		 ans=translateEng(b);
		    		 a=translateEng(c)+ " thousand ";
		    		 
		    	 }
	
	    	 if(keta==3) {
	    		 b=n%100; //下2桁
	    		 c=n/100;//１００の位の数字
	    		 a=translateEng(c)+" hundred ";
	    		 ans=translateEng(b);
	    	 }
	
	
	    	 if(keta==2){
	    	 for(int i=2; i<10; i++){
	    	 if(n/10==i){
	    		 if(i==2){a="twenty ";}
	    		 if(i==3){a="thirty ";}
	    		 if(i==4){a="fourty ";}
	    		 if(i==5){a="fifty ";}
	    		 if(i==6){a="sixty ";}
	    		 if(i==7){a="seventy ";}
	    		 if(i==8){a="eighty ";}
	    		 if(i==9){a="ninety ";}
	    	 }
	    	 }
	    	 int m=n%10;
	    	 ans=translateEng(m);
	    	 }
	    	 
	    	 return a+ans;
	    }
	
	}
	