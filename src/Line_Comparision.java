public class Line
{
    int x1, y1, x2, y2;

    public Line(int x1, int y1, int x2, int y2)
    {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public int calculateLength() 
    {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    
	public static void main(String[] args) 
	{	
		System.out.println("Welcome to Line Comparison Computation Program");

		        Line line = new Line(1, 2, 4, 6);
		        double length = line.calculateLength();
		        System.out.println("The length of the line is: " + length);
	}

}
