package com.polymorphism;

public class Animal {

	public Animal() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Polymorphism is the ability of an object to take on many forms.
		
		Animal rover = new Dog();
		Animal fluffy = new Cat();
		Animal randomAnimal = new Animal();
		speakAnimal(rover);
		speakAnimal(fluffy);
		speakAnimal(randomAnimal);

	}
	
	public String makeSound(){
		return "grrrrrr";
	}
	
	public static void speakAnimal(Animal randomAnimal){
		System.out.println(randomAnimal.makeSound());
	}

}
