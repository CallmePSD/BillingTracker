package pvt.dolaicorp.bt.webApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pvt.dolaicorp.bt.webApp.beans.BillingTrackerBean;

@RestController
public class BillingTackerController {
	
	@GetMapping("/")
	public String showBillingDetailsInputPage() {
		//It should return 1 html page.
		return "insertBillingDetailsPage";
	}
	
	@PostMapping("/saveBillingDetails")
	public String saveBillingDetails(@RequestBody BillingTrackerBean billingTrackerBean) {
		return "Billing Details received";
	}

}
