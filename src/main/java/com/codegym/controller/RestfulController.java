package com.codegym.controller;

import com.codegym.model.Comment;
import com.codegym.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestfulController {

    @Autowired
    private CommentService commentService;

    @GetMapping("/api")
    public ResponseEntity<Iterable<Comment>> getAllComments() {
        Iterable<Comment> listComment = commentService.findAll();
        return new ResponseEntity<>(listComment, HttpStatus.OK);
    }
    @PostMapping("/api")
    public ResponseEntity<Iterable<Comment>> allComments() {
        Iterable<Comment> listComment = commentService.findAll();
        return new ResponseEntity<>(listComment, HttpStatus.OK);
    }
}
