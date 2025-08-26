package ssayong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuestionAir {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("첫번째 질");
		System.out.println("1이내 가전제품을 구매한 이력이 있나요?");
		String ques1 = br.readLine();
		System.out.println("두번째 질");
		System.out.println("주문하신 가전제품 삼성인가요?");
		String ques2 = br.readLine();
		System.out.println("세째 질");
		System.out.println("주문하신 제품이 에어인가요?");
		String ques3 = br.readLine();
		
		if(ques1.equals("x") || ques2.equals("x") || ques3.equals("x")) {
			System.out.println("설문 대상 x");
		}else if(ques1.equals("o") && ques2.equals("o") && ques3.equals("o")) {
			System.out.println("10원 적");
		}
		System.out.println("모두 설문참여에 감사드립니다.");

		
	}
}
