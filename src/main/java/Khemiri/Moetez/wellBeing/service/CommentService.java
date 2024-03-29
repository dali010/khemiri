package Khemiri.Moetez.wellBeing.service;

import Khemiri.Moetez.wellBeing.model.Comment;
import Khemiri.Moetez.wellBeing.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    //add comment
    public Comment addComment(Comment comment) {
        return commentRepository.save(comment);
    }

    // get event comments
    public List<Comment> getEventComments(Long eventId) {
        return commentRepository.findByEvent_EventId(eventId);
    }
}
