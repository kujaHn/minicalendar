package calendar;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String week[] = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};

		while(true) {
			System.out.println("날짜를 입력하세요");
			String whatsDay = br.readLine();
			StringTokenizer st = new StringTokenizer(whatsDay,"/");
			int month = Integer.parseInt(st.nextToken());
			int day = Integer.parseInt(st.nextToken());
			if(days[month+1]<day) {
				System.out.println(month+"월은 "+days[month+1]+"일 까지 있습니다.");
			}
			else {
				System.out.println(month+"월 "+days[month+1]+"은 "+week[1]+"입니다.");						
			}
			System.out.println("다시 검색하시겠습니까?(Y/N)");			
			if(br.readLine().equals("N")||br.readLine().equals("n")) {
				System.out.println("좋은 하루 되세요!");
				break;
			}
		}
	}
}
