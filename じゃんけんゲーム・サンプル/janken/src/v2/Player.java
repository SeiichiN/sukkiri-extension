package v2;

public abstract class Player {
	private String name;
	private int hand;
	private String result;
	// じゃんけんの手 0:グー 1:チョキ 2:パー
    // 次の手を決める戦略の型(インターフェース)
	private NextHand nextHand;
	
	public Player(NextHand nextHand) {
		this.nextHand = nextHand;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHand() {
		return hand;
	}
	public void setHand() {
		this.hand = nextHand.decideHand();
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public NextHand getNextHand() {
		return nextHand;
	}
	// ゲームの途中で戦略を入れ替えることができる	
	public void setNextHand(NextHand nextHand) {
		this.nextHand = nextHand;
	}
	
	public String toString() {
		return this.name + ":" + Const.hands[this.hand] + ":" + this.result;
	}
}
