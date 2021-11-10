package ttps.spring.data.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ttps.spring.data.model.MiPrimerEntity;
import ttps.spring.data.services.ITestService;

@RestController
@RequestMapping("/api/test")
public class TestController {
	
	@Autowired
	ITestService testService;
	
	@PostMapping
	public ResponseEntity<MiPrimerEntity> create(@RequestBody MiPrimerEntity entity) {
		try {
			
			entity = getTestService().save(entity);
			return new ResponseEntity<MiPrimerEntity>(entity, HttpStatus.OK);
			
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<MiPrimerEntity>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping
	public ResponseEntity<List<MiPrimerEntity>> list() {
		try {
			
			List<MiPrimerEntity> list = getTestService().findAll();
			return new ResponseEntity<List<MiPrimerEntity>>(list, HttpStatus.OK);
			
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<List<MiPrimerEntity>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	public ITestService getTestService() {
		return testService;
	}

	public void setTestService(ITestService testService) {
		this.testService = testService;
	}
		
}
