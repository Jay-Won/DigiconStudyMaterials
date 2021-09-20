
public class PlaneTest {
	public static void main(String[] args) {
		
		Plane p1 = new Plane("Boeing", "aaa", 100);
		p1.info();	
		System.out.println("총 비행기 생산량 : " + Plane.getPlane() + "대"); // <-Main에서 호출
		
		System.out.println("----------------------");
		
		Plane p2 = new Plane("Airbus", "bbb", 200);
		p2.info();
		System.out.println("총 비행기 생산량 : " + Plane.getPlane() + "대");
		
		System.out.println("----------------------");
		
		Plane p3 = new Plane("Lockheed", "ccc", 30);
		p3.info();
		System.out.println("총 비행기 생산량 : " + Plane.getPlane() + "대");
		
	}
}