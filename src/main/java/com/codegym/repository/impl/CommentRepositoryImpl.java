package com.codegym.repository.impl;

import com.codegym.model.Comment;
import com.codegym.repository.CommentRepositoryQuery;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

@Transactional
public class CommentRepositoryImpl implements CommentRepositoryQuery {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Iterable<Comment> allTodayComments() {
        String queryStr = "SELECT c FROM Comment AS c WHERE (c.date=CURRENT_DATE)";
        TypedQuery<Comment> query = em.createQuery(queryStr, Comment.class);
        return query.getResultList();
    }
}
