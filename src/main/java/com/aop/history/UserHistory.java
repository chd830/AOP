package com.aop.history;

import com.aop.user.User;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component // @Bean과 동일하게 Spring Bean으로 등록
public class UserHistory {

    @Autowired
    private HistoryRepository historyRepository;

    // 중복을 해결해 줌
    @Pointcut("execution(* com.aop.user.UserService.update(*)) && args(user)")
    public void updateUser(User user) {
    }

    // 핵심 메서드의 호출이 성공했을 때 반환하는 메서드.
    @AfterReturning("updateUser(user)")
    public void saveHistory(User user) {
        historyRepository.save(new  History(user.getId()));
    }

}
