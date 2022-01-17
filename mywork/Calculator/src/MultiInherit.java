 class Multilevel {
	void check(){
		System.out.println("Multilevel class");
		}}

class MultiB extends Multilevel{
		void check(){
			System.out.println("Child B class");
			}
	}
public class MultiInherit extends MultiB{

			void check(){
				System.out.println("Child C class");
				}
		public static void main(String args[]){
			Multilevel obj1 ,obj2, obj3;
			obj1=new Multilevel();
			obj2=new MultiB();
			obj3=new MultiInherit();
			obj1.check();
			obj2.check();
			obj3.check();
			}

	}


