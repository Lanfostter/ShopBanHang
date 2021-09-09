package com.example.ShopDemo.Hello;

import com.example.ShopDemo.Model.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class HelloShop {
    public static List<Employees> employeesList = new ArrayList<Employees>();
    //    @Value("${my.key}") //c1 cach doc key properties
//    private String hello;
    @Autowired //c2 cach doc key trong properties
    private Environment env;

    @GetMapping(value = "/hello")
    public String home(HttpServletRequest request) {
        employeesList.addAll(Arrays.asList(new Employees(1, "Duc Anh", 20), new Employees(2, " Pham Duc Anh", 20)));
        request.setAttribute("msg", "Hello");
//        System.out.println(hello);
        System.out.println(env.getProperty("my.key"));
        return "index";
    }

    @GetMapping("/employees")
    public String employee(HttpServletRequest request, Model model) {
        request.setAttribute("employeesList", employeesList);
        model.addAttribute("employees", new Employees(3, "demo", 20));
        System.out.println(env.getProperty("my.key"));
        return "employee";
    }

    @PostMapping(value = "/addNewEmployee")
    public String addEmployee(HttpServletRequest request, @ModelAttribute(name = "employees") Employees employees) {
        employees.setId(employeesList.size() + 1);
        employeesList.add(employees);
        return "redirect:/employees";
    }
    @PostMapping(value = "/deleteEmployee")
    public String deleteEmployee(HttpServletRequest request, @ModelAttribute(name = "employees") Employees employees) {
        employeesList.remove(employees);
        return "redirect:/employees";
    }
}