
public class Oil {

	float lastPrice = 30.0f;

	public float raisePrice(float aRaisePrice) throws OverOilPriceRaiseException {
		float percent = aRaisePrice / lastPrice;

		if (percent > 0.03) {
			throw new OverOilPriceRaiseException("油價漲價每次不得超過政府規定之 3%");
		}
		float newPrice = lastPrice + aRaisePrice;
		return newPrice;
	}

	public static void main(String[] args) {
		
		float aRaisePrice= 0.91f;
		try {
			Oil oil = new Oil();
			float newPrice = oil.raisePrice(aRaisePrice);
			System.out.println("油漲價後的新價格 newPrice=" + newPrice);
		} catch (OverOilPriceRaiseException e) {
			String message = e.getMessage();
			System.out.println(message);
		}
	}

}
