package com.proxy;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* ����һ�������죬����ɫ�ж���
*/

public class XiMenQing {

	/*
	* ˮ���������д�ģ������챻�˽������������һ���ѵ��������ˣ�
	* �����ſ�����, �Ϳ�ʼ������˺��£�������Ϊ�˽����Ĵ�����
	* ���˲��ٺô��ѣ������Ǽ���һ�£�
	* ���û���������м�ǣ�ߣ���������Ҫ�����ܳ�����˵�ĺܣ�
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�����Žг���
		WangPo wangPo = new WangPo();
		
		//Ȼ���������˵����Ҫ���˽���happy��Ȼ�����žͰ����������춪���ӵ��ǳ�Ϸ:
		wangPo.makeEyesWithMan(); //����û����Ȼ������ʱ����������ʵ����ˬ�����˽���
		
		wangPo.happyWithMan();
	}

}
