package com.example.springBootwithjasperreport;

import com.example.springBootwithjasperreport.entity.Employee;
import com.example.springBootwithjasperreport.repo.EmployeeRepository;
import com.example.springBootwithjasperreport.report.ReportService;
import net.sf.jasperreports.engine.JRException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;
import java.util.List;

@SpringBootApplication
@RestController
public class SpringBootWithJasperReportApplication {


	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithJasperReportApplication.class, args);
	}

}
