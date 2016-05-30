package com.DuckSystem.model;

public abstract class Duck {
	  //����Ϊ������Ϊ�ӿ����ͣ����Ͷ���Ϊʵ�����͵�����
	  FlyBehavior flyBehavior;
	  QuackBehavior quackBehavior;

	  public void performFly() {
	    //�����д���fly()��Ϊ������ί�ϸ�����flyBehavior��ָ�����Ϊ����
	    flyBehavior.fly();
	  }

	  public void performQuack() {
	    quackBehavior.quack();
	  }

	  public void swim() {
	    System.out.println("I Can Swim!!!.");  
	    System.out.println("----------------------");
	  }
	  
	  public abstract void display();
	}