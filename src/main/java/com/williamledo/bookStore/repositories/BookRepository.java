package com.williamledo.bookStore.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.williamledo.bookStore.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer >{

}
