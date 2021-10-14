package LabPrograms;

interface AnimalEat {
	   void eat();
	}
	interface AnimalTravel {
	   void travel();
	}
	class Animals implements AnimalEat, AnimalTravel {
	   public void eat() {
	      System.out.println("Animal is eating");
	   }
	   public void travel() {
	      System.out.println("Animal is travelling");
	   }
	}
	public class MultipleInheritance {
	   public static void main(String args[]) {
	      Animals a = new Animals();
	      a.eat();
	      a.travel();
	   }
	}