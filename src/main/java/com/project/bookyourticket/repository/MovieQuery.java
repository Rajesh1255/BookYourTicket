package com.project.bookyourticket.repository;

import com.project.bookyourticket.Util.HibernateUtil;
import com.project.bookyourticket.model.Movie;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class MovieQuery {
//    @Autowired
//    private HibernateUtil hibernateUtil;
//
//    public void saveMovie(Movie movie) {
//        try {
////            movieRepository.save(movie);
//        } catch(Exception ex) {
//            log.debug("Unsuccessful to save : {}", ex.getMessage());
//        }
//    }
//
//    /**
//     * return showId along with cinema hall and show time.
//     */
//    public List<String> searchMovie(String movieName, String city, String date) {
////        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
////            CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
////
////            CriteriaQuery<Object[]> criteriaQuery = criteriaBuilder.createQuery(Object[].class);
////            Root<Movie> root = criteriaQuery.from(Movie.class);
////
////            criteriaQuery.multiselect()
////        } catch (Exception ex) {
////            log.error("Unsuccessful to search : {}", ex.getMessage());
////        }
//    }
}
