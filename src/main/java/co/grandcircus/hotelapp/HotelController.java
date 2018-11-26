package co.grandcircus.hotelapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import co.grandcircus.hotelapp.dao.HotelDao;
import co.grandcircus.hotelapp.entity.Hotel;


@Controller
public class HotelController {

	@Autowired
	private HotelDao hotelDao;

	@RequestMapping("/")
	public ModelAndView list() {
		 List<Hotel> list = hotelDao.findAll();
		 return new ModelAndView("index", "hotels", list);
	}
	
	@RequestMapping("/hotel-listing")
	public ModelAndView listFood(@RequestParam(name = "city", required = false)String city) {
		ModelAndView mav = new ModelAndView("hotel-listing");
		if(city == null || city.isEmpty()) {
			mav.addObject("hotels", hotelDao.findAll());
		}else {
			mav.addObject("hotels", hotelDao.findByCity(city));
		}
	
		return mav;
	}
	

	}

