/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studenttue23;

/**
 *
 * @author adria
 */
public class PartTimeStudent extends StudentTue23
{
    private int numOfCourses;

    public PartTimeStudent(int numOfCourses, String studentId, String studentName) {
        super(studentId, studentName);
        this.numOfCourses = numOfCourses;
    }

    public int getNumOfCourses() {
        return numOfCourses;
    }

    public void setNumOfCourses(int numOfCourses) {
        this.numOfCourses = numOfCourses;
    }
    
    
    
}
