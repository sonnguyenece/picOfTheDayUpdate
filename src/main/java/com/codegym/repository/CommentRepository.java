package com.codegym.repository;

import com.codegym.model.Comment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import javax.persistence.TypedQuery;

public interface CommentRepository extends PagingAndSortingRepository<Comment,Long> {
//    Iterable<Comment> findAllByProvince(Comment comment);
//
//    Page<Comment> findAllByFirstNameContaining(String firstname, Pageable pageable);

}
