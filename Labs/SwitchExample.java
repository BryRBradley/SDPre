public class SwitchExample {
	public static void main(String[] args){
	char grade;
	grade = 'B';

	switch (grade) {
	case 'A':
		System.out.println("You are an A student.");
		break;
	case 'B':
		System.out.println("Good job.");
		break;
	case 'C':
		System.out.println("Meh you are doing OK.");
		break;
	case 'D':
		System.out.println("A little more effort would be great.");
		break;
	case 'E':
		System.out.println("Well there is always next year.");
		break;
	default:
		System.out.println("Invalid grade");
		}
	}
}