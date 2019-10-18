package com.lambdaschool.bookstore.services;

import com.lambdaschool.bookstore.model.Author;

import java.util.ArrayList;

public interface AuthorService
{
    ArrayList<Author> findAll();
}