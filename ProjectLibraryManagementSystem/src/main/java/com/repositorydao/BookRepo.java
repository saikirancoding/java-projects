package com.repositorydao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.model.Book;

@Repository
public interface BookRepo extends  JpaRepository<Book,Integer> {

}
