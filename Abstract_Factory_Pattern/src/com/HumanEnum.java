package com;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* ����������Щ���͵��ˣ��г���
* JDK 1.5��ʼ����enum����Ҳ��Ŀ�ĵģ�����C����Աת����
*/
public enum HumanEnum {

	//�����������������Ͷ��������
	YelloMaleHuman("com.yellowHuman.YellowMaleHuman"),
	YelloFemaleHuman("com.yellowHuman.YellowFemaleHuman"),
	WhiteFemaleHuman("com.whiteHuman.WhiteFemaleHuman"),
	WhiteMaleHuman("com.whiteHuman.WhiteMaleHuman"),
	BlackFemaleHuman("com.blackHuman.BlackFemaleHuman"),
	BlackMaleHuman("com.blackHuman.BlackMaleHuman");
	
	
	private String value = "";
	//���幹�캯����Ŀ����Data(value)���͵���ƥ��
	private HumanEnum(String value){
		this.value = value;
	}
	public String getValue(){
	return this.value;
	}
	/*
	* java enum���;�����ʹ�ã�������Ҫʹ�ö�̬���̳еȷ���
	* �Ͼ���Clas��ȫ���Դ���enum
	*/
	
	
}
