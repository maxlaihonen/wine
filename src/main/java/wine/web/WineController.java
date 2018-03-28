package wine.web;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import wine.domain.CountryDAO;
import wine.domain.Wine;
import wine.domain.WineDAO;

@Controller
public class WineController {
	@Autowired
	private WineDAO wineDAO;
	@Autowired
	private CountryDAO countryDAO;

	@RequestMapping(value = "/winelist")
	public String getAll(Model model) {	
		List<Wine> wines = wineDAO.findAll();
		model.addAttribute("wines", wines);
		return "winelist";
	}
	
	@RequestMapping(value="/login")
    public String login() {	
        return "login";
    }
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addBook(Model model){
		Wine newwine = new Wine();
		newwine.setYear(2017); // Asettaa lomakkeelle valmiiksi 2017. Muuten olisi 0, joka on vähän ikävä muuttaa.
		model.addAttribute("wine", newwine);
		model.addAttribute("countries", countryDAO.findAllCountries());
		return "addwine";
	}   

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String save(@Valid Wine wine, BindingResult bindingResult, Model model){
		if (bindingResult.hasErrors()) {
			return "addwine";
		}
		wineDAO.save(wine);
		return "redirect:winelist";
	}


}
