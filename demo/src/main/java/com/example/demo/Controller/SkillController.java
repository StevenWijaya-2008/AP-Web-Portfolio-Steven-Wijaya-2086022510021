package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.Model.Skill;
import com.example.demo.Repository.SkillsRepository;


@Controller
@RequestMapping("/skills")
public class SkillController {

    @Autowired
    private SkillsRepository skillRepo;

    @GetMapping
    public String listSkills(Model model) {
        model.addAttribute("listSkills", skillRepo.findAll());
        return "skills";
    }


    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("skill", new Skill());
        return "add-skill";
    }


    @PostMapping("/save")
    public String saveSkill(@ModelAttribute("skill") Skill skill) {
        skillRepo.save(skill);
        return "redirect:/skills";
    }


    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable("id") Integer id, Model model) {
        Skill skill = skillRepo.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid skill Id:" + id));
        model.addAttribute("skill", skill);
        return "add-skill";
    }


    @GetMapping("/delete/{id}")
    public String deleteSkill(@PathVariable("id") Integer id) {
        skillRepo.deleteById(id);
        return "redirect:/skills";
    }
}