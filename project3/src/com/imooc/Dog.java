package com.imooc;

public class Dog extends Animal {
//如对Animal方法不满意则可以重写方法
	public int age=20;
	public void eat(){
		System.out.println("狗吃骨头");
	}
	public Dog(){
		//super();//此处写不写效果一样，为隐式调用，一定显式则必须放到子类构造方法内的第一行
		System.out.println("Dog类执行了");
		//super();
		//System.out.println("年龄"+age+"狗可以吃东西");
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (age != other.age)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Dog [age=" + age + "]";
	}
	public void method(){
		super.eat();  //调用父类方法
		System.out.println(super.age);//调用父类属性
	}
}
