package com.codesetters.ebook.service;

import com.codesetters.ebook.service.dto.BookDTO;
import java.util.List;

/**
 * Service Interface for managing Book.
 */
public interface BookService {

    /**
     * Save a book.
     *
     * @param bookDTO the entity to save
     * @return the persisted entity
     */
    BookDTO save(BookDTO bookDTO);

    /**
     *  Get all the books.
     *
     *  @return the list of entities
     */
    List<BookDTO> findAll();

    /**
     *  Get the "id" book.
     *
     *  @param id the id of the entity
     *  @return the entity
     */
    BookDTO findOne(String id);

    /**
     *  Delete the "id" book.
     *
     *  @param id the id of the entity
     */
    void delete(String id);
}
