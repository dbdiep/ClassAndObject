package advance.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		
		Student students[] = new Student[10];
		input(students);
		print(students);
	}
	
	static void input(Student students[]) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < students.length; i++) {
			Student std = new Student();
			
			System.out.format("Sinh vien thu %d", i + 1).println();
			
			System.out.println("Nhap ten ");
			std.name = sc.nextLine();
			
			System.out.println("Nhap tuoi ");
			std.age = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Nhap dia chi ");
			std.address = sc.nextLine();
			
			System.out.println("Nhap so dien thoai ");
			std.phoneNumber = sc.nextLine();
			
			System.out.println("Nhap diem trung binh ");
			std.mark = sc.nextDouble();
			sc.nextLine();
			
			students[i] = std;
		}
	}
	
	static void print(Student students[]) {
		for (int i = 0; i < students.length; i++) {
			System.out.format("Ten: %s - Tuoi: %d - Dia chi: %s - So dien thoai: %d - Diem trung binh: %.2f", students[i].name, students[i].age, students[i].address, students[i].phoneNumber, students[i].mark).println();
		}
	}
}


