package com.example.jpa.controller;
import com.example.jpa.model.Msg;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author A-team Eva
 * @date 2018-05-16
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(Model model) {
        Msg msg = new Msg("标题", "内容", "额外信息，只对管理员显示");
        model.addAttribute("msg", msg);
        return "index";

    }
}
