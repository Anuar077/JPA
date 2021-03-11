package kz.repository;

import kz.models.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface EmployeeRepository extends JpaRepository<Employees, Integer> {
    List<Employees> findByName(String name, int i);

    @Query("select p from Employees p order by name")
    List<Employees> findAllOrderedByName();
}