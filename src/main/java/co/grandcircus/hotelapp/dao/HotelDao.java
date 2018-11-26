package co.grandcircus.hotelapp.dao;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import co.grandcircus.hotelapp.entity.Hotel;



@Repository
@Transactional
public class HotelDao {
	@PersistenceContext
	private EntityManager em;
	
	public List<Hotel> findAll() {
		return em.createQuery("FROM Hotel", Hotel.class).getResultList();
	}
	
	public Hotel findById(Long id) {
		return em.find(Hotel.class, id);
	}
	
	public List<Hotel> findByCity(String city) {
		return em.createQuery("FROM Hotel WHERE city = :city", Hotel.class)
				.setParameter("city", city)
				.getResultList();
	}
	
	public Set<String> findAllCities() {
		List<String> cityList = em.createQuery("SELECT DISTINCT city FROM Hotel", String.class)
				.getResultList();
		return new TreeSet<>(cityList);
	}
	


}
