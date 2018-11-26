package co.grandcircus.hotelapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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
	
//	@RequestMapping("/")
//	public ModelAndView listFood(
//			@RequestParam(value="city", required=true) String city) {
//		ModelAndView mav = new ModelAndView("hotel-listing");
//		mav.addObject("cities", hotelDao.findAllCities());
//		return mav;
//	}
	
	@GetMapping("/hotel-listing")
	public ModelAndView citySearch(@RequestParam(name="city") String city) {
		ModelAndView mav = new ModelAndView("hotel-listing");
		mav.addObject("city", city);

			mav.addObject("hotelList", hotelDao.findByCity(city));
		
		return mav;
	}


//	@RequestMapping("/hotel-listing")
//	public ModelAndView findbyCity(@RequestParam(name = "city", required = true) String city) {
//		ModelAndView mv = new ModelAndView("hotel-listing");
//		mv.addObject(city);
//		return mv;
//
//
//		}
	}

