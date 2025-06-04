package in.bikkadit.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.bikkadit.request.Passenger;
import in.bikkadit.response.Ticket;

@Service
public class MakeMyTripService {

	private static final String IRCTC_ENDPOINT_1 = "http://localhost:9090/api/ticket";

	private static final String IRCTC_ENDPOINT_2 = "http://localhost:9090/api/ticket/{ticketId}";

	public Ticket getTicketInfo(String ticketId) {

		RestTemplate rt = new RestTemplate();

		ResponseEntity<Ticket> responseEntity = rt.getForEntity(IRCTC_ENDPOINT_2, Ticket.class, ticketId);

		HttpStatusCode statusCode = responseEntity.getStatusCode();
	
		if  (statusCode == HttpStatus.OK) {

			Ticket ticket = responseEntity.getBody();

			return ticket;
		}

		return null;

	}

	public Ticket processTicketBooking(Passenger passenger) {

		RestTemplate rt = new RestTemplate();

		ResponseEntity<Ticket> responseEntity =

				rt.postForEntity(IRCTC_ENDPOINT_1, passenger, Ticket.class);

		HttpStatusCode statusCode = responseEntity.getStatusCode();

		if (statusCode == HttpStatus.OK) {

			Ticket ticket = responseEntity.getBody();

			return ticket;
		}

		return null;

	}
}
