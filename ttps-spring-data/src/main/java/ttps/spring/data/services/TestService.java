package ttps.spring.data.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ttps.spring.data.model.MiPrimerEntity;
import ttps.spring.data.repository.MiPrimerEntityRepository;

@Service
public class TestService implements ITestService{

	@Autowired 
	MiPrimerEntityRepository miPrimerEntityRepository;

	@Override
	public List<MiPrimerEntity> findAll() {
		return getMiPrimerEntityRepository().findAll();
	}

	@Override
	public MiPrimerEntity save(MiPrimerEntity entity) {
		return getMiPrimerEntityRepository().save(entity);		
	}

	public MiPrimerEntityRepository getMiPrimerEntityRepository() {
		return miPrimerEntityRepository;
	}

	public void setMiPrimerEntityRepository(MiPrimerEntityRepository miPrimerEntityRepository) {
		this.miPrimerEntityRepository = miPrimerEntityRepository;
	}
		
	
}
