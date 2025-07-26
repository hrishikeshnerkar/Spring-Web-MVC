package com.example.SpringMVCDemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @ModelAttribute("course")
    public String courseName(){
        return "Java";
    }
    
  //From now for index2.jsp
    @RequestMapping("/")
    public String home(){
    	System.out.println("home controller called");
        return "index2";
    }
    
    //Using modelview
    @RequestMapping("add")
    public ModelAndView add(@RequestParam("num1") int x, @RequestParam("num2") int y, ModelAndView mv){
        int result = x + y;
        mv.addObject("result", result);
        mv.setViewName("result");
        return mv;
    }

    
    @RequestMapping("addAlien")
    public String addAlien(@ModelAttribute Alien alien){ // ModelAttribute for different name
        return "result";
    }
}
