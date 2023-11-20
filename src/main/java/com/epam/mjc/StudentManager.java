package com.epam.mjc;


public class StudentManager {

  private static final long[] IDs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

  public Student find(long studentID) throws StudentManagerException {
    if (studentID<=11){
      return Student.getValueOf(studentID);
    } else throw new StudentManagerException("Could not find student with ID " + studentID);
  }

  public static void main(String[] args) {
    StudentManager manager = new StudentManager();

    for (int i = 0; i < IDs.length; i++) {
      try {
        Student student = manager.find(IDs[i]);
        System.out.println("Student name " + student.getName());
      } catch (NullPointerException e){
        System.out.println("Could not find student with ID " + IDs[i]);
      }

    }

  }
}