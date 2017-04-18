package com.fleetMall.service.other.otherImpl;

import com.fleetMall.domain.Comment;
import com.fleetMall.service.other.CommentService;
import com.fleetMall.service.base.baseImpl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * Created by beila on 2017/4/9.
 */
@Service("comment_service")
public class CommentServiceImpl extends ServiceImpl<Comment> implements CommentService {
}
