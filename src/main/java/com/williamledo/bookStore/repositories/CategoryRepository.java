package com.williamledo.bookStore.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.williamledo.bookStore.entity.Book;
import com.williamledo.bookStore.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer >{

}
