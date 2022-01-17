
import java.util.*;
public class StringDemo {

	public static void main(String[] args) {
		String str = " Hello";
		String str2 = " Apisero! ";
		StringBuilder sb = new StringBuilder();
		sb = sb.append(str + str2);
		System.out.println("Concatination--> "+str.concat(str2));//concat_method_use
		System.out.println("Lower_Case--> "+ str.toLowerCase());//toLowerCase_method_use
		System.out.println("Upper_Case--> "+ str.toUpperCase());//toUpperCase_method_use
		System.out.println("Reverse-->" + sb.reverse());//StringBUilder
		System.out.println(str2.substring(2,7));//substring_method_use
		System.out.println(str2.lastIndexOf("ero"));//lastIndexOf_method_use
		System.out.println(str2.indexOf("ero"));//indexOf_method_use
		System.out.println(str2.charAt(2));//charAt_method_use
		System.out.println(str.startsWith(" Hel"));//startsWith_method_use   
		System.out.println(str2.startsWith("Aa")); //startsWith_method_use
		
		System.out.println(sb.toString());//toString_method_use
		char[] ch = new char[35];
		ch = str.toCharArray();//toCharArray_method_use
		System.out.println(ch[3]);
		
		String[] str3 = new String[5];
		str3 = sb.toString().split("\\s");//split_method_use
		for(int i=0;i<str3.length;i++) {
		System.out.println(str3[i]);}
		String strr="rohit";
		String strrr = "rohit";
		System.out.println(strr.equals(strrr));//equals_method_use
		System.out.println(strr.equalsIgnoreCase(strrr));//equalsIgnoreCase_method_use
		sb.delete(0,5);
		System.out.println(sb);

	}

}
