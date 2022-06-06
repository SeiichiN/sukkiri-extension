package v2;

public class Player {
	// じゃんけんの手 0:グー 1:チョキ 2:パー
    // 次の手を決める戦略の型(インターフェース)
	NextHand nextHand;    
	
	// newするときに戦略クラスを与えることができる
	public Player(NextHand nextHand) {
		this.nextHand = nextHand;
	}

	public int getHand() {
		return nextHand.getHand();
	}

	// ゲームの途中で戦略を入れ替えることができる
	public void setNextHand(NextHand nextHand) {
		this.nextHand = nextHand;
	}
	
}
