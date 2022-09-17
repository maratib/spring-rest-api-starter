package com.example.demo.domain.repos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Book;

@Repository
public interface BookRepo
                extends JpaRepository<Book, Long>, JpaSpecificationExecutor<Book> {

        // Optional<Notification> findById(final Long userId);

        Optional<Book> findById(final Long id);

}
