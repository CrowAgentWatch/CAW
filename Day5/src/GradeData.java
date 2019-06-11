
public class GradeData {

	int[] score = new int[4];
	String name;

	float avg;
	int calcul;

	int getScore(int index) {
		return score[index];
	}

	void setScore(int score, int index) {
		this.score[index] = score;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	int calcul() {
		calcul=score[0]+score[1]+score[2];
		return calcul;
	}

	float getAvg() {
		avg=score[3]/3;
		return avg;
	}

	void setAvg(float avg) {
		this.avg = avg;
	}

	public GradeData(String name,int a,int b,int c) {
		this.name=name;
		this.score[0]=a;
		this.score[1]=b;
		this.score[2]=c;
		this.score[3]=a+b+c;
	}

}
