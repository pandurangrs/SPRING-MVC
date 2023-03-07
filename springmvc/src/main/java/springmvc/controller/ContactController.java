package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.entity.User;

@Controller
public class ContactController {
	
	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("Header","LearnCode With Pandurang");
		m.addAttribute("Desc","Home for Programmer");
		System.out.println("adding common data");
	}

	@RequestMapping("/contact")
	public String showForm(Model m) {
		System.out.println("contact controller");
		return "contact";
	}
	
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute("user") User user,Model model) {	
			System.out.println(user);
		return "success";
	}

	/*
	 * @RequestMapping(path = "/processform", method = RequestMethod.POST) public
	 * String processForm(HttpServletRequest request) { String email =
	 * request.getParameter("email"); System.out.println("email is = "+email);
	 * String userName = request.getParameter("userName");
	 * System.out.println("UserName is = "+userName); String password =
	 * request.getParameter("password");
	 * System.out.println("Password is = "+password);
	 * 
	 * 
	 * return "contact"; }
	 */

	/*
	 * @RequestMapping(path = "/processform", method = RequestMethod.POST) public
	 * String handleForm(@RequestParam(name="userEmail", required=false) String
	 * userEmail,
	 * 
	 * @RequestParam("userName") String userName,
	 * 
	 * @RequestParam("userPassword") String userPassword,Model model) {
	 * 
	 * // System.out.println("user email is = "+userEmail); //
	 * System.out.println("user name is = "+userName); //
	 * System.out.println("user password is = "+userPassword);
	 * 
	 * 
	 * User user=new User(); user.setUserEmail(userEmail);
	 * user.setUserName(userName); user.setUserPassword(userPassword);
	 * System.out.println(user);
	 * 
	 * //process data
	 * 
	 * // model.addAttribute("email",userEmail); //
	 * model.addAttribute("name",userName); //
	 * model.addAttribute("password",userPassword); model.addAttribute("user",user);
	 * return "success"; }
	 */
	

}
