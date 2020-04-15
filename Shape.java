package ass1;

public class Shape {
	public Point [] points;
	public int size = 0;
	int Perimeter=0;
	int n;
	int av=0;
	public Shape() {
	 points = new Point[1000];
		Perimeter = 0;
		size = 0;
	}
	public void addpoint(int x,int y) {
		Point p = new Point(x,y);
		points[size] = p;
		size++;
	}
	public Point[] getPoints() {
		return points;}
	
	public double calculatePerimeter  (int n) {
		for(int i =0;i <n-1;i++) {
		Perimeter+=points[i ].distance(points[i +1]);}
		return Perimeter;
		}
	public double average (int n) {
		for(int i=0; i<n;i++) {
			av+=points[i].distance(points[i+1]);
			}
		return av;
	}
	
	
   
}
	

