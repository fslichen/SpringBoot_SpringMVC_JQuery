package evolution.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import evolution.dto.AnyDto;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class AnyController {
	// @RequestBody converts JSON to Java DTO.
	// The implicit @ResponseBody in @RestController converts Java DTO to JSON.
	@PostMapping(value = "/post")
	public AnyDto anyMethod(@RequestBody AnyDto anyDto, HttpServletRequest request) {
		log.info(anyDto.toString());
		return anyDto;
	}
	
	@GetMapping("/get")
	public AnyDto anotherMethod() {
		AnyDto anyDto = new AnyDto("Chen", "M");
		return anyDto;
	}
}
