package section05;
/*
 * 반복문
 * 	특정한 부분의 코드가 반복적으로 수행될 수 있도록 하는 명령어
 * 
 * 1. while(조건문) {
 * 		반복 수행할 코드
 *    }
 *    
 * 	  break 문
 * 		반복문에서 break문은 반복문을 즉시 종료하는 명령어!
 * 	  countinue 문
 * 		반복문에서 스킵
 */	 

public class Loop01 {
	public static void main(String[] args) {
		//while문을 이용하여 0~99 까지 출력하기
//		int count = 0;
//		while (true) {
//			System.out.println(count);
//			++count;
//			if(count ==100)
//				break;
//		}
//		
//		int count1 = 0;
//		while(count1 < 100) {
//			System.out.println(count1);
//			++count1;
//		}
//		
//		int count3 = 0;
//		boolean isRun = true;
//		while (isRun) {
//			System.out.println(count3);
//			++count3;
//			if(count3 ==100)
//				isRun = false;
//		}
		
		int i =0;
		while(i<7) {
			i++;
			if (i ==3) {
				continue;				
			}
			System.out.println(i);
		}
		
	}

}
