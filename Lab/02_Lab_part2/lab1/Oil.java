
public class Oil {

	float lastPrice = 30.0f;

	public float raisePrice(float aRaisePrice) throws OverOilPriceRaiseException {
		float percent = aRaisePrice / lastPrice;

		if (percent > 0.03) {
			throw new OverOilPriceRaiseException("�o�������C�����o�W�L�F���W�w�� 3%");
		}
		float newPrice = lastPrice + aRaisePrice;
		return newPrice;
	}

	public static void main(String[] args) {
		
		float aRaisePrice= 0.91f;
		try {
			Oil oil = new Oil();
			float newPrice = oil.raisePrice(aRaisePrice);
			System.out.println("�o�����᪺�s���� newPrice=" + newPrice);
		} catch (OverOilPriceRaiseException e) {
			String message = e.getMessage();
			System.out.println(message);
		}
	}

}
