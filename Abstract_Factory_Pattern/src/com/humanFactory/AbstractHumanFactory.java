package com.humanFactory;

import com.Human;
import com.HumanEnum;
import com.HumanFactory;

public abstract class AbstractHumanFactory implements HumanFactory {

	/*
	* ����һ���Ա����࣬����һ��������� רҵ�����ǲ�����Ʒ�ȼ�
	*/
	protected Human createHuman(HumanEnum humanEnum) {
		Human human = null;
		//������ݽ�������һ��Enum�о����һ��Element�Ļ����򲻴���
		if (!humanEnum.getValue().equals("")) {
			try {
				//ֱ�Ӳ���һ��ʵ��
				human = (Human)
				Class.forName(humanEnum.getValue()).newInstance();
			} catch (Exception e) {
				//��Ϊʹ����enum��������쳣�����������ˣ��������enum�����⣻
				e.printStackTrace();
			}
		}
		return human;
	}
}
