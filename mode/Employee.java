package com.example.Example4.mode;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Employee {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "code")
    private String code;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "address")
    private String address;
    @Basic
    @Column(name = "phone")
    private String phone;
    @Basic
    @Column(name = "email")
    private String email;
//    @Basic
//    @Column(name = "classid")
//    private Long classid;
    @ManyToOne
    @JoinColumn(name = "classid", referencedColumnName = "classid")
    private Clazz clazzByClassid;
    @OneToMany(mappedBy = "employeeByIdEmployee")
    private Collection<Mark> marksById;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    public Long getClassid() {
//        return classid;
//    }
//
//    public void setClassid(Long classid) {
//        this.classid = classid;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (id != employee.id) return false;
        if (code != null ? !code.equals(employee.code) : employee.code != null) return false;
        if (name != null ? !name.equals(employee.name) : employee.name != null) return false;
        if (address != null ? !address.equals(employee.address) : employee.address != null) return false;
        if (phone != null ? !phone.equals(employee.phone) : employee.phone != null) return false;
        if (email != null ? !email.equals(employee.email) : employee.email != null) return false;
//        if (classid != null ? !classid.equals(employee.classid) : employee.classid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
//        result = 31 * result + (classid != null ? classid.hashCode() : 0);
        return result;
    }

    public Clazz getClazzByClassid() {
        return clazzByClassid;
    }

    public void setClazzByClassid(Clazz clazzByClassid) {
        this.clazzByClassid = clazzByClassid;
    }

    public Collection<Mark> getMarksById() {
        return marksById;
    }

    public void setMarksById(Collection<Mark> marksById) {
        this.marksById = marksById;
    }
}
