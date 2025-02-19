package com.mobile_application.hireme.repo;

import com.mobile_application.hireme.entity.Director;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DirectorRepo extends JpaRepository<Director, String> {

    Optional<Director> findAllByFname(String fname);
}
