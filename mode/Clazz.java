package com.example.Example4.mode;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "class", schema = "dbo", catalog = "Springboot")
public class Clazz {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "classid")
    private long classid;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "note")
    private String note;
    @OneToMany(mappedBy = "clazzByClassid")
    private Collection<Employee> employeesByClassid;

    public long getClassid() {
        return classid;
    }

    public void setClassid(long classid) {
        this.classid = classid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Clazz clazz = (Clazz) o;

        if (classid != clazz.classid) return false;
        if (name != null ? !name.equals(clazz.name) : clazz.name != null) return false;
        if (note != null ? !note.equals(clazz.note) : clazz.note != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (classid ^ (classid >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        return result;
    }

    public Collection<Employee> getEmployeesByClassid() {
        return employeesByClassid;
    }

    public void setEmployeesByClassid(Collection<Employee> employeesByClassid) {
        this.employeesByClassid = employeesByClassid;
    }
}
