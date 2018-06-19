package com.luomo.repository;

import com.luomo.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * @author LiuMei
 * @date 2018-06-19.
 */
public interface UserRepository extends JpaRepository<User, Long>, JpaSpecificationExecutor<User> {

    User findById(long id);

    User findByName(String name);

    User findByNameAndAge(String name, Integer age);

    @Query("from User  where name = :name")
    User findUser(@Param("name") String name);
}
