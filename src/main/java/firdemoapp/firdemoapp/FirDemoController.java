package firdemoapp.firdemoapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirDemoController {

	@RequestMapping("/demo")
	public String demoMethod() {
		return "Hello World";
	}
}
