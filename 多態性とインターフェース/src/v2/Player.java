package v2;

public class Player {
	int hand;             // じゃんけんの手 0:グー 1:チョキ 2:パー
	NextHand nextHand;    // 次の手を決める戦略の型(インターフェース)
	
	// newするときに戦略クラスを与えることができる
	public Player(NextHand nextHand) {
		this.nextHand = nextHand;
	}

	public int getHand() {
		return hand;
	}

	public void setHand() {
		this.hand = nextHand.getHand();
	}

	// ゲームの途中で戦略を入れ替えることができる
	public void setNextHand(NextHand nextHand) {
		this.nextHand = nextHand;
	}
	
}
