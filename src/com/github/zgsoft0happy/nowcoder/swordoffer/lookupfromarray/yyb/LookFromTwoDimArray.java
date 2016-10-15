package com.github.zgsoft0happy.nowcoder.swordoffer.lookupfromarray.yyb;

/**
 * <br/>
 * oschina��<a href="https://my.oschina.net/yyb1991">Ǭ�����ֵġ���ζ���ݡ�</a> <br/>
 * CSDN��ҳ��<a href="http://my.csdn.net/y1193329479">CSDN��ҳ</a> <br/>
 * GitHub��ҳ��<a href="https://github.com/zgsoft0happy">github��ҳ</a> <br/>
 * Copyright (C), 2016 , YYB ,YangYang , Thomas, Free Copy and other operation.
 * <br/>
 * This program is protected by copyright laws. <br/>
 * Date: 2016��10��15�� ����7:40:15 Locate:149
 * 
 * @author yyb zgsoft_happy@126.com or zgsoft_happy@qq.com
 * @version 1.0 Programe Name:TODO<br/>
 *          description��
 */
public class LookFromTwoDimArray {

	public static boolean find(int[][] A, int target) {

		int clen = A.length; // ����
		int rlen = clen>0? A[0].length:0; // ����
		int i = clen-1, j = 0;
		while (i >=0 && j < rlen) {
			if(target==A[i][j]){
				return true;
			}
			else if(A[i][j]>target){
				i--;
			}
			else if(A[i][j]<target){
				j++;
			}
			else{
				return false;
			}
		}
		return false;
	}

}
