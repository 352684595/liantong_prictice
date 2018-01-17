package cn.liantong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LianTongController {
	
	//三个按钮点击后,后台打印一句话.用springmvc框架
		@RequestMapping("/page/lijibanli")
		public String showPage(Model model){
		System.out.println("立即办理");
			return "new_file.html";
			
		}
}
