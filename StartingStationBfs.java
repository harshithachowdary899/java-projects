package xyz;

import java.util.*;

public class StartingStationBfs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashMap<String, List<String>> city=new HashMap<>();
        city.put("Central Station", Arrays.asList( "Market Square", "Museum", "Business District"));
        city.put("Market Square", Arrays.asList("Shopping Mall"));
        city.put("Museum", Arrays.asList("Art Gallery"));
        city.put("Business District", new ArrayList<>());
        city.put("Shopping Mall", new ArrayList<>());
        city.put("Art Gallery", new ArrayList<>());
        bfs(city,"Central Station");
	}

	private static void bfs(HashMap<String, List<String>> city, String place) {
		Queue<String> que=new LinkedList<String>();
		Set<String> visited=new HashSet<>();
		 
		que.add(place);
		visited.add(place);
	
	while(!que.isEmpty()) {
		String cplace=que.poll();
		System.out.println("Visited :"+ cplace);
		
		for(String nei:city.get(cplace)) {
			if(!visited.equals(nei)) {
			 que.add(nei);
			 visited.add(nei);
			}
			
		}
	}
	}

}
