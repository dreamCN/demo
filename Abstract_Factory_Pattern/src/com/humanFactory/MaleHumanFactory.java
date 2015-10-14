package com.humanFactory;

import com.Human;
import com.HumanEnum;

public class MaleHumanFactory extends AbstractHumanFactory {

	//����һ�����Ժ�����
	public Human createBlackHuman() {
		return super.createHuman(HumanEnum.BlackMaleHuman);
	}
	//����һ�����԰�����
	public Human createWhiteHuman() {
		return super.createHuman(HumanEnum.WhiteMaleHuman);
	}
	//����һ�����Ի�����
	public Human createYellowHuman() {
		return super.createHuman(HumanEnum.YelloMaleHuman);
	}

}
