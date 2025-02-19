package com.mobile_application.hireme.repo;

import com.mobile_application.hireme.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends JpaRepository<User, String > {
}
