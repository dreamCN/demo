package com;

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
	//��һ�����䣬�������ȥ���˾ͳ��������̫�Ƚ���
	public static Human createHuman(Class c){
		Human human=null; //����һ�����͵�����
		try {
			human = (Human)Class.forName(c.getName()).newInstance(); //����һ������
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
}