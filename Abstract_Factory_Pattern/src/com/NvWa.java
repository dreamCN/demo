package com;

import com.humanFactory.FemaleHumanFactory;
import com.humanFactory.MaleHumanFactory;

/**
* I'm glad to share my knowledge with you all.
* Ů洽����������������ߣ��ֱ��ǣ�
* ����������
* Ů��������
*/
public class NvWa {

	public static void main(String[] args) {
		
		//��һ�������ߣ�����������
		HumanFactory maleHumanFactory = new MaleHumanFactory();
		
		//�ڶ��������ߣ�Ů��������
		HumanFactory femaleHumanFactory = new FemaleHumanFactory();
		
		//�����߽�����ϣ���ʼ��������:
		Human maleYellowHuman = maleHumanFactory.createYellowHuman();
		Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();
		
		maleYellowHuman.cry();
		maleYellowHuman.laugh();
		femaleYellowHuman.sex();
		/*
		* .....
		* �������������
		*/
	}

}