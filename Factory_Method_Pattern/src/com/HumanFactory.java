package com;

import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
* I'm glad to share my knowledge with you all.
* ���콲Ů����˵Ĺ��£�������¹����������ģ�
* �ܾúܾ���ǰ���̹ſ�������أ���������������ǳ���ɽ����ľ�����һƬ����
* One day��Ů��½�����һ�⣬����̫��į��̫�¶��ˣ�û����Ц�ġ���޵ġ���˵���Ķ���
* ����ô���أ����óŮ洣�����ѽ�������ѽ��Ȼ������ͣ��Ű���¯�������������̫�׽��ǵı�
�����п������Ǿ������ˣ�
* ���ǰ���������˵Ĺ�����Java������ֳ�����
*/
public class HumanFactory {
	
	
	private static HashMap<String,Human> humans = new HashMap<String,Human>();
	
	//��һ�����䣬�������ȥ���˾ͳ��������̫�Ƚ���
	public static Human createHuman(Class c){
		Human human=null; //����һ�����͵�����
		try {
//			human = (Human)Class.forName(c.getName()).newInstance(); //����һ������
			
			//���MAP���У���ֱ�Ӵ�ȡ�������ó�ʼ����
			if(humans.containsKey(c.getSimpleName())){
				human = humans.get(c.getSimpleName());
			}else{
				human = (Human)Class.forName(c.getName()).newInstance();
				//�ŵ�MAP��
				humans.put(c.getSimpleName(), human);
			}
			
		} catch (InstantiationException e) {
			//��Ҫ�ǲ�˵��������ɫ�Ļ���û������Ҫ�׵ĺڣ���˵���˲źÿ�
			System.out.println("����ָ���������ɫ");
		} catch (IllegalAccessException e) { 
			//��������������⣬�ǾͿ��������ˣ�����...
			System.out.println("���ඨ����� ");
		} catch (ClassNotFoundException e) { 
			//�����˵�����࣬�ҵ������������ȥ����
			System.out.println("�쵰����ָ���������Ҳ����� ");
		}
		return human;
	}
	
	//Ů������ˣ���һ�������������¯��������ɶ�����ɶ����
	public static Human createHuman(){
		Human human=null; //����һ�����͵�����
		//�����ǻ���ж��ٸ�ʵ���࣬���ٸ�����
		List<Class> concreteHumanList =
				ClassUtils.getAllClassByInterface(Human.class); //�����˶�������
		//����¯�Լ���ʼ���ճ�ʲô�˾�ʲô��
		Random random = new Random();
		int rand = random.nextInt(concreteHumanList.size());
		human = createHuman(concreteHumanList.get(rand));
		return human;
	}
	
	
}
