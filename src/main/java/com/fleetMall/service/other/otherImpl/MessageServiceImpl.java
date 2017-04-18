package com.fleetMall.service.other.otherImpl;

import com.fleetMall.domain.Message;
import com.fleetMall.service.other.MessageService;
import com.fleetMall.service.base.baseImpl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * Created by beila on 2017/4/9.
 */
@Service("message_service")
public class MessageServiceImpl extends ServiceImpl<Message> implements MessageService {
}
