package section01;
/* 여러줄 주석
 * 
 */
// 한 줄 주석

public class Hello {
	public static void main(String[] args) {
		System.out.println("Hello, JAVA!!!");
		
		// 정수 출력하는 메소드
		printNum(422);
	}
	/** JavaDoc 주석
	 * 
	 * printNum - 입력받은 정수 출력
	 * @param num
	 */
	public static void printNum(int num) {
		System.out.println("num: " + num);
	}
}