/**
 * @description TODO 
 * @author LENOVO
 * @version 1.0
 * @created Sep 3, 2025 12:40:25 AM
 */

package main.java.iuh.fit.ds;

import java.util.*;

public class CourseList {
    private int count = 0;
    private Course[] courses;

    public CourseList(int n) {
        courses = new Course[n];
    }

    public boolean addCourse(Course c) {
        if (exists(c.getId())) {
            System.out.println("Mã khóa học đã tồn tại!");
            return false;
        }
        if (count < courses.length) {
            courses[count++] = c;
            return true;
        }
        return false;
    }

    public boolean exists(String id) {
        return searchCourseById(id) != null;
    }

    public Course[] getCourses() {
        return Arrays.copyOf(courses, count);
    }

    public boolean removeCourse(String id) {
        for (int i = 0; i < count; i++) {
            if (courses[i].getId().equalsIgnoreCase(id)) {
                for (int j = i; j < count - 1; j++) {
                    courses[j] = courses[j + 1];
                }
                courses[--count] = null;
                return true;
            }
        }
        return false;
    }

    public Course searchCourseById(String id) {
        for (int i = 0; i < count; i++) {
            if (courses[i].getId().equalsIgnoreCase(id)) {
                return courses[i];
            }
        }
        return null;
    }

    public Course[] searchCourse(String title) {
        List<Course> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            if (courses[i].getTitle().toLowerCase().contains(title.toLowerCase())) {
                list.add(courses[i]);
            }
        }
        return list.isEmpty() ? null : list.toArray(new Course[0]);
    }

    public Course[] searchCourseByDepartment(String dept) {
        List<Course> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            if (courses[i].getDepartment().equalsIgnoreCase(dept)) {
                list.add(courses[i]);
            }
        }
        return list.isEmpty() ? null : list.toArray(new Course[0]);
    }

    public Course[] sortCourses() {
        Course[] sorted = getCourses();
        Arrays.sort(sorted, Comparator.comparing(Course::getTitle));
        return sorted;
    }

   
    public Course[] findMaxCredit() {
        if (count == 0) return null;
        int max = courses[0].getCredit();
        for (int i = 1; i < count; i++) {
            if (courses[i].getCredit() > max) {
                max = courses[i].getCredit();
            }
        }
        List<Course> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            if (courses[i].getCredit() == max) {
                list.add(courses[i]);
            }
        }
        return list.toArray(new Course[0]);
    }

    public String findDepartmentWithMostCourses() {
        if (count == 0) return null;
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < count; i++) {
            map.put(courses[i].getDepartment(),
                    map.getOrDefault(courses[i].getDepartment(), 0) + 1);
        }
        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}
