package com.lyyzoo.demo;

import com.lyyzoo.demo.rabbitmq.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = RabbitmqApplication.class)
public class RabbitmqApplicationTests {

	@Autowired
	private Sender sender;

	@Test
	public void sendDatetime() {
		sender.sendTime();
	}

}
