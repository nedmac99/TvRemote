package classPractice;

import java.util.Scanner;

public class TV {

	boolean isOn = false;
	int channel = 1;
	int volume = 0;

	Scanner input = new Scanner(System.in);

	public void turnOn() {
		isOn = true;
	}

	public void turnOff() {
		isOn = false;
	}

	public void setChannel(int newChannel) {
		if (isOn && newChannel >= 1 && newChannel <= 120)
			channel = newChannel;
	}

	public void setVolume(int newVolume) {

		if (isOn && newVolume >= 0 && newVolume <= 7)
			volume = newVolume;
	}

	public void channelUp() {
		if (isOn && channel < 120)
			channel++;
	}

	public void channelDown() {
		if (isOn && channel > 1)
			channel--;
	}

	public void volumeUp() {
		if (isOn && volume < 7)
			volume++;
	}

	public void volumeDown() {
		if (isOn && volume > 1)
			volume--;
	}

}
