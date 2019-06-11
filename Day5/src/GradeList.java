import java.util.*;

public class GradeList {

	public static void main(String[] args) {
		int sel1;
		boolean sel2 = true;

		List<GradeData> list = new ArrayList<GradeData>();
//ArrayList->Vector해도 큰 차이없음
		Scanner sc = new Scanner(System.in);

		while (sel2) {
			String name;
			int score1;
			int score2;
			int score3;

			System.out.println("작업을 선택하세요");
			System.out.println("1.추가 2.검색 3.수정  4.삭제 5.전체출력 6.종료");
			System.out.println(":");
			sel1 = sc.nextInt();

			switch (sel1) {

			case 1: {
				System.out.println("이름을 입력하세요");
				name = sc.next();
				System.out.println("국어점수를 입력하세요");
				score1 = sc.nextInt();
				System.out.println("영어점수를 입력하세요");
				score2 = sc.nextInt();
				System.out.println("수학점수를 입력하세요");
				score3 = sc.nextInt();
				list.add(new GradeData(name, score1, score2, score3));
				System.out.println(name + " 정보 추가완료");
				break;
			}
			case 2: {
				System.out.println("이름을 입력하세요");
				name = sc.next();
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).getName().equals(name)) {
						System.out.println("이름" + "\t" + "국어" + "\t" + "영어" + "\t" + "수학" + "\t" + "총점" + "\t" + "평균");
						System.out.println(list.get(i).getName() + "\t" + list.get(i).getScore(0) + "\t"
								+ list.get(i).getScore(1) + "\t" + +list.get(i).getScore(2) + "\t"
								+ list.get(i).calcul() + "\t" + list.get(i).getAvg());
					}
				}
				break;
			}
			case 3: {
				System.out.println("이름을 입력하세요");
				name = sc.next();
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).getName().equals(name)) {
						System.out.println("이름: " + name);
						System.out.println("국어점수를 입력하세요");
						score1 = sc.nextInt();
						System.out.println("영어점수를 입력하세요");
						score2 = sc.nextInt();
						System.out.println("수학점수를 입력하세요");
						score3 = sc.nextInt();
						list.set(i, new GradeData(name, score1, score2, score3));
						System.out.println(name + " 수정완료");
					}

				}
				break;
			}
			case 4: {
				System.out.println("이름을 입력하세요");
				name = sc.next();
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).getName().equals(name)) {
						list.remove(i);
						System.out.println(name + " 삭제완료");
					}
				}
				break;
			}
			case 5: {
				System.out.println("이름" + "\t" + "국어" + "\t" + "영어" + "\t" + "수학" + "\t" + "총점" + "\t" + "평균");
				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i).getName() + "\t" + list.get(i).getScore(0) + "\t"
							+ list.get(i).getScore(1) + "\t" + +list.get(i).getScore(2) + "\t" + list.get(i).calcul()
							+ "\t" + list.get(i).getAvg());
				}
				break;
			}
			case 6: {
				sel2 = false;
				//System.exit(); 강제종료 명령어
				//System.exit(0); 정상종료 ㅇㅇ
				//System.exit(-1); 문제있는종료
				break;
			}
			default: {
				System.out.println("잘못된 입력입니다");
				break;
			}
			}
		}
		System.out.println("종료합니다.");
	}
}
