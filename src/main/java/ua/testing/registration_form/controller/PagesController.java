package ua.testing.registration_form.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <h1>Registration Form (Second Name Has Added)</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-03-02
 */
@Controller
public class PagesController {

    @RequestMapping("/api")
    public String mainPage() {
        return "index.html";
    }

    @RequestMapping("/form")
    public String regForm() {
        return "reg_form";
    }
}
