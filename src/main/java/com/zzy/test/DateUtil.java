package com.zzy.test;

import java.util.Date;

public class DateUtil {

	//����1�����ݴ�������ڻ�ȡ����
	public static int getAge (Date src) {
		return 0;
		
		}
	
	
	//����2�����ݴ���Ĳ�����ȡ�����ڵ��³����ڣ��������������Ϊ��2019-09-19 19:29:39�������ء�2019-09-01 00:00:00��	
	public static Date getDateByMonthInit (Date src) {
		return src;
	
	}

	//����3 :���ݴ���Ĳ�����ȡ����������ĩ���ڣ��������������Ϊ��2019-09-19 19:29:39�������ء�2019-09-30 23:59:59����ע���´���С�Լ����ꡣ
	//ʾ��:
	public static Date getDateByMonthLast(Date src) {
		return src;
	
	}

	//����4����δ����������컹ʣ������
	//ʾ��:
	public static int getDaysByFuture (Date future) {
		return 0;
	//TODO
	}
	
	//����5�����ȥ����������ȥ������
	//ʾ��:
	public static int getDaysByDeparted (Date departed) {
		return 0;
	//TODO
	}

}
