package com.touk.Ticketbooking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;

@SpringBootApplication
public class TicketBookingApplication {

	public static void main(String[] args) throws SQLException {
		org.h2.tools.Server server = org.h2.tools.Server.createTcpServer().start();


		SpringApplication.run(TicketBookingApplication.class, args);
	}

}
