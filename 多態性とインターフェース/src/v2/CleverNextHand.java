package v2;

public class CleverNextHand implements NextHand {

	@Override
	public int getHand() {
		// 前回の相手の手と自分の手を参考にして次の手を考える。
		// 0:グー 1:チョキ 3:パー
		int hand = 0;   // グーに決めたとする
		return hand;
	}
	
}
