package com.jsp;

public class Lambda {

	public static void main(String[] args) {
		
		
//		MyInter i=new MyInter() {
//			
//			@Override
//			public void sayHello() {
//				System.out.println("this is annonomous class");
//				
//			}
//		};
//		
//		i.sayHello();
		
		
		
		//using lambda
		MyInter i=()->{
			System.out.println("this is first time i am using lambda");
		};
		
		i.sayHello();
		
		
		
		
		SumInter suminter=(int a,int b)->{
			return a+b;
		};
		
		System.out.println(suminter.sum(2,6));
	}

}
