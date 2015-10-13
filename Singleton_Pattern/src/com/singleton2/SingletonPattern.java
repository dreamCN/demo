package com.singleton2;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* ͨ�õ���ģʽ
*/
@SuppressWarnings("all")
public class SingletonPattern {

	private static SingletonPattern singletonPattern= null;
	
	//����ס����ֱ�Ӳ���һ��ʵ��
	private SingletonPattern(){
		
	}
	
	public SingletonPattern getInstance(){
		
		if(this.singletonPattern == null){ //�����û��ʵ�����򴴽�һ��
			
			this.singletonPattern = new SingletonPattern();
			
		}
		return this.singletonPattern;
	}
	
}
