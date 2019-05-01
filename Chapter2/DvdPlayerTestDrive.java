 class DvdPlayer{
	boolean canRecord = false;
	void recordDvd(){
		System.out.println("DVD recording");
			}
			void playDvd(){
				System.out.println("Playing DVD");
			}
}

public class DvdPlayerTestDrive{
	public static void main(String[] args){
		DvdPlayer dv  = new DvdPlayer();
		 dv.canRecord = true;
		 dv.playDvd();
		if (dv.canRecord == true){
			dv.recordDvd();
		}
		
	}
	
}