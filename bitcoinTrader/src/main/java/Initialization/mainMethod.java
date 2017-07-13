package Initialization;
import com.coinbase.api.Coinbase;
import com.coinbase.api.CoinbaseBuilder;

public class mainMethod {

	public mainMethod() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Coinbase cb = new CoinbaseBuilder()
                .withApiKey(System.getenv(api.getAPI()), System.getenv(api.getAPI()))
                .build();
		
	}

}
