

public class AccessModifier {

	public static void main(String[] args) {
		PrivateClass ice = new PrivateClass();
		ice.setName("ishu");
		System.out.println("i am "+ice.getName());
		
			DefaultClass dcl=new DefaultClass();
			dcl.message();
			ProtectedClass pcl=new ProtectedClass();
			pcl.protectedmessage();
			
		}
		
		

	}


	//default access modifier

	class DefaultClass{
		void message() {
			System.out.println("This is a default modifier");
		}
	}


	class PrivateClass {
		private String name;
		
		public String getName(){
			return name;
		}
		
		public void setName(String name) {
			this.name=name;
		}
	}

	class ProtectedClass extends AccessModifier {
		protected void protectedmessage() {
			System.out.println("This is a protected class");
		}
	
		
		
		
		

	}


