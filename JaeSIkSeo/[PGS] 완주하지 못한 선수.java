package a.PGS;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class PGS_완주하지못한선수 {

	public static String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Map <String, Integer> hashMap = new HashMap<>();
        for (int i=0; i<participant.length; i++) {
        	
        	if (hashMap.containsKey(participant[i])) {
        		int count = hashMap.get(participant[i]);
        		hashMap.put(participant[i], ++count);
        	}
        	else {
        		hashMap.put(participant[i], 1);
        	}
        	
        }
        
        for (String name : completion) {
        	if (hashMap.containsKey(name) && hashMap.get(name) > 1) {
        		int count = hashMap.get(name);
        		hashMap.replace(name, --count);
        	}
        	else if (hashMap.containsKey(name)) {
        		hashMap.remove(name);
        	}
        }
        
        Iterator<Entry<String, Integer>> iterator = hashMap.entrySet().iterator() ;
        if (iterator.hasNext()) {
        	Entry<String, Integer> entrySet = (Entry<String, Integer>)
        	iterator.next();
        	answer = entrySet.getKey();
        }
        
        return answer;
    }
	
	
	public static void main(String[] args) {
		String [] participant = {"mislav", "stanko", "mislav", "ana"};
		String [] completion = {"stanko", "ana", "mislav"};
		solution(participant, completion);
		
	}

}
