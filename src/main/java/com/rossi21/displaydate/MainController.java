package com.rossi21.displaydate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Date;
import java.text.SimpleDateFormat;

@Controller
public class MainController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
		
	@RequestMapping("/date")
	public String date(Model model) {
		String pattern = "EEEE, MMMM d, Y";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
		
		model.addAttribute("date", date);
		
		return "date.jsp";
	}
			
	@RequestMapping("/time")
	public String time(Model model) {
		String pattern = "h:mm a";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String time = simpleDateFormat.format(new Date());
		
		model.addAttribute("time", time);
		return "time.jsp";
	}
}
