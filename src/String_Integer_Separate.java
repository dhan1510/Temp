
public class String_Integer_Separate {

	public static void main(String[] args) {
		String s="dha123nw4ate";
		
		int i;
		
		String str="";
		String  str2="";
		String str3="";
		
		for (i=0;i<s.length();i++)
		{
			char c= s.charAt(i);
			if(c>='0'&&c<='9')
			str=str+c;
			if(c>='a'&&c<='z')
				str2=str2+c;
			
		}
		for(i=str2.length()-1;i>=0;i--)
		{
			str3=str3+str2.charAt(i);
		}
		
		System.out.println(str);
		System.out.println(str2);
		System.out.println("Reverser= "+str3);
	}

}
