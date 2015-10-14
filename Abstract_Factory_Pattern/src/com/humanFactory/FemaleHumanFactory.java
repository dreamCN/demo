package com.humanFactory;

import com.Human;
import com.HumanEnum;

public class FemaleHumanFactory extends AbstractHumanFactory {
	
	//����һ��Ů�Ժ�����
	public Human createBlackHuman() {
		return super.createHuman(HumanEnum.BlackFemaleHuman);
	}
	//����һ��Ů�԰�����
	public Human createWhiteHuman() {
		return super.createHuman(HumanEnum.WhiteFemaleHuman);
	}
	//����һ��Ů�Ի�����
	public Human createYellowHuman() {
		return super.createHuman(HumanEnum.YelloFemaleHuman);
	}
}
