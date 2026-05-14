package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.Model.Project;
import com.example.demo.Repository.ProjectsRepository;


@Controller
@RequestMapping("/projects")
public class ProjectController {

    @Autowired
    private ProjectsRepository projectRepo;

    @GetMapping
    public String listProjects(Model model) {
        model.addAttribute("listProjects", projectRepo.findAll());
        return "project";
    }


    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("project", new Project());
        return "add-project";
    }


    @PostMapping("/save")
    public String saveProject(@ModelAttribute("project") Project project) {
        projectRepo.save(project);
        return "redirect:/projects";
    }


    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable("id") Integer id, Model model) {
        Project project = projectRepo.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid project Id:" + id));
        model.addAttribute("project", project);
        return "add-project";
    }


    @GetMapping("/delete/{id}")
    public String deleteProject(@PathVariable("id") Integer id) {
        projectRepo.deleteById(id);
        return "redirect:/projects";
    }
}