

public class Plane {			//<-1�� ������ �ʵ� ���� O
	private String manufacturer;
	private String model;
	private int maxPassengers;
	static int planes;
	
	public static int getPlane() {
		return planes;
	}
	
	
	public Plane() {							//<-�⺻ ������(������ 1)
		
	}
	
	public Plane(String manufacturer, String model, int maxPassengers) {		//<-������ �����ε�(3�� �ߺ� ������O)
		super();	
		this.manufacturer = manufacturer;
		this.model = model;
		this.maxPassengers = maxPassengers;
		planes++;		// <-�����ڿ��� ����
		
	}

	//���� 6�� �޼ҵ� = 2�� getter and setter �ۼ� O
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
		System.out.printf("������ : %s\n",getManufacturer());
		System.out.printf("�ִ� �°��� : %d\n", getMaxPassengers());
		System.out.printf("�װ��� �𵨸� : %s\n", getModel());	
	}
	
	
}
