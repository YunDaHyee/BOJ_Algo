package Graph.연습문제;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.List;

/**
 * 
	@Question
		N×M크기의 배열로 표현되는 미로가 있다.
		1	0	1	1	1	1
		1	0	1	0	1	0
		1	0	1	0	1	1
		1	1	1	0	1	1
		미로에서 1은 이동할 수 있는 칸을 나타내고, 0은 이동할 수 없는 칸을 나타낸다.
		이러한 미로가 주어졌을 때, (1, 1)에서 출발하여 (N, M)의 위치로 이동할 때 지나야 하는 최소의 칸 수를 구하는 프로그램을 작성하시오.
		한 칸에서 다른 칸으로 이동할 때, 서로 인접한 칸으로만 이동할 수 있다.
		위의 예에서는 15칸을 지나야 (N, M)의 위치로 이동할 수 있다.
		칸을 셀 때에는 시작 위치와 도착 위치도 포함한다.
	
	@Input
		첫째 줄에 두 정수 N, M(2 ≤ N, M ≤ 100)이 주어진다.
		다음 N개의 줄에는 M개의 정수로 미로가 주어진다.
		각각의 수들은 붙어서 입력으로 주어진다.
		
		4 6
		101111
		101010
		101011
		111011
		
		4 6
		110110
		110110
		111111
		111101
		
		2 25
		1011101110111011101110111
		1110111011101110111011101
		
		7 7
		1011111
		1110001
		1000001
		1000001
		1000001
		1000001
		1111111
		
	@Output
		15
		9
		38
		13
		
	@History
		
		
 */
public class _2178 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out) );
		
		int cnt = br.readLine();
		int[][] mazeMatrix = 
		
		br.close();
		bw.flush();
		bw.close();
	}
}
