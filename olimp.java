package lab1;

import java.util.Scanner;
public class olimp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		double[] time = new double[N];
		String[] name = new String[N];
		for (int i = 0; i<N; i++) { 
			name[i] = scan.next();
			time[i] = scan.nextDouble(); 
		}
        for (int i = 0; i < N; i++) {
            for (int j = N - 1; j > i; j--) {
                if (time[j] < time[j - 1]) {
                    double temp = time[j];
                    String temp2 = name[j];
                    time[j] = time[j - 1];
                    name[j] = name[j - 1];
                    time[j - 1] = temp;
                    name[j - 1] = temp2;
                }
            }
        }
		for (int i = 0; i<3; i++) {
			System.out.println(i + 1 + " " + name[i] + " " + time[i]); 
		}
		scan.close();
	}
}

