package Db;

import Model.Group;
import Model.Student;

import java.util.ArrayList;
import java.util.List;

public class Database {
   private List <Group> groups = new ArrayList<>();
  private List <Student> students = new ArrayList<>();

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Database() {
        this.groups = groups;
        this.students = students;
    }
}
