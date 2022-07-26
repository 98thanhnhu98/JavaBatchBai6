package com.example.Example4.mode;

import javax.persistence.*;

@Entity
public class Mark {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
//    @Basic
//    @Column(name = "idEmployee")
//    private Long idEmployee;
//    @Basic
//    @Column(name = "idSubject")
//    private Long idSubject;
    @Basic
    @Column(name = "mark")
    private Integer mark;
    @Basic
    @Column(name = "note")
    private String note;
    @ManyToOne
    @JoinColumn(name = "idEmployee", referencedColumnName = "id")
    private Employee employeeByIdEmployee;
    @ManyToOne
    @JoinColumn(name = "idSubject", referencedColumnName = "id")
    private Subject subjectByIdSubject;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

//    public Long getIdEmployee() {
//        return idEmployee;
//    }
//
//    public void setIdEmployee(Long idEmployee) {
//        this.idEmployee = idEmployee;
//    }
//
//    public Long getIdSubject() {
//        return idSubject;
//    }
//
//    public void setIdSubject(Long idSubject) {
//        this.idSubject = idSubject;
//    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
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

        Mark mark1 = (Mark) o;

        if (id != mark1.id) return false;
//        if (idEmployee != null ? !idEmployee.equals(mark1.idEmployee) : mark1.idEmployee != null) return false;
//        if (idSubject != null ? !idSubject.equals(mark1.idSubject) : mark1.idSubject != null) return false;
        if (mark != null ? !mark.equals(mark1.mark) : mark1.mark != null) return false;
        if (note != null ? !note.equals(mark1.note) : mark1.note != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
//        result = 31 * result + (idEmployee != null ? idEmployee.hashCode() : 0);
//        result = 31 * result + (idSubject != null ? idSubject.hashCode() : 0);
        result = 31 * result + (mark != null ? mark.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        return result;
    }

    public Employee getEmployeeByIdEmployee() {
        return employeeByIdEmployee;
    }

    public void setEmployeeByIdEmployee(Employee employeeByIdEmployee) {
        this.employeeByIdEmployee = employeeByIdEmployee;
    }

    public Subject getSubjectByIdSubject() {
        return subjectByIdSubject;
    }

    public void setSubjectByIdSubject(Subject subjectByIdSubject) {
        this.subjectByIdSubject = subjectByIdSubject;
    }
}
