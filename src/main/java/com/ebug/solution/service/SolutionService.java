package com.ebug.solution.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import com.ebug.solution.VO.ResponseTemplateVO;
import com.ebug.solution.VO.Staff;
import com.ebug.solution.VO.Ticket;
import com.ebug.solution.entity.Solution;
import com.ebug.solution.repository.SolutionRepository;



@Service
public class SolutionService {
@Autowired
private SolutionRepository solutionRepository;



@Autowired
private RestTemplate restTemplate;
 
public Solution addSolution (Solution  solution ) {
	Solution  solution1= solutionRepository.save(solution );
	return solution1 ;

}
@Transactional
public int deleteSolution (int solutionId) {
	return solutionRepository.deleteSolution(solutionId) ;
}
@Transactional
public int updateRemedyDetails(int solutionId, String remedyDetails) {
return solutionRepository.updateRemedyDetails(solutionId, remedyDetails);
}
public List<Solution> allSolutions() {
	return solutionRepository.findAll();
}

public ResponseTemplateVO getSolutionWithTicketandStaff(int solutionId) {
	ResponseTemplateVO vo= new ResponseTemplateVO();
	Solution solution= solutionRepository.findBySolutionId(solutionId);
	Ticket ticket= restTemplate.getForObject("http://localhost:9006/ticket/" + solution.getTicketId(),Ticket.class);
	Staff staff= restTemplate.getForObject("http://localhost:9002/staff/" + solution.getStaffId(),Staff.class);
	vo.setSolution(solution);
	vo.setTicket(ticket);
	vo.setStaff(staff);
	return vo; 
}
public Solution searchSolutionById(int solutionId) {
	return solutionRepository.searchSolutionById(solutionId);
}


}