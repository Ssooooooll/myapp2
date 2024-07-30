package com.test5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

interface MessageService {
    public void sendMsg(String name);
}
@Component
class EmailService implements MessageService {
	@Override
	public void sendMsg(String message) {
        System.out.println(message);
    }
}
@Component
class SmsService implements MessageService {
	@Override
	public void sendMsg(String message) {
        System.out.println(message);
    }
}
interface MessageProcesser {
    public void processMsg(String message);
}
@Component
class MessageProcesserImpl implements MessageProcesser {
    private MessageService messageService;
    @Autowired
    public MessageProcesserImpl(@Qualifier("emailService") MessageService messageService) {
        this.messageService = messageService;
    }
	@Override
	public void processMsg(String message) {
        messageService.sendMsg((message));
	}

}

@Configuration
@ComponentScan(basePackages = "com.test5")
class JavaConfig {}

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        
    }


}
