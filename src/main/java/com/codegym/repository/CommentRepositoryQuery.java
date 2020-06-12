package com.codegym.repository;

import com.codegym.model.Comment;

public interface CommentRepositoryQuery {
    public Iterable<Comment> allTodayComments();
}
