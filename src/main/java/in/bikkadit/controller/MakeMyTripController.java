package in.bikkadit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.bikkadit.request.Passenger;
import in.bikkadit.response.Ticket;
import in.bikkadit.service.MakeMyTripService;

@Controller
public class MakeMyTripController {

	@Autowired
	private MakeMyTripService makeMyTripService;

	@GetMapping("/")
	public String index() {

		return "index";
	}

	@GetMapping("/Search")
	public String searchPage() {

		return "search";
	}

	@GetMapping("/SearchTicket")
	public String searchTicket(@RequestParam String ticketId, Model model) {
	    System.out.println("Ticket ID :: " + ticketId);
	    Ticket ticketInfo = makeMyTripService.getTicketInfo(ticketId);
	    model.addAttribute("ticket", ticketInfo);
	    return "search";
	}
  
	@PostMapping("/bookTicket")
	public String bookTicket(Passenger request, Model model) {

		Ticket ticketInfo =   makeMyTripService.processTicketBooking(request);

		model.addAttribute("ticket", ticketInfo);

		return "Success";
	}
}
