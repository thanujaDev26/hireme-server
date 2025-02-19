package com.mobile_application.hireme.repo;

import com.mobile_application.hireme.entity.Director;
import com.mobile_application.hireme.entity.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FilmRepo extends JpaRepository<Film, Long> {

}
