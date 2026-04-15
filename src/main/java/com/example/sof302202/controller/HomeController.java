package com.example.sof302202.controller;

import com.example.sof302202.model.Category;
import com.example.sof302202.model.Drink;
import com.example.sof302202.repository.CategoryRepo;
import com.example.sof302202.repository.DrinkRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    CategoryRepo categoryRepo;

    @Autowired
    DrinkRepo drinkRepo;

    @GetMapping("/home")
    public String home(Model model) {
        List<Category> listCategory = categoryRepo.findAll();
        model.addAttribute("listCategory", listCategory);
        List<Drink> listDrink = drinkRepo.findAll();
        model.addAttribute("listDrink", listDrink);
        return "home.html";

    }

    @PostMapping("/add")
    public String add(Drink drink) {
        drinkRepo.save(drink);
        return "redirect:/home";
    }
}
