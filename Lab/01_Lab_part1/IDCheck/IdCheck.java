public class IdCheck {
	private int convert(char ch) {
		ch = Character.toUpperCase(ch);
		if(ch=='A') {
			return 10;
		} else if(ch=='B') {
			return 11;
		}
		return -100;
	}
	
	private boolean isLegalFormat(String id) {
		if(id.length()!=10) {
			return false;
		}
		for(int i=1; i<10; i++) {
			char ch = id.charAt(i);
			if(!Character.isDigit(ch)) {
				return false;
			}
		}
		return true;
	}
  public boolean check(String id) {
  	if(!isLegalFormat(id)) {
  		return false;
  	}
  	
		char ch = id.charAt(0);
  	int D0 = this.convert(ch);
		
		int D1 = Integer.parseInt(id.substring(1, 2));
		int D2 = Integer.parseInt(id.substring(2, 3));
		int D3 = Integer.parseInt(id.substring(3, 4));
		int D4 = Integer.parseInt(id.substring(4, 5));
		int D5 = Integer.parseInt(id.substring(5, 6));
		int D6 = Integer.parseInt(id.substring(6, 7));
		int D7 = Integer.parseInt(id.substring(7, 8));
		int D8 = Integer.parseInt(id.substring(8, 9));
		int D9 = Integer.parseInt(id.substring(9, 10));

		int X1 = D0/10;
		int X2 = D0%10;
		int Y = X1+ 9*X2+ 8*D1+ 7*D2+ 6*D3+ 5*D4+4*D5+ 3*D6+ 2*D7+ D8;
		int CheckCode = (10-(Y % 10)) % 10;
		
		if(CheckCode==D9) {
			return true;
		} else {
  		return false;		
		}
		
  }

}
