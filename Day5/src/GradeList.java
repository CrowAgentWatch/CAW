import java.util.*;

public class GradeList {

	public static void main(String[] args) {
		int sel1;
		boolean sel2 = true;

		List<GradeData> list = new ArrayList<GradeData>();
//ArrayList->Vector�ص� ū ���̾���
		Scanner sc = new Scanner(System.in);

		while (sel2) {
			String name;
			int score1;
			int score2;
			int score3;

			System.out.println("�۾��� �����ϼ���");
			System.out.println("1.�߰� 2.�˻� 3.����  4.���� 5.��ü��� 6.����");
			System.out.println(":");
			sel1 = sc.nextInt();

			switch (sel1) {

			case 1: {
				System.out.println("�̸��� �Է��ϼ���");
				name = sc.next();
				System.out.println("���������� �Է��ϼ���");
				score1 = sc.nextInt();
				System.out.println("���������� �Է��ϼ���");
				score2 = sc.nextInt();
				System.out.println("���������� �Է��ϼ���");
				score3 = sc.nextInt();
				list.add(new GradeData(name, score1, score2, score3));
				System.out.println(name + " ���� �߰��Ϸ�");
				break;
			}
			case 2: {
				System.out.println("�̸��� �Է��ϼ���");
				name = sc.next();
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).getName().equals(name)) {
						System.out.println("�̸�" + "\t" + "����" + "\t" + "����" + "\t" + "����" + "\t" + "����" + "\t" + "���");
						System.out.println(list.get(i).getName() + "\t" + list.get(i).getScore(0) + "\t"
								+ list.get(i).getScore(1) + "\t" + +list.get(i).getScore(2) + "\t"
								+ list.get(i).calcul() + "\t" + list.get(i).getAvg());
					}
				}
				break;
			}
			case 3: {
				System.out.println("�̸��� �Է��ϼ���");
				name = sc.next();
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).getName().equals(name)) {
						System.out.println("�̸�: " + name);
						System.out.println("���������� �Է��ϼ���");
						score1 = sc.nextInt();
						System.out.println("���������� �Է��ϼ���");
						score2 = sc.nextInt();
						System.out.println("���������� �Է��ϼ���");
						score3 = sc.nextInt();
						list.set(i, new GradeData(name, score1, score2, score3));
						System.out.println(name + " �����Ϸ�");
					}

				}
				break;
			}
			case 4: {
				System.out.println("�̸��� �Է��ϼ���");
				name = sc.next();
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).getName().equals(name)) {
						list.remove(i);
						System.out.println(name + " �����Ϸ�");
					}
				}
				break;
			}
			case 5: {
				System.out.println("�̸�" + "\t" + "����" + "\t" + "����" + "\t" + "����" + "\t" + "����" + "\t" + "���");
				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i).getName() + "\t" + list.get(i).getScore(0) + "\t"
							+ list.get(i).getScore(1) + "\t" + +list.get(i).getScore(2) + "\t" + list.get(i).calcul()
							+ "\t" + list.get(i).getAvg());
				}
				break;
			}
			case 6: {
				sel2 = false;
				//System.exit(); �������� ��ɾ�
				//System.exit(0); �������� ����
				//System.exit(-1); �����ִ�����
				break;
			}
			default: {
				System.out.println("�߸��� �Է��Դϴ�");
				break;
			}
			}
		}
		System.out.println("�����մϴ�.");
	}
}
