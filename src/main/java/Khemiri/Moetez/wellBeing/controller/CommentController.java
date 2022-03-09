package Khemiri.Moetez.wellBeing.controller;

import Khemiri.Moetez.wellBeing.model.Comment;
import Khemiri.Moetez.wellBeing.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommentController {

    @Autowired
    private CommentService commentService;

    // add comment
    @RequestMapping(value = "/addComment", method = RequestMethod.POST)
    public Comment saveComment(@RequestBody Comment comment) {
        return commentService.addComment(comment);
    }

    // get event comments
    @RequestMapping(value = "/eventComments", method = RequestMethod.GET)
    public List<Comment> retrieveEventComments(@RequestParam(name = "eventId") final Long eventId) {
        return commentService.getEventComments(eventId);
    }

}
