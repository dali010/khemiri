package Khemiri.Moetez.wellBeing.controller;

import Khemiri.Moetez.wellBeing.model.Comment;
import Khemiri.Moetez.wellBeing.model.Event;
import Khemiri.Moetez.wellBeing.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CommentController {

    @Autowired
    private CommentService commentService;

    // add comment
    @RequestMapping(value = "/addComment", method = RequestMethod.POST)
    public Comment saveComment(@RequestBody Comment comment) {
        return commentService.addComment(comment);
    }

}
