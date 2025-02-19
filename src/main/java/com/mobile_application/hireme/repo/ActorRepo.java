package com.mobile_application.hireme.repo;

import com.mobile_application.hireme.entity.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ActorRepo extends JpaRepository<Actor, String> {

    Optional<Actor> findAllByFname(String fname);
}
