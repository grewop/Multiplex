package com.touk.Ticketbooking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.sql.SQLException;

@SpringBootApplication
@EnableSwagger2
public class TicketBookingApplication {

	public static void main(String[] args) throws SQLException {
		org.h2.tools.Server server = org.h2.tools.Server.createTcpServer().start();


		SpringApplication.run(TicketBookingApplication.class, args);
	}

}
