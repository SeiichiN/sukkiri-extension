package v2;

import java.util.Random;

public class RandomNextHand implements NextHand {

	@Override
	public int decideHand() {
		// ランダムに決める。
		// 0:グー 1:チョキ 3:パー
		int hand = new Random().nextInt(3);
		return hand;
	}

}
