package bitcoin;

import java.util.ArrayList;

public class bitcoinTransfer {

	public ArrayList<aBTCo> blist = new ArrayList<aBTCo>();
	public ArrayList<aBTCo> slist = new ArrayList<aBTCo>();
	public bitcoinTransfer() {
		// TODO Auto-generated constructor stub
	}

	public void addBTCo(boolean buy, double amtBTC, double amtUSD, int profile , int id){
		aBTCo a =new aBTCo(buy, amtUSD, amtUSD, profile, id);
		if(buy = true){
			blist.add(a);
		}else{
			slist.add(a);
		}
		
	}
	
}
