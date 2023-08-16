package a.BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ_28278 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine()); 
		
		int [] stack = new int [N];
		int index = -1;
		
		for (int i=0; i<N; i++) {
			
			st = new StringTokenizer(br.readLine());
			int order = Integer.parseInt(st.nextToken());
			
			switch (order) {

				case 1:
					stack[++index] = Integer.parseInt(st.nextToken()); 
					break;
					
				case 2:
					if(index >= 0) {
						int num = stack[index--];
						bw.write(num+"\n");
					}
					else {
						bw.write(index+"\n");
					}
					break;
					
				case 3:
					bw.write((index+1)+"\n");
					break;
					
				case 4:
					if (index >= 0) {
						bw.write(0+"\n");
					}
					else {
						bw.write(1+"\n");
					}
					break;
				case 5:
					
					if (index >= 0) {
						bw.write(stack[index]+"\n");
					}
					else {
						bw.write(-1+"\n");
					}
					break;

			}
			
		}
		bw.flush();
		bw.close();
	}

}
