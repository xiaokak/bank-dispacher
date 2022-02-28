package cn.edu.zucc.pb.bankdispacher;

import java.util.List;

/**
 * @author pengbin
 * @version 1.0
 */
public interface IUserSelector {
    UserEvent select(List<UserEvent> events);
}
