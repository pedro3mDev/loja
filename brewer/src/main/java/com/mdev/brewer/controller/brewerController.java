package com.mdev.brewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "")
public class brewerController {
	
	@GetMapping("/")
    public String paginaLogin(Model model) {
        model.addAttribute("login", 123);
        return "login";
    }
	@GetMapping("/recuperarSenha")
    public String paginaRecuperarSenha(Model model) {
        model.addAttribute("recuperarSenha", 123);
        return "recuperarSenha";
    }
	@GetMapping("admin/dashboard")
    public String paginaDashboard(Model model) {
        model.addAttribute("paginaDashboard", 123);
        return "admin/dashboard";
    }
	@GetMapping("admin/500")
    public String paginaErro500(Model model) {
        model.addAttribute("paginaErro500", 123);
        return "admin/500";
    }
	@GetMapping("admin/404")
    public String paginaErro404(Model model) {
        model.addAttribute("paginaErro404", 123);
        return "admin/404";
    }
	@GetMapping("admin/403")
    public String paginaErro403(Model model) {
        model.addAttribute("paginaErro403", 123);
        return "admin/403";
    }
		

}