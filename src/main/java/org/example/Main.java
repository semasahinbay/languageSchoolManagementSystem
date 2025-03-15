package org.example;

public class Main {
    public static void main(String[] args) {

        // Öğretmenler
        Instructor instructor1 = new Instructor("Ayşe", "Terzi", 24, "I12345", "English");
        Instructor instructor2 = new Instructor("Hande", "Kırat", 41, "I54321", "German");
        Instructor instructor3 = new Instructor("Çağrı", "Ulaş", 35, "I67890", "French");

        // Dersler
        Course englishA1 = new Course("A1", "ENG101", instructor1);
        Course englishA2 = new Course("A2", "ENG102", instructor1);

        Course germanA1 = new Course("A1", "GER101", instructor2);
        Course germanB1 = new Course("B1", "GER201", instructor2);

        Course frenchA1 = new Course("A1", "FR101", instructor3);
        Course frenchB2 = new Course("B2", "FR201", instructor3);

        // Bölümler
        Department germanDepartment = new Department("German");
        Department englishDepartment = new Department("English");
        Department frenchDepartment = new Department("French");

        // Ders ve öğretmen ekleme
        englishDepartment.addCourse(englishA1);
        englishDepartment.addCourse(englishA2);
        englishDepartment.addInstructor(instructor1);

        germanDepartment.addCourse(germanA1);
        germanDepartment.addCourse(germanB1);
        germanDepartment.addInstructor(instructor2);

        frenchDepartment.addCourse(frenchA1);
        frenchDepartment.addCourse(frenchB2);
        frenchDepartment.addInstructor(instructor3);

        // Personel
        Staff staff1 = new Staff("Fatma", "Yılmaz", 30, "ST123", "Admin");
        staff1.displayInfo();
        System.out.println();

        // Bölüm bilgilerini görüntüleme
        englishDepartment.displayDepartmentInfo();
        System.out.println();
        germanDepartment.displayDepartmentInfo();
        System.out.println();
        frenchDepartment.displayDepartmentInfo();
        System.out.println();

        // Öğrenci oluşturma ve ders kaydı
        Student student1 = new Student("Sema", "Şahinbay", 31, "S1234", englishDepartment);
        student1.enrollInCourse(englishA1);
        student1.enrollInCourse(englishA2);

        Student student2 = new Student("Feyza", "Duru", 26, "S1235", germanDepartment);
        student2.enrollInCourse(germanA1);
        student2.enrollInCourse(germanB1);

        // Öğrenci bilgileri
        student1.displayInfo();
        System.out.println();
        student2.displayInfo();
    }
}
