public class Line implements Comparable<Line> 
{
	int x1, y1, x2, y2;

    public Line(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }


    private double length() {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
	@Override
    public int compareTo(Line other) {
        return Double.compare(this.length(), other.length());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Line line = (Line) obj;
        return (x1 == line.x1 && y1 == line.y1 && x2 == line.x2 && y2 == line.y2) ||
               (x1 == line.x2 && y1 == line.y2 && x2 == line.x1 && y2 == line.y1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x1, y1, x2, y2);
    }

    public static void main(String[] args) {
        Line line1 = new Line(0, 0, 3, 4);
        Line line2 = new Line(0, 0, 3, 4);
        Line line3 = new Line(3, 5, 0, 0);
        Line line4 = new Line(0, 0, 6, 8);

        System.out.println(line1.equals(line2)); 
        System.out.println(line1.equals(line3)); 
        System.out.println(line1.equals(line4)); 

        System.out.println(line1.compareTo(line2));
        System.out.println(line1.compareTo(line3)); 
        System.out.println(line1.compareTo(line4)); 
     
}
}
