package wine.web;

import org.springframework.web.bind.annotation.RequestMapping;

public class WineController {
	
	@RequestMapping("/index")
	public String home() {
		// do something
		return "index";
	}

}
