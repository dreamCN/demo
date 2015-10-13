package com.singleton2;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* 通用单例模式
*/
@SuppressWarnings("all")
public class SingletonPattern {

	private static SingletonPattern singletonPattern= null;
	
	//限制住不能直接产生一个实例
	private SingletonPattern(){
		
	}
	
	public SingletonPattern getInstance(){
		
		if(this.singletonPattern == null){ //如果还没有实例，则创建一个
			
			this.singletonPattern = new SingletonPattern();
			
		}
		return this.singletonPattern;
	}
	
}
