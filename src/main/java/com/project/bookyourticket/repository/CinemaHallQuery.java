package com.project.bookyourticket.repository;

import com.project.bookyourticket.Util.HibernateUtil;
import com.project.bookyourticket.model.CinemaHall;
import jakarta.persistence.Query;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.Session;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class CinemaHallQuery {
    public void saveCinemaHall(CinemaHall cinemaHall) throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            if(cinemaHall == null) {
                throw new NullPointerException("cinema hall data is null");
            }
            log.info("cinema hall : {}", cinemaHall);
            session.beginTransaction();
            session.persist(cinemaHall);
            session.getTransaction().commit();
        } catch (Exception ex) {
            log.error("Unsuccessful to save cinema hall : {}", ex.getMessage());
            throw new Exception("Unsuccessful to save cinema hall");
        }
    }

    public List getCinemaHallList(String city, String movieId, String date) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();

            CriteriaQuery<Object[]> criteriaQuery = criteriaBuilder.createQuery(Object[].class);
            Root<CinemaHall> root = criteriaQuery.from(CinemaHall.class);

            log.info("city : {}, movie : {}, date : {}", city, movieId, date);
            criteriaQuery
                    .multiselect(root.get("cinemaHallId"), root.get("movieId"))
                    .where(
                            criteriaBuilder.equal(root.get("city"), city),
                            criteriaBuilder.equal(root.get("movieId"), movieId),
                            criteriaBuilder.equal(root.get("date"), date)
                    );
            Query query = session.createQuery(criteriaQuery);
            log.info("query : {}", query);
            List resultList = query.getResultList();
            log.info("Result of search : {}", resultList);
            resultList.forEach(item -> {
                log.info("{}", item);
            });
            return resultList;
        } catch (Exception ex) {
            log.error("Unsuccessful to get cinema hall ids : {}", ex.getMessage());
        }
        return null;
    }
}
