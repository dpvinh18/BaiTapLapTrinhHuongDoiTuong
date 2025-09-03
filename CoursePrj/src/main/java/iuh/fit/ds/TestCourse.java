/**
 * @description TODO 
 * @author LENOVO
 * @version 1.0
 * @created Sep 3, 2025 12:40:25 AM
 */
package main.java.iuh.fit.ds;

public class TestCourse {

    public static void initData(CourseList cl) {
        cl.addCourse(new Course("C001", "Lap trinh huong doi tuong", 3, "IT"));
        cl.addCourse(new Course("C002", "He co so du lieu", 4, "IT"));
        cl.addCourse(new Course("C003", "Kinh doanh", 2, "Kinh te"));
        cl.addCourse(new Course("C004", "Kinh doanh 2", 3, "Kinh te"));
        cl.addCourse(new Course("C005", "Ki thuat lap trinh", 4, "IT"));
    }

    public static void main(String[] args) {
        CourseList cl = new CourseList(20);
        initData(cl);
//Danh sach khoa hoc
        System.out.println("=== Danh sách khóa học ===");
        for (Course c : cl.getCourses()) {
            System.out.println(c);
        }

        System.out.println("\n=== Tìm theo ID 'C002' ===");
        System.out.println(cl.searchCourseById("C002"));
// tìm kiếm theo tên
        System.out.println("\n=== Tìm theo tên chứa 'doi tuong' ===");
        Course[] list1 = cl.searchCourse("doi tuong");
        if (list1 != null) for (Course c : list1) System.out.println(c);
// sap xep theo khóa học
        System.out.println("\n=== Tìm theo khoa 'Business' ===");
        Course[] list2 = cl.searchCourseByDepartment("Kinh te");
        if (list2 != null) for (Course c : list2) System.out.println(c);
// sap xep theo tên
        System.out.println("\n=== Sắp xếp theo tên ===");
        for (Course c : cl.sortCourses()) {
            System.out.println(c);
        }

        System.out.println("\n=== Khóa học có tín chỉ lớn nhất ===");
        for (Course c : cl.findMaxCredit()) {
            System.out.println(c);
        }

        System.out.println("\n=== Khoa có nhiều khóa học nhất ===");
        System.out.println(cl.findDepartmentWithMostCourses());
    }
}
