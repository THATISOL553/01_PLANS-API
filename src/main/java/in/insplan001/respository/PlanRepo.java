package in.insplan001.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.insplan001.entity.Plan;

public interface PlanRepo extends JpaRepository<Plan, Integer>{

}
