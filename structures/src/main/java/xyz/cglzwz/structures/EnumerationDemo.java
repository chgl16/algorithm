package xyz.cglzwz.structures;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Java Enumeration
 * 
 * @author chgl16
 * @date 2019-03-08
 */

public class EnumerationDemo {
    private enum gendar {
    	MALES,
    	FEMALES
    }
    
	
	public static void main(String[] args) {
		Enumeration<String> days;
		
	    Vector<String> list = new Vector<String>();
	    
	    list.add("Monday");
	    list.add("Tuesday");
	    list.add("Wednesday");
	    list.add("Thursday");
	    list.add("Friday");
	    list.add("Saturday");
	    
	    // 转化为枚举类型
	    days = list.elements();
	    
	    // 测试此枚举是否包含更多的元素。
	    while (days.hasMoreElements()) {
	    	// 返回下一个元素
	    	System.out.println(days.nextElement());
	    }
	    
	    // 会报错，类型不一致
//	    System.out.println(gendar.FEMALES == "FEMALES");
	}

}
