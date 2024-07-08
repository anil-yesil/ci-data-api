package gov.turkpatent.ci_data_api.repository;

import gov.turkpatent.ci_data_api.model.CIEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class CIRepository extends JpaRepository<CIEntity, Long> {
}
