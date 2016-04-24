
public class Station<Key extends Comparable<Key>> {
  
  private int stationNum;
  private int posX;
  private int posY;
  
  public Station() {
	  
  }
  
  public Station (int num) {
	  this.stationNum = num;
  }
  
  public Station(int num, int x, int y) {
	this.stationNum = num;
	this.posX = x;
	this.posY = y;
  }
  
  public void setNum(int num) {
	this.stationNum = num;
  }
  
  public void setPos(int x, int y) {
	this.posX = x;
	this.posY = y;
  }
  
  public int getNum() {
	return this.stationNum;
  }
  
  public int getX() {
	return this.posX;
  }
  
  public int getY() {
	return this.posY;
  }
  
  public Edge getEdge(Station end) {
	int x1, x2, y1, y2, dist;
	x1 = this.getX();
	x2 = end.getX();
	y1 = this.getY();
	y2 = end.getY();
	dist = (int) Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
	
	return new Edge(this.getNum(), end.getNum(), dist);
  }

}
