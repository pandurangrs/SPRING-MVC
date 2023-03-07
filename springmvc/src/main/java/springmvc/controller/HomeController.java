package springmvc.controller;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class HomeController {

//	@RequestMapping("/home")
	@RequestMapping(path="/home",method=RequestMethod.GET)
	public String home(Model model) {
		System.out.println("This is home url");
		model.addAttribute("name","Pandurang Shinde");
		model.addAttribute("id",12);
		
		List<String> friends=Arrays.asList("Om","Hari","Jay","Pratik");
		model.addAttribute("f",friends);
		return "index";
	}
	
	@RequestMapping("about")
	public String about() {
		System.out.println("this is about page");
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help()
	{
		System.out.println("This is help controller");
		//Creating Model and view object
		ModelAndView modelAndView=new ModelAndView();
		
		//Setting the data
		modelAndView.addObject("Name","Shinde Pandurang");
		modelAndView.addObject("id",12);
		Date date=new Date();
		modelAndView.addObject("date",date);
		
		List<String> list=Arrays.asList("Pandurang","Maya","Laxmi");
		modelAndView.addObject("list",list);
		
		//setting the view name
		modelAndView.setViewName("help");
		
		return modelAndView;
	}
	
	
}
