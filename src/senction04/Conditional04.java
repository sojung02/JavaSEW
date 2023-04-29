package senction04;

public class Conditional04 {
	public static void main(String[] args) {
		// 01 : 환불 신청 중
		// 02 : 환불 처리 중
		// 03 : 환불 취소
		// 04 : 계좌 이체 중
		// 05 : 환불 완료
		// 01, 02, 04 상태 일 때 환불 불가!
		
		String rtCd = "02";
		switch(rtCd) {
		case "01" :
		case "02" :
		case "04" :
			System.out.println("환불 불가! 관리자에게 문의하세요.");
			System.out.println("환불상태코드: " + rtCd);
		}
		
		if(rtCd == "01" || rtCd == "02" || rtCd == "04" ) {
			System.out.println("환불 불가! 관리자에게 문의하세요.");
			System.out.println("환불상태코드: " + rtCd);
		}
		
	}
	
}
