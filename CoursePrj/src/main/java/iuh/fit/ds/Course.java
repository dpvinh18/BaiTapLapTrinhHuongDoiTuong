/**
 * @description TODO 
 * @author LENOVO
 * @version 1.0
 * @created Sep 3, 2025 12:34:17 AM
 */

package main.java.iuh.fit.ds;

public class Course {
    private int credit;
    private String department;
    private String id;
    private String title;

    public Course() {}
    public Course(String id, String title, int credit, String department) {
        this.id = id;
        this.title = title;
        this.credit = credit;
        this.department = department;
    }

    public int getCredit() {
        return credit;
    }

    public String getDepartment() {
        return department;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

 
    public void setCredit(int credit) {
        this.credit = credit;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return String.format("%-6s %-20s %-6d %-10s", id, title, credit, department);
    }
}

