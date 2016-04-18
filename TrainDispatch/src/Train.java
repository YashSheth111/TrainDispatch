import java.util.ArrayList;
public class Train {

	private int start;
	private int end;
	private int cost;
	private int waitTime;
	private int moves;
	private int status;
	private double trainMovement;
	private int speed;
	private int lastStation;
	private int distance;
	 private ArrayList<Edge> path;
	 
	Train (int start_, int end_, int cost_) {
		this.start = start_;
		this.end = end_;
		this.cost = cost_;
		this.waitTime = 0;
		this.moves = 1;
		this.status = 0;
		this.trainMovement = 0;
		this.speed = 30;
		this.distance = 0;
	}
	
	public void waitTimer() {
		waitTime += 1;
		if (waitTime > 3600) {
			status = 3;
		}
	}
	
	public Edge trainMove() {
		Edge e = path.get(path.size() - moves);
		trainMovement += speed * 0.0003;
		if (trainMovement >= e.getCost()) {
			lastStation = e.getEnd();
			distance = e.getCost();
			moves = moves + 1;
			trainMovement = 0;
			
			if (lastStation == this.end) 
				status = 2;
			
			return e;
		}
		return null;
 	}
	
	public int getStatus() {
		return status;
	}
	
	public void setStatus(int status_) {
		this.status = status_;
	}
	
	public int getStart() {
		return start;
	}
	
	public int getEnd() {
		return end;
	}
	
	public int getTime() {
		return cost;
	}
	
	public void newStart(int start_) {
		this.start = start_;
	}
	
	public ArrayList<Edge> getPath() {
		return path;	
	}
	
	public void setPath(ArrayList<Edge> path_) {
		this.path = path_;
		moves = 1;
	}
}
