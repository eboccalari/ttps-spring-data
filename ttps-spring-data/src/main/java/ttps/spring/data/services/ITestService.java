package ttps.spring.data.services;

import java.util.List;

import ttps.spring.data.model.MiPrimerEntity;

public interface ITestService {
	
	MiPrimerEntity save(MiPrimerEntity entity);

	List<MiPrimerEntity> findAll();
	
}
