import java.util.ArrayList;
import java.util.List;

public class StatMapSideTest {
	
	public static void main(String[] args) {
		
		StationMap map = new StationMap(10);
		List<Edge> connections = new ArrayList<Edge>();
		map.callStation(0).setPos(1, 1);
		map.callStation(1).setPos(1, 4);
		map.callStation(2).setPos(4, 1);
		map.callStation(3).setPos(5, 5);
		map.callStation(4).setPos(6, 3);
		map.callStation(5).setPos(2, 7);
		map.callStation(6).setPos(8, 6);
		map.callStation(7).setPos(3, 9);
		map.callStation(8).setPos(9, 1);
		map.callStation(9).setPos(7, 9);
		
		connections.add(map.callStation(0).getEdge(map.callStation(1)));
		connections.add(map.callStation(0).getEdge(map.callStation(2)));
		connections.add(map.callStation(1).getEdge(map.callStation(3)));
		connections.add(map.callStation(1).getEdge(map.callStation(5)));
		connections.add(map.callStation(2).getEdge(map.callStation(3)));
		connections.add(map.callStation(2).getEdge(map.callStation(4)));
		connections.add(map.callStation(3).getEdge(map.callStation(5)));
		connections.add(map.callStation(3).getEdge(map.callStation(4)));
		connections.add(map.callStation(4).getEdge(map.callStation(6)));
		connections.add(map.callStation(5).getEdge(map.callStation(7)));
		connections.add(map.callStation(6).getEdge(map.callStation(8)));
		connections.add(map.callStation(7).getEdge(map.callStation(9)));
		
	}

}
