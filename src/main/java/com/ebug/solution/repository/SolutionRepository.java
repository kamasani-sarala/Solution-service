package com.ebug.solution.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ebug.solution.entity.Solution;

@Repository
public interface SolutionRepository extends JpaRepository<Solution,Integer>{
	@Query(value="delete from Solution sl where sl.solutionId = :solutionId")
	@Modifying
	int deleteSolution(int solutionId);
	@Query(value="update Solution sl set sl.remedyDetails=:e where sl.solutionId=:solutionId")
	@Modifying
 int updateRemedyDetails(@Param("solutionId") int solutionId,@Param("e") String remedyDetails);
	


Solution findBySolutionId(int solutionId);
@Query(value="select sl from Solution sl where sl.solutionId = :solutionId")
Solution searchSolutionById(int solutionId);
}
