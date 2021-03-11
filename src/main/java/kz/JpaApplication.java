package kz;

import kz.models.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import kz.repository.EmployeeRepository;

import java.util.Arrays;
import java.util.List;

import static kz.models.EmployeeType.SALARIED;

@SpringBootApplication
public class JpaApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(JpaApplication.class, args);
    }

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public void run(String... args) throws Exception {

        Employees a = new Employees(SALARIED, "b", 455, 500, 542, 455);
        Employees b = new Employees(SALARIED, "b", 455, 500, 542, 455);
        Employees c = new Employees(SALARIED, "b", 455, 500, 542, 455);

        List<Employees> people = Arrays.asList(a, b, c);
        employeeRepository.saveAll(people);

        System.out.println("Data:" + employeeRepository.findAll());
    }
}