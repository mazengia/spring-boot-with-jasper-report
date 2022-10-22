package com.example.springBootwithjasperreport.controller;

import com.example.springBootwithjasperreport.repo.EmployeeRepository;
import com.example.springBootwithjasperreport.report.ReportService;
import lombok.RequiredArgsConstructor;
import net.sf.jasperreports.engine.JRException;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.*;

@RestController
@RequestMapping()
@RequiredArgsConstructor
public class EmployeeController {

    private final ReportService reportService;

    @GetMapping(value = "/candidate/pdf", produces = MediaType.APPLICATION_PDF_VALUE)
    public void candidateReportPdf(HttpServletResponse response) {
        try (OutputStream outputStream = response.getOutputStream()) {
            response.setContentType("application/pdf");
            response.setHeader("Content-Disposition", "inline; filename=".concat("by maze"));
            reportService.candidate("pdf", outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @GetMapping("/report/{format}")
    public String generateReport(@PathVariable String format) throws FileNotFoundException, JRException {
        return reportService.exportReport(format);
    }
}