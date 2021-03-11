package kz.service.impl;


import kz.models.Employees;
import kz.repository.EmployeeRepository;
import kz.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeesServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void create(Employees employees) {
        employeeRepository.save(employees);
    }

    @Override
    public Page<Employees> getAll() {
        Pageable pageable = PageRequest.of(0, 6, Sort.by(Sort.Direction.DESC,"name", "age"));
        return employeeRepository.findAll(pageable);
    }

    @Override
    public List<Employees> getUsersByName(String name) {
//        return userRepository.findByNameAndAgeGreaterThanEqual(name, 40);
        return employeeRepository.findByName(name, 40);
    }

    @Override
    public Employees getById(Long id) {
        return null;
    }

    @Override
    public void update(Long id, Employees employees) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Employees getById(int id) {
        return employeeRepository.findById(id).orElse(new Employees());
    }

    @Override
    public void update(int id, Employees employees) {
        Optional<Employees> userOptional = employeeRepository.findById(id);

        if (userOptional.isPresent()) {
            Employees dbUser = userOptional.get();
            dbUser.setName(employees.getName());

           employeeRepository.save(dbUser);
        }
    }

    @Override
    public void delete(int id) {
        employeeRepository.deleteById(id);
    }
}
