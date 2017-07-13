package trader;

import java.io.IOException;

import org.joda.money.Money;

import com.coinbase.api.Coinbase;
import com.coinbase.api.CoinbaseBuilder;
import com.coinbase.api.entity.Transfer;
import com.coinbase.api.exception.CoinbaseException;

import Initialization.api;

public class Buy {

	public Buy(){
		}
	public String buy(double amt) throws CoinbaseException, IOException{
		Coinbase cb = new CoinbaseBuilder()
                .withApiKey(System.getenv(api.getAPI()), System.getenv(api.getAPI()))
                .build();
		String amts = "BTC " + amt;
		// TODO Auto-generated constructor stub
		Transfer t = cb.buy(Money.parse(amts));
		String x = t.getCode() + " " + t.getTotal().toString();
		 
		return x;
	}

}
