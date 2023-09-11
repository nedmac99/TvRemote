package classPractice;

public class TvRemote {

	public static void main(String[] args) {
		
		TV tv1 = new TV();
		
		tv1.turnOn();
		tv1.setChannel(30);
		tv1.setVolume(5);
		
		TV tv2 = new TV();
		
		tv2.turnOn();
		tv2.channelUp();
		tv2.channelUp();
		tv2.volumeUp();
		
		System.out.println("Tv1 channel is set to: " + tv1.channel + " and the volume is set to: " + tv1.volume);
		System.out.println("-----------------------------------------------------");
		System.out.println("Tv2 channel is set to: " + tv2.channel + " and the volume is set to: " + tv2.volume);
		
		
		
		

	}

}
