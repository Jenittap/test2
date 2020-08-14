class A9{
	void print(){
		System.out.println("Hai");
		}
}
class B9 extends A9{
			void print(){
			System.out.println("Welcome");
			}
}

class demo16{
		public static void main(String jj[])
			{
				A9 a = new A9();
				A9 b = new B9();
				B9 c = new B9();

				a.print();
				b.print();
				c.print();		

			}
}