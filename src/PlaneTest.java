
public class PlaneTest {
	public static void main(String[] args) {
		
		Plane p1 = new Plane("Boeing", "aaa", 100);
		p1.info();	
		System.out.println("�� ����� ���귮 : " + Plane.getPlane() + "��"); // <-Main���� ȣ��
		
		System.out.println("----------------------");
		
		Plane p2 = new Plane("Airbus", "bbb", 200);
		p2.info();
		System.out.println("�� ����� ���귮 : " + Plane.getPlane() + "��");
		
		System.out.println("----------------------");
		
		Plane p3 = new Plane("Lockheed", "ccc", 30);
		p3.info();
		System.out.println("�� ����� ���귮 : " + Plane.getPlane() + "��");
		
	}
}