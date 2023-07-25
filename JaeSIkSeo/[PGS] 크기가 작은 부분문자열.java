package a.PGS;

public class PGS_크기가작은부분문자열 {

	public static int solution(String t, String p) {
        int answer = 0;
        
        for (int i=0; i<=t.length() - p.length(); i++) {
        	long temp = Long.parseLong(t.substring(i, i+p.length()));

        	if (temp <= Long.parseLong(p)) {
        		answer++;
        	}
        }
        return answer;
    }
	
	public static void main(String[] args) {

		String t = "10203";
		String p = "15";	
		// "3141592"		"271"			5번 반복
		// "500220839878"	"7"		8		12번 반복
		// "10203"			"15"	3		4번 반복
		solution(t, p);
	}

}
