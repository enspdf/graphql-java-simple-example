package com.graphql.example.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.graphql.example.model.Author;
import com.graphql.example.model.Book;
import com.graphql.example.repository.AuthorRepository;

import java.util.Optional;

public class BookResolver implements GraphQLResolver<Book> {
    private AuthorRepository authorRepository;

    public BookResolver(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Optional<Author> getAuthor(Book book) {
        return authorRepository.findById(book.getAuthor().getId());
    }
}
