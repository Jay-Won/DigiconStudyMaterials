

public class Plane {			//<-1번 전용멤버 필드 정의 O
	private String manufacturer;
	private String model;
	private int maxPassengers;
	static int planes;
	
	public static int getPlane() {
		return planes;
	}
	
	
	public Plane() {							//<-기본 생성자(생성자 1)
		
	}
	
	public Plane(String manufacturer, String model, int maxPassengers) {		//<-생성자 오버로딩(3번 중복 생성자O)
		super();	
		this.manufacturer = manufacturer;
		this.model = model;
		this.maxPassengers = maxPassengers;
		planes++;		// <-생성자에서 증가
		
	}

	//이하 6개 메소드 = 2번 getter and setter 작성 O
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getMaxPassengers() {
		return maxPassengers;
	}
	public void setMaxPassengers(int maxPassengers) {
		this.maxPassengers = maxPassengers;
	}
	
	public void info() {
		System.out.printf("제조사 : %s\n",getManufacturer());
		System.out.printf("최대 승객수 : %d\n", getMaxPassengers());
		System.out.printf("항공기 모델명 : %s\n", getModel());	
	}
	
	
}
