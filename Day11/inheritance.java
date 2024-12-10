package Day11;


	
     class animal{
    	 void sound() {
    		 System.out.println("animal sound");
    	 }
     }
	
	class dog extends animal{
		@Override
		void sound() {
			System.out.println("the dog barks");
		}
	}
	
    class cat extends animal{
    	@Override
    	void sound() {
    		System.out.println("the cat meows");
    	}
    }
    public class inheritance {
    	
    public static void main(String[] args) {
    	
    	dog voice=new dog();
    	voice.sound();
    	cat voice1=new cat();
    	voice1.sound();
    	
    	
    	
    	
    	
    	
    	
    	
    	
		
	
}
}