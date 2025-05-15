package com.example.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import java.util.List;

@Controller // Changed from @RestController to @Controller for Thymeleaf
public class AdminController {

    @Autowired
    private AdminRepository adminRepository;

    @GetMapping("/")
    public String hello() {
        return "redirect:/table"; // Redirect to table page
    }

    @PostMapping("/admin/add")
    public String addAdmin(@ModelAttribute Admin admin, BindingResult result) {
        if (result.hasErrors()) {
            return "tables";
        }
        adminRepository.save(admin);
        return "redirect:/table";
    }

    @GetMapping("/admin/edit/{id}")
    public String showEditForm(@PathVariable Integer id, Model model) {
        Admin admin = adminRepository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("Invalid admin Id:" + id));
        model.addAttribute("admin", admin);
        return "tables"; // Changed to return tables.html since we're using modal
    }

    @PostMapping("/admin/edit/{id}")
    public String updateAdmin(@PathVariable Integer id, @ModelAttribute Admin admin) {
        admin.setId(id); // Ensure we update the correct record
        adminRepository.save(admin);
        return "redirect:/table";
    }

    @GetMapping("/admin/delete/{id}")
    public String deleteAdmin(@PathVariable Integer id) {
        Admin admin = adminRepository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("Invalid admin Id:" + id));
        adminRepository.delete(admin);
        return "redirect:/table";
    }

    // REST endpoint to get all admins
    @GetMapping("/admins")
    @ResponseBody // Added to return JSON for REST endpoint
    public List<Admin> getAllAdmins() {
        return adminRepository.findAll();
    }

    @GetMapping("/table")
    public String showDashboard(Model model) {
        List<Admin> admins = adminRepository.findAll();
        model.addAttribute("admins", admins);
        return "tables"; // This maps to tables.html
    }

    @GetMapping({
            "/index",
            "/buttons",
            "/cards",
            "/utilities-color",
            "/utilities-border",
            "/utilities-animation",
            "/utilities-other",
            "/login",
            "/register",
            "/forgot-password",
            "/404",
            "/blank",
            "/charts"
    })
    public String notUsedPage() {
        return "not-relevant"; // maps to not-relevant.html
    }

}