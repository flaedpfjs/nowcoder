package com.github.zgsoft0happy.nowcoder.swordoffer.replacestring.yyb;

import java.util.Scanner;

/**
 * <br/>
 * oschina��<a href="https://my.oschina.net/yyb1991">Ǭ�����ֵġ���ζ���ݡ�</a> <br/>
 * CSDN��ҳ��<a href="http://my.csdn.net/y1193329479">CSDN��ҳ</a> <br/>
 * GitHub��ҳ��<a href="https://github.com/zgsoft0happy">github��ҳ</a> <br/>
 * Copyright (C), 2016 , YYB ,YangYang , Thomas, Free Copy and other operation.
 * <br/>
 * This program is protected by copyright laws. <br/>
 * Date: 2016��10��15�� ����9:34:23   Locate:149
 * @author yyb zgsoft_happy@126.com or zgsoft_happy@qq.com
 * @version 1.0 
 * Programe Name:TODO<br/>
 * description��
 */
public class ReplaceString {

	public static void main(String[] args) {
		String str = "I love you!";
		System.out.println(str);
		StringBuffer sb = new StringBuffer(str);
		System.out.println(replace(sb));
	}
	
	public static StringBuffer replace(StringBuffer str){
		StringBuffer sb = new StringBuffer(str);
		String newstr = sb.toString();
		newstr = newstr.replaceAll(" ", "%20");
		sb = new StringBuffer(newstr);
		return sb;
	}
	
}
