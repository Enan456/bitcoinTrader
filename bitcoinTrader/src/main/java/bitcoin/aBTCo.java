package bitcoin;

public class aBTCo {
public boolean buy;
public double amtBTC;
public double amtUSD;
public int profile;
public int id;
public aBTCo(boolean b, double btc, double usd, int p, int i){
		
	buy = b;
	amtBTC = btc;
	amtUSD = usd;
	profile = p;
	id =i;
	}
public boolean getbuy(){
	return buy;
	
}
public double getamtBTC(){
	return amtBTC;
	
}
public double getamtUSD(){
	return amtUSD;
	
}
public int getprofile(){
	return profile;
	
}
public int getid(){
	return id;
	
}
}
