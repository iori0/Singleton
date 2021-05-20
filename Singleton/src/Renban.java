class Renban{
	private static Renban instance = new Renban();
	private int number;

	private Renban(){
		number = 0;
	}

	public static Renban getInstance(){
		return instance;
	}

	public String getNumber(){
		number = number+1;
		String stnum = String.format("%04d",number);
		return stnum;
	}
}