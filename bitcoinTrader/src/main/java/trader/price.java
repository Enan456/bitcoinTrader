package trader;

import java.io.IOException;
import java.util.Map;

import org.joda.money.Money;

import com.coinbase.api.Coinbase;
import com.coinbase.api.CoinbaseBuilder;
import com.coinbase.api.entity.Quote;
import com.coinbase.api.exception.CoinbaseException;

import Initialization.api;


public class price {
	public Coinbase cb = new CoinbaseBuilder()
			.withApiKey(System.getenv(api.getAPI()), System.getenv(api.getAPI()))
			.build();
	public price() {
		// TODO Auto-generated constructor stub
	}
public Money sellprice(double amt) throws IOException, CoinbaseException{
	String amts = "BTC " + amt;
	Quote q = cb.getSellQuote(Money.parse(amts));
	Map<String, Money> fees = q.getFees();
	q.getSubtotal();
	Money p = q.getTotal();
		return p;
		
	}
	public Money buyprice(double amt) throws IOException, CoinbaseException{
		String amts = "BTC " + amt;
		Quote q = cb.getBuyQuote(Money.parse(amts));
		Map<String, Money> fees = q.getFees();
		q.getSubtotal();
		Money p = q.getTotal();
			return p;
	}
}
