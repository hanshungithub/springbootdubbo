package cn.hassan.provider.service.impl;

import cn.hassan.provider.service.TicketService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * Author: hassan
 * Date: 2018/5/29 22:37
 * Description:
 */
@Component
@Service//dubbo中的service
public class TicketServiceImpl implements TicketService {
    @Override
    public String getTicket() {
        return "hassan";
    }
}
