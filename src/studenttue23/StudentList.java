/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studenttue23;

/**
 *
 * @author adria
 */
public class StudentList {
    public static void main(String[] args){
        
        //StudentTue23 s1= new StudentTue23("s1","Ronak");
                StudentTue23[] studentList = new StudentTue23[3];
                studentList[0] = new StudentTue23("s1", "Ronak ");
                studentList[1] = new StudentTue23("s2", "Bob ");
                studentList[2] = new StudentTue23("s3", "Milo ");
                
                for(int i=0;i<studentList.length;i++){
                    System.out.print(studentList[i].getStudentName());
                }
    }//end of main
    
    }//end of class