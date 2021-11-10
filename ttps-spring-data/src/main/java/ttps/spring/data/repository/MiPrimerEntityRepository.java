package ttps.spring.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ttps.spring.data.model.MiPrimerEntity;

@Repository
public interface MiPrimerEntityRepository extends JpaRepository<MiPrimerEntity, Long>{

}
