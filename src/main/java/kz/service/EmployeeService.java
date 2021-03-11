package kz.service;

import kz.models.Employees;
import org.springframework.data.domain.Page;

import java.util.List;

public interface EmployeeService {

    void create(Employees employees);
    Page<Employees> getAll();
    List<Employees> getUsersByName(String name);
    Employees getById(Long id);
    void update(Long id, Employees employees);
    void delete(Long id);

    Employees getById(int id);

    void update(int id, Employees employees);

    void delete(int id);
}
